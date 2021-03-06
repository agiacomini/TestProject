package com.giacomini.andrea.OperatorsAndStatements.AdditionalBinaryOperators;

/*
 * N.B: Gli OPERATORI RELAZIONALI confrontano due espressioni e ritornano un valore booleano.
 * 		Gli operatori relazioni applicabili a primitive sono:
 * 		- < (strettamente minore di);
 * 		- <= (minore o uguale a);
 * 		- > (strettamente maggiore di);
 * 		- >= (maggiore o uguale a);
 * 
 * 		Se i due operandi numerici NON sono delle stesso tipo, il più piccolo viene promosso a quello più grande.
 * 
 * 		Esiste anche un quinto operatore relazionale applicabile a riferimenti di oggetti, classi e interfacce:
 * 		- a instanceof b (true se l'oggetto puntato del riferimento "a" è un'istanza di una particola tipo di classe o 
 * 		  interfaccia );
 * 
 * 		L'operatore "instanceof" non sarà presente nell'esame.
 */

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10, y = 20, z = 10;
		System.out.println(x < y);	// true
		System.out.println(x <= y);	// true
		System.out.println(x >= z); // true
		System.out.println(x > z);	// false
		
		

	}

}
