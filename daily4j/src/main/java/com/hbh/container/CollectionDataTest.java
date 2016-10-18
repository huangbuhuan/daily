package com.hbh.container;

import java.util.LinkedHashSet;
import java.util.Set;

import com.hbh.generic.Generator;

class Goverment implements Generator<String> {
	String[] foundation = ("String women lying in ponds "
			+ "distributing sword is no basis for a system of "
			+ "goverment").split(" ");
	private int index;
	@Override
	public String next() {
		return foundation[index++];
	}
}
public class CollectionDataTest {
	public static void main(String[] args) {
		//LinkedHashSet保持了插入顺序的链接顺序
		Set<String> set = new LinkedHashSet<>(
				new CollectionData<String>(new Goverment(), 15));
		//有顺序的不重复集合
		set.addAll(CollectionData.list(new Goverment(), 15));
		System.out.println(set);
	}
}
