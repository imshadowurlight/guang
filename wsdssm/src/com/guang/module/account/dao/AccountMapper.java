package com.guang.module.account.dao;

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
	
}
