package com.giacomini.andrea.BuildingBlocks.DestroyingObjects;

import java.util.ArrayList;
import java.util.List;

/*
 * N.B: Un'oggetto come ultima attività prima della fine del suo ciclo di vita può chiamare il metodo "finalize()". 
 * 		Questo metodo prende la chiamata se il GarbageCollector prova a collezionarlo.
 * 		Viene chiamato prima che il Garbage Collector reclami l'oggetto stesso per liberarlo dalla memoria.
 * 		In questo metodo finalize() l'oggetto che lo richiama esegue attività di pulizia, per esempio rilasciando
 * 		risorse di sistemi oppure chiudendo connessioni con altri sistemi. 
 */

/*
 * N.B: In ogni classe si definisce un metodo finalize(), privo di argomenti. Un'istante prima che l'oggetto venga
 * 		cancellato dal garbage collector, la JVM lo richiamerà per eliminare qualsiasi risorsa rimanente. 
 * 		In sostanza il metodo finalize() viene richiamato dal garbage collector un attimo prima che l'oggetto 
 * 		stesso venga liberato dalla memoria (cioè viene eseguito quando l'oggetto diventa eleggibile per il
 * 		garbage collector).
 * 
 *  	La chiamata del metodo finalize() può essere una sola oppure nessuna.
 */

public class Finalize {

	private static List objects = new ArrayList();
	
	// Dichiarazione del metodo. Nessun parametro viene specificato.
	@Override
	protected void finalize() throws Throwable{
		
		try{
			
			System.out.println("Fianlize of Sub Class");
			
		} catch(Throwable t){
			
			throw t;
			
		} finally{
			
			System.out.println("Calling finalize of super Class");
			super.finalize();
		}
		
//		System.out.println("Calling finalize");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Finalize f = new Finalize();

	}

}
