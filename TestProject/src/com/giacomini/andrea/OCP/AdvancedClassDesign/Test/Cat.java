package com.giacomini.andrea.OCP.AdvancedClassDesign.Test;

// N.B: Una classe può essere "abstract" (quindi estesa da una sotto-classe concreta o un'altra classe absrtract) oppure può essere
//		marcata come FINAL che significa che la classe non potrà essere estesa da una sotto-classe.
//		Infatti, le parole chiave abstract e final non potranno mai essere messe insieme delle definizione di una classe o metodo;
//		Un'esempio di classe FINAL è "String". Infatti una volta creato un'oggetto String non potrà più essere modificato;
public abstract class Cat {

	String name = "The Cat";
	
	static String name2 = "The Cat";		// N.B: definisce una variabile di classe STATIC e la rende condivisa a livello di classe
											// 		quindi tra tutti gli oggetti di quella stessa classe. Sarà accedibile solo attraverso
											//		il nome della "nome_classe.nome_campo";
	
	static final String name3 = "The Cat";	// N.B: questo campo (variabile) potrà essere acceduto solo come "Cat.name3" (per via di STATIC)
											// 		e non potrà mai essere cambiato (per via di FINAL);
	
	final static String name4 = "The Cat";	// N.B: idem sopra;
	
	// Metodo abstract;
//	abstract void clean();
	
	// Metodo concreto;
	void clean(){ }
	
	// Metodo di classe o static;
	public static void test(){}
}
