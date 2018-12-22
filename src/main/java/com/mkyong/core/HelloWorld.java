package com.mkyong.core;

/**
 * Spring bean
 * This is test comment
 * This is 2nd jenkin test schedule build
 */
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}
}
