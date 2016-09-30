package com.hbh.extend;

public class Chess extends BoardGame{

	Chess() {
		super(11);
		System.out.println("Chess construtor");
	}
	
	public static void main(String[] args) {
		Chess x = new Chess();
	}
	
}
