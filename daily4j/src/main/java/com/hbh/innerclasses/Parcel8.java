package com.hbh.innerclasses;

public class Parcel8 {
	
	public Wrapping wrapping(int x) {
		return new Wrapping(x) {
			//继承基类并重写value方法
			public int value() {
				return super.value()*47;
			}
		};//别忘了分号!
	}
	public static void main(String[] args) {
		Parcel8 p =  new Parcel8();
		Wrapping w = p.wrapping(8);
		System.out.println(w.value());
	}

}
