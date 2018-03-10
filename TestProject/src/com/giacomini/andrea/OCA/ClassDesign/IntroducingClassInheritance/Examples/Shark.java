package com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples;

public class Shark extends Fish {

	private int numberOfFins = 8;
	
	public Shark(int age){
		super(age);
		this.size = 4;						// Si usa la parola chiave "this" anche per accedere, dalla classe figlia, ai membri
	}										// della classe padre;
	
	// Ci si può riferisce direttamente ad un memebro della classe padre ("getAge()" e "size");
	public void displaySharkDetails(){
		System.out.println("Shark with age: " + getAge());
		System.out.println(" and " + size + " meters long");
		System.out.println(" with " + numberOfFins + " fins.");
	}
	
	// Versione alternativa del metodo "displaySharkDetails()", dove per ogni membro sia della classe padre che della classe figlia
	// viene usata la parola chiave "this";
	public void displaySharkDetails2(){
		System.out.println("Shark with age: " + this.getAge());
		System.out.println(" and " + this.size + " meters long");
		System.out.println(" with " + this.numberOfFins + " fins.");
	}
	
	public void displaySharkDetails3(){
		System.out.println("Shark with age: " + super.getAge());
		System.out.println(" and " + super.size + " meters long");
		System.out.println(" with " + this.numberOfFins + " fins.");
//		System.out.println(" with " + super.numberOfFins + " fins.");				NON COMPILA - nella classe padre non c'è un membro
//																								  "numberOfFins"; 				
	}		
}
