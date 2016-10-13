package com.hbh.generic;

class CommuicateSimply {
	static void perform(Performs performs) {
		performs.speak();
		performs.sit();
	}
}

public class SimpleDogsAndRobots {
	public static void main(String[] args) {
		CommuicateSimply.perform(new PerformingDogs());
		CommuicateSimply.perform(new Robot());
	}
}
