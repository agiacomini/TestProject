package com.giacomini.andrea.CoreJavaAPI.UderstandingJavaArray;

/*
 * N.B: E' possibile scegliere qualsiasi tipo di dato JAVA per essere il tipo di un'array, incluse le classi
 * 		create da noi.
 * 		E' importante sapere che un'array non riserva memoria per allocare gli oggetti veri e propri che contiene MA 
 * 		alloca memoria per i riferimenti a quegli oggetti, che stanno in realtà in un'area di memoria diversa.
 * 		Se un'array viene solo dichiarato MA non istanziato allora il suo riferimento punterà per il momento a NULL.  
 */

public class CreatingAnArrayWithReferenceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] bugs = {"cricket", "beetle", "ladybug"};
		String[] alias = bugs;
		
		/*
		 * N.B: E' possbile chiamare il metodo "equals()" perché anche gli array sono Oggetti.
		 * 		Il seguente statement ritorna TRUE in quanto i due riferimenti sono uguali.
		 * 		Il metodo "equals()" degli array non guarda gli elementi dell'array. Questo vale per tutti i tipi
		 * 		di array (int[], char[], String[], ..).
		 * 		ATTENZIONE: "int" è una primitva, mentre "int[]" è un'oggetto.
		 */
		System.out.println(bugs.equals(alias));		// TRUE - confronta gli indirizzi di "bugs" e di "alias", ed entrambi puntano allo
													//		  stesso oggetto array;
		System.out.println(bugs[1].toString());		// "beetle"
		System.out.println(bugs.toString());		// [Ljava.lang.String;@160bc7c0
		
		String[] strings = {"stringValue"};
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;	// N.B: in questo caso viene usato un "cast esplicito" perché stò passando da
													//		un riferimento ad un array di Object ad un riferimento di array di String
													//		cioè stò specializzando il nuovo riferimento (Da una super-classe "Object" 
													//		ad una sotto-classe "String");
		
//		againStrings[0] = new StringBuilder();		// ERRORE DI COMPILAZIONE
		objects[0] = new StringBuilder();			// ATTENZIONE: lancerà "ArrayStoreException"

	}

}
