package com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers;

/*
 * N.B: Un membro STATIC (metodo o campo) non può chiamare un membro (metodo o campo) d'istanza.
 * 
 * 		Un metodo STATIC e un metodo d'istanza (NON-STATIC) possono chiamare un metodo STATIC perché ques'ultimo non ha bisogno
 * 		di un'oggetto da usare.
 * 
 * 		Solo un metodo d'istanza (NON-STATIC) può chiamare un altro metodo d'istanza (NON-STATIC) nella stessa classe senza usare
 * 		un riferimento di variabile, perché i metodi d'istanza richiedono un'oggetto.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.Gorilla;
 * 
 */

public class StaticVsInstance {
	
	// Membri STATIC
	private static void first(){ }
	private static void second(){ }
	
	// Membri d'Istanza
	private String name = "Static class";
	private void third(){
		
		System.out.println(name);
	}

	// "Main()" è un membro di tipo STATIC
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		first();
		second();
//		third();											NON COMPILA - il metodo STATIC "main()" non può chimare un metodo (membro)
//																		  non STATIC;		

		/*
		 * N.B: Il problema precedente potrebbe essere risolto chiamando il metodo "third()" come un metodo d'istanza;
		 */
		StaticVsInstance prova = new StaticVsInstance();
		prova.third();
	}

}
