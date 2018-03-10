package com.giacomini.andrea.OCA.ClassDesign.UnderstandingPolymorphism.Examples;

public class Peacock extends Bird2{

	// Overiding del metodo "getName()" della classe padre "Bird2"
	public String getName(){
		return "Peacock";
	}
	
	public static void main(String[] args){
		// Si enfatizza il POLIMORFISMO usando un riferimento alla classe padre "Bird2", ma sarebbe stato lo stesso anche se
		// si usava un riferimento alla classe figlia "Peacock".
		Bird2 bird2 = new Peacock();
		
		// Stesso risultato della riga precedente;
//		Peacock bird2 = new Peacock();
		bird2.displayInformation();						// The bird name is: Peacock
		
//		Peacock peacock = (Peacock)bird2;
//		peacock.displayInformation();					// The bird name is: Peacock
	}
}
