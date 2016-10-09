package com.hbh.generic;

public class GenericArray2<T> {
	private Object[] array;
	public GenericArray2(int sz) {
		array = new Object[sz];
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	@SuppressWarnings(value="unchecked")
	public T get(int index) {
		return (T)array[index];
	}
	@SuppressWarnings(value="unchecked")
	public T[] rep() {
		return (T[])array;
	}
	public static void main(String[] args) {
		GenericArray2<Integer> gai = new GenericArray2<>(10);
		int i = 0;
		while(i < 10) {
			gai.put(i, i);
			i++;
		}
		System.err.println(gai.get(0));
		Integer[] ia = gai.rep();
	}
}
