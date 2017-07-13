package com.guang.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guang.po.Items;
import com.guang.service.ItemsService;

/**
 * @Controller  将此控制器类交给spring管理
 * @RequestMapping("/items") 访问路径
 * */
@Controller
@RequestMapping("/items")
public class ItemsController {
	
	/**
	 * @Resource   大概就是注入的意思了,不需要构造器,也不需要setter.
	 * */
	@Resource
	private ItemsService itemsService; 
	
	/**
	 * 查询所有商品
	 * */
	@RequestMapping("list")
	public String list(Model model){
		List<Items> list = itemsService.findAll();
		model.addAttribute("itemsList", list);
		return "itemsList";
	}
	
	
	/**
	 * 跳转到修改页面
	 * */
	@RequestMapping("edit")
	public String edit(Integer id, Model model){
		//根据id查询商品
		Items items = itemsService.findById(id);
		model.addAttribute("item", items);
		return "editItem"; 
	}
	
	/**
	 * 更新商品
	 * */
	@RequestMapping("saveOrUpdate")
	public String saveOrUpdate(Items items){
		itemsService.saveOrUpdate(items);
		
		return "redirect:list.do"; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
