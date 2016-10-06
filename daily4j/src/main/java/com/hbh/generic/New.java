package com.hbh.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import com.hbh.collection.SetTest;

public class New {
	
	public static <K, V> Map<K, V> map() {
		return new HashMap<K, V>();
	}
	
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> lLisk() {
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> Set() {
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}
	
	public static void main(String[] args) {
		Map<String, List<String>> map = map();
		List<String> list = list();
		LinkedList<String> lList = lLisk();
		Set<String> ss = Set();
		Queue<String> queue = queue();
	}

}
