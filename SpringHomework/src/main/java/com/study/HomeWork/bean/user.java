package com.study.HomeWork.bean;

public class user {
	private static final long serialVersionUID = 9079219847479368296L;

	private Long id;
	private String userName;
	private Integer age;
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public user(Long id, String userName, Integer age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", age=" + age + "]";
	}
	
	

}
