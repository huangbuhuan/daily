package com.hbh.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericAndCovariance {
	public static void main(String[] args) {
		List<? extends Fruit> flist = new ArrayList<Apple>();
		flist.add(null);
		Fruit fruit = flist.get(0);
	}
}
