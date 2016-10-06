package com.hbh.generic;

public class BasicGeneratorDemo {
	public static void main(String[] args) {
		//初始化
		Generator<CountedObject> generator = BasicGenerator.create(CountedObject.class);
		for(int i = 0; i < 5; i++)
			//实例化
			System.out.println(generator.next());
	}
}
