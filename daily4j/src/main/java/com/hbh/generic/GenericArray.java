package com.hbh.generic;

public class GenericArray<T> {
	private T[] array;
	
	@SuppressWarnings(value ="unchecked")
	public GenericArray(int sz) {
		array = (T[])new Object[sz];
	}
	
	public void put(int index, T item) {
		array[index] = item;
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public T[] rep() {
		return array;
	}
	public static void main(String[] args) {
		GenericArray<Integer> gai = new GenericArray<Integer>(10);
		//实际运行为Object类型,java.lang.ClassCastException
		//Integer[] ia = gai.rep();
		//正确
		Object[] oa = gai.rep();
	}
}
