package com.giacomini.andrea.ClassDesign.ImplementingInterfaces.Examples;

public class Bunny implements Hop {

	public void getDetails(){
//		System.out.println(getJumpHeight());				NON COMPILA - senza un preciso riferimento al nome dell'interfaccia
//																		  il codice non compilerà, anche se la classe "Bunny"
//																		  implementa l'interfaccia "Hop".
//																		  In questa maniera, i metodi di interfaccia static non
//																		  sono ereditati da una classe che implementa l'interfaccia;
		
		System.out.println(Hop.getJumpHeight());
	}
}
