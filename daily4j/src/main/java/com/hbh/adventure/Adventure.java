package com.hbh.adventure;
interface Canfight {
	int a = 1;
	void fight();
}
interface CanSwim {
	void swim();
}
interface CanFly {
	void fly();
}
class ActionCharacter {
	public void fight(){}
}
class Hero extends ActionCharacter implements Canfight, CanSwim, CanFly{
	@Override
	public void fly() {
		
	}

	@Override
	public void swim() {
		
	}
	
}
public class Adventure {
	public static void t(Canfight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
	public static void w(ActionCharacter x) { x.fight(); }
	public static void main(String[] args) {
		Hero h = new Hero();
		System.out.println(h.a);
		//h.a = 2;报错，说明a为final
		//说明a为static
		System.out.println(Hero.a);
		//说明a的值呗存储在该接口的静态存储区域内
		System.out.println(Canfight.a);
		t(h);
		u(h);
		v(h);
		w(h);
	}
	
}
