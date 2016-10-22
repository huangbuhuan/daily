package com.hbh.container;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {
	public static <T extends Groundhog> void detectSpring(Class<T> type)
			throws Exception {
		Constructor<T> ghog = type.getConstructor(int.class);
		Map<Groundhog, Prediction> map = new HashMap<>();
		for(int i = 0; i < 10; i++) {
			map.put(ghog.newInstance(i), new Prediction());
		}
		System.out.println(map);
		Groundhog gh = ghog.newInstance(3);
		System.out.println(gh);
		if(map.containsKey(gh)) {
			System.out.println(map.get(gh));
		}else {
			System.out.println("not found");
		}
	}
	public static void main(String[] args) throws Exception {
		detectSpring(Groundhog.class);
	}
}
