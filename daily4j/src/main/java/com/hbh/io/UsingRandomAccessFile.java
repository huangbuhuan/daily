package com.hbh.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
	static String file = "e://test.txt";
	public static void display() throws IOException {
		RandomAccessFile rf = new RandomAccessFile(file, "r");
		for(int i = 0; i < 7; i++) {
			System.out.println("Value" + i + ":" + rf.readDouble());
		}
		System.out.println(rf.readUTF());
		rf.close();
	}
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile(file, "rw");
		for(int i = 0; i < 7; i++) {
			rf.writeDouble(i * 1.44);
		}
		rf.writeUTF("The end of the file");
		rf.close();
		display();
		rf = new RandomAccessFile(file, "rw");
		rf.seek(5 * 8);
		rf.writeDouble(47.001);
		rf.close();
		display();
	}
}
