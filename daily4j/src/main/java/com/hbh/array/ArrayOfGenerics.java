package com.hbh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayOfGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[]) la;
		ls[0] = new ArrayList<String>();
		//ls[1] = new ArrayList<Integer>();只能使用String
		Object[] objects = ls;
		objects[1] = new ArrayList<Integer>();
		System.out.println(Arrays.deepToString(objects));
		List<BerylliumSphere>[] spheres = (List<BerylliumSphere>[])new List[10];
		for(int i = 0; i < spheres.length; i++) {
			spheres[i] = new ArrayList<BerylliumSphere>();
		}
	}
}	
