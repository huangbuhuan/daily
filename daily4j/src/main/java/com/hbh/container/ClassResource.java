package com.hbh.container;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClassResource {
	public static void main(String[] args) throws IOException, InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool();
		ServerSocket server = new ServerSocket(8080);
		InputStream sokertInput = new Socket("localhost", 8080).getInputStream();
		exec.execute(new IOBlocked(sokertInput));
		exec.execute(new IOBlocked(System.in));
		TimeUnit.MILLISECONDS.sleep(100);
		System.out.println("shutdown all thread");
		exec.shutdownNow();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing " + sokertInput.getClass().getName());
		sokertInput.close();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing " + System.in.getClass().getName());
		System.in.close();
	}
}
