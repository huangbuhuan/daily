package com.hbh.container;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CollectionMethods {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("ten");
		c.add("eleven");
		System.out.println(c);
		Object[] array = c.toArray();
		System.out.println(new String().getClass());
		System.out.println((new String[0]).getClass());
		/*转换为String数组, 如果长度大于list的长度, 拷贝list.size个对象
		 *其他为null*/
		String[] strs = c.toArray(new String[3]);
		System.out.println("strs :" + Arrays.toString(strs));
		System.out.println("max : " + Collections.max(c));
		System.out.println("min : " + Collections.min(c));
		Collection<String> t2 = new ArrayList<String>();
		t2.add("one");
		c.addAll(t2);
		System.out.println(c);
		//循环判断是否存在, 如果存在就进行缩容, 并将list.(size-1)的对象置为null
		c.remove("one");
		System.out.println(c);
		//返回一个0-2的内部类
		Collection<String> c3 = ((List<String>)c).subList(0, 2);
		c.addAll(c3);
		/*
		 * 清除所有的对象,modCount++(用来记录容器增删改的数量, 多线程环境来判
		 * 断在执行某一操作时, 该容器是否被其他线程修改),
		 * elementData循环置为null, size = 0
		 */
		c.clear();
	}
}
