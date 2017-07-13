package com.guang.module.account.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAccount {
	static ApplicationContext context;
	static{
		context = new ClassPathXmlApplicationContext( 
		        new String[] {"beans.xml"}); 
	}
	
	public static void main(String[] args) {
		//如何获取注解定义的bean???
		System.out.println("ok");
	}
}
