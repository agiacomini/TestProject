package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers;

import java.util.ArrayList;

/*
 * N.B: Le variabili STATIC possono cambiare durante l'esecuzione del programma.
 * 		Le variabili "counter" sono un tipico esempio di variabili STATIC che cambiano.
 * 		Come una variabile d'istanza anche le variabili STATIC possono essere inizializzate al momento della dichiarazione.
 * 
 *  	Altra variabili STATIC invece possono NON cambiare durante l'esecuzione del programma.
 *  	Questo tipo di variabili sono conosciute come "costanti". Usano il modificatore "final" per assicurarsi che non cambino mai.
 *  	Le variabili STATIC FINAL usano una diversa nomenclatura. Vengono scritte sempre in MAIUSCOLO.
 */

public class StaticVariables {
	
	public static int counter = 0;							// Inizializzazione
	
	private static final int NUM_BUCKET = 45;				// Inizializzazione
	
	private static final ArrayList<String> values = new ArrayList<>(); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		NUM_BUCKET = 5;										NON COMPILA - non è possibile aggiornare una variabile STATIC FINAL
		
		/*
		 * N.B: E' permesso chiamare metodi su riferimenti di variabili STATIC FINAL.
		 * 		Il compilatore controlla che non si tenti di ri-assegnare il valore STATIC FINAL facendolo puntare 
		 * 		ad un'altro oggetto.
		 * 		
		 * 		"values" continua a puntare ad un ArrayList di String, a cui però è stato aggiunto un'elemento.	
		 */
		values.add("changed");

	}

}
