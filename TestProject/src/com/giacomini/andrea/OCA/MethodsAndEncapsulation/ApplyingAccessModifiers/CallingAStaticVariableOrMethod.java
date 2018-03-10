package com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers;

import com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.Koala;

/*
 * N.B: Per accedere ad un metodo STATIC basta anteporre il nome della classe che lo contiene al nome del metodo o del campo STATIC.
 * 		E' possibile però usare anche un'istanza dell'oggetto per richiamare un metodo STATIC. Questo però è un pò più complicato. 
 * 		
 */

public class CallingAStaticVariableOrMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Chiamata di un una variavile STATIC
		System.out.println(Koala.count);
		
		// Chiamata di un metodo STATIC
		Koala.main(new String[0]);
		
		// Vediamo come si usa un riferimento all'istanza della classe per poter accedere ad un metodo STATIC.
		Koala k = new Koala();
		System.out.println(k.count);						// stamapa 0 
		k = null;
		System.out.println(k.count);						// stamapa 0 - questo succede perché anche se si sta usando un riferimento null
															//			   si sta facendo uso di una variabile STATIC che sarà uguale per tutte
															//			   le istanze di quella particolare classe.
		
		// Vediamo ora cosa succede se vine modificato un campo STATIC
		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala1.count = 6;
		koala2.count = 5;
		System.out.println(Koala.count);					// count = 5;
		 

	}

}