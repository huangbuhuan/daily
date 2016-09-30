package com.hbh.staticinitiliza;

public class Cupboard {
	
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard() {
		System.out.println("Cupboard");
		bowl4.f1(2);
	}
	void f3(int mark) {
		System.out.println("f3 " + mark+ " ");
	}
	static Bowl bowl5 = new Bowl(5);

}
