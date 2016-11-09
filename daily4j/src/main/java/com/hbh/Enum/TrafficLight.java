package com.hbh.Enum;

enum Signal {
	GREEN, YELLOW, RED
}
public class TrafficLight {
	Signal color = Signal.RED;
	
	public void change() {
		switch(color) {
			case RED: color = Signal.RED;
					  break;
			case YELLOW: color = Signal.YELLOW;
			 			 break;
			case GREEN: color = Signal.GREEN;
						 break;
		}
	}
}
