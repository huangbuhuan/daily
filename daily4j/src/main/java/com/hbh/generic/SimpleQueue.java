package com.hbh.generic;

import java.io.ObjectInputStream.GetField;
import java.util.Iterator;
import java.util.LinkedList;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

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
