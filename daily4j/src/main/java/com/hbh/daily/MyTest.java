package com.hbh.daily;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


import org.junit.Test;

public class MyTest {
	
	@Test
	public void transientTest(){
		User user=new User();
		user.setUserName("cc");
		user.setAge(16);
		user.setWeight(100);
		user.setGender("man");
		System.out.println("userName:"+user.getUserName());
		System.out.println("age:"+user.getAge());
		System.out.println("weight:"+user.getWeight());
		System.out.println("gender:"+user.getGender());
		System.out.println("----------");
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e:/user.txt"));
			/**将对象写入文件*/
			oos.writeObject(user);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("e:/user.txt"));
			user.setUserName("dd");
			user=(User)ois.readObject();
			ois.close();
			System.out.println("userName:"+user.getUserName());
			/**age字段添加了tansient后不被写入序列化文件*/
			System.out.println("age:"+user.getAge());
			System.out.println("weight:"+user.getWeight());
			System.out.println("gender:"+user.getGender());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void externalizableTest(){
		ExternalizableTest et=new ExternalizableTest();
		try {
			ObjectOutput oo=new ObjectOutputStream(new FileOutputStream("e:/exTest.txt"));
			oo.writeObject(et);
			ObjectInput oi=new ObjectInputStream(new FileInputStream("e:/exTest.txt"));
			et=(ExternalizableTest) oi.readObject();
			//System.out.println(et.getTest());
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
	
	
	public void test3(){
		System.out.println(Integer.MAX_VALUE);
		List<String> strs=new ArrayList<String>();
		/**有参实例化*/
		List str=new ArrayList(1);
		/**无参实例化*/
		List str2=new ArrayList();
		new ArrayList<String>();
	}

}
