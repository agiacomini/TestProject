package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples;

public class Elephant extends Mammal {

	public Elephant(){
		super(10);
	}
	
//	public Elephant(int age){				NON COMPILA - nella classe padre "Mammal" essendoci definito esplicitamente un construttore
//		super();										  che prende un argomento, non è possibile chiamare il suo costruttore di default
//	}													  senza argomenti perché il compilatore non l'avrà inserito in modo automatico
//														  visto che ha identificato un costruttore definito dall'utente;
}
