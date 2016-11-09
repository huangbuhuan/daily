package com.hbh.Enum;

public enum ConstantSpecificMethod {
	DATE_TIME {
		String getInfo() {
			return "date";
		}
	},
	CLASSPATH {
		String getInfo() {
			return "classPath";
		}
	},
	VERSION {
		String getInfo() {
			return "version";
		}
	};
	
	abstract String getInfo();
	
	public static void main(String[] args) {
		for(ConstantSpecificMethod csm : values()) {
			System.out.println(csm.getInfo());
		}
	}
}
