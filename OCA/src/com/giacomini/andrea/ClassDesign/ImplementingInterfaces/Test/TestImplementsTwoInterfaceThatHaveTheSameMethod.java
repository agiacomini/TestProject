package com.giacomini.andrea.ClassDesign.ImplementingInterfaces.Test;

public class TestImplementsTwoInterfaceThatHaveTheSameMethod implements I1, I2 {

	public void getName(){
		System.out.println("");
		
	}
	
	public void getAge(){
		
		System.out.println("getAge() in class");
	}

	
}

abstract class ClassAbstract implements I1, I2 {
	
//	public abstract void getName();	COMPILA CORRETTAMENTE
	
	public void getName(){
		
	}
	
//	public abstract void getAge();
	
	public void getAge(){
		
		System.out.println("");
	}
	
	protected void getMethod(){
		
	}
	
	private void setMethod(){
		
	}
}

abstract interface I1 {
	
	public abstract void getName();
	
	public default void getAge(){
		
		System.out.println("getAge() in I1");
	}
}

interface I2 {
	
	public abstract void getName();
	
	public default void getAge(){
		
		System.out.println("getAge() in I2");
	}
}

