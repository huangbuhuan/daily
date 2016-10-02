package com.hbh.innerclasses;

public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	public Contents contents(){
		return new MyContents();
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		p.contens();
	}
}
