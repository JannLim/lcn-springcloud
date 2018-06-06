/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.transaction.controller;

import com.codedemo.lcn.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe:
 * @Author: linjuanjuan
 * @Date: 2018/6/6 22:50
 * @Version: 1.0
 */
@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("test1")
    public void test1() {
        transactionService.test1();
    }

    @PostMapping("test2")
    public void test2() {
        transactionService.test2();
    }

}
