package com.hbh.container;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SotedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> sortedSet = new TreeSet<>();
		Collections.addAll(sortedSet,
				"one two three four five six seven eight".split(" "));
		System.out.println(sortedSet);
		//返回第一个元素
		String low = sortedSet.first();
		//返回最后一个元素
		String high = sortedSet.last();
		System.out.println(low);
		System.out.println(high);
		Iterator<String> iterator = sortedSet.iterator();
		for(int i = 0; i <= 6; i++) {
			if(i == 3) low= iterator.next();
			if(i == 6) high = iterator.next();
			else 
				iterator.next();
		}
		System.out.println(low);
		System.out.println(high);
		//含前不含后
		System.out.println(sortedSet.subSet(low, high));
		//获取小于high元素的子集
		System.out.println(sortedSet.headSet(high));
		//获取大于或等于low元素的子集
		System.out.println(sortedSet.tailSet(low));
	}
}
