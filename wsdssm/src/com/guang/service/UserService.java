package com.guang.service;

import java.util.List;
import java.util.Map;

import com.guang.po.User;

public interface UserService {
	/**
	 * 添加用户
	 * */
	public void addUser(User user);
	
	/**
	 * 查看用户列表
	 * */
	@Deprecated
	public List<User> userList();
	
	/**
	 * 查看用户列表
	 * */
	public List<User> userList(Map map);

	/**
	 * 获取数据记录数
	 * */
	public int getUsersSize(Map map);

	/**
	 * 删除用户
	 * */
	public void deleteUser(User user);
	
}
