package com.hbh.innerclass;

public class Parcell {
	
	class Contents {
		private int i =11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		String readLabel() {
			return label;
		}
	}
	/**
	 * 使用内部类和使用普通类没有什么不同*/
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcell p = new Parcell();
		p.ship("Tasmannia");
		Parcel3 p3 = new Parcel3();
		Parcel3.Contents pc = p3.new Contents();
	}

}
