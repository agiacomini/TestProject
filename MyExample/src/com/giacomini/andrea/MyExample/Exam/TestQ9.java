package com.giacomini.andrea.MyExample.Exam;

public class TestQ9 {

	/* N:B: La posizione della dichiarazione di una variabile ne definisce lo scope, ovvero la sua visibilità
	 * 		e il ciclo di vita della stessa.
	*/
	
	/*
	 * Variabile di Classe - si identifica dal modificatore "static" e viene creata nel momento in cui 
	 * la classe viene caricata in memoria. E' unica per tutte le istanze della classe.
	 * Quindi lo scope della variabile "x" vale per tutto il ciclo di vita della classe stessa, cioè da quando la classe
	 * viene caricata in memoria. 
	 */
	static int x = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int x = 0 ; x < 5 ; x++){

			// Lo scope della variavile "x" definita nel ciclo for è limitata all'interno dello stesso ciclo for.
//			System.out.print(x);
		}
		
		System.out.print(x);

	}

}
