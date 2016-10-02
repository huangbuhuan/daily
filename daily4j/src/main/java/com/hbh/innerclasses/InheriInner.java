package com.hbh.innerclasses;


class WithInner {
	
	class Inner{
		
	}
}

public class InheriInner extends WithInner.Inner {
	
	public InheriInner(WithInner withInner) {
		withInner.super();
	}
	private void mian() {
		
	}
} 