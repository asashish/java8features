package com.java.eight.functionalinterface;

public class MyClass implements Interface1, Interface2{

	@Override
	public void method2() {
		
	}
	
	@Override
	public void method1(String str) {
		
	}
	
	@Override
	public void log(String str) {
		System.out.println("MyClass logging::"+str);
		Interface1.print("abc");
	}
	
}
