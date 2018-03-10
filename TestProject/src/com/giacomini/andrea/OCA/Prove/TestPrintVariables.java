package com.giacomini.andrea.OCA.Prove;

public class TestPrintVariables {

	/*
	 * N.B: i nome di variabile e i nomi di classi e metodi posso iniziare con:
	 * 		- una lettera
	 * 		- un "_" (underscore)
	 * 		- un "$" (dollar sign)
	 */
	
	private static int $;

	public static void main(String[] main) {
		// TODO Auto-generated method stub
		
		String a_b;
		
		/*
		 * Possibile inizializzazione.
		 */
//		String a_b = null;
		
		System.out.print($);
		
		/*
		 * Errore di Compilazione: non è possibile refernziare variabili locali prima che siano state inizializzate,
		 * infatti non è possibile stampare a video il valore della variabile String "a_b" in quanto il suo valore
		 * di default (fino a quando non viene inizializzato) è un valore NULL.
		 */
		
//		System.out.print(a_b);

	}
}
