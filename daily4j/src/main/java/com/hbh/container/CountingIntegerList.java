package com.hbh.container;

import java.util.AbstractList;

import com.hbh.generic.New;

public class CountingIntegerList extends AbstractList<Integer>{
	private int size;
	@Override
	public Integer get(int index) {
		return Integer.valueOf(index);
	}

	@Override
	public int size() {
		return size;
	}
	public CountingIntegerList(int size) {
		this.size = size < 0 ? 0 : size;
	}
	
	public static void main(String[] args) {
		System.out.println(new CountingIntegerList(30));
	}
	
}
