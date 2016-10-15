package com.hbh.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 使用适配器仿真潜在类型机制
 * @author Administrator
 *
 * @param <T>
 */
interface Addable<T> {
	void add(T t);
}
public class Fill2 {
	public static <T> void fill(Addable<T> addable, Class<? extends T> classToken, int size) {
		for(int i = 0; i < size; i++) {
			try {
				addable.add(classToken.newInstance());
			} catch (Exception e) {
				throw new RuntimeException();
			}
		}
	}
	public static <T> void fill(Addable<T> addable, Generator<T> generator, int size) {
		for(int i = 0; i < size; i++) {
			addable.add(generator.next());
		}
	}
}
class AddableCollectionAdapter<T> implements Addable<T> {
	private Collection<T> c;
	public AddableCollectionAdapter(Collection<T> c) {
		this.c = c;
	}
	@Override
	public void add(T t) {
		c.add(t);
	}
	
}
class Adapter {
	public static <T> Addable<T> collectionAdapter(Collection<T> c) {
		return new AddableCollectionAdapter(c);
	}
}
class AddableSimpleQueue<T> extends SimpleQueue<T> implements Addable<T>{
	public void add(T time) {
		super.add(time);
	}
}
class Fill2Test {
	public static void main(String[] args) {
		List<Coffee> coffees = new ArrayList<>();
		Fill2.fill(new AddableCollectionAdapter<Coffee>(coffees), Coffee.class, 3);
		Fill2.fill(Adapter.collectionAdapter(coffees), Latte.class, 2);
		for(Coffee c : coffees) {
			System.out.println(c);
		}
		System.out.println("---------");
		AddableSimpleQueue<Coffee> coffeeQueue = new AddableSimpleQueue<Coffee>();
		Fill2.fill(coffeeQueue, Mocha.class, 4);
		Fill2.fill(coffeeQueue, Latte.class, 1);
		for(Coffee coffee : coffeeQueue) {
			System.out.println(coffee);
		}
	}
}