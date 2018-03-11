package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism;

/*
 * N.B: JAVA supporta il POLIMORFISMO, la proprietà di un'oggetto di assumere molte forme differenti. 
 * 		Un'oggetto JAVA può essere acceduto usando un riferimento con lo stesso tipo dell'oggetto, un riferimento che è superclasse
 * 		dell'oggetto, oppure un riferimento che definisce un'interfaccia che l'oggetto implementa, sia direttamente che attraverso
 * 		una superclasse. Inoltre, non è richiesto un cast se l'oggetto non è stato riassegnato a un super tipo o interfaccia dell'
 * 		oggetto.
 * 
 *  	Guarda gli esempi: com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples.Primate;
 *  					   com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples.HasTail;
 *  					   com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples.Lemur;
 *  
 *  	La cosa più importante da notare di questo esempio è che solo un'oggetto "Lemur" è creato e referenziato.
 *  	L'abilità di un'istanza di "Lemur" di essere passata come un'istanza di un'interfaccia che implmenta, "HasTail", così
 *  	come un'istanza delle sue superclassi, "Primate", è la natura del polimorfismo.
 *  	Una volta che l'oggetto è stato assegnato ad un nuovo tipo di riferimento, solo i metodi e variabili disponibili a quel
 *  	tipo di riferimento sono richiamabili dall'oggetto senza un esplicito cast.
 *  
 *   	Esempio al capitolo "com.giacomini.andrea.ClassDesign.IntroducingClassInheritance".
 */

public class UnderstandingPolymorphism {

}
