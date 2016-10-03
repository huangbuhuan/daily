package com.hbh.finaldemo;
class WithFinals {
	private final void f() {
		System.out.println("Withfinals.f()");
	}
	private void g() {
		System.out.println("Withfinales.g()");
	}
}
class OverridingPrivate extends WithFinals {
	private final void f(){
		System.out.println("OverridingPrivate.f()");
	}
	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}
class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	public void g(){
		System.out.println("OverridingPrivate2.g()");
	}
}
public class FinalOverrideingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		OverridingPrivate op = op2;
		//op.f()编译错误
		WithFinals wf = op2;
		//wf.f()编译错误
	}
}
