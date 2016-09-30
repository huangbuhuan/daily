package com.hbh.daily;

public class Holder3 <T>{
	
	private T a;
	
	public Holder3(T a){
		this.a=a;
	}
	
	public void set(T a){
		this.a=a;
	}
	
	public T get(){
		return a;
	}
	
	public static void main(String[] args) {
		Holder3<String> h=new Holder3<String>("2");
		System.out.println(h.get());
		h.set("111");
		System.out.println(h.get());
		Holder3<Integer> h2=new Holder3<Integer>(2);
		System.out.println(h2.get());
		h2.set(10);
		System.out.println(h2.get());
	}
	
}
