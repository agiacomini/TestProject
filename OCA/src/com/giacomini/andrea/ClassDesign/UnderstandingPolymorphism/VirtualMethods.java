package com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism;

/*
 * N.B: La caratteristica più importante del POLIMORFISMO - e una delle principali ragioni per cui abbiamo strutture di classe -
 * 		è supportare i metodi virtuali. Un METODO VIRTUALE è un metodo nel quale la specifica implementazione è determinata solo 
 * 		a run-time. Infatti, tutti i metodi non-FINAL, non-STATIC e non-PRIVATE sono considerati metodi virtuali, dal momento che ognuno
 * 		di loro può essere overide a runtime. Quello che rende un metodo virtuale speciale in JAVA è che se si chiama un metodo
 * 		su un'oggetto che overide un metodo, si prende il metodo overide, anche se la chiamata del metodo è fatta da un riferimento del
 * 		padre o all'interno della classe parent.
 * 
 *    	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Bird2;
 *    					   com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Peacock;
 *    
 * 		Come si è già visto in un esempio simile nella sezione "IntroducingClassInheritance - InheritanceMethods", il metodo
 * 		"getName()" è overiding nella classe figlia "Peacock". Più significativamente, però, il valore del metodo "getName()"
 * 		a runtime nel metodo "displayInformation()" è sostituito con il valore dell'implementazione della sotto classe "Peacock".
 * 
 * 		In altre parole, anche se la classe parent "Bird2" definisce la sua personale versione del metodo "getName()" e non
 * 		conosce nulla riguardo la classe "Peacock" durante la compilazione, a runtime l'istanza usa la versione overiding del
 * 		metodo, come definito nell'istanza dell'oggetto.
 * 		Si enfatizza questa situazione usando un riferimento alla classe Bird2 nel metodo "main()", anche se il risultato sarebbe
 * 		stato lo stesso se si fosse usato un riferimento a "Peacock".
 * 
 * 		Si conosce ora il vero scopo dell'overiding dei metodi e di come si relazione con il polimorfismo.
 * 
 * 		La natura del polimorfismo è che un'oggetto può assumere molte forme differenti. 
 * 
 * 		Combinando il polimorfismo con l'overiding dei metodi si può vedere che gli oggetti possono essere interpretati in molti
 * 		modi differenti a runtime, specialmente nei metodi definiti nella classe parent (super-class) dell'oggetto.
 * 		   	
 */

public class VirtualMethods {

}
