package com.hbh.generic;

class Subtype extends BasecHolder<Subtype>{}
public class CRGWithBasecHolder {
	public static void main(String[] args) {
		Subtype st1 = new Subtype(), st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
	}
}
