package com.hbh.typeinfo;


class Candy {
	
	static {
		System.out.println("Candy");
	}
	
}

class Gum {
	
	static {
		System.out.println("Gum");
	}
	
}

class Cookie {
	
	static {
		System.out.println("Cookie");
	}
}

public class SweetSop {
	
	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating candy");
		try {
			Class.forName("com.hbh.typeinfo.Gum");
		} catch (ClassNotFoundException e) {
			System.out.println("Couldn't find Gum");
		}
		System.out.println("After creating gum");
		new Cookie();
		System.out.println("After creating cookie");
	}
}
