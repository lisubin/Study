package com.pattern;

import com.qq.compare.NewItem;

/**
 * 单例模式：保证一个类只有一个实例对象，并且提供一个访问该实例的全局访问点，
 * 主要分为：
 *    饿汉式：线程安全，调用效率高，但是不能延时加载
 *    懒汉式：线程安全，调用效率不高，但是能延时加载
 *    静态内部类式：线程安全，调用效率高，而且能延时加载
 *    枚举式：线程安全，调用效率高，不能延时加载
 * @author 懒汉式
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


