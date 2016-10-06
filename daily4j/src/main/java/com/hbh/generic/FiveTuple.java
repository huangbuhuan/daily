package com.hbh.generic;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
	
	public final E five;
	
	public FiveTuple(A a, B b, C c, D d, E e) {
		super(a, b, c, d);
		this.five = e;
	}
	
	public String toString() {
		return "(" + first + "." + second  + "." + three + "." + four + "." + five + ")"; 
	}
}
