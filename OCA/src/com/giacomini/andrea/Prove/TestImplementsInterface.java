package com.giacomini.andrea.Prove;

public class TestImplementsInterface implements TestImplementsInterface2{

	// Implementazione del metodo ABSTRACT ereditato dall'interfaccia
	public void testMethodAbstract(){
		
	}
	
	void print(){
		
		TestImplementsInterface2.testMethodStatic();
	}
	
	public static void testMethodStatic(){
		System.out.println("we are in the STATIC method \"testMethodStatic\" in class \"TestImplementsInterface\" ");
	}
	
	public static void main(String[] args){
		
		TestImplementsInterface test = new TestImplementsInterface();
		test.print();
		
		System.out.println();
		
		testMethodStatic();
	}
}
