package com.hbh.concurrent;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory{
	public Thread newThread(Runnable r) {
		Thread t = new Thread();
		t.setDaemon(true);
		return t;
	}
}
