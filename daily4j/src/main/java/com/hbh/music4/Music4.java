package com.hbh.music4;

import com.hbh.music.Note;

abstract class Instrument {
	private int i;
	abstract void play(Note N);
}
class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play()");
	}
}

public class Music4 {

}
