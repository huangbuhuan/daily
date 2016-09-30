package com.hbh.staticinitiliza;

public class Table {
	
	public static Bowl bowl = new Bowl(1);
	Table() {
		System.out.println("Table()");
		bowl2.f1(1);
	}
	public void f2(int maker) {
		System.out.println("f2 " + maker +" ");
	}
	public static Bowl bowl2 =new Bowl(2);

}
