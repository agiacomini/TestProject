package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples;

public class Animal2 {

	private int age;
	private String name;
	
	public Animal2(int age, String name){
		// N.B: chiama il costruttore senza argomenti della classe padre "java.lang.Object";  
		super();
		
		this.age = age;
		this.name = name;
	}
	
	public Animal2(int age){
		// N.B: chiama il costruttore senza argomenti della classe padre "java.lang.Object";
		super();
		
		this.age = age;
		this.name = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
