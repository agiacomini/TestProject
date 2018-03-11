package com.giacomini.andrea.OCA.MethodsAndEncapsulation.OverloadingMethods;

/*
 * N.B: JAVA, quando si parla di overloading di metodi e di lista di parametri di primitive, quando non trova un match perfetto 
 * 		tra i parametri passati al metodo e la lista di parametri che il metodo si aspetta di ricevere non ha problemi a chiamare 
 * 		il metodo che accetta una lista di parametri che siano primitive di più alto livello di quelle passate dal chiamante.
 * 		Un "int" può essere passato ad un metodo che prende una lista di "long".
 * 		Al contrario invece JAVA non riesce a convertire in modo automatico un "long" passato ad un metodo che prende in ingresso
 * 		una lista di "int", MA sarà necessario inserire in modo esplicito un cast sul parametro passato in input.  
 * 		  
 */

public class Primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Primitives p = new Primitives();
		p.fly(123);				// long
		p.fly(123L);			// long
		p.fly((long)123.123);	// long				// N.B: si deve usare un cast esplicito se viene passata al metodo una 
													//		primitiva più grande di "long";
	}
	
//	public void fly(int i){
//		
//		System.out.print("int ");
//	}
	
	public void fly(long l){
		
		System.out.println("long " + l);
	}

}
