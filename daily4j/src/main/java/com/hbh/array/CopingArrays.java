package com.hbh.array;

import java.util.Arrays;

public class CopingArrays {
	public static void main(String[] args) {
		int[] a = new int[7];
		int[] b = new int[10];
		
		Arrays.fill(a, 7);
		System.out.println(Arrays.toString(a));
		Arrays.fill(b, 8);
		System.out.println(Arrays.toString(b));
		//要拷贝的数组, 偏移量, 目标数组, 偏移量, 长度. 
		//如果拷贝的数组为对象数组, 只复制对象的引用, 而且不会进行自动包装和拆包.
		System.arraycopy(a, 0, 8, 0, a.length);
		System.out.println(Arrays.toString(b));
	}
}
