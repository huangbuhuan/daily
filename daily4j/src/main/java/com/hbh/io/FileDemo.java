package com.hbh.io;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("e://download");
		if(file.isFile()) {
			System.out.println("is file");
		}
		if(file.isDirectory()) {
			System.out.println("is directory");
		}
		if(file.isAbsolute()) {
			System.out.println("is absolute");
		}
		if(file.isHidden()) {
			System.out.println("is hidden");
		}
		if(file.canRead()) {
			System.out.println("can read");
		}
		if(file.canWrite()) {
 			System.out.println("can write");
		}
		if(file.canExecute()) {
			System.out.println("can execute");
		}
	}
}
