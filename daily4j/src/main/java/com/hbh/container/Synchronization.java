package com.hbh.container;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Synchronization {
	public static void main(String[] args) {
		//自动同步整个容器
		Collection<String> c = Collections
				.synchronizedCollection(new ArrayList<String>());

	}
}
