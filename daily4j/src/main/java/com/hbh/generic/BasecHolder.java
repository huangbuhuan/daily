package com.hbh.generic;

public class BasecHolder<T> {
	T element;
	void set(T arg) {
		element = arg;
	}
	T get() {
		return element;
	}
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}
