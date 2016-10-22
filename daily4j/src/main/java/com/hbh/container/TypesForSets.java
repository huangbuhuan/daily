package com.hbh.container;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetType {
	int i;
	public SetType(int n) {
		i = n;
	}
	public boolean equals(Object object) {
		return object instanceof SetType && (i == ((SetType)object).i);
	}
	public String toString() {
		return Integer.toString(i);
	}
}
class HashType extends SetType {
	public HashType(int n) {
		super(n);
	}
	public int hashCode() {
		return i;
	}
}
class TreeType extends SetType implements Comparable<TreeType>{
	public TreeType(int n) {
		super(n);
	}

	@Override
	public int compareTo(TreeType o) {
		return (o.i < i ? -1 : (o.i == i ? 0 : 1));
	}
}
public class TypesForSets {
	static <T> Set<T> fill(Set<T> set, Class<T> type) {
		try {
			for(int i = 0; i < 10; i++) {
				set.add(type.getConstructor(int.class).newInstance(i));
			}
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return set;
	}
	static <T> void test(Set<T> set, Class<T> type) {
		fill(set, type);
		fill(set, type);
		fill(set, type);
		System.out.println(set);
	}
	public static void main(String[] args) {
		//无序无重复
		test(new HashSet<HashType>(), HashType.class );
		//无序无重复
		test(new LinkedHashSet<HashType>(), HashType.class);
		//有序无重复
		test(new TreeSet<TreeType>(), TreeType.class);
		//以一定顺序排序有重复
		test(new HashSet<TreeType>(), TreeType.class );
		//按插入顺序排序
		test(new LinkedHashSet<TreeType>(), TreeType.class );
		//没有实现Comparable接口报错
		try {
			test(new TreeSet<HashType>(), HashType.class);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}