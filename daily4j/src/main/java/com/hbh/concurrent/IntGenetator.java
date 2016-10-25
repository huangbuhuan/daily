package com.hbh.concurrent;

public abstract class IntGenetator {
	private volatile boolean canceled = false;
	public abstract int next();
	public void cancel() {
		canceled = true;
	}
	public boolean inCanceled() {
		return canceled;
	}
}
