package com.giacomini.andrea.MethodsAndEncapsulation.WritingSimpleLambdas.Example;

/*
 * N.B: L'obiettivo è stampare gli animali in una lista secondo alcuni criteri.
 */

public class Animal {

	// Variabili d'istanza
	private String species;
	private boolean canHop;
	private boolean canSwim;
	
	// Costruttore - setta le variabili d'istanza
	public Animal(String speciesName, boolean hopper, boolean swimmer){
		
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}
	
	// Ha due metodi che ottengono lo stato dell'animale se salta oppure nuota.
	public boolean canHop(){ return canHop; }
	public boolean canSwim(){ return canSwim; }
	
	// Il metodo "toString()" ci aiuta ad identificare facilmente l'animale in esame.
	public String toString(){ return species; }

}
