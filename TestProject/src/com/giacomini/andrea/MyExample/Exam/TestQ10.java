package com.giacomini.andrea.MyExample.Exam;

public class TestQ10 {

	public static void main(String[] args) {

		// La variabile "s" è una reference (o puntatore) ad un oggetto di tipo String.
		String s = "Java";
		
		// N.B: La concatenazione di due stringhe non aggiorna il valore puntato dalla refecence MA crea un nuovo oggetto.
		//      La notazione "s.concat(" SE 7")" equivale alla notazione "String ss = s + " SE 7"". L'unica differenza è che 
		//      per la notazione "s.concat(" SE 7")" non c'è nessuna reference per riferisi al nuovo oggetto modificato. 
		s.concat(" SE 7");
//		String ss = s + " SE 7";
		
		s.replaceAll("7", "");
//		String sss = ss.replaceAll("7", "");
		
		System.out.println(s);
		
//		System.out.println(ss);
		System.out.println(s.concat(" SE 7"));

//		System.out.println(sss);
		System.out.println(s.concat(" SE 7").replaceAll("7", ""));
	}

}
