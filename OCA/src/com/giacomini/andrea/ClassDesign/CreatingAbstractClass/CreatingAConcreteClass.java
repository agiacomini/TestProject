package com.giacomini.andrea.ClassDesign.CreatingAbstractClass;

/*
 * N.B: Quando si lavora con le classi "Abstract" è molto importante ricordarsi che non possono essere istanziate e perciò
 * 		non si potrà fare altro che definire variabili e metodi static.
 * 		Una classe abstract diventa utile quando viene estesa da una sotto-classe concreta.
 * 		Una classe concreta è la prima sotto-classe non-abstract che estende una classe abstract e richiede di implementare
 * 		tutti i metodi abstract ereditati.
 * 		E' sempre molto importante controllare che, una classe concreta che estende una classe abstract, implementi tutti i 
 * 		metodi abstract ereditati. Non è necessario implementare quei metodi NON abstract di una classe abstract.
 * 		
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Animal;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Walrus;
 * 
 * 		Si noti che, quando si definisce una classe concreta come la prima sotto-classe non abstract data una classe abstract di
 * 		partenza, si include anche la possibilità per un'altra classe non abstract di estendere questa prima classe concreta 
 * 		non abstract ereditata dalla classe abstract di partenza.
 * 		Il punto chiave è che la prima classe concreta che estende la classe abstract deve implementare tutti i metodi
 * 		abstract ereditati.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Animal;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Bird;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Flamingo;
 * 
 * 		Il metodo abstract deve essere implementato da TUTTE le classe che ereditano direttamente dalla classe di partenza abstract.
 * 		Non importa invece se le classi che ereditano NON direttamente dalla classe abstract "Animal" ma dalla classe concreta
 * 		"Bird" implementano o meno il metodo abstract "getName()". 	
 * 		
 */

public abstract class CreatingAConcreteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		final CreatingAConcreteClass prova = new CreatingAConcreteClass();					NON COMPILA - non è possibile istanziare
//																										  una classe abstract;

	}

}
