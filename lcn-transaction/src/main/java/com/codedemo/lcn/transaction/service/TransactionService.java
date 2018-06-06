/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.transaction.service;

import com.codedemo.lcn.transaction.integration.Service1Integration;
import com.codedemo.lcn.transaction.integration.Service2Integration;
import com.codingapi.tx.annotation.TxTransaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Describe:
 * @Author: linjuanjuan
 * @Date: 2018/6/6 22:46
 * @Version: 1.0
 */
@Slf4j
@Service
public class TransactionService {

    @Autowired
    private Service1Integration service1Integration;
    @Autowired
    private Service2Integration service2Integration;

    @TxTransaction(isStart = true)
    @Transactional
    public void test1() {
        service1Integration.insert();
        service2Integration.insert();
    }

    @TxTransaction(isStart = true)
    @Transactional
    public void test2() {
        service1Integration.insert();
        service2Integration.insert();
        throw new RuntimeException("抛出异常，事务回滚");
    }

}
