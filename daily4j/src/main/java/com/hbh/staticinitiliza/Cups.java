package com.hbh.staticinitiliza;

public class Cups {
	public static Cup cup3 = new Cup(3);
	public static Cup cup1;
	public static Cup cup2;
	public Cups() {
		System.out.println("Cups ");
	}
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	
	public static Cup cup4 = new Cup(4);
	
	

}
