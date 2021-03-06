package com.giacomini.andrea.OperatorsAndStatements.AdditionalBinaryOperators;

import java.io.File;

/*
 * N.B: In Java c'è una profonda differenza tra "DUE OGGETTI SONO GLI STESSI" e "DUE OGGETTI SONO EQUIVALENTI".
 * 		Per le primitive e per i boolean questa distinzione non esiste.
 * 
 * 		- == (operatore di ugualgianza)
 * 		- != (operatore di disunguaglianza)
 * 
 * 		Come gli OPERATORI RELAZIONALI (x < y) valutano entrambi due operandi e ritornano un valore booleano 
 * 		se l'espressione o i valori sono uguali o differenti.
 * 
 *  	Sono usati nei seguenti scenari:
 *  	- comparare due primitive numeriche (se sono di tipi differenti il più piccolo viene automaticamente promosso);
 *  	- comparare due valaro booleani;
 *  	- comparare due oggetti, inclusi i valori NULL e String;
 *  
 *  	
 */

public class EqualityOperators {

	public static void main(String[] args){
		
		/*
		 * Gli operatori di uguaglianza/disuguaglianza sono limitati agli scenari elencati sopra.
		 * Non è possibila mischiare più operatori "==" e "!=" con operatori di assegnamento. 
		 */
//		boolean x = true == 3; 			NON COMPILA
//		boolean y = false != "Giraffe"; NON COMPILA
//		boolean z = 3 == "Kangaroo";	NON COMPILA
		
		/*
		 * Prestare attenzione ai tipi di dati quando c'è in gioco un operatore "==" o "!=".
		 * 
		 */
		boolean y = false;
		boolean x = (y = true);
		System.out.println(x); // TRUE
		
		/*
		 * Per il confronto fra oggetti invece, gli operatori "==" e "!=" sono applicabili ai riferimenti di questi oggetti,
		 * e non agli oggetti che puntano. Due riferimenti sono equivalenti se e solo se puntano allo stesso oggetto o se
		 * entrambi puntano a NULL.
		 */
		File f = new File("myFile.txt");
		File g = new File("myFile.txt");
		File z = f;
		System.out.println(f == g); // FALSE
		System.out.println(f == z); // TRUE
	}
}
