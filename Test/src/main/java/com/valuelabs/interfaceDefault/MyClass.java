
package com.valuelabs.interfaceDefault;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1() {
	}

	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		
	}
	
	
	static void ststicMethod() {
		
	}
}
