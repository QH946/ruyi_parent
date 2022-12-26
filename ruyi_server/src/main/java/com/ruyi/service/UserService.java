package com.ruyi.service;

import com.ruyi.dto.UserLoginDTO;
import com.ruyi.entity.User;

public interface UserService {

    //微信登录
    User wxLogin(UserLoginDTO userLoginDTO);
}
