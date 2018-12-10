package com.valuelabs.test;

public class MyDataImpl implements MyData {

	/*public void print(String str) {
		
		System.out.println("MyDataImpl print()");
	}*/
	
	
	public boolean isNull(String str) {
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}
	
	public static void main(String args[]){
		MyDataImpl obj = new MyDataImpl();
		obj.print("");
		obj.isNull("abc");
	}
}