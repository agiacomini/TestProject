package com.giacomini.andrea.ClassDesign.CreatingAbstractClass.Examples;

public class Lion extends BigCat {

	// implementa il metodo abstract "getName()" della classe abstract Animal;
	public String getName(){
		return "Lion";
	}
	
	// implementa il metodo abstract "roar()" della classe abstract BigCat;
	public void roar(){
		System.out.println("The Lion lets out a loud ROAR!");
	}
}
