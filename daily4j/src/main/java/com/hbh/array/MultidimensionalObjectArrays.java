package com.hbh.array;

import java.util.Arrays;

public class MultidimensionalObjectArrays {
	public static void main(String[] args) {
		BerylliumSphere[][] berylliumSpheres = {
				{ new BerylliumSphere(), new BerylliumSphere() },
				{ new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere()},
				{ new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere(),
				  new BerylliumSphere(), new BerylliumSphere()}
		};
		System.out.println(Arrays.deepToString(berylliumSpheres));
	}
}
