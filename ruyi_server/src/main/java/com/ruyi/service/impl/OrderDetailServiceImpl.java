package com.ruyi.service.impl;

import com.ruyi.mapper.OrderDetailMapper;
import com.ruyi.service.OrderDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 订单
 */
@Service
@Slf4j
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

}
