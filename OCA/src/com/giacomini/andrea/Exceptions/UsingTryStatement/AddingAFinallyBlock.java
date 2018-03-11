package com.giacomini.andrea.Exceptions.UsingTryStatement;

/*
 * N.B: Il "try" statement permette di eseguire codice alla fine con una clausola "finally" indipendentemente dal fatto che
 * 		venga lanciata una eccezione o meno.
 * 
 * 			try {
 * 
 * 			} catch(ExcpetionType identifier) {
 * 
 * 			} finally {
 * 
 * 			}
 * 
 * 		Ci sono due percorsi attraverso il codice sia con "catch" che con "finally". Se una eccezione viene lanciata, il blocco
 * 		"finally" è eseguito dopo il blocco "catch". Se invece non viene lanciata nessuna eccezione, il blocco "finally" viene
 * 		eseguito dopo il blocco "try".
 * 
 * 		Un problema con la clausola "finally" è che qualsiasi uso realistico del blocco è fuori scope dall'esame OCA. Infatti,
 * 		il blocco "finally" è tipicamente usato per chiudere risorse come file o databse.
 */

public class AddingAFinallyBlock {{
	
//	public static void fall() {	}
	
	// Esempio1
//	try{												NON COMPILA - l'ordine dei blocchi è sbagliato;
//		fall();
//	} finally {
//		System.out.println("all better");
//	} catch(Exception e){
//		System.out.println("get up");
//	}
	
	// Esempio2
//	try{												NON COMPILA - manca il blocco "catch" o al massimo il blocco "finally";
//		fall();
//	}
	
	
	// N.B: Il blocco "catch" non è richiesto se c'è la presenza del blocco "finally";
	// Esempio3
	try {
//		fall();
	} finally {
		System.out.println("all better");
	}
	
	String s = "";
	try{
		s += "t";
	}catch(Exception e){
		s += "c";
	} finally{
		s += "f";
	}
	
	s += "a";
	System.out.println(s);

}}
