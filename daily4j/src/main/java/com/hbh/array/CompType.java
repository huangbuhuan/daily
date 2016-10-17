package com.hbh.array;

import java.util.Random;

import javax.annotation.Generated;
import javax.management.openmbean.CompositeType;

import com.hbh.generic.Generator;
import com.hbh.staticinitiliza.StaticInitialization;

public class CompType implements Comparable<CompType>{
	int i;
	int j;
	private static int count = 1;
	public CompType(int n1, int n2) {
		i = n1;
		j = n2;
	}
	@Override
	public int compareTo(CompType o) {
		return i < o.i ? -1 : (1 == o.i ? 0 :1);
	}
	private static Random rand = new Random(47);
	public static Generator<CompType> generator() {
		return new Generator<CompType>() {

			@Override
			public CompType next() {
				return new CompType(rand.nextInt(10), rand.nextInt(10));
			}
			
		};
	}
}
