package com.hbh.generic;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 一个队列
 * @author hbh
 *
 * @param <T>
 */
public class SimpleQueue<T> implements  Iterable<T> {
	private LinkedList<T> storage = new LinkedList<>();
	public void add(T t) {
		storage.add(t);
	}
	public T get() {
		return storage.pop();
	}
	@Override
	public Iterator<T> iterator() {
		return storage.iterator();
	}
	
}
