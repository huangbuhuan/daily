package com.hbh.generic;

class OrdinarySetter {
	void set(Base base) {
		System.out.println("OrdinarySetter");
	}
}
class DerivedSetter extends OrdinarySetter {
	//重载了父类的方法
	void set(Derived derived) {
		System.out.println("DerivedSetter");
	}
}

public class OrdinaryArguments {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter derivedSetter =  new DerivedSetter();
		derivedSetter.set(base);
		derivedSetter.set(derived);
	}
}
