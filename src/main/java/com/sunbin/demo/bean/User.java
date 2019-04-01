package com.sunbin.demo.bean;

public class User {
	private String uid;
	private String username;
	private String age;
	private String gender;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public User(String uid, String username, String age, String gender) {
		super();
		this.uid = uid;
		this.username = username;
		this.age = age;
		this.gender = gender;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
