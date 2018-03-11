package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples;

import javax.naming.InsufficientResourcesException;

public class Snake extends Reptile {

	// Overriding - il metodo figlio può nascondere o eliminare l'eccezione del metodo parent; 
	protected boolean hasLegs(){
		return false;
	}
	
	// Overriding - il metodo figlio può usare un'eccezione più piccola dell'eccezione usata dal metodo padre;
	// "InsufficientResourcesException" è sotto-classe di "Exception"
	protected double getWeight() throws InsufficientResourcesException{
		return 2;
	}
	
//	protected double getHeight() throws Exception{								    NON COMPILA - la terza regola dell'overrding
//		return 2;																				  non è rispettata perché "Excpetion"
//	}																							  non è sotto-classe di "InsufficientResourcesException"
	
//	protected int getLength() throws InsufficientResourcesException{				NON COMPILA - la terza regola dell'overriding		
//		return 10;																				  non è rispettata perché dato che
//	}																							  il metodo padre non può lanciare
//																								  eccezioni nemmeno il metodo figlio
//																							  	  può farlo;

	
}
