/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.service2.service;

import com.codedemo.lcn.service2.dao.mapper.ServiceBMapper;
import com.codedemo.lcn.service2.dao.model.ServiceB;
import com.codingapi.tx.annotation.TxTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describe: 服务2service，用于保存信息
 * @Author: linjuanjuan
 * @Date: 2018/6/6 21:40
 * @Version: 1.0
 */
@Slf4j
@Service
public class DemoService {

    @Autowired
    private ServiceBMapper serviceBMapper;

    @TxTransaction
    @Transactional
    public void insert() {
        ServiceB serviceB = new ServiceB();
        serviceB.setServiceBId(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        serviceB.setServiceBName("服务2");
        log.info("服务2存储开始");
        serviceBMapper.insert(serviceB);
        log.info("服务2存储结束");
    }

}
