package com.giacomini.andrea.Exceptions.UnderstandingExceptions;

/*
 * N.B: Esistono due modi in cui vengono gestite le eccezioni. Un metodo può gestire il caso dell'eccezione oppure renderla responsabilità
 * 		del chiamante.
 * 		Il punto chiave è che le eccezioni alterano il flusso di esecuzione del programma.
 * 
 * 		Return Codes Vs Excpetion:
 * 		Le eccezioni vengono usate quando "qualcosa va storto". Ma la parola "Qualcosa va storto" è soggettiva. 
 * 
 * 			public int indexOf(String[] names, String name){
 * 
 * 				for (int i = 0 ; i < names.length ; i++){
 * 
 * 					if(names[i].equals(name)) { return i; }
 * 				}
 * 				
 * 				return -1;
 * 			}
 * 
 * 		Questo approccio è comune quando si escrive un metodo che esegue una ricerca. In una ricerca è perfettamente ragionevole
 * 		non trovare una corrispondenza nell'insieme in cui si sta eseguendo la ricerca dell'elemento cercato. Quando succede questo
 * 		un valore speciale viene ritornato. Una eccezione invece dovrebbe essere usata per condizioni eccezionali come la presenza
 * 		di un valore null nelll'array su cui fare la ricerca.
 */

public class TheRoleOfExceptions {

}
