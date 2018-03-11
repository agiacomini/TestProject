package com.giacomini.andrea.Prove;

public abstract class TestAbstractClass {

	public void testMethod(){
		System.out.println("we are in instacne method \"testMethod\" in abstract class \"TestAbstractClass\" ");
	}
	
	public abstract void testMethodAbstract();
	
	public static void testMethodStatic(){
		System.out.println("we are in the STATIC method \"testMethodStatic\" in abstract class \"TestAbstractClass\"");
	}
}
