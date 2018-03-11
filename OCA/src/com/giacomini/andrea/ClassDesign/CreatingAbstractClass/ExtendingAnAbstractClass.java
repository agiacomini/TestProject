package com.giacomini.andrea.ClassDesign.CreatingAbstractClass;

/*
 * N.B: E' possibile anche estendere una classe abstract con un'altra classe abstract.
 * 		In questo scenario, la seconda classe abstract che estende la prima classe abstract di partenza non ha bisogno
 * 		di implementare necessarimanete il metodo abstract della classe abstract da cui ha ereditato.
 * 		Quindi se una classe abstract estende un'altra classe abstract, non è necessario implementare i suoi metodi abstract ereditati.
 * 		
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Animal;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Walsur;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Eagle;
 * 
 * 		Se una classe concreta (Lion), eredita da una classe abstract (BigCat) la quale a sua volta ha ereditato da 
 * 		un'altra classe abstract (Animal), la classe concreta dovrà implemetare TUTTI i metodi abstract ereditati, anche quelli
 * 		della classe con grado di parentela più alto.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.BigCat;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Lion;
 * 
 * 		Questo però non vuol dire che una classe abstract che eredita da un'altra classe abstract non possa implementare il 
 * 		metodo abstract ereditato. Se c'è la necessità può farlo tranquillamente.
 * 		In questa situazione allora, la classe concreta (Lion) non dovrà più al suo interno implementare il metodo abstract che 
 * 		la sua classe padre ha già implementato.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.BigCat2;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Lion2;
 * 
 * 		In questo caso quindi, se una classe intermediaria (BigCat2) implementa il metdo "getName()" della classe abstract padre 
 * 		"Animal", il metodo implementato viene ereditato dalla classe concreta "Lion" come un metodo concreto e non più come 
 * 		un metodo abstract per il quale specificare una sua implementazione. 
 */

public class ExtendingAnAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
