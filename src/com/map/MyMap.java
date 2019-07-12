package com.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


/**
 * 采用数组加链表的形式实现hashmap
 * @author lsb
 *
 */


public class MyMap {
	
	  LinkedList<LsbEntry>[] aLsbEntrys=new LinkedList[999];
 
      public void put(Object key,Object value){
    	  LsbEntry LsbEntry=new LsbEntry(key, value);
    	  int a=key.hashCode()%aLsbEntrys.length;
    	  
    	  if(aLsbEntrys[a]==null){
    		  LinkedList<LsbEntry> aLinkedList=new LinkedList();
    		  aLinkedList.add(LsbEntry);
    		  aLsbEntrys[a]=aLinkedList;
    	  }else{
    		  LinkedList<LsbEntry> list=aLsbEntrys[a];
    		  for (int i = 0; i < list.size(); i++) {
				  LsbEntry e=list.get(i);
				  if(e.key.equals(key)){
					  e.setValue(value);
				  }
			
    		  }}
      }
      
      public Object getValue(Object key){
    	  int a=key.hashCode()%aLsbEntrys.length;
    	  if(aLsbEntrys[a]!=null){
    		  LinkedList<LsbEntry> list=aLsbEntrys[a];
    		  for (int i = 0; i < list.size(); i++) {
				  LsbEntry e=(LsbEntry) list.get(i);
				  if(e.key.equals(key)){
					  return e.value;
				  }
			}
    	  }
    	  
    	  return null;
      }
      
      public static void main(String[] args) {
  		  MyMap sMap=new MyMap();
		  sMap.put("daf", "dsaf");
    	  sMap.put("s", "来来来");
    	  sMap.put("s", "发的开发");
    	  System.out.println(sMap.getValue("s"));
    	  
    
    	  
    	  
	}
}


class LsbEntry{
	Object key;
	Object value;
	public LsbEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	
}
