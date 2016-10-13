package com.hbh.generic;
/*
import java.util.Date;

*//**
 * 与接口混合
 *//*
interface TimeStamped {
	long getStamp();
}

class TimeStampImpl implements TimeStamped {
	private final long timeStamp;

	public TimeStampImpl() {
		timeStamp = new Date().getTime();
	}

	@Override
	public long getStamp() {
		return timeStamp;
	}

}

interface SeriaNumbered {
	long getSeriNumber();
}

class SerialNumberedImpl implements SeriaNumbered {
	private static long counter = 1;
	private final long serialNumber = counter++;

	@Override
	public long getSeriNumber() {
		return serialNumber;
	}
}

interface Basic {
	public void set(String val);

	public String get();
}

class BasicImpl implements Basic {
	private String value;

	@Override
	public void set(String val) {
		value = val;
	}

	@Override
	public String get() {
		return value;
	}

}

class Mixin extends BasicImpl implements TimeStamped, SeriaNumbered {
	private TimeStamped timeStamp = new TimeStampImpl();
	private SeriaNumbered SerialNumber = new SerialNumberedImpl();

	@Override
	public long getSeriNumber() {
		return SerialNumber.getSeriNumber();
	}

	@Override
	public long getStamp() {
		return timeStamp.getStamp();
	}

}
*/
public class Mixins {
	public static void main(String[] args) {
		/*Mixin mixin1 = new Mixin();
		Mixin mixin2 = new Mixin();
		mixin1.set("test1");
		mixin2.set("test2");
		System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSeriNumber());
		System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSeriNumber());
	*/}
}
