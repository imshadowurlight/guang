package com.guang.module.account.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
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
	JSONObject data =new JSONObject();
	
	/**
	 * 访问添加用户页面
	 * */
	@Deprecated
	@RequestMapping("addAccountPage")
	public String addAccountPage(){
		return "addAccount"; 
	}
	
	/**
	 * 添加账户
	 * */
	@Deprecated
	@RequestMapping("addAccount")
	public String addAccount(Account account){
		accountService.addAccount(account);
		return "addAccount";
	}
	
	/**
	 * datagrid添加账户
	 * */
	@RequestMapping("saveAccount")
	public @ResponseBody JSONObject saveAccount(Account account){
		try {
			accountService.addAccount(account);
			data.put("msg", "账户添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			data.put("errorMsg", "账户添加失败");
		}
		return data;
	}
	
	/**
	 * datagrid更新账户
	 * */
	@RequestMapping("updateAccount")
	public @ResponseBody JSONObject updateAccount(Account account){
		try {
			accountService.updateAccount(account);
			data.put("msg", "账户更新成功");
		} catch (Exception e) {
			data.put("errorMsg", "账户更新失败");
			e.printStackTrace();
		}
		return data;
	}
	
	/**
	 * daragrid删除账户
	 * */
	@RequestMapping("deleteAccount")
	public @ResponseBody JSONObject deleteAccount(Account account){
		
		try {
			accountService.deleteAccount(account);
			data.put("success", true);
		} catch (Exception e) {
			data.put("errorMsg", "账户删除失败");
			e.printStackTrace();
		}
		return data;
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
	 * 查看账户列表_简单_样式
	 * */
	@RequestMapping("accountList_simple_style")
	public String  accountList_simple_style(Model model){
		List<Account> accounts = accountService.accountList();
		model.addAttribute("accounts", accounts);
		return "accountList_simple_style"; 
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
	
	
	/**
	 * 测试datagrid获取数据
	 * */
	@SuppressWarnings({ })
	@RequestMapping("testDataGrid")
	public @ResponseBody JSONObject testDataGrid(){
		//获取结果集
        List<Account> accounts = accountService.accountList();
        List<JSONObject> jsonAccounts = new ArrayList<JSONObject>();
        //转换为json结果集
        for (int i = 0; i < accounts.size(); i++) {
        	JSONObject jsonAccount = (JSONObject) JSONObject.toJSON(accounts.get(i));
        	jsonAccounts.add(jsonAccount);
		}
        Map<String,Object> map = new HashMap<String,Object>();  
        map.put("total",jsonAccounts.size());  
        map.put("rows", jsonAccounts);
        //转换为datagrid格式的结果集
        data = (JSONObject) JSONObject.toJSON(map);
		return data;
	}
	
	
	
	
}
