package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.TYPE)//��ע��ע�����������ʹ��
@Retention(RetentionPolicy.RUNTIME)//������ͨ�������Ļ���ע�����ͨ��������ƶ�ȡ��
public @interface STable {
      String value();
}
