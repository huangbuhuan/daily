package com.hbh.container;

import java.util.Map;

public class Maps {
	public static void printKeys(Map<Integer, String> map) {
		System.out.println("size:" + map.size());
		System.out.print("keys:");
		System.out.println(map.keySet());
	}
	public static void test(Map<Integer, String> map) {
		System.out.println(map.getClass().getSimpleName());
		printKeys(map);
		map.keySet().removeAll(map.keySet());
	}
}
