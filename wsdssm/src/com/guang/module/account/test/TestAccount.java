package com.guang.module.account.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guang.module.account.dao.AccountMapper;

@RunWith(SpringJUnit4ClassRunner.class) 		//指定测试用例的运行器 这里是指定了Junit4
@ContextConfiguration("classpath:beans.xml")	//装配Spring
public class TestAccount {
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Test
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getAccountNumber(){
		Map map = new HashMap();
		map.put("start", 1);
		map.put("size", 100);
		int count = accountMapper.getAccountsSize(map);
		Assert.assertEquals(count, 51);
	}
	
}
