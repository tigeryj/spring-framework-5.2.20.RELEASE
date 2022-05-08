/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.tiger.test;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author xiaojin
 * @version Test.java, v 0.1 2022年05月06日 taiyuejie Exp $
 */
public class Test {
	public static void main(String[] args) {

		RespEntity respEntity = new RespEntity();
		Field[] fields = respEntity.getClass().getFields();
		Arrays.stream(fields).forEach(e-> System.out.println(e.getName()));
		Field[] declaredFields = respEntity.getClass().getDeclaredFields();
		System.out.println("============");
		Arrays.stream(declaredFields).forEach(e-> System.out.println(e.getName()));

	}
}
