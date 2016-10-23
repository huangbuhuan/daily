package com.hbh.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListSortSearch {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(CollectionsDemo.list);
		System.out.println(list);
		Collections.shuffle(list, new Random(47));
		System.out.println(list);
		//获取迭代器并设置迭代器的下一个元素的下标
		ListIterator<String> it = list.listIterator(5);
		while(it.hasNext()){
			it.next();
			it.remove();
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		String key = list.get(4);
		System.out.println(key);
		//搜索容器中第一个获得的元素下标位置
		int index = Collections.binarySearch(list, key);
		System.out.println(index);
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println(list);
		index = Collections.binarySearch(list, key, String.CASE_INSENSITIVE_ORDER);
		System.out.println(index);
		
	}
}
