
package com.valuelabs.interfaceDefault;

public interface Interface1 {

	void method1();
	
	default void log(String str){
		System.out.println("I1 logging::"+str);
	}
	
	static void ststicMethod() {
		
	}
}
