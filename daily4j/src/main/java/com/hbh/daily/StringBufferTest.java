package com.hbh.daily;

public class StringBufferTest {
	
	public static void main(String[] args) {
		StringBuffer strs = new StringBuffer();
		for(int i = 0; i < 10 ;i++)
			strs.append(i);
		System.out.println(strs.toString());
	}

}
