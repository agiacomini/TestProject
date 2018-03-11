package com.giacomini.andrea.OCA.MethodsAndEncapsulation.CreatingConstructor;

/*
 * N.B: Come abbiamo già detto all'inizio "MethodsAndEncapsulation", le variabili d'istanza di tipo FINAL vengono assegnate
 * 		una sola volta. Al momento della dichiarazione oppure in uno statement di inizializzazione a parte.
 * 		E' anche possibile però inizializzare una variabile d'istanza FINAL anche all'interno di un costruttore.
 * 
 * 		Il costruttore è parte del processo di inizializzazione, per questo gli è permesso di inizializzare le variabili d'istanza FINAL.
 * 		Una volta che il costruttore ha finito, tutte le variabili d'istanza FINAL dovranno essere inizailizzate.
 */

public class FinalField {

	private final int volume;
	private final String name = "The Mouse House";
	
	public FinalField(int length, int width, int height){
		
		volume = length * width * height;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
