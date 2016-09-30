package com.hbh.daily;

import java.util.ArrayList;
import java.util.List;

public class MyClass extends MySuperClass{
		
		public static void main(String[] args) {
			List<MyClass> myClasses=new ArrayList<MyClass>();
			List<MySuperClass> mySuperClasses=new ArrayList<MySuperClass>();
			mySuperClasses.addAll(myClasses);
			/*报错*/
			//myClasses.addAll(mySuperClasses);
		}
}
