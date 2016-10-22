package com.hbh.container;

import java.util.Random;

public class Prediction {
	private static Random random = new Random();
	private boolean shadow = random.nextDouble() > 0.5;
	public String toString() {
		if(shadow) {
			return "six more weeks of Winter!";
		}else {
			return "Early Spring";
		}
	}
}
