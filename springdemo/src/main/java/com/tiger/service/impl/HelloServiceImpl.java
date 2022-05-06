/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.tiger.service.impl;

import com.tiger.service.HelloService;

/**
 * @author xiaojin
 * @version HelloServiceImpl.java, v 0.1 2022年05月06日 taiyuejie Exp $
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String input) {
		return "hello" + input;
	}
}
