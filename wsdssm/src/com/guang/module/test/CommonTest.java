package com.guang.module.test;

import org.junit.Test;

import com.guang.utils.MD5Util;

public class CommonTest {
	@Test
	public void test(){
		 System.out.println(MD5Util.MD5Encode("ssm-maven-secret", "UTF-8"));
	}
}
