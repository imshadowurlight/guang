package com.guang.module.account.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guang.module.account.dao.AccountMapper;
import com.guang.module.account.po.Account;
import com.guang.module.account.service.AccountService;

/*
 * 通过bean.xml中的以下配置
 * <context:component-scan base-package="com.guang"></context:component-scan>
 * 来扫描@service类下面的@Resource来实现依赖注入
 * 相对于xml配置的setter/constructor等实现注入有以下优势:
 * 		配置简单;
 * 		不用在类中提供setter/constructor
 * */
@Service
public class AccountServiceImpl implements AccountService{
	
	
	@Resource
	private AccountMapper accountMapper;
	
	@Override
	public void addAccount(Account account) {
		int result = accountMapper.insert(account);	//result为数据库返回的操作的行数
		System.out.println(result);
	}
	
}
