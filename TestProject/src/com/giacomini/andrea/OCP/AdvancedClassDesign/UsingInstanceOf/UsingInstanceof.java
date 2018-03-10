package com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf;

/*
 * N.B: L'espressione "a instanceof B" ritorna TRUE se il riferimento a cui punta "a" è un'istanza della classe "B", oppure una
 * 		sotto-classe di "B" (direttamente o indirettamente), oppure ancora una classe che implementa l'interfaccia "B" (direttamente o
 * 		indirettamente).
 * 
 *   	Guarda gli esempi: com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf.Test.HeavyAnimal;
 *   					   com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf.Test.Hippo;
 *   					   com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf.Test.Elephant;
 *   					   com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf.Test.TestInstanceof;
 *   
 *   	Tutte le classi Java ereditano dalla classe "Object", quindi, per quanto detto, "x instanceof Object" ritornerà sempre TRUE.
 *   	E' sempre vero tranne che in un caso particolare e cioè quando abbiamo "null instanceof Object" oppure quando "x instanceof Object"
 *   	dove "x" contiene un riferimento "null". Infatti "null" non è un'oggetto.
 *   
 *    	La compilazione controlla solo l'applicabilità quando "instanceof" è chiamato su una classe. Quando invece controlla se un'oggetto
 *    	è un'istanza di una interfaccia, Java aspetta fino a runtime per fare il controllo. La ragione è che una sotto-classe potrebbe
 *    	implementare quella interfaccia e il compilatore non lo può sapere.
 *    
 *      Guarda gli esempi: com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf.Test.Mother;
 *      				   com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf.Test.Hippo;
 *      				   com.giacomini.andrea.OCP.AdvancedClassDesign.UsingInstanceOf.Test.TestInstanceof;
 *      
 *      Il compilatore sa che un'interfaccia potrebbe essere aggiunta, in modo che lo statement "instanceof" possa essere vero per
 *      alcune sotto-classi, al contrario non è assolutamente possibile trasformare una classe "Hippo" in una classe "Elephant".
 *      L'operatore "instaceof" è comunemente usato per determinare se un'istanza è sotto-classe di un particolare oggetto prima di
 *      applicare un cast esplicito (tipico per il down-cast).
 *      
 *      Per esempio prendiamo un metodo che prende in input un riferimento di tipo "Animal" ed esegue un'operazione in funzione
 *      del tipo dell'animale: 
 *      
 *      	public void feedAnimal(Animal animal){
 *		
 *				if (animal instanceof Cow){
 *			
 *					((Cow)animal).addHay();
 *				} else if (animal instanceof Bird) {
 *	
 *					((Bird)animal).addSeed();		
 *				} else if (animal instaceof Lion) {
 *
 *					((Lion)animal).addMear();
 *				} else {
 *
 *					throw new RuntimeException("Unsupported animal");
 *				}
 *			}
 *
 *		In questo esempio è necessario sapere se l'animale è un'istanza di una sottoclasse prima di applicare il cast esplicito
 *		e chiamare il metodo appropriato. Per esempio, un "Bird" o un "Lion" probabilmente non avranno il metodo "addHay()", un "Cow"
 *		o "Lion" probabilmente non avranno il metodo "addSeed()" e così via. E' comune che la clausola "else" lanci una eccezione.
 *		Permette al codice di fallire quando un'animale (Animal) inatteso viene passato. Questa è una buona cosa. Dice al programmatore
 *		di correggere il codice piuttosto che lasciare che l'animale abbia fame.
 *		Non c'è un buon modo per scrivere codice. "instaceof" e la pratica del casting all'interno dell'if è estremamente raro trovarlo
 *		fuori da questo esame. E' molto più usato invece quando si scrivono librerie che saranno usate da molti altri. 
 *		Per l'esame basta sapere come funziona "instanceof".  
 *      
 * */


public class UsingInstanceof {

}
