package com.hbh.array;

import com.hbh.generic.Generator;

public class GeneratorsTest {
	public static int size = 10;
	public static void test(Class<?> surroundingClass) {
		for(Class<?> type : surroundingClass.getClasses()) {
			System.out.println(type.getSimpleName());
			try {
				Generator<?> generator = (Generator<?>) type.newInstance();
				for(int i = 0; i < size; i++) {
					generator.next();
				}
			} catch (Exception e) {
				throw new RuntimeException();
			}
		}
	}
	public static void main(String[] args) {
		test(CountingGenerator.class);
	}
}
