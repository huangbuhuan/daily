package com.hbh.container;

public class Groundhog2 extends Groundhog{
	public Groundhog2(int n) {
		super(n);
	}
	public int hashCode() {
		return number;
	}
	public boolean equals(Object o) {
		return o instanceof Groundhog2 &&
				(number == ((Groundhog2)o).number);
	}
	public static void main(String[] args) throws Exception {
		//重写hashCode和equals方法后返回true
		SpringDetector.detectSpring(Groundhog2.class);
	}
}
