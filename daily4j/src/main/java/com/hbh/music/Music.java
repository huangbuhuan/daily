package com.hbh.music;

public class Music {
	public static void tune(Instrucment i) {
		i.paly(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
