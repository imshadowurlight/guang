package com.guang.module.word.po;

public class Word {
	
	private int id;
	private String enword;		//英语单词
	private String zhword;		//中文解释
	private int status;			//状态(1:可用,0:禁用)
	private String time;		//添加时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnword() {
		return enword;
	}
	public void setEnword(String enword) {
		this.enword = enword;
	}
	public String getZhword() {
		return zhword;
	}
	public void setZhword(String zhword) {
		this.zhword = zhword;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Word() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Word(int id, String enword, String zhword, int status, String time) {
		super();
		this.id = id;
		this.enword = enword;
		this.zhword = zhword;
		this.status = status;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Word [id=" + id + ", enword=" + enword + ", zhword=" + zhword
				+ ", status=" + status + ", time=" + time + "]";
	}
	
	
	
	
}
