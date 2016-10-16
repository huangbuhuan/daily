package com.hbh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	public String toString() {
		return "Shpere" + id;
	}
}
public class ContainerCompersion {
	public static void main(String[] args) {
		BerylliumSphere[] berylliumSpheres = new BerylliumSphere[10];
		for(int i = 0; i < berylliumSpheres.length; i++) {
			berylliumSpheres[i] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(berylliumSpheres));
		System.out.println(berylliumSpheres[4]);
		List<BerylliumSphere> list = new ArrayList<BerylliumSphere>();
		for(int i = 0; i < 5; i++) {
			list.add(new BerylliumSphere());
		}
		System.out.println(list);
		System.out.println(list.get(4));
		List<Integer> integers = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
		integers.add(99);
		System.out.println(integers);
		System.out.println(integers.get(4));
	}
}
