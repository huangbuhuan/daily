package com.hbh.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}
	public Iterable<T> reversed() {
		//返回一个匿名内部类Iterable
		return new Iterable<T>() {
			//重写iterator方法
			@Override
			public Iterator<T> iterator() {
				//返回一个匿名内部类Iterator
				return new Iterator<T>() {
					//重写hasNext和next方法
					int current = size() - 1;
					public boolean hasNext() {
						return current > -1;
					}
					public T next() {
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
				
			}
			
		};
	}
}
public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
				Arrays.asList("To be or not to be".split(" ")));
		for(String s : ral) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(String s : ral.reversed()) {
			System.out.print(s + " ");
		}
	}
}
