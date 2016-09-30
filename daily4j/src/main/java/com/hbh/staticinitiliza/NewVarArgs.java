package com.hbh.staticinitiliza;

public class NewVarArgs {
	
	static void printArray (String ...strs){
		for (String str : strs)
			System.out.print(str);
		System.out.println();
	}
	static void printArray (Object... args){
		System.out.println(args.length);
		for (Object object : args){
			System.out.print(object +" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArray(new Integer(47), new Integer(24), new Float(3.4));
		printArray((Object[])new Integer[]{1,4,3,5,6,9,9});
		printArray("1","1","1","1");
		printArray(new String[]{"2","2","3"});
	}

}
