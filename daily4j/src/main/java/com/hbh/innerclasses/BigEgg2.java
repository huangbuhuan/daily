package com.hbh.innerclasses;


class Egg2 {
	
	protected class Yolk {
		public Yolk() {
			System.out.println("egg2.yolk");
		}
		public void f() {
			System.out.println("egg2.f");
		}
	}
	
	private Yolk y = new Yolk();
	
	public Egg2() {
		System.out.println("new egg2");
	}
	
	public void insertYolk(Yolk yy) {
		y = yy;
	}
	
	public void g() {
		System.out.println("egg2.g");
		y.f();
	}
	
}
public class BigEgg2 extends Egg2{
	
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			System.out.println("bigegg2.yolk");
		}
		public void f() {
			System.out.println("bigegg2.yolk.f");
		}
	}
	public BigEgg2() {
		insertYolk(new Yolk());
	}
	
	public static void main(String[] args) {
		Egg2 egg2 = new BigEgg2();
		egg2.g();
	}
}
