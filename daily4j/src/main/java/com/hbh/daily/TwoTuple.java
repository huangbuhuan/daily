package com.hbh.daily;

public class TwoTuple <A,B>{
	
	public final A first;
	
	public final B second;
	
	public TwoTuple(A a,B b){
		first=a;
		second=b;
	}
	
	public String toString(){
		return "("+first+","+second+")";
	}
	
	public static void main(String[] args) {
		TwoTuple<String, Integer> test= new TwoTuple<String, Integer>("11", 111);
	}

}
