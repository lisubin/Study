package com.annotation;

import java.lang.reflect.Field;
import java.util.Map;

public class Test {

	/**���÷�����ƽ���ע������
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Class class1=Class.forName("com.annotation.Student");//��ȡ���µ����ж���
			
			STable sTable=(STable) class1.getAnnotation(STable.class);//��ȡ�����ϵ�ע������ж��Ҳ����ͨ������
			System.out.println(sTable.value());
			
			Field field=class1.getDeclaredField("name");//��ȡ���������
			SField sField=field.getAnnotation(SField.class);//�������ϵ�ע���ȡ
			
			System.out.println(sField.columnName()+sField.type());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
