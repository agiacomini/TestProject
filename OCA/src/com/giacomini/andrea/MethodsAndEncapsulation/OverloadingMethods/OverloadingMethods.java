package com.giacomini.andrea.OCA.MethodsAndEncapsulation.OverloadingMethods;

/*
 * N.B: Si parla di "Method overloading" quando si hanno differenti firme di metodi con lo stesso nome MA con una lista
 * 		di parametri differenti. Il modificatore di accesso e la lista di eccezioni invece sono indifferenti per l'overloading.
 * 		
 */

public class OverloadingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Stesso nome di metodo MA firme differenti.
	public void fly(int numMiles){}
	public void fly(short numFeet){}
	public boolean fly(){ return false; }
	void fly(int numMiles, short numFeet){}
	public void fly(short numFeet, int numMiles) throws Exception {}
	
	// Cambiare il valore di ritorno o rendere STATIC il metodo non permette l'overloading.
//	public int fly(int numMiles){ }										NON COMPILA - è cambiato solo il valore di ritorno
//	public static void fly(int numMiles){}								NON COMPILA - è stato solo aggiunto STATIC			

}
