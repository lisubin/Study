package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.FIELD)//��ע��ע��������������������
@Retention(RetentionPolicy.RUNTIME)//������ͨ�������Ļ���ע�����ͨ��������ƶ�ȡ��
public @interface SField {
	String columnName();
	String type();
	int length();

}
