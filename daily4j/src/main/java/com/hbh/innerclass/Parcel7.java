package com.hbh.innerclass;

public class Parcel7 {
	public Contents contens() {
		return new Contents() {
			private int i = 11;
			@Override
			public int value() {
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contens();
	}

}
