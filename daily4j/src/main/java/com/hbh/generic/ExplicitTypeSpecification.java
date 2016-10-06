package com.hbh.generic;

import java.util.List;
import java.util.Map;

import com.hbh.typeinfo.pets.Person;
import com.hbh.typeinfo.pets.Pet;

public class ExplicitTypeSpecification {
	
	static void f(Map<Person, List<? extends Pet>> petPeople) {}
	
	public static void main(String[] args) {
		/*
		 * 不能将泛型调用的结果当作参数传递
		 * f(New.map());*/
		f(New.<Person, List<? extends Pet>>map());
	}
}
