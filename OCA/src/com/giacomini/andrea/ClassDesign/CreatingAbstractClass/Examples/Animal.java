package com.giacomini.andrea.ClassDesign.CreatingAbstractClass.Examples;

public abstract class Animal {

	protected int age;
	public void eat(){
		System.out.println("Animal is eating");
	}
	
	public abstract String getName();
}
