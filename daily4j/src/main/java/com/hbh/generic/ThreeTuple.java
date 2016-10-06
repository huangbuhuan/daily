package com.hbh.generic;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
	
	public final C three;
	
	public ThreeTuple(A a, B b, C c) {
		super(a, b);
		this.three = c;
	}
	
	public String toString() {
		return "(" + first + "." + second  + "." + three + ")"; 
	}
	
}
