package com.hbh.typeinfo;

import java.util.ArrayList;
import java.util.List;

class CountedInteger {
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return Long.toString(id);
	}
}

public class FilledList<T> {
	private Class<T> type;
	public FilledList(Class<T> type) {
		this.type = type;
	}
	public List<T> create(int nElement) {
		List<T> result = new ArrayList<T>();
		try {
			for(int i = 0; i < nElement; i++) {
				result.add(type.newInstance());
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return result;
	}
	
	public static void main(String[] args) {
		FilledList<CountedInteger> f1 = new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(f1.create(15));
	}
	
}
