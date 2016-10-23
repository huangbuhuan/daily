package com.hbh.container;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReadOnly {
	static Collection<String> data = Arrays.asList("A B C D".split(" "));
	public static void main(String[] args) {
		Collection<String> collection = Collections.unmodifiableCollection(data);
		System.out.println(collection);
		//出现错误
		try {
			collection.add("E");
		} catch (Exception e) {
			System.out.println("该对象不可修改!!");
		}
	}
}
