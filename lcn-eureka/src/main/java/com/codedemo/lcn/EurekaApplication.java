/**
 * Copyright (c) 2018 LINJUANJUAN TECHNOLOGY Inc. All rights reserved.
 */
package com.codedemo.lcn;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Describe: 注册中心
 * @Author: linjuanjuan
 * @Date: 2018/6/6 20:17
 * @Version: 1.0
 */
@Slf4j
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        log.info("========== 启动成功 ==========");
    }

}
