package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo01 {
	private static String path="com.annotation.Student";

	/**
	 * ����api���ƣ���ȡ������������������ԣ����췽��
	 * @param args
	 */
	public static void main(String[] args) {
		Method[] methods=null;
		Field[] fields=null;
		try {
			Class class1=Class.forName(path);
			System.out.println(class1.getName());//��ð���������
			System.out.println(class1.getSimpleName());//�������
			
			
			//methods=class1.getDeclaredMethods();//����������еķ���
			methods=class1.getMethods();//�������public���Եķ���
			Method method1=class1.getMethod("setName", String.class);//���ָ���ķ�������Ҫ������ֹ����
			System.out.println(method1.getName());
			
			
			
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			
			fields=class1.getDeclaredFields();//������µ���������
			fields=class1.getFields();//�������public������
			
			for (Field field : fields) {
				System.out.println(field.getName());
			}
			
			class1.getDeclaredConstructors();//����ͬ���ǻ�����еĹ��췽��
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
