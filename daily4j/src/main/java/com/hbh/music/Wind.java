package com.hbh.music;

class Instrucment {
	public void paly(Note n) {
		System.out.println("Instrucment.play()");
	}
}
public class Wind extends Instrucment {
	public void play (Note n) {
		System.out.println("Wind.paly()" + n);
	}
}
