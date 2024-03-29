package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.FIELD)//标注该注解可以在类里的属性上用
@Retention(RetentionPolicy.RUNTIME)//保留，通过这样的话该注解可以通过反射机制读取到
public @interface SField {
	String columnName();
	String type();
	int length();

}
