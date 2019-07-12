package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Base64;

import com.annotation.Student;

public class Demo02 {
	private static String path="com.annotation.Student";

	/**
	 * ���÷���API��������
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class aClass =Class.forName(path);
			Student student=(Student) aClass.newInstance();//ֱ�ӵ����޲εĹ�����
			Constructor<Student> sConstructor=aClass.getDeclaredConstructor(int.class,String.class,String.class	);
			Student student2=sConstructor.newInstance(1,"jj","df");//�����вε�ֱ����ֵ
			System.out.println(student2.toString());
			
			Method method1=aClass.getMethod("setName", String.class);
			method1.invoke(student, "sjkla");//��ȡ��Ӧ�ķ���ֱ����ֵ
			System.out.println(student.getName());
			//��ȡ�ϼ����������
			ClassLoader aClassLoader = ClassLoader.getSystemClassLoader();
			System.out.println(aClassLoader.getParent());
			
			Field field=aClass.getDeclaredField("name");
			field.setAccessible(true);
			field.set(student, "�����");//��˽�е�������ֵ����Ҫ��������Ȩ�ޣ�Accessible
			System.out.println(student.getName());
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
