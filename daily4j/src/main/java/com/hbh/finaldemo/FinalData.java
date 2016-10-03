package com.hbh.finaldemo;

import java.util.Random;

public class FinalData {
	
	int a = 1;
	
	final int b = 2;
	
	static Random random = new Random();
	 
	final int I = random.nextInt(20);
	
	static int J = random.nextInt(20);
	
	public static void main(String[] args) {
		System.out.println("I:" + new FinalData().I);
		System.out.println("I1:" + new FinalData().I);
		System.out.println("J:" + new FinalData().J);
		System.out.println("J1:" + new FinalData().J);
	}

}
