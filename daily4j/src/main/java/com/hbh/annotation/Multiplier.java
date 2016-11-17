package com.hbh.annotation;


@ExtractInterface("IMultiplier")
public class Multiplier {
	public int multiply(int x, int y) {
		int total = 0;
		for(int i = 0; i < x; i++) {
			total = add(x, y);
		}
		return total;
	}
	private int add(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		Multiplier multiplier = new Multiplier();
		System.out.println("11*16 = " + multiplier.multiply(11, 16));
	}
}
