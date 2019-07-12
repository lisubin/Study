package com.annotation;

import java.lang.reflect.Field;
import java.util.Map;

public class Test {

	/**利用反射机制解释注解流程
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Class class1=Class.forName("com.annotation.Student");//获取类下的所有东西
			
			STable sTable=(STable) class1.getAnnotation(STable.class);//获取到类上的注解如果有多个也可以通过数组
			System.out.println(sTable.value());
			
			Field field=class1.getDeclaredField("name");//获取类里的属性
			SField sField=field.getAnnotation(SField.class);//将属性上的注解获取
			
			System.out.println(sField.columnName()+sField.type());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
