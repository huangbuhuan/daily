package com.hbh.innerclasses;

class Egg {
	
	private York york;
	
	protected class York {
		public York() {
			System.out.println("egg.york");
		}
	}
	public Egg() {
		System.out.println("new egg");
		york = new York();
	}
}
public class BigEgg extends Egg{
	
	public class York {
		
		public York() {
			System.out.println("bigegg.york");
		}
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
}
