package com.hbh.generic;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	
	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class,
			Americano.class, Brave.class };
	
	private static Random rand = new Random(47);
	
	public CoffeeGenerator() {}
	
	private int size =0;
	
	public CoffeeGenerator(int size){
		this.size=size;
	}

	@Override
	public Coffee next() {
		try {
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	class CoffeeIterator implements Iterator<Coffee>{
		int count = size;
		public boolean hasNext(){
			return count > 0;
		}
		public Coffee next(){
			count--;
			return CoffeeGenerator.this.next();
		}
		
		public void remove(){
			throw new UnsupportedOperationException();
		}
	};
	
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}
	
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i=0; i < 5; i++)
			System.out.println(gen.next());
		for(Coffee coffee: new CoffeeGenerator())
			System.out.println(coffee);
	}
}
