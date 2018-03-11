package com.giacomini.andrea.OCA.MethodsAndEncapsulation.OverloadingMethods;

/*
 * N.B: JAVA cerca sempre di trovare il metodo (overloaded) più specifico che match con la lista di parametri della chiamata. 
 */

public class ReferenceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReferenceType r = new ReferenceType();
		r.fly("test");			// string
		r.fly(56);				// object								// sta passando una primitva int = 56,
																// ma non esiste un metodo "fly()" con una lista di parametri int
																// in grado di ricevere la chiamata, quindi JAVA prima esegue
																// l'Autoboxing ad un'oggetto Integer ma nemmeno in questo caso c'è
																// corrsipondenza. Come ultimo tentativo allora JAVA porta la primitava
																// int ad un'ggetto Object.

	}
	
	public void fly(String s){
		
		System.out.print("string ");
	}
	
	public void fly(Object o){
		
		System.out.print("obejct ");
	}
}
