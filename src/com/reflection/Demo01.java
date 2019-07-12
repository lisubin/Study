package com.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo01 {
	private static String path="com.annotation.Student";

	/**
	 * 反射api机制，获取类的类名，方法，属性，构造方法
	 * @param args
	 */
	public static void main(String[] args) {
		Method[] methods=null;
		Field[] fields=null;
		try {
			Class class1=Class.forName(path);
			System.out.println(class1.getName());//获得包名加类名
			System.out.println(class1.getSimpleName());//获得类名
			
			
			//methods=class1.getDeclaredMethods();//获得类下所有的方法
			methods=class1.getMethods();//获得类下public属性的方法
			Method method1=class1.getMethod("setName", String.class);//获得指定的方法，需要参数防止重载
			System.out.println(method1.getName());
			
			
			
			for (Method method : methods) {
				System.out.println(method.getName());
			}
			
			fields=class1.getDeclaredFields();//获得类下的所有属性
			fields=class1.getFields();//获得类下public的属性
			
			for (Field field : fields) {
				System.out.println(field.getName());
			}
			
			class1.getDeclaredConstructors();//与上同理是获得所有的构造方法
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
