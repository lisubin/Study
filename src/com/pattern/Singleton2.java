package com.pattern;

import com.qq.compare.NewItem;

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

public class Singleton2 {
       private static Singleton2 singleton;
       
       public static synchronized Singleton2 getInstence() {
		  if(singleton==null){
			  singleton = new Singleton2();
		  }
		  
		  return singleton;
	}
       
       private Singleton2(){
    	   
       }
}


