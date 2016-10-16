package com.hbh.array;

public class ArrayOfGenericType<T> {
	T[] array;
	@SuppressWarnings("unchecked")
	public ArrayOfGenericType(int size) {
		//array = new T[size];边界擦除使得泛型不适用
		array = (T[]) new Object[size];
		//array = { new T(), new T()};
	}
}
