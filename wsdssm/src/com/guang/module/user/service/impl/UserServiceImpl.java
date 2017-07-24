package com.guang.module.user.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guang.module.user.dao.UserMapper;
import com.guang.module.user.po.User;
import com.guang.module.user.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public List<User> userList() {
		return userMapper.selectUsers();
	}

	@Override
	public List<User> userList(Map map) {
		return userMapper.userList(map);
	}

	@Override
	public int getUsersSize(Map map) {
		return userMapper.getUsersSize(map);
	}

	@Override
	public void deleteUser(User user) {
		userMapper.deleteUser(user);
	}
	
	
}
