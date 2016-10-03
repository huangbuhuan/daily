package com.hbh.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "A B C D E F".split(" "));
		set1.add("G");
		System.out.println("H:" + set1.contains("H"));
		System.out.println("I:" + set1.contains("E"));
		Set<String> set2 = new HashSet<String>();
		Collections.addAll(set2, "D E F G".split(" "));
		System.out.println(set1.containsAll(set2));
		set1.remove("G");
		System.out.println(set1);
		System.out.println(set1.containsAll(set2));
		//差集
		set1.removeAll(set2);
		System.out.println("差集:" + set1);
		//并集
		set1.addAll(set2);
		System.out.println("并集:" + set1);
		//交集
		set1.retainAll(set2);
		System.out.println(set1);
		Collections.addAll(set1, "X Y Z".split(" "));
		System.out.println("add X Y Z :" + set1);
		
	}
}
