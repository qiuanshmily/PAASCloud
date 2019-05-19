/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：PaasCloudEurekaApplication.java
 * 创建人: 邱安
 */

package com.paascloud.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The class Paas cloud eureka application.
 *
 * @author qiuan
 */
@EnableEurekaServer
@SpringBootApplication
public class PaasCloudEurekaApplication {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(PaasCloudEurekaApplication.class, args);
	}
}
