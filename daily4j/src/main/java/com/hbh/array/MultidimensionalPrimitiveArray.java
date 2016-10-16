package com.hbh.array;

import java.util.Arrays;

import org.junit.experimental.max.MaxCore;

public class MultidimensionalPrimitiveArray {
	public static void main(String[] args) {
		int[][] a = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
		};
		System.out.println(Arrays.deepToString(a));
		System.out.println(0x7fffffff);
		System.out.println(max(32));
	}
	
	static int max(int n) {
		if(n == 1) {
			return 1;
		}else {
			return 2 * max(n-1);
		}
	}
}
