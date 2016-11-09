package com.hbh.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	static String file = "BasicFileOutput.out";
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(new FileWriter(file));
		int lineCount = 1;
		String s = null;
		while((s = in.readLine()) != null) {
			out.println(lineCount++ + ":" + s);
		}
		out.close();
	}
}
