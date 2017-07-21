package com.guang.module.account.dao;

import java.util.List;
import java.util.Map;

import com.guang.module.account.po.Account;

/**@author HDXY
 * @version1.0
 * account在dao层使用mybatis定义的接口
 * */
public interface AccountMapper {
	
	/**
	 * 插入一个账户记录
	 * */
	int insert(Account record);

	/**
	 * 查询账户记录集合
	 * */
	List<Account> selectAccounts();
	
	/**
	 * 分页查询账户记录集合
	 * */
	List<Account> selectAccountsByPagination(Map map);
	
	/**
	 * 更新一条账户记录
	 * */
	int update(Account account);

	/**
	 * 删除账户
	 * */
	int delete(Account account);

	/**
	 * 查询账户集合总记录数
	 * */
	int getAccountsSize(Map map);

	
	
}
