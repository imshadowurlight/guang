package com.guang.module.account.po;

public class Account {
	private Integer id;
	private String name;	//账户名
	private String passwd;	//账户密码
	private String email;	//认证邮箱
	private String phone;	//认证手机
	private String website; //网站名称
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Integer id, String name, String passwd, String email,
			String phone, String website) {
		super();
		this.id = id;
		this.name = name;
		this.passwd = passwd;
		this.email = email;
		this.phone = phone;
		this.website = website;
	}
	
	
	
}
