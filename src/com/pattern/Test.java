package com.pattern;

public class Test {

	/**
	 * ����ģʽ����֤һ����ֻ��һ��ʵ�����󣬲����ṩһ�����ʸ�ʵ����ȫ�ַ��ʵ㣬
 * ��Ҫ��Ϊ��
 *    ����ʽ���̰߳�ȫ������Ч�ʸߣ����ǲ�����ʱ����
 *    ����ʽ���̰߳�ȫ������Ч�ʲ��ߣ���������ʱ����
 *    ��̬�ڲ���ʽ���̰߳�ȫ������Ч�ʸߣ���������ʱ����
 *    ö��ʽ���̰߳�ȫ������Ч�ʸߣ�������ʱ����
	 * ѡ�������
	 *   ��������ռ����Դ�٣�����Ҫ��ʱ���أ�ö�ٺ��ڶ���ʽ
	 *   ��������ռ����Դ�࣬������ʱ���أ���̬�ڲ���ʽ��������ʽ
	 */
	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstence();
		Singleton singleton2=Singleton.getInstence();
		System.out.println(singleton);
		System.out.println(singleton2);

	}

}
