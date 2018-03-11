package com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples;

public class Panda extends Bear {

	// Il metodo STATIC "eat()" della classe figlia "Panda" nasconde (hiding) il metodo STATIC "eat()" della classe padre "Bear".
	// Visto che entrambi sono marcati come STATIC non è da considerarsi un "overiding method".
	public static void eat(){
		System.out.println("Panda is eating");
	}
	
//	public void sneeze(){													NON COMPILA - il compilatore verifica che si sta cercando 
//		System.out.println("Panda bear sneezes quietly");								  di "overiding" un metodo che dovrebbe essere		
//	}																				      "hidden";
	
//	public static void hibernate(){											NON COMPILA - il compilatore verifica che si sta cercando 
//		System.out.println("Panda bear is going to sleep");								  di "hidden" un metodo che dovrebbe essere
//	} 																					  "overiding";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Panda.eat();

	}

}
