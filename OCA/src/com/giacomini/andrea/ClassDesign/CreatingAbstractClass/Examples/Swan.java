package com.giacomini.andrea.ClassDesign.CreatingAbstractClass.Examples;

public class Swan extends Animal {

	// Il metodo "getName()" nella classe figlia Swan implementa, con lo stesso nome e firma, il metodo abstract "getName()" 
	// della classe padre;
	public String getName(){
		return "Swan";
	}
}
