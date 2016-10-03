package com.hbh.typeinfo;

import java.util.Random;

class Initable {
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.random.nextInt();
	static {
		System.out.println("Initializing Initable");
	}
}

class Initable2 {
	static int staticNotFinal = 74;
	static {
		System.out.println("Initializing Initable2");
	}
}

class Initable3 {
	static int staticNotFinal = 74;
	static {
		System.out.println("Initialzing Initable3");
	}
}

public class ClassInitialization {
	public static Random random = new Random(47);
	public static void main(String[] args) throws ClassNotFoundException {
		//加载 不会初始化静态块
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		//static final为编译期常量 不需要初始化就能读取静态域 
		System.out.println(Initable.staticFinal);
		//初始化
		System.out.println(Initable.staticFinal2);
		System.out.println(Initable2.staticNotFinal);
		//用Class.forName立即初始化
		Class initable3 = Class.forName("com.hbh.typeinfo.Initable3");
		System.out.println("After creating Initable3 ref");
		System.out.println(Initable3.staticNotFinal);
	}
}
