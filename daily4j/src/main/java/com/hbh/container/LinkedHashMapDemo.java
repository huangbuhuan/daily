package com.hbh.container;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "mysql");
		map.put(2, "oracle");
		map.put(3, "mongodb");
		map.put(4, "redis");
		map.put(5, "memcache");
		//按插入时顺序遍历
		System.out.println(map);
		map = new LinkedHashMap<>(16, 0.75f, true);
		map.put(6, "InfoGrid");
		map.put(7, "HBase");
		System.out.println(map);
		//由于LRU算法被访问后移动到了队列后端
		map.get(6);
		System.out.println(map);
	}
}
