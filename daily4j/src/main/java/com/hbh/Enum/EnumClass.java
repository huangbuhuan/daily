package com.hbh.Enum;

enum Shrubber{
	GROUND, CRAWLING, HANGING
}

public class EnumClass {
	public static void main(String[] args) {
		for(Shrubber s : Shrubber.values()) {
			System.out.println(s + " ordinal " + s.ordinal());
			System.out.println(s.compareTo(Shrubber.CRAWLING) + " ");
			System.out.println(s.equals(Shrubber.CRAWLING) + " ");
			System.out.println(s == Shrubber.CRAWLING);
			System.out.println(s.getDeclaringClass());
			System.out.println(s.name());
			System.out.println("--------");
		}
	}
}
