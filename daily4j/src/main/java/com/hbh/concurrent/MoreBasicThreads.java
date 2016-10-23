package com.hbh.concurrent;

public class MoreBasicThreads {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			new Thread(new Liftoff()).start();;
		}
		System.out.println("wait");
	}
}
