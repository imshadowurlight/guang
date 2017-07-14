package com.guang.module.account.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.guang.module.account.po.Account;
import com.guang.module.account.service.AccountService;
import com.guang.po.User;

/**@author HDXY
 * @version 1.0
 * 定义注解,使被扫描,实现控制反转,由spring管理此bean对象
 * */
@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Resource
	private AccountService accountService;
	JSONObject data =new JSONObject();
	
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
	public String addAccount(Account account){
		accountService.addAccount(account);
		return "addAccount";
	}
	
	/**
	 * 查看账户列表
	 * */
	@RequestMapping("accountList")
	public String  accountList(Model model){
		List<Account> accounts = accountService.accountList();
		model.addAttribute("accounts", accounts);
		return "accountList"; 
	}
	
	
	/**
	 * 测试json的交互
	 * */
	@RequestMapping("requestJson")
	public @ResponseBody List<Account> requestJson(@RequestBody Account account){
		String jsonAccount = JSONObject.toJSONString(account);
		System.out.println(jsonAccount);
		List<Account> accounts = accountService.accountList();
		return accounts;
	}
	
	
	
}
