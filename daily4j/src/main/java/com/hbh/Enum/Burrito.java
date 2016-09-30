package com.hbh.Enum;

public class Burrito {
	
	Sipciness degree;
	
	public Burrito(Sipciness degree) {
		this.degree = degree;
	}
	
	public void descripe() {
		System.out.println("This burrito is ");
		switch(degree) {
			case NOT:
				System.out.println("not spicy at all");
			case MILD:
			case MEDIUM:
				System.out.println("a little hot.");
				break;
			case HOT:
			case FLAMING:
			default: System.out.println("maybe to hot");
			
		}
	}
	public static void main(String[] args) {
		Burrito plain = new Burrito(Sipciness.HOT);
		plain.descripe();
	}

}
