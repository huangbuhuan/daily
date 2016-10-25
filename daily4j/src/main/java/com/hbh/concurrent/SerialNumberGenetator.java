package com.hbh.concurrent;

public class SerialNumberGenetator {
	private static volatile int serialNumber = 0;
	public static int nextSerialNumber() {
		return serialNumber++;
	}
}
