package com.ruyi.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruyi.constant.MessageConstant;
import com.ruyi.dto.UserLoginDTO;
import com.ruyi.entity.User;
import com.ruyi.exception.LoginFailedException;
import com.ruyi.mapper.UserMapper;
import com.ruyi.service.UserService;
import com.ruyi.utils.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    public static final String LOGIN_URL = "https://api.weixin.qq.com/sns/jscode2session";

    @Autowired
    private UserMapper userMapper;

    @Value("${ruyi.wechat.appid}")
    private String appid;

    @Value("${ruyi.wechat.secret}")
    private String secret;


    private String getOpenid(String code) {
        Map<String, String> param = new HashMap<>();
        param.put("appid",appid);
        param.put("secret",secret);
        param.put("js_code",code);
        param.put("grant_type","authorization_code");

        //数据格式:{openid:xxxx,session_key:xxxx}
        String res = HttpClientUtil.doGet(LOGIN_URL, param);
        JSONObject jsonObject = JSON.parseObject(res);
        String openid = jsonObject.getString("openid");
        log.info("查询到微信用户的openid:{}", openid);

        if (openid == null){
            throw new LoginFailedException(MessageConstant.LOGIN_FAILED);
        }

        return openid;


    }

    /**
     * 微信登陆
     *
     * @param userLoginDTO 微信授权码
     * @return 用户信息
     */
    public User wxLogin(UserLoginDTO userLoginDTO) {
        String code = userLoginDTO.getCode();

        //获取微信用户的openid
        String openid = getOpenid(code);

        if (openid == null) {
            throw new LoginFailedException(MessageConstant.LOGIN_FAILED);
        }

        //根据openid查询用户
        User user = userMapper.getByOpenid(openid);
        if (user == null) {
            //新用户自动注册
            user = new User();
            user.setOpenid(openid);
            user.setCreateTime(LocalDate.now());
            userMapper.insert(user);
        }
        return user;
    }

}
