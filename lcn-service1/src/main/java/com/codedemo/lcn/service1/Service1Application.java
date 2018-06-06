/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Describe: 服务1
 * @Author: linjuanjuan
 * @Date: 2018/6/6 20:38
 * @Version: 1.0
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement
@EnableAutoConfiguration
public class Service1Application {

    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class, args);
        log.info("========== 启动成功 ==========");
    }

}
