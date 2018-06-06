/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.transaction.integration;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Describe:
 * @Author: linjuanjuan
 * @Date: 2018/6/6 22:45
 * @Version: 1.0
 */
@FeignClient("service2")
public interface Service2Integration {

    @PostMapping("demo/insert")
    void insert();

}
