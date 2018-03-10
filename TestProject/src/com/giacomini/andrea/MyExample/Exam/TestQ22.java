package com.giacomini.andrea.MyExample.Exam;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class TestQ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Instant start = Instant.now();
		
		/*
		 * LAMBDA EXPRESSION: Argument List -- Arrow Token -- Body
		 * Sono funzioni anonime (come nel linguaggio C), senza una dichiarazione che le dia un nome.
		 * 
		 */
		list.forEach((s) -> System.out.println(s));
		
		Instant end = Instant.now();
		
		long duration = Duration.between(start, end).toMillis();
		
		/*
		 * ERRORE DI COMPILAZIONE: il metodo "between" ritorna un risultato di tipo "Duration" che non può
		 * 						   essere assegnato ad una variabile di tipo "long".
		 */
//		long duration = Duration.between(start, end);
		
		/*
		 * ERRORE DI COMPILAZIONE: non è possible eseguire direttamente l'operazione di differenza tra due oggetti "Instance".
		 */
//		long duration = end - start;
		
		/*
		 * ERRORE DI COMPILAZIONE: la classe "Duration" non ha un costruttore che prende in input due oggetti "Instant".
		 */
//		long duration = new Duration(start,end).getMillis();

	}

}
