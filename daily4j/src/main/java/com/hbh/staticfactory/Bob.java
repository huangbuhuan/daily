package com.hbh.staticfactory;
class Ded {
	public static Ded getInstance (Ded ded){
		return ded;
	}
	void f() {
		System.out.println("ded");
	}
}
public class Bob extends Ded{
	void f() {
		System.out.println("bob");
	}
	public static void main(String[] args) {
		Ded ded = Ded.getInstance(new Bob());
		ded.f();
	}

}
