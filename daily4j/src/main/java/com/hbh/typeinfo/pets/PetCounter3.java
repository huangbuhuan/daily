package com.hbh.typeinfo.pets;

import java.util.LinkedHashMap;

public class PetCounter3 {
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
		public PetCounter() {
		}
	}

}
