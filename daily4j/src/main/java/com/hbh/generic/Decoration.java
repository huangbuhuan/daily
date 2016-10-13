package com.hbh.generic;

import java.util.Date;

/**
 * 装饰器实现混型，但是只有最后一层才是实际类型，只有最后一层的方法是可视的
 * @author Administrator
 *
 */
class Basic {
	private String value;
	public void set(String val) {
		value = val;
	}
	public String get() {
		return value;
	}
}
class Decorator extends Basic {
	protected Basic basic;
	public Decorator(Basic basic) {
		this.basic = basic;
	}
	public void set(String val) {
		basic.set(val);
	}
	public String get() {
		return basic.get();
	}
}
class TimeStamped extends Decorator {
	private final long timeStamp;
	public TimeStamped(Basic basic) {
		super(basic);
		timeStamp = new Date().getTime();
	}
	public long getStamp() {
		return timeStamp;
	}
}
class SerialNumbered extends Decorator {
	public SerialNumbered(Basic basic) {
		super(basic);
	}
	private static long counter = 1;
	private final long serialNumber = counter++;
	public long getSerialNumber() {
		return serialNumber;
	}
}
public class Decoration {
	public static void main(String[] args) {
		TimeStamped t = new TimeStamped(new Basic());
		TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
		SerialNumbered serialNumbered = new SerialNumbered(new Basic());
		SerialNumbered serialNumbered2 = new SerialNumbered(new TimeStamped(new Basic()));
	}
}
