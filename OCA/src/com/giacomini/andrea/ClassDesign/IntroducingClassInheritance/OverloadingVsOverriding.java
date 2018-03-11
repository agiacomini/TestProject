package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance;

/*
 * N.B: Il concetto di Overloading e di Overriding sono molto simili tra di loro in quanto entrambi ridefiniscono un metodo
 * 		usando lo stesso nome. Differiscono in quanto l'Overloading di un metodo usa una firma differente rispetto invece all'Overriding
 * 		del metodo che usa la medesima firma.
 * 		Questa distinzione permette ai metodi Overloading una migliore libertà nella sintassi rispetto ai metodi Overring.   
 */

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Bird{
	
	public void fly(){
		System.out.println("Bird is flying");
	}
	
	public void eat(int food){
		System.out.println("Bird is eating " + food + " units of bird");
	}
}

class Eagle extends Bird{
	
	// Overloading del metodo "fly()" della classe padre "Bird". E' possibile quindi cambiare anche il tipo di ritorno.
	public int fly(int height){
		System.out.println("Bird is flying at " + height + " meters");
		return height;
	}
	
	// Overridden del metodo "eat()" della classe padre "Bird".
	// Hanno la stessa firma (nome + lista di parametri). 
//	public int eat(int food){														NON COMPILA - il valore di ritorno del metodo
//		System.out.println("Bird is eating " + food + " units of food");						  overriding deve essere una sotto-classe
//		return food;																			  del valore di ritorno del metodo della
//	}																							  classe padre (regola numero 4);
}
