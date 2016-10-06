package com.hbh.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	
	public static <T> List<T> makeList(T... args) {
		List<T> result = new ArrayList<T>();
		for(T item : args){
			result.add(item);
		}
		return result;
	}
	
	public static void main(String[] args) {
		List<String> list = makeList(args);
		System.out.println(list);
		list = makeList("A", "B", "C");
		System.out.println(list);
		list = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(list);
	}

}
