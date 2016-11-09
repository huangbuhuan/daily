package com.hbh.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OSExecute {

	public static void command(String command) {
		boolean err = false;
		try {
			Process process = new ProcessBuilder(command.split(" ")).start();
			BufferedReader results = new BufferedReader(
					new InputStreamReader(process.getInputStream()));
			String s;
			while ((s = results.readLine()) != null) {
				System.out.println(s);
			}
			BufferedReader errors = new BufferedReader(
					new InputStreamReader(process.getErrorStream(), "gbk"));
			while((s = errors.readLine()) != null) {
				System.out.println(s);
				err = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(err) {
			System.out.println("error");
		}
	}
	
	public static void main(String[] args) {
		command("CMD /C ping www.baidu.com");
	}

}
