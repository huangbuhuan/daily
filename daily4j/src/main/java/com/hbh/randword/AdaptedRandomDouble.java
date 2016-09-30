package com.hbh.randword;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomDouble extends RandomDoubles implements Readable{
	
	private int count;
	
	public AdaptedRandomDouble(int count) {
		this.count = count;
	}
	
	public int read(CharBuffer cb){
		if(count-- == 0)
			return -1;
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(new AdaptedRandomDouble(7));
		while(sc.hasNext())
			System.out.println(sc.next());
	}

}
