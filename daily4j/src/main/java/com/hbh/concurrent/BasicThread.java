package com.hbh.concurrent;

public class BasicThread {
	public static void main(String[] args) {
		Thread t = new Thread(new Liftoff());
		t.start();
		System.out.println("wait");
	}
}
