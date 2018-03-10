package com.giacomini.andrea.OCA.Exceptions.CallingMethodsThatThrowExceptions.Examples;

//class NoMoreCarrotsExcpetion extends Exception {}

public class Bunny2 {
	
	public void bad() {
		
//		try{
//			eatCarrot();
//		}catch(NoMoreCarrotsExcpetion e){				NON COMPIAL - JAVA riconosce che il metodo "eatCarrot()" non può lanciare
//			System.out.println("sad rabbit");						  una eccezione checked - il che significa che non c'è modo
//		}															  per il blocco "catch" del metodo "bad()" di essere raggiunto;
	}
	
	public void good() throws NoMoreCarrotsExcpetion {
		eatCarrot();
	}
	
	private static void eatCarrot() {}

}
