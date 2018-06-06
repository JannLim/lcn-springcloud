/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.service2.controller;

import com.codedemo.lcn.service2.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Describe:
 * @Author: linjuanjuan
 * @Date: 2018/6/6 21:46
 * @Version: 1.0
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping("insert")
    public void insert() {
        demoService.insert();
    }

}
