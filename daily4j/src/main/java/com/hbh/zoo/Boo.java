package com.hbh.zoo;

class Zoo extends Boo{
	public  void f() {
		System.out.println("Zoo.f()");
	}
	public void g() {
		System.out.println("Zoo.g()");
	}

}
public class Boo {
	private  void f() {
		System.out.println("Boo.f()");
	}
	public void g() {
		System.out.println("Boo.g()");
	}
	public static void main(String[] args) {
		Boo b = new Zoo();
		b.f();
		b.g();
	}
}
