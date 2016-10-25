package com.hbh.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

import javax.management.timer.Timer;

public class AtomicIntegerTesst implements Runnable{
	private AtomicInteger i = new AtomicInteger(0);
	private int getValue() {
		return i.get();
	}
	private void evenIncrement() {
		i.addAndGet(2);
	}
	@Override
	public void run() {
		while(true) {
			evenIncrement();
		}
	}
}
