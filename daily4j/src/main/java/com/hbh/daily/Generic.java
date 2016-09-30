package com.hbh.daily;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generic<T> {
	private T t;
	public T getT(){
		return this.t;
	}
	
	public T add(T data){
		this.t=data;
		return this.t;
	}
	
	@SuppressWarnings("hiding")
	public <T>T toT(T a){
		return a;
	}
	
	public static void main(String[] args) {
		Generic<String> g=new Generic<String>();
		List<String>strs=new ArrayList<String>();
		List<String>strs1=new ArrayList<String>();
		strs.add("1");
		strs.add("2");
		strs1.add("3");
		Iterator iterator=strs.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(iterator.hasNext());
		
		strs.containsAll(strs1);//判断是否存在
		System.out.println(strs);
		strs.removeAll(strs1);//差集
		System.out.println(strs);
		
		strs.retainAll(strs1);//并集
		g.add("111");
		System.out.println(g.getT());
		System.out.println(g.toT(1.0));
		System.out.println(strs);
	}
}
