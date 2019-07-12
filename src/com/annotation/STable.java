package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.TYPE)//标注该注解可以在类上使用
@Retention(RetentionPolicy.RUNTIME)//保留，通过这样的话该注解可以通过反射机制读取到
public @interface STable {
      String value();
}
