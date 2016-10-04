package com.hbh.stringdemo;

public class Imutable {
	
	public static String upcase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		String q = "howdy";
		System.out.println(q);
		//创建了一个q的副本,并转换成大写
		String qq = upcase(q);
		System.out.println(qq);
		System.out.println(q);
	}

}
