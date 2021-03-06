package com.giacomini.andrea.Exceptions.UnderstandingExceptions;

/*
 * N.B: Ogni codice JAVA può lanciare una eccezione.
 * 		Nell'esame vedremo due tipi di codice che finisce in una eccezione. La prima quando si scrive codice sbagliato:
 * 
 *  		String[] animals = new String[0];
 *  		System.out.println(animals[0]);
 *  
 *   	Questo pezzo di codice lancerà una eccezione "ArrayIndexOutOfBoundException".
 *   	Un secondo esempio di codice che potrebbe finire in una eccezione è quella di richiedere esplicitamente a JAVA di
 *   	lanciarne una.
 *   
 *   		throw new Exception();
 *   		throw new Exception("Ow! I fell.");
 *   		throw new RunTimeException();
 *   		throw new RunTimeException("Ow! I fell.");
 *   
 *   	La parola chiave "throw" dice a JAVA che si vuole che un'altra parte di codice si occupi dell'eccezione. 
 *   	Quando si crea una eccezione, si può passare un parametro String con un messaggio oppure non passare nulla e usare 
 *   	il default.
 * 		I primi due esempi creano un nuovo oggetto di tipo "Exception" e lo lanciano. Gli ultimi due mostrano un codice molto
 * 		simile, indipendentemente dal tipo di eccezione che si lancia.
 * 
 *      Le seguenti regole sono molto importanti:
 *      
 *      Type					Come riconoscerle							catch dallo sviluppatore		gestite o dichiarate
 *      																									dal programma		
 *      
 *      Runtime Excpetion		sotto-classe di "RunTimeExcpetion"					SI								NO
 *      
 *      Checked Exception		sotto-classe di "Exception" ma						SI								SI
 *      						non sotto-classe di "RunTimeException"
 *      
 *      Error					sotto-classe di "Error"								NO								NO
 *    
 */

public class ThrowingAnException {

}
