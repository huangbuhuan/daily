package com.hbh.generic;

import java.util.HashSet;
import java.util.Set;


public class Sets {
	
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		//并集
		result.addAll(b);
		return result;
	}
	
	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		//交集
		result.retainAll(b);
		return result;
	}
	
	public static <T> Set<T> difference(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		//差集
		result.removeAll(b);
		return result;
	}
	
	public static <T> Set<T> complement(Set<T> a, Set<T> b) {
		return difference(union(a, b), intersection(a, b));
	}
}
