package com.hbh.array;

public class Sort {
	public static void quicksort(int n[], int left, int right) {
		if(left < right) {
			int i = left, j = right, x=n[left];
			while(i < j) {
				while(i < j && n[j] >= x) {
					j--;
				}
				if(i < j) {
					n[i++] = n[j];
				}
				while(i < j && n[i] < x) {
					i++;
				}
				if(i < j) {
					n[j--] = n[i];
				}
			}
			quicksort(n, left, i - 1);
			quicksort(n, i + 1, right);
		}
	}
	
}
