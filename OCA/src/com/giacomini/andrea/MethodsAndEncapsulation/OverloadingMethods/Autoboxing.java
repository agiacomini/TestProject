package com.giacomini.andrea.MethodsAndEncapsulation.OverloadingMethods;

/*
 * N.B: Nel capitolo precedente "CoreJavaAPI" (UnderstandingAnArrayList) abbiamo visto come JAVA riesce a convertire
 * 		una primitva "int" in un oggetto "Integer" attraverso l'autoboxing.
 * 
 *  	Lo stesso discorso vale anche nel momento in cui si richiama un metodo che prevede per esempio come parametro un oggetto
 *  	"Interger" ma il chimante gli passa una primitiva "int".
 */

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// viene passata una primitiva "3". 
		fly(3);

	}
	
	// Overloading del metodo "fly()". Sono due firme diverse.
	// JAVA naturalemnte, se sono presenti entrambi i metodi, sceglierà il metodo "fly(int numMiles)" in modo da evitare
	// di fare lavoro aggiuntivo (Autoboxing) prima di passare al metodo "fly(Integer numMiles)". 
	public static void fly(Integer numMiles){}
	public static void fly(int numMiles){}

}
