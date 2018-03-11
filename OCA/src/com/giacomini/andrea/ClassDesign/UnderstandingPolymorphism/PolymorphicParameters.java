package com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism;

/*
 * N.B: Una delle applicazioni più utili del POLIMORFISMO è l'abilità di passare istanze della sotto-classe o interfaccia
 * 		ad un metodo. Per esempio, si può definire un metodo che prende un'istanza di un'interfaccia come un parametro.
 * 		In questa maniera, qualsiasi classe che implementa l'interfaccia può essere passata al metodo. Dal momento che
 * 		si sta facendo un cast da un sotto-tipo ad un super-tipo, un cast esplicito non è richiesto.
 * 		Questa proprietà è riferita come "PARAMETRI POLIFORMICI" di un metodo.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Reptile;
 * 						   com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Alligator;
 * 						   com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.Crocodile;
 * 						   com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples.ZooWorker;
 * 
 * 		Focalizziamoci sul metodo "feed(Reptile reptile)" della classe "ZooWorker". Come si può vedere questo metodo
 * 		è in grado di gestire istanze di "Alligator" e "Crocodile" senza problemi, in quanto entrambe sono sotto-classi
 * 		della classe "Reptile". E' in grado di accettare anche un tipo che match con la classe "Reptile".
 * 		Se si dovesse passare al metodo "feed(Reptile reptile)" un tipo senza nessuna relazione con "Reptile", come per esempio 
 * 		"Rodent" o "Capybara", oppure una super-classe come "java.lang.Object" il codice non compilerebbe. 
 */

public class PolymorphicParameters {

}
