package com.hbh.daily;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		char[] buf =new char[1024];
		try {
			FileReader fr=new FileReader("file"); 
			while(fr.read(buf)>0){
				sb.append(buf);
			}
			sb.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
