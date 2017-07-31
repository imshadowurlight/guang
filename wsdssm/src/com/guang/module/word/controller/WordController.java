package com.guang.module.word.controller;

import com.alibaba.fastjson.JSONObject;
import com.guang.beans.PageBean;
import com.guang.module.word.po.Word;
import com.guang.module.word.service.WordService;
import com.guang.utils.ResponseUtil;
import net.sf.json.JSONArray;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/word")
public class WordController {
	
	@Resource
	private WordService wordService;
	JSONObject data =new JSONObject();
	static Logger log = Logger.getLogger(WordController.class);
	
	/**
	 * 单词页面跳转
	 * */
	
	@RequestMapping("wordList")
	public String  wordList(Model model){
		
		return "word"; 
	}
	
	/**
	 * 获取单词集合
	 * */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("list")
	public String List(@RequestParam(value = "page", required = false) String page, 
			@RequestParam(value = "rows", required = false) String rows,
			Word word,HttpServletResponse response){
		try {
			Map map = new HashMap();
			if(!StringUtils.isBlank(page) && !StringUtils.isBlank(rows)){
				PageBean pageBean = new PageBean(Integer.parseInt(page), Integer.parseInt(rows));
				map.put("start", pageBean.getStart());
				map.put("size", pageBean.getPageSize());
			}
			List<Word> words = wordService.getWords(map);
			int total = wordService.getWordsSize(map);				
			//按格式封装数据
			JSONArray jsonWords = JSONArray.fromObject(words);
			data.put("total", total);
			data.put("rows", jsonWords);
			ResponseUtil.write(response, data);
			log.info("request: word/list ,  map: " + map.toString());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 添加单词
	 * */
	@RequestMapping("saveWord")
	public String saveWord(Word word,HttpServletResponse response){
		try {
			wordService.insertWord(word);
			data.put("msg", "单词添加成功");
			log.info("request: word/saveWord ,  map: " + data.toString());
			ResponseUtil.write(response, data);
		} catch (Exception e) {
			e.printStackTrace();
			data.put("errorMsg", "单词添加失败");
			log.info("request: word/saveWord ,  map: " + data.toString());
		}
		return null;
	}
	
	/**
	 * 删除单词
	 * */
	@RequestMapping("deleteWord")
	public String deleteWord(Word word,HttpServletResponse response){
		try {
			wordService.deleteWord(word);
			data.put("msg", "删除单词成功");
			log.info("request: word/deleteWord ,  map: " + data.toString());
			ResponseUtil.write(response, data);
		} catch (Exception e) {
			data.put("errorMsg", "删除单词失败");
			log.info("request: word/deleteWord ,  map: " + data.toString());
			e.printStackTrace();
		}
		return null;
	}
}
