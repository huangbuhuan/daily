package com.hbh.array;

import com.hbh.generic.Generator;

public class CountingGenerator {
	public static class Boolean implements Generator<java.lang.Boolean> {
		private boolean value = false;
		@Override
		public java.lang.Boolean next() {
			value = !value;
			return value;
		}
	}
}
