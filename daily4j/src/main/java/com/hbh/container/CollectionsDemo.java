package com.hbh.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class CollectionsDemo {
	static List<String> list = Arrays.asList("one two three Four five six one".split(" "));

	public static void main(String[] args) {
		System.out.println(list);
		//长生一个不可变的list
		System.out.println(Collections.singletonList("four"));
		//判断 两个集合有没有相同的元素, 
		System.out.println("disjoint:"
				+ Collections.disjoint(list, Collections.singletonList("four")));
		//获取最大值和最小值, 采用默认比较法
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		//采用Comparator比较
		System.out.println(Collections.min(list, String.CASE_INSENSITIVE_ORDER));
		System.out.println(Collections.max(list, String.CASE_INSENSITIVE_ORDER));
		List<String> subList = Arrays.asList("one".split(" "));
		System.out.println(subList);
		//返回出现的位置
		System.out.println("lashIndex:" + Collections.lastIndexOfSubList(list, subList));
		System.out.println("indexOf:" + Collections.indexOfSubList(list, subList));
		//替换全部
		Collections.replaceAll(list, "one", "Yo");
		System.out.println(list);
		//逆序
		Collections.reverse(list);
		System.out.println(list);
		//向后移动,末尾元素移动到首部
		Collections.rotate(list, 3);
		System.out.println(list);
		//复制并替换原容器
		List<String> source = Arrays.asList("in the matrix".split(" "));
		Collections.copy(list, source);
		System.out.println(list);
		//交换容器中元素的位置
		Collections.swap(list, 0, list.size() - 1);
		System.out.println(list);
		//改变列表顺序
		Collections.shuffle(list, new Random(47));
		System.out.println(list);
		//填充容器
		Collections.fill(list, "pop");
		System.out.println(list);
		//返回等于"pop"的元素个数
		System.out.println(Collections.frequency(list, "pop"));
		//
		List<String> dups = Collections.nCopies(3, "snap");
		System.out.println(dups);
		System.out.println(" " + Collections.disjoint(list, dups));
		Enumeration<String> e = Collections.enumeration(dups);
		Vector<String> v = new Vector<>();
		while(e.hasMoreElements()) {
			v.addElement(e.nextElement());
		}
		System.out.println(v);
		ArrayList<String> arrayList = Collections.list(v.elements());
		System.out.println(arrayList);
	}
}
