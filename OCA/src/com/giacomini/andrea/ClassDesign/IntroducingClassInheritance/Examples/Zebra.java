package com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples;

public class Zebra extends Animal2 {

	public Zebra(int age){
		super(age);
		
		System.out.println("Zoo created!");
		
//		super(age);								NON COMPILA - la posizione del comando "super()" è sbagliata. Non è il primo statement;
	}
	
	public Zebra(){
		this(4);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
