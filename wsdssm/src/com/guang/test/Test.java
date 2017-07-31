package com.guang.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		
		System.out.println(simpleDateFormat.format(date));
		
		System.out.println("hello ,github ,i m eclipse");
	}
}
