package com.hbh.generic.watercolors;

import java.util.EnumSet;
import java.util.Set;

import com.hbh.generic.Sets;

public class WaterColorsSets {
	public static void main(String[] args) {
		Set<Watercolors> set1 = EnumSet.range(Watercolors.BRILLIAN_RED,
				Watercolors.VIRIDIAN_HUE);
		Set<Watercolors> set2 = EnumSet.range(Watercolors.CERULEAN_BLUE_HUE,
				Watercolors.BURNT_UMBER);
		System.out.println("set1 :" + set1);
		System.err.println("set2 :" + set2);
		System.out.println("union : " + Sets.union(set1, set2));
	}
}
