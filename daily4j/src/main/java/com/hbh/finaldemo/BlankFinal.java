package com.hbh.finaldemo;

class PopPet {
	
	private int i;
	PopPet (int li) { i = li;}

}

public class BlankFinal {
	private final int i =0;
	private final int j;
	private final PopPet p;
	public BlankFinal() {
		j = 1;
		p = new PopPet(1);
	}
	public BlankFinal(int i) {
		j = i ;
		p = new PopPet(i);
	}
	public static void main(String[] args) {
		new BlankFinal();
		new BlankFinal(47);
	}
}
