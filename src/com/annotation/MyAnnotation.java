package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(value={ElementType.METHOD,ElementType.TYPE})//��ע��ע�������������  ElementType[]
@Retention(RetentionPolicy.RUNTIME)//������ͨ�������Ļ���ע�����ͨ��������ƶ�ȡ��
public @interface MyAnnotation {

	String value() default "";//����Ĳ������û��Ĭ��ֵ�����ø÷����ͻ����
}
