package com.valuelabs;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		//list.remove(3);
		list.remove(new Integer("3"));
		
		System.out.println(list);
		

	}

}
