package com.hbh.typeinfo;

class Buiding {
	
}
class House extends Buiding {
	
}
public class ClassCasts {
	public static void main(String[] args) {
		Buiding buiding = new Buiding();
		Class<House> house = House.class;
		House h = house.cast(buiding);
		h = (House)buiding;
	}
}
