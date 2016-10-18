package com.hbh.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class StringAddress {
	private String s;
	public StringAddress(String s) {
		this.s = s;
	}
	public String toString() {
		return super.toString() + " " + s;
	}
}
public class FillingLists {
	public static void main(String[] args) {
		//填充对象
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		//fill只能替换已有的元素, 不能添加新的元素
		Collections.fill(list, new StringAddress("World"));
		System.out.println(list);
	}
}
