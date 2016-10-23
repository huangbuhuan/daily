package com.hbh.concurrent;

public class Liftoff implements Runnable{
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
	public Liftoff() {
		
	}
	public Liftoff(int countDown) {
		this.countDown = countDown;
	}
	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff") + "). ";
	}
	@Override
	public void run() {
		while(countDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}
	}
	
}
