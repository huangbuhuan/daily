package com.hbh.daily;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 测试用
	 */
	private static final long serialVersionUID = -2156547593289371682L;

	private static String userName;
	
	private transient Integer age;
	
	private int weight;
	
	private transient static String gender;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	

	
}
