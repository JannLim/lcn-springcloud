/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.service1.service;

import com.codedemo.lcn.service1.dao.mapper.ServiceAMapper;
import com.codedemo.lcn.service1.dao.model.ServiceA;
import com.codingapi.tx.annotation.TxTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Describe: 服务1service，用于保存信息
 * @Author: linjuanjuan
 * @Date: 2018/6/6 21:40
 * @Version: 1.0
 */
@Slf4j
@Service
public class DemoService {

    @Autowired
    private ServiceAMapper serviceAMapper;

    @TxTransaction
    @Transactional
    public void insert() {
        ServiceA serviceA = new ServiceA();
        serviceA.setServiceAId(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        serviceA.setServiceAName("服务1");
        log.info("服务1存储开始");
        serviceAMapper.insert(serviceA);
        log.info("服务1存储结束");
    }

}
