package com.guang.module.word.service;

import java.util.List;
import java.util.Map;

import com.guang.module.word.po.Word;

public interface WordService {
	/**
	 * 获取单词集合
	 * */
	List<Word> getWords(Map map);
	
	/**
	 * 添加单词
	 * */
	void insertWord(Word word);
	
	/**
	 * 删除单词/更新
	 * */
	void deleteWord(Word word);
	
	/**
	 * 查询符合要求的单词总数
	 * */
	int getWordsSize(Map map);
}
