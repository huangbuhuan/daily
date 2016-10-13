package com.hbh.generic;

import com.hbh.typeinfo.pets.Dog;

class PerformingDogs extends Dog implements Performs {
	public void speak(){
		System.out.println("Woof");
	}


	@Override
	public void sit() {
		System.out.println("sitting");
	}
	public void reproduce() {
		
	}
}
class Robot implements Performs {

	@Override
	public void speak() {
		System.out.println("Click");
	}

	@Override
	public void sit() {
		System.out.println("Clank");
	}
	
	public void oilChange() {
		
	}
}
class Communicate {
	public static <T extends Performs> void performs(T performer) {
		performer.speak();
		performer.sit();
	}
}
public class DogsAndRobots {
	public static void main(String[] args) {
		PerformingDogs d = new PerformingDogs();
		Robot r = new Robot();
		Communicate.performs(d);
		Communicate.performs(r);
	}
}
