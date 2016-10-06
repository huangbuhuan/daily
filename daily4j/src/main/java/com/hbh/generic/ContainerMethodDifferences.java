package com.hbh.generic;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ContainerMethodDifferences {
	
	static Set<String> methodSets(Class<?> type) {
		Set<String> result = new TreeSet<String>();
		for(Method method : type.getMethods()){
			result.add(method.getName());
		} 
		return result;
	}
	
	static void interfaces(Class<?> type) {
		System.out.println("interfaces in " + type.getSimpleName());
		List<String> result = new ArrayList<String>();
		for(Class<?> c : type.getInterfaces()) {
			result.add(c.getSimpleName());
		}
		System.out.println(result);
	}
	
	static Set<String> object = methodSets(Object.class);
	
	static {
		object.add("clone");
	}
	
	static void diffence(Class<?> superset, Class<?> subset) {
		System.out.println(superset.getSimpleName() + " extends " + subset.getSimpleName());
		Set<String> comp = Sets.difference(methodSets(superset), methodSets(subset));
		comp.removeAll(object);
		System.out.println(comp);
		interfaces(superset);
	}
}
