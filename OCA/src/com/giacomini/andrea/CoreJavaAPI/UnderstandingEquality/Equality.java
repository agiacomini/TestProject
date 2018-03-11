package com.giacomini.andrea.OCA.CoreJavaAPI.UnderstandingEquality;

/*
 * N.B: Nel capitolo "OperatorsAndStatements" abbiamo già parlato dell'operatore == per confrontare numeri e 
 * 		riferimenti ad oggetti.
 * 		E' SEMPRE CONSIGLIABILE NON USARE MAI L'OPERATORE == (DI CONFRONTO) PER CONFRONTARE OGGETTI STRING.
 * 		PER CONFRONTARE OGGETTI STRING E' RACCOMANDATO USARE IL METODO "EQUALS()".
 */ 
public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		
		System.out.println(one == two);				// FALSE
		System.out.println(one == three);			// TRUE - puntano allo stesso oggetto;
		
		/*
		 * N.B: Ricordiamoci che le String sono oggetti IMMUTABILE e i letterali sono messi in un pool da cui la JVM pesca.
		 * 		In questo caso specifico la JVM ha creato un solo letterale che ha messo nel pool, e ha creato due
		 * 		riferimenti differenti che puntano allo stesso oggetto String.
		 */
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y);					// TRUE - i due riferimenti "x" e "y" punatno allo stesso letterale nello stringpool;
		
		/*
		 * N.B: In questo esempio invece non abbiamo due riferimenti che puntano allo stesso letterale String.
		 * 		Visto che le due String vengono valutate in due momenti diversi, uno a run-time e l'altra a compile-time
		 * 		un nuovo oggetto String viene creato. 
		 */
		String z = " Hello World".trim();
		System.out.println(x == z);					// FALSE
		
		/*
		 * N.B: E' anche possibile forzare la situazione precedente, forzando la creazione di un nuovo oggetto String.
		 */
		String a = new String("Hello World");
		String b = "Hello World";
		System.out.println(a == b);					// FALSE
		
		/*
		 * N.B: Per confrontare due oggetti String e in particolare il loro contenuto viene usato il metodo "equals()" tipico
		 * 		proprio degli oggetti String. Questo vale SOLO per gli oggetti String. Infatti ogni classe dovrebbe implementare
		 * 		un proprio metodo per confrontare il contenuto delle istanze della classe. Altrimenti JAVA potrà solo
		 * 		determinare se due oggetti (istanze di una determinata classe) hanno lo stesso puntamento usando l'operatore
		 * 		di uguaglianza (==).
		 * 		Per esempio l'autore di StringBuilder non ha implemetato un metodo per confrontare il contenuto di due oggetti.
		 * 		Per questo con gli StringBuilder è possible solo confrontare i riferimenti. 
		 */
		System.out.println(a.equals(b));			// TRUE

	}
}
