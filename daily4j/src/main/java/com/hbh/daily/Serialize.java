package com.hbh.daily;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialize implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 20238939121292048L;
	private int num =1390;
	
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("d:/test.dat");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Serialize serialize=new Serialize();
			oos.writeObject(serialize);
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
