package com.list;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class MyArrayList {
	private Object[] dataObjects;
	private int size=0;
	
	public MyArrayList(){
		this(10);
	}
	
	public MyArrayList(int i) {
		if(i<0){
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		this.dataObjects=new Object[i];
	}

	public void add(Object value){
		if(size==dataObjects.length){
			dataObjects=Arrays.copyOf(dataObjects, size+1);
		}
		dataObjects[size++]=value;
		
	}
	
	public Object get(int index){
		if(index>size||index<0){
			try {
				throw new Exception("kjflafj");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return dataObjects[index];
	}
	
	public int size(){
		return this.size;
	}
	
	public static void main(String[] args) {
		MyArrayList list=new MyArrayList(2);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.size());
	}

}
