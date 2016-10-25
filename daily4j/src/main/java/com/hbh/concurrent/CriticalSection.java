package com.hbh.concurrent;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

class Pair {
	private int x, y;
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Pair() {
		this(0, 0);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void incrementX() {
		x++;
	}
	public void incrementY() {
		y++;
	}
	public String toString() {
		return "x: " + x + ".y:" + y;
	}
	public class PairValuesNotEqualException extends RuntimeException{
		public PairValuesNotEqualException() {
			super("" + Pair.this);
		}
		public void checkState() {
			throw new PairValuesNotEqualException();
		}
	}
}
abstract class PairManager {
	AtomicInteger checkCounter = new AtomicInteger();
	protected Pair p = new Pair();
	//private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());
	public synchronized Pair getPair() {
		return new Pair(p.getX(), p.getY());
	}
	
}
public class CriticalSection {

}
