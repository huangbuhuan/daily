package com.hbh.daily;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		String contentType = "text/html; charset=gbk";
		contentType = contentType.substring(contentType.lastIndexOf("/") + 1,contentType.lastIndexOf(";"));
		System.out.println(contentType);
		File file = new File("e:/spider/");
		System.out.println();
		String str = "123.html";
		System.out.println("?:*<>".replaceAll("[\\?/:*|<>\"]", "_"));
		System.out.println(str.lastIndexOf("."));
		System.out.println((str.substring(str.lastIndexOf(".") + 1)));
		boolean aa = 5==5?true:false;
	}

}
