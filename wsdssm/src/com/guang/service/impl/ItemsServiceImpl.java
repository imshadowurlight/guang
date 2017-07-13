package com.guang.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guang.dao.ItemsMapper;
import com.guang.po.Items;
import com.guang.service.ItemsService;


/**
 * @Service  将此类交给service管理
 * */
@Service
public class ItemsServiceImpl implements ItemsService {
	@Resource
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> findAll() {
		return itemsMapper.findAll();
	}

	@Override
	public Items findById(Integer id) {
		return itemsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void saveOrUpdate(Items items) {
		itemsMapper.updateByPrimaryKey(items);
	}
	
	
}
