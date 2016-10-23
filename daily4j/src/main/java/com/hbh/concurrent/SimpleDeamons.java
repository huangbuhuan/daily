package com.hbh.concurrent;

import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable {
	
	@Override
	public void run() {
		try {
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			System.out.println("sleep()");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDeamons());
			daemon.setDaemon(true);
			daemon.start();
		}
		System.out.println("started");
		TimeUnit.MILLISECONDS.sleep(1);
	}

}
