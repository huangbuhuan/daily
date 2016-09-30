package com.hbh.daily;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableTest implements Externalizable{
	
	private transient String test="序列化啦！！！";
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(test);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		test=(String)in.readObject();
	}
	
	public static void main(String[] args) {
		ExternalizableTest et=new ExternalizableTest();
		try {
			ObjectOutput oo=new ObjectOutputStream(new FileOutputStream("e:/exTest.txt"));
			oo.writeObject(et);
			ObjectInput oi=new ObjectInputStream(new FileInputStream("e:/exTest.txt"));
			et=(ExternalizableTest) oi.readObject();
			System.out.println(et.test);
			oo.close();
			oi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
