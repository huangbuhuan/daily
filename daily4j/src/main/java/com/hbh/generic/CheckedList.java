package com.hbh.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hbh.typeinfo.pets.Cat;
import com.hbh.typeinfo.pets.Dog;
import com.hbh.typeinfo.pets.Pet;

public class CheckedList {
	@SuppressWarnings("unchecked")
	static void oldStyleMethod(List probablyDogs) {
		probablyDogs.add(new Cat());
	}
	public static void main(String[] args) {
		List<Dog> dogs1 = new ArrayList<>();
		oldStyleMethod(dogs1);
		List<Dog> dogs2 = Collections.checkedList(new ArrayList<Dog>(), Dog.class);
		try {
			//报错
			oldStyleMethod(dogs2);
		} catch (Exception e) {
			System.out.println("出错啦");
		}
		//无问题
		List<Pet> pets = Collections.checkedList(new ArrayList<Pet>(), Pet.class);
		pets.add(new Dog());
		pets.add(new Cat());
	}
}
