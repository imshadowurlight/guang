package com.guang.module.account.service;

import java.util.List;

import com.guang.module.account.po.Account;

public interface AccountService {
	/**
	 * 添加一条账户记录
	 * */
	void addAccount(Account account);
	
	/**
	 * 查询账户集合
	 * */
	List<Account> accountList();
	
	/**
	 * 更新账户记录
	 * */
	void updateAccount(Account account);
	
	/**
	 * 删除账户
	 * */
	void deleteAccount(Account account);
	
	
	
}
