package com.guang.module.word.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guang.module.word.dao.WordMapper;
import com.guang.module.word.po.Word;
import com.guang.module.word.service.WordService;

@Service
public class WordServiceImpl implements WordService{
	@Resource
	private WordMapper wordMapper;
		
	@Override
	public List<Word> getWords(Map map) {
		return wordMapper.getWords(map);
	}

	@Override
	public void insertWord(Word word) {
		Date time = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd hh:mm:ss");
		word.setTime(simpleDateFormat.format(time));
		int result = wordMapper.insertWord(word);
		System.out.println(result);
	}

	@Override
	public void deleteWord(Word word) {
		wordMapper.deleteWord(word);
	}

	@Override
	public int getWordsSize(Map map) {
		int result = wordMapper.getWordsSize(map);
		return result;
	}
	
	
}
