/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.transaction.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Describe:
 * @Author: linjuanjuan
 * @Date: 2018/6/6 22:43
 * @Version: 1.0
 */
@FeignClient("service1")
public interface Service1Integration {

    @PostMapping("demo/insert")
    void insert();

}
