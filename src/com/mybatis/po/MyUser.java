package com.mybatis.po;

public class MyUser {
	private String name;
	private String passwd;
	private Integer id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd=passwd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String toString() {
		return "User [name="+ name +",passwd="+passwd+",id="+id+"]";
	}
}
