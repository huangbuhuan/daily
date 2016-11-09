package com.hbh.Enum;

import java.util.EnumSet;

public class EnumSets {
	public static void main(String[] args) {
		EnumSet<OzWitch> set = EnumSet.of(OzWitch.EAST, OzWitch.NORTH);
		for(OzWitch oz : set) {
			System.out.println(oz.getDescription());
		}
	}
}
