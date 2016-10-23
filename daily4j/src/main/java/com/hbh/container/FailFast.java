package com.hbh.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class FailFast {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("an object");
		try {
			String s = it.next();
		} catch (ConcurrentModificationException e) {
			System.out.println(e);
		}
	}
}
