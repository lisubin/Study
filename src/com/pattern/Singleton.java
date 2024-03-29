package com.pattern;


/**
 * 单例模式：保证一个类只有一个实例对象，并且提供一个访问该实例的全局访问点，
 * 主要分为：
 *    饿汉式：线程安全，调用效率高，但是不能延时加载
 *    懒汉式：线程安全，调用效率不高，但是能延时加载
 *    静态内部类式：线程安全，调用效率高，而且能延时加载
 *    枚举式：线程安全，调用效率高，不能延时加载
 * @author 饿汉式
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


