package com.hbh.annotation;

public @interface Uniqueness {
	Constraints constraints() default @Constraints;
}
