package com.map;

import java.util.Map.Entry;

public class MyEntry<K,V> implements Entry<K, V> {
	K keyK;
	V valueV;
	
	
	
	public MyEntry (K nK,V nv){
		this.keyK= nK;
		this.valueV=nv;
	}

	@Override
	public K getKey() {
		
		return keyK;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return valueV;
	}

	@Override
	public V setValue(V value) {
		// TODO Auto-generated method stub
		return value;
	}

}
