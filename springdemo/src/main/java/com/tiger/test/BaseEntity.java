/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.tiger.test;

/**
 * @author xiaojin
 * @version BaseEntity.java, v 0.1 2022年05月06日 taiyuejie Exp $
 */
public class BaseEntity {
	private String id;

	private String name;

	/**
	 * Getter method for property <tt>id</tt>.
	 *
	 * @return property value of id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Setter method for property id.
	 *
	 * @param id value to be assigned to property id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Getter method for property <tt>name</tt>.
	 *
	 * @return property value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for property name.
	 *
	 * @param name value to be assigned to property name
	 */
	public void setName(String name) {
		this.name = name;
	}
}
