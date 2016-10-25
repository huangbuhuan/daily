package com.hbh.concurrent;

class Sleeper extends Thread {
	private int duration;
	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}
	public void run() {
		try{
			sleep(duration);
		} catch(InterruptedException e){
			System.out.println(getName() + " was inter " + isInterrupted());
			return;
		}
		System.out.println(getName() + " has awa" );
	}
}
class Joiner extends Thread {
	private Sleeper sleeper;
	public Joiner(String name, Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	public void run() {
		try{
			sleeper.join();
		}catch(InterruptedException e){
			System.out.println("Inter");
		}
		System.out.println(getName() + "join  completed");
	}
}
public class Joining {
	public static void main(String[] args) {
		Sleeper sleepy = new Sleeper("Sleepy", 1500);
		Sleeper grupy = new Sleeper("grupy", 1500);
		Joiner dopey = new Joiner("Dopey", sleepy);
		Joiner doc = new Joiner("Doc", grupy);
		grupy.interrupt();
	}
}
