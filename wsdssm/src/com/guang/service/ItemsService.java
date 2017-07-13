package com.guang.service;

import java.util.List;

import com.guang.po.Items;

public interface ItemsService {

	List<Items> findAll();

	Items findById(Integer id);

	void saveOrUpdate(Items items);

}
