package com.guang.service;

import java.util.List;

import com.guang.po.User;

public interface UserService {
	/**
	 * 添加用户
	 * */
	public void addUser(User user);
	
	/**
	 * 查看用户列表
	 * */
	public List<User> userList();
	
}
