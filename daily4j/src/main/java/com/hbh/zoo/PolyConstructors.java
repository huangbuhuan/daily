package com.hbh.zoo;
class Glyph {
	int radius = 1;
	void draw() {
		System.out.println("Glyph.draw()");
	}
	public Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
class RoundGlyph extends Glyph {
	private int radius = 1;
	public RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph() " + radius);
	}
	void draw() {
		System.out.println("RoundGlyph " + radius);
	}
}
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}
