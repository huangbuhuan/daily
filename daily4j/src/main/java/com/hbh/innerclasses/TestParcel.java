package com.hbh.innerclasses;


class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;
		@Override
		public int value() {
			return i;
		}
	}
	protected class PDestination implements Destination {
		class a{
			class b{
				class c{
					void c(){
						System.out.println(PDestination.a.b.c.class);
					}
				}
			}
		}
		private String label;
		private PDestination (String whrerTo){
			label = whrerTo;
		}
		@Override
		public String readLabel() {
			return label;
		}
	}
	public Destination destination(String s) {
		return new PDestination(s);
	}
	public Contents contents() {
		return new PContents();
	}
}
public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p4 = new Parcel4();
		Contents c = p4.contents();
		Destination d = p4.destination("Tasmanis");
	}
}
