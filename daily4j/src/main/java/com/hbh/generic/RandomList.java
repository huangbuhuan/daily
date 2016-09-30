package com.hbh.generic;

import java.util.ArrayList;
import java.util.Random;

public class RandomList<T>{
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T item){
		storage.add(item);
	}
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RandomList<String> strs=new RandomList<String>();
		for(String str : ("The quick brown fox jumped over"
				+"the lazy brown dog").split(" "))
			strs.add(str);
		for(int i=0; i < 11; i++)
			System.out.print(strs.select()+" ");
	}
}
