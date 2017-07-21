package com.guang.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.guang.beans.PageBean;
import com.guang.po.User;
import com.guang.service.UserService;
import com.guang.utils.ResponseUtil;

/**
 * @Controller  将此控制器类交给spring管理
 * @RequestMapping("/user") 访问路径前缀
 * */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	JSONObject data =new JSONObject();
	
	/**
	 * 访问添加用户页面
	 * */
	@Deprecated
	@RequestMapping("addUserPage")
	public String addUserPage(){
		return "addUser"; //
	}
	
	
	/**
	 * 添加一个用户
	 * */
	@Deprecated
	@RequestMapping("addUser")
	public String addUser(User user){
		userService.addUser(user);//
		return "addUser"; //
	}
	
	/**
	 * 跳转用户列表页面
	 * */
	@RequestMapping("userList")
	public String userList(Model model){
		//List<User> users = userService.userList();
		//model.addAttribute("users", users);
		return "userList"; 
	}
	
	/**
	 * 显示用户列表
	 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("list")
	public String list(@RequestParam(value = "page", required = false) String page, 
			@RequestParam(value = "rows", required = false) String rows,
			User user,HttpServletResponse response) throws Exception{
		
		//分页获取数据
		Map map = new HashedMap();
		if(!StringUtils.isBlank(page) && !StringUtils.isBlank(rows)){
			PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
			map.put("start", pageBean.getStart());
			map.put("size", pageBean.getPageSize());
		}
		List<User> users = userService.userList(map);
		int total = userService.getUsersSize(map);
		//用户的出生日期(Date类型),在转格式时变成了"birthday":{"date":10,"day":4,"hours":0,"minutes":0,"month":6,"seconds":0,"time":1404921600000,"timezoneOffset":-480,"year":114}
		//JSONArray jsonUsers = JSONArray.fromObject(users);
		//对user进行特别的格式处理
		JSONArray jsonUsers = JSONArray.fromObject(format(users));
		data.put("total", total);
		data.put("rows", jsonUsers);
		ResponseUtil.write(response, data);
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private List format(List<User> users){
		List list = new ArrayList();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			Map map = new HashMap(); 
			map.put("username", user.getUsername());
			if(!StringUtils.isBlank(user.getAddress())){
				map.put("address", user.getAddress());
			}else{
				map.put("address", "宇宙神秘国度");
			}
			
			if(!StringUtils.isBlank(user.getSex()) && user.getSex().trim().equals("0")){
				map.put("sex", "女");
			}else if(!StringUtils.isBlank(user.getSex()) && user.getSex().trim().equals("1")){
				map.put("sex", "男");
			}else{
				map.put("sex", "宇宙人");
			}
			if(user.getBirthday() != null){
				map.put("birthday", simpleDateFormat.format(user.getBirthday()));
			}else{
				map.put("birthday", simpleDateFormat.format(new Date()));
			}
			list.add(map);
		}
		return list;
	}
	
	
	/**
	 * 添加用户
	 * */
	@RequestMapping("saveUser")
	public String saveUser(User user){
		userService.addUser(user);
		return null;
	}
	
	/**
	 * 删除用户
	 * */
	@RequestMapping("deleteUser")
	public String deleteUser(User user){
		//删除数据时发现无法获取数据...因为数据格式根本不对应...所以user无法获取. ==> 修改format的sex类型.
		//userService.deleteUser(user);
		System.out.println(user.getId());
		return null;
	}
	
	
	
}
