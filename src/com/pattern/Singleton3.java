package com.pattern;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.qq.compare.NewItem;

/**
 * 单例模式：保证一个类只有一个实例对象，并且提供一个访问该实例的全局访问点，
 * 主要分为：
 *    饿汉式：线程安全，调用效率高，但是不能延时加载
 *    懒汉式：线程安全，调用效率不高，但是能延时加载
 *    静态内部类式：线程安全，调用效率高，而且能延时加载
 *    枚举式：线程安全，调用效率高，不能延时加载
 * @author 静态内部类式
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


