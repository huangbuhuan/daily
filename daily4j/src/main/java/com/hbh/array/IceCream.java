package com.hbh.array;

import java.util.Arrays;
import java.util.Random;

public class IceCream {
	private static Random rand = new Random(47);
	static final String[] FLAVORS = {
		"Chocolate", "Strawberry", "Vanilla Fudge Swirl",
		"Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
		"Praline Cream", "Mud Pie"
	};
	public static String[] flavorSet(int n) {
		if(n > FLAVORS.length) {
			throw new IllegalArgumentException("Set too big");
		}
		String[] result = new String[n];
		boolean[] piked = new boolean[FLAVORS.length];
		for(int i = 0; i < n; i++) {
			int t;
			do{
				t = rand.nextInt(FLAVORS.length);
			}while(piked[t]);
			result[i] = FLAVORS[t]; 
			piked[t] = true;
		}
		return result;
	}
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {
			System.out.println(Arrays.toString(flavorSet(3)));
		}
	}
}
