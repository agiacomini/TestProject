package com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass;

/*
 * N.B: Una classe abstract può includere anche metodi e variabili non ti tipo abstract.
 * 		Inoltre, una classe abstract può anche NON definire nessun metodo di tipo abstract, ma può anche NON definire proprio
 * 		nessun metodo in generale.
 * 		Un metodo abstract però, se definito, deve stare necessarimanete all'interno di una classe di tipo abstract.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.ClassDesign.CreatingAbstractClass.Examples.Swam;
 * 
 * 		Una classe abstract NON può essere marcata come FINAL per un'ovvia ragione. Per definizione, una classe abstract
 * 		è una classe che deve essere estesa da un'altra classe per essere istanziata, mentre invece una classe FINAL non può
 * 		essere estesa da un'altra classe per definizione.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.ClassDesign.CreatingAbstractClass.Examples.Tortoise;
 * 
 * 		Allo stesse modo, un metodo abstract NON può essere marcato come final per la stessa ragione che una classe abstract
 * 		non può essere marcata come final. Quando un metodo viene marcato come final, il metodo non potrà mai essere overiding
 * 		in una sotto-classe figlia, rendendo impossibile creare un'istanza concreta della classe abstract.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.ClassDesign.CreatingAbstractClass.Examples.Goat;
 * 
 * 		Infine, un metodo marcato come abstract NON può essere marcato anche come PRIVATE. Come sarebbe possibile definire una 
 * 		sotto-classe figlia che implementa un metodo "required" se questo metodo non è visibile/accedibile dalla classe
 * 		figlia perché private!?!
 * 		 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.Whale;
 * 						   com.giacomini.andrea.OCA.ClassDesign.CreatingAbstractClass.Examples.HumpbackWhale
 * 
 *  	Anche con i metodi abstract, le regole dell'overiding continuano a valere.
 */

public class DefiningAbstractClass {

//	public abstract void peck();						NON COMPILA - il metodo non è definito all'interno di una classe abstract;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
