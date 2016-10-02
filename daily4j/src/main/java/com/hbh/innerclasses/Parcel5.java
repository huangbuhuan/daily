package com.hbh.innerclasses;

public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;
			@Override
			public String readLabel() {
				return label;
			}
			private PDestination(String s) {
				label = s;
			}
		}
		return new PDestination(s);
	}
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		p.destination("Tasmania");
	}

}
