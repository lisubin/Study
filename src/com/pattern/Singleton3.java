package com.pattern;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.qq.compare.NewItem;

/**
 * ����ģʽ����֤һ����ֻ��һ��ʵ�����󣬲����ṩһ�����ʸ�ʵ����ȫ�ַ��ʵ㣬
 * ��Ҫ��Ϊ��
 *    ����ʽ���̰߳�ȫ������Ч�ʸߣ����ǲ�����ʱ����
 *    ����ʽ���̰߳�ȫ������Ч�ʲ��ߣ���������ʱ����
 *    ��̬�ڲ���ʽ���̰߳�ȫ������Ч�ʸߣ���������ʱ����
 *    ö��ʽ���̰߳�ȫ������Ч�ʸߣ�������ʱ����
 * @author ��̬�ڲ���ʽ
 *
 */

public class Singleton3 {
      
	 private static class Singleton3Instance{
		 private static final Singleton3 INSTACE_SINGLETON3=new Singleton3();
	 }
	 
	 private Singleton3(){
		 
	 }
	 
	 public static Singleton3 getInstance() {
		 return Singleton3Instance.INSTACE_SINGLETON3;
		
	}
}


