package com.hbh.music;
class Stringed extends Instrucment {
	public void play(Note n) {
		System.out.println("Stringed.paly()" + n);
	}
}
class Brass extends Instrucment {
	public void play(Note n) {
		System.out.println("Stringed.play()" + n);
	}
}
public class Music2 {
	public static void tune(Wind i) {
		i.paly(Note.MIDDLE_C);
	}
	public static void tune(Stringed i) {
		i.paly(Note.MIDDLE_C);
	}
	public static void tune(Brass i) {
		i.paly(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}
}
