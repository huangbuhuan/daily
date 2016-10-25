package com.hbh.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {
	private IntGenetator generator;
	private final int id;
	public EvenChecker(IntGenetator g, int ident) {
		this.generator = g;
		this.id = ident;
	}
	@Override
	public void run() {
		while(!generator.inCanceled()) {
			int val = generator.next();
			if(val%2 != 0) {
				System.out.println(val + " not enven");
				generator.cancel();
			}
		}
	}
	public static void test(IntGenetator gp, int count) {
		System.out.println("press");
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < count; i++) {
			exec.execute(new EvenChecker(gp, i));
		}
		exec.shutdown();
	}
	public static void test(IntGenetator gp) {
		test(gp, 10);
	}

}
