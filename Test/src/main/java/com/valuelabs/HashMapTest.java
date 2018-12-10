package com.valuelabs;

import java.util.HashMap;

public class HashMapTest {
	
	private static final Object PRESENT = new Object(); 

	public static void main(String[] args) {
		
		HashMap<Integer, Object> hashMap = new HashMap<>();
		hashMap.put(1, PRESENT);
		hashMap.put(2, PRESENT);
		hashMap.put(3, PRESENT);
		hashMap.put(4, PRESENT);
		hashMap.put(5, PRESENT);
		hashMap.put(6, PRESENT);
		
		System.out.println(hashMap);
		
		
		System.out.println(hashMap.get(1).hashCode());
		System.out.println(hashMap.get(2).hashCode());
		System.out.println(hashMap.get(3).hashCode());
		System.out.println(hashMap.get(4).hashCode());
		System.out.println(hashMap.get(5).hashCode());
		System.out.println(hashMap.get(6).hashCode());
		
	}
	
	
	
	

}
