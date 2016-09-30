package com.hbh.Enum;

public class EnumOrder {
	
	public static void main(String[] args) {
		for (Sipciness s : Sipciness.values())
			System.out.println(s + ",oridnal " + s.ordinal());
	}

}
