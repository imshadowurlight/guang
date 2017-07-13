package com.guang.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guang.po.User;
import com.guang.service.UserService;

/**
 * @Controller  将此控制器类交给spring管理
 * @RequestMapping("/user") 访问路径前缀
 * */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	/**
	 * 访问添加用户页面
	 * */
	@RequestMapping("addUserPage")
	public String addUserPage(){
		return "addUser"; //
	}
	
	
	/**
	 * 添加一个用户
	 * */
	@RequestMapping("addUser")
	public String addUser(User user){
		userService.addUser(user);//
		return "addUser"; //
	}
	
	/**
	 * 显示用户列表
	 * */
	@RequestMapping("userList")
	public String userList(Model model){
		List<User> users = userService.userList();
		model.addAttribute("users", users);
		return "userList"; 
	}
	
	
}
