package com.hbh.innerclass;
abstract class Base {
	public Base(int i) {
		System.out.println("b.Base()" + i);
	}
	public abstract void f();
}
public class AnonymousConstructor {
	
	/** 外部的参数在匿名内部类中使用时必须被修饰为final */
	public static Base getBase(int i) {
		return new Base(i) {
			{
				System.out.println("代码块");
			}
			@Override
			public void f() {
				System.out.println("a.f()");
			}
		};
	}
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}
