package com.pattern;


/**
 * ����ģʽ����֤һ����ֻ��һ��ʵ�����󣬲����ṩһ�����ʸ�ʵ����ȫ�ַ��ʵ㣬
 * ��Ҫ��Ϊ��
 *    ����ʽ���̰߳�ȫ������Ч�ʸߣ����ǲ�����ʱ����
 *    ����ʽ���̰߳�ȫ������Ч�ʲ��ߣ���������ʱ����
 *    ��̬�ڲ���ʽ���̰߳�ȫ������Ч�ʸߣ���������ʱ����
 *    ö��ʽ���̰߳�ȫ������Ч�ʸߣ�������ʱ����
 * @author ����ʽ
 *
 */

public class Singleton {
       private static Singleton singleton=new Singleton();
       
       public static Singleton getInstence() {
		  return singleton;
	}
       
       private Singleton(){
    	   
       }
}


