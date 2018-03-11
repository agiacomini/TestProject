package com.giacomini.andrea.OCA.ClassDesign.Test;

public class TestInheritanceMethodsFromInterfaces {

}

interface FirstInterface {
	
	public default void getName(){
		System.out.println("getName() in FirstInterface");
	}
}

interface SecondInterface {
	
	public default void getName(){
		System.out.println("getName() in SecondInterface");
	}
	
	public void getAge();
	
//	protected abstract void t();	NON COMPILA - i metodi di una interfaccia POSSONO essere solo PUBLIC;
}

abstract class TestInheritanceInterface implements FirstInterface, SecondInterface{
	
//	public abstract void getName();
	
	public void getName(){
		
		System.out.println("getName() in abstract class TestInheritanceInterface");
	}
	
	public void getAge(){
		
	}
	
	protected abstract void testMethod();
	
//	private abstract void m();
	private void c(){}
}
