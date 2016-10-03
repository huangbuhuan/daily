package com.hbh.typeinfo;


interface HasBatteries {
	
}
interface WaterProop {
	
}
interface Shoots {
	
}
class Toy {
	Toy() {
		
	}
	Toy(int i) {
		
	}
}
class FancyToy extends Toy implements HasBatteries, WaterProop, Shoots{
	public FancyToy() {
		super();
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("ClassName:" + cc.getName() + ",is interface:" + cc.isInterface());
		System.out.println("Simple name:" + cc.getSimpleName());
		System.out.println("Canonical name:" + cc.getCanonicalName());
	}
	
	public static void main(String[] args) {
		Class cc = null;
		try {
			cc = Class.forName("com.hbh.typeinfo.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		System.out.println(cc);
		for(Class face : cc.getInterfaces()) {
			System.out.println(face);
		}
		Class up = cc.getSuperclass();
		Object object = null;
		try {
			object = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(object.getClass());
	}
}
