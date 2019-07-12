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
	 * 利用反射API进行设置
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class aClass =Class.forName(path);
			Student student=(Student) aClass.newInstance();//直接调用无参的构造器
			Constructor<Student> sConstructor=aClass.getDeclaredConstructor(int.class,String.class,String.class	);
			Student student2=sConstructor.newInstance(1,"jj","df");//调用有参的直接设值
			System.out.println(student2.toString());
			
			Method method1=aClass.getMethod("setName", String.class);
			method1.invoke(student, "sjkla");//获取对应的方法直接设值
			System.out.println(student.getName());
			//获取上级的类加载器
			ClassLoader aClassLoader = ClassLoader.getSystemClassLoader();
			System.out.println(aClassLoader.getParent());
			
			Field field=aClass.getDeclaredField("name");
			field.setAccessible(true);
			field.set(student, "黎夙斌");//对私有的属性设值，先要开启访问权限，Accessible
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
