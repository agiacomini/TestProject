package com.giacomini.andrea.CoreJavaAPI.UsingStringBuilderClass;

/*
 * N.B: Lo StringBuilder è un'oggetto MUTABILE a differenza dell'oggetto String.
 */

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Di seguito un'esempio di codice che crea molto velocemente una serie di oggetti String.
		 * Ad ogni iterazione del ciclo, visto considerato che stiamo trattando con oggetti String che per definizione non
		 * sono mutabili, viene creato un nuovo oggetto String a cui far puntare la variabile "alpha". 
		 * In sostanza, tutti gli oggetti String, tranne l'ultimo, creati durante le diverse iterazioni del loop for
		 * diventano eleggibili per il garbage collector in quanto non più puntati da nessuna variabile.
		 * Questo è molto inefficiente. 
		 */
		String alpha = "";
		for(char current = 'a' ; current <= 'z' ; current++)
			alpha += current;
		System.out.println(alpha);		// abcdefghijklmnopqrstuvwxyz
		
		/*
		 * Per far fronte all'inefficienza dell'esempio precedente Java mette a disposzione l'oggetto StringBuilder
		 * che a differenza dell'oggetto String e MUTABILE.
		 * Nell'esempio di seguito, ad ogni iterazione del ciclo for all'oggetto StringBuilder puntato dalla variabile "aplha2"
		 * viene aggiunto sempre un nuovo carattere in fondo alla stringa. In questo modo non vengono creati nuovi oggetti
		 * String intermedi ad ogni iterazione.
		 */
		StringBuilder alpha2 = new StringBuilder();
		for(char current = 'a' ; current <= 'z' ; current++)
			alpha2.append(current);
		System.out.println(alpha2);		// abcdefghijklmnopqrstuvwxyz

	}

}
