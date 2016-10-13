package com.hbh.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
	static <T>void add(List<T> list, T item) {
		list.add(item);
	}
	static List<Fruit> fflList = new ArrayList<Fruit>();
	static void f(){
		add(fflList, new Apple());
	}
	public static void main(String[] args) {
		List<? extends Fruit> flist = Arrays.asList(new Apple());
		Apple apple = (Apple)flist.get(0);
		flist.contains(new Apple());
		flist.indexOf(new Apple());
		List<Fruit> list = new ArrayList<Fruit>();
		list.add(new Apple());
		add(list, new Apple());
	}
}
