package com.pattern;

public class Test {

	/**
	 * 单例模式：保证一个类只有一个实例对象，并且提供一个访问该实例的全局访问点，
 * 主要分为：
 *    饿汉式：线程安全，调用效率高，但是不能延时加载
 *    懒汉式：线程安全，调用效率不高，但是能延时加载
 *    静态内部类式：线程安全，调用效率高，而且能延时加载
 *    枚举式：线程安全，调用效率高，不能延时加载
	 * 选用情况：
	 *   单例对象占用资源少，不需要延时加载：枚举好于饿汉式
	 *   单例对象占用资源多，可以延时加载：静态内部类式好于懒汉式
	 */
	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstence();
		Singleton singleton2=Singleton.getInstence();
		System.out.println(singleton);
		System.out.println(singleton2);

	}

}
