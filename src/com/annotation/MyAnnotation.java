package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value={ElementType.METHOD,ElementType.TYPE})//标注该注解可以在哪是用  ElementType[]
@Retention(RetentionPolicy.RUNTIME)//保留，通过这样的话该注解可以通过反射机制读取到
public @interface MyAnnotation {

	String value() default "";//定义的参数如果没有默认值，调用该方法就会出错
}
