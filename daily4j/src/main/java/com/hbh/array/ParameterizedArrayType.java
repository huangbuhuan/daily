package com.hbh.array;

class ClassParameter<T> {
	public T[] f(T[] arg) {
		return arg;
	}
}
class MethodParameter {
	public static <T> T[] f(T[] arg) {
		return arg;
	}
}
public class ParameterizedArrayType {
	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Integer[] integers2 = new ClassParameter<Integer>().f(integers);
		Double[] doubles2 = new ClassParameter<Double>().f(doubles);
		integers2 = MethodParameter.f(integers);
		doubles2 = MethodParameter.f(doubles); 
	}
}
