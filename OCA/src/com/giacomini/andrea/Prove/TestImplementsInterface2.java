package com.giacomini.andrea.Prove;

public interface TestImplementsInterface2 {

	// Metodo STATIC
	public static void testMethodStatic(){
		System.out.println("we are in the STATIC method \"testMethodStatic\" in class \"TestImplementsInterface2\" ");
	}
	
	// Metodo ABSTRACT
	public void testMethodAbstract();
	
	// Metodo DEFAULT
	public default void testMethodDefault(){
		
	}
	
}
