package com.hbh.innerclasses;


interface Incrementable{
	void increment();
}

class Callee1 implements Incrementable {

	private int i = 0;
	
	@Override
	public void increment() {
		i++;
		System.out.println(i);
	}
	
}

class MyIncrement {
	
	public void increment() {
		System.out.println("Other operation");
	}
	
	static void f(MyIncrement myIncrement) {
		myIncrement.increment();
	}
	
}

class Calle2 extends MyIncrement {
	
	private int i = 0;
	
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incrementable {

		@Override
		public void increment() {
			Calle2.this.increment();
		}
		
	}
	
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller {
	
	private Incrementable callbackReference;
	
	Caller(Incrementable incrementabel) {
		callbackReference = incrementabel;
	}
	
	void go() {
		callbackReference.increment();
	}
	
}



public class Callbacks {

}
