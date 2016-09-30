package com.hbh.adventure;

import com.hbh.adventure.A.DImp2;


class A {
	interface B {
		void f();
	}
	public class BImp implements B {
		@Override
		public void f() {
			
		}
	}
	private class BImp2 implements B {
		@Override
		public void f() {
			
		}
	}
	public interface C {
		void f();
	}
	class CImp implements C {
		@Override
		public void f() {
			
		}
	}
	private class CImp2 implements C {
		@Override
		public void f() {
			
		}
	}
	private interface D {
		void f();
	}
	private class DImp implements D {
		@Override
		public void f() {
			
		}
	}
	public class DImp2 implements D {
		@Override
		public void f() {
			
		}
	}
	public D getD(){ return new DImp2(); }
	private D dRef;
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	int ddd = 1;
	interface G {
		void f();
	}
	public interface H {
		void f();
	}
	void g();
/*无法使用private*/
//	private interface I{
//		void f();
//	} 
	class a {
		
	}
}

public class NestingInterfaces {
	public class BImp implements A.B {
		public void f() {}
	}
	class CImp implements A.C {
		public void f() {}
	}
	/*无法实现private的接口*/
//	class DImp implements A.DImp2 {
//		void f();
//	}
	class EImp implements E {
		@Override
		public void g() {
			
		}
	}
	class EGImp implements E.G {
		@Override
		public void f() {
			
		}
	}
	class EImp2 implements E {
		@Override
		public void g() {
			
		}
		class EG implements E.G {
			public void f() {}
		}
	}
	public static void main(String[] args) {
		A a = new A();
		/*因为接口为private不能向上转型*/
		//A.D = a.getD();
		A.DImp2 di2 =  (DImp2) a.getD();
		System.out.println(a.getD());
		/*a.getD()获取一个private的D接口无法使用，需要强转*/
		//a.getD().f();
		((DImp2)a.getD()).f();
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}
