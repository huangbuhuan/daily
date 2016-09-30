package com.hbh.extend;
class Bar {
	void f() {
		System.out.println("bar : f");
	}
	void g() {
		System.out.println("bar :g");
	}
}
public class Car extends Bar{
	void f() {
		System.out.println("car :f");
	}
	void c() {
		System.out.println("car : c");
	}
	public static void main(String[] args) {
		Bar b = new Car();
		b.f();
	}
}
