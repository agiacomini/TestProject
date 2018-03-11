package com.giacomini.andrea.Exceptions.UnderstandingExceptions;

/*
 * N.B: Come abbiamo detto, un'eccezione è un evento che altera l'esecuzione del programma. JAVA possiede una super-classe
 * 		"Throwable" per tutti gli oggetti che rappresentano questi eventi.
 * 		
 * 		Di seguito la gerachia di classi che gestiscono le eccezioni: 
 * 
 * 			"java.lang.Object"
 * 
 * 			"java.lang.Throwable"
 * 
 * 			"java.lang.Excpetion"  "java.lang.Error"
 * 
 * 			"java.lang.RuntimeExcpetion"
 * 
 * 		"Error" significa qualcosa che è andato storto, per esempio il "disk drive" non trovato. Queste sono condizioni anomale
 * 		che è difficile incontrare.
 * 		Una "runtime exception" è definita come la classe "RuntimeException" e le sue sotto-classi. Runtime exception tende ad essere
 * 		inaspettata ma non necessariamente fatale. Per esempio, accedere ad un indice, che non esiste, di un array è inaspettato.
 * 		
 * 		Le Runtime exception sono conoscito anche come "unchecked exception".
 * 		
 * 		Una "checked exception" include "Excpetion" e tutte le sotto-classi che NON estendono "RuntimeExcpetion". Le eccezioni checked
 * 		tendono ad essere più prevedibili - per esempio, la lettura di un file che non esiste.
 * 		"Checked Exception"? Cosa stiamo controllando? JAVA ha una regola chiamata "handle or declare rule". Per le "checked exception"
 * 		JAVA richiede al codice di gestirle o dichiararle nella firma del metodo.
 * 		Per esempio, il seguente metodo dichiara che potrebbe lanciare una eccezione:
 * 
 *       	void fall() throws Exception {
 *       
 *       		throw new Exception();
 *       	}
 *       
 *      Si noti che in questo esempio si stanno usando due differenti parole chiave. "throw" dice a JAVA che si vuole lanciare una
 *      eccezione. "throws" semplicemente dichiara che il metodo potrebbe lanciare una "Exception". Potrebbe anche non farlo. 
 *      Visto che le eccezioni "checked" tendono ad essere anticipate, JAVA impone allo sviluppatore di fare qualcosa per mostrare
 *      che l'eccezione è stata prevista. Forse è stata gestita nel meotodo. Oppure il metodo dichiara che non è stata gestita e che
 *      qualcuno dovrebbe farlo.
 *      Un esempio di "RuntimeException" è un "NullPointerException", che si verifica quando si prova a chiamare un metodo su un
 *      riferimento null. Questo può succedere con qualsiasi metodo. Se è stato necessario dichiarare le runtime excpetion ovunque,
 *      ogni singolo metodo potrebbe avere quel disordine.
 *      
 *      
 */

public class UnderstandingExceptionTypes {

}
