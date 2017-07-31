package com.guang.module.word.dao;

import java.util.List;
import java.util.Map;

import com.guang.module.word.po.Word;

public interface WordMapper {
	/**
	 * 查询
	 * */
	List<Word> getWords(Map map);
	
	
	/**
	 * 插入
	 * */
	int insertWord(Word word);
	
	/**
	 * 更新
	 * */
	int updateWord(Word word);

	/**
	 * 查询符合要求的单词总数
	 * */
	int getWordsSize(Map map);

	/**
	 * 删除
	 * */
	void deleteWord(Word word);
}
