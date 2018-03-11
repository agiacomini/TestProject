package com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples;

public class BactrianCamel extends Camel {

	// Overriding
//	private int getNumberOfHumps(){						NON COMPILA - Per le regole dell'Overriding, il metodo figlio deve essere
//		return 2;													  accedibile almeno quanto o più il metodo padre. Quindi, essendo
//	}																  "protected" il metodo padre, il figlio non potrà quindi essere 
//																	  "private" perché più restrittivo.
//																	  Inoltre, per la quarta regola dell'overriding, il valore di 
//																      ritorno deve essere covariante a quello del padre;
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
