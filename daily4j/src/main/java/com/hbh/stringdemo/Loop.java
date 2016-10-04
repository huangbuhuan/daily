package com.hbh.stringdemo;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Loop {

	public static void main(String[] args) throws Exception {
		

		
	}
	@Test
	public void test(){
		StringBuilder str = new StringBuilder("dummy");

		for (int i = 0; i < 25; i++) {
			str.append(str);
		}

		System.out.println("len: " + str.length());

		System.out.print("inner: ");
		final long startInner = System.currentTimeMillis();
		innerLen(str.toString());
		System.out.println(System.currentTimeMillis() - startInner);
		System.out.print("outer: ");
		final long startOuter = System.currentTimeMillis();
		outerLen(str.toString());
		System.out.println(System.currentTimeMillis() - startOuter);
	}
	public static void outerLen(final String s) {
		int sum = 0;

		final int len = s.length();
		for (int i = 0; i < len; i++) {
			sum += i;
		}
	}

	public static void innerLen(final String s) {
		final Set<String> set = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += i;
		}
	}
}
