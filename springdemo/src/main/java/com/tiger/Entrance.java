/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.tiger;

import com.tiger.service.HelloService;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author xiaojin
 * @version Entrance.java, v 0.1 2022年05月06日 taiyuejie Exp $
 */
public class Entrance {

	public static void main(String[] args) {

		String configPath = "//Users/taiyuejie/my/code/spring-framework-5.2.20.RELEASE/springdemo/src/main/resources/spring/spring-config.xml";

		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext(configPath);

		HelloService helloService = applicationContext.getBean(HelloService.class);

		System.out.println(helloService.sayHello("你好"));

	}

}
