package com.guang.module.account.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guang.module.account.po.Account;
import com.guang.module.account.service.AccountService;

/**@author HDXY
 * @version 1.0
 * 定义注解,使被扫描,实现控制反转,由spring管理此bean对象
 * */
@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Resource
	private AccountService accountService;
	
	/**
	 * 访问添加用户页面
	 * */
	@RequestMapping("addAccountPage")
	public String addAccountPage(){
		return "addAccount"; 
	}
	
	/**
	 * 添加账户
	 * */
	@RequestMapping("addAccount")
	public String addUser(Account account){
		accountService.addAccount(account);
		return "addAccount";
	}
	
}
