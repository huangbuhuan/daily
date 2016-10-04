package com.hbh.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class SetTest {
	
	@Test
	public void test() {
		final Set<String> set = new HashSet<String>(16);
		for(int i = 0; i < 20 ; i++) {
			set.add("" + i);
			System.out.println(set.size());
		}
		Map<String, String> map = new HashMap<String, String>();
	}

}
