package com.giacomini.andrea.CoreJavaAPI.UnderstandingAnArrayList;

/*
 * N.B: In JAVA ogni primitiva ha una classe Wrapper associata, la quale è un tipo oggetto corrispondente alla
 * 		primitiva che rappresenta.
 * 
 * 									(Converting String to primitive)		(Converting String to Wrapper)
 * 
 * 		- boolean -- Boolean          	Boolena.parseBoolean("true");				Boolean.valueof("true");
 * 		- byte 		 Byte				Byte.parseByte("1");						Byte.valueOf("1");
 * 		- short 	 Short				Short.parseShort("1");						Short.valueOf("1");
 * 		- int -- 	 Integer			Integer.parseInt("1");						Integer.valueOf("1");
 * 		- long 		 Long				Long.parseLong("1");						Long.valueOf("1");
 * 		- float 	 Float				Float.parseFloat("1");						Float.valueOf("1");
 * 		- double 	 Double				Double.parseDouble("1");					Double.valueOf("1");
 * 		- char 		 Char				None										None
 * 
 * 		Ogni classe Wrapper ha un metodo che converte l'oggetto di nuovo nella primitiva.
 * 		Esistono anche metodi che convertono una String in una primitiva o in una classe Wrapper.
 * 		Il metodo "parseInt()" ritorna una primitiva, mentre il metodo "valueOf()" ritorna una classe Wrapper.
 * 		
 */

public class WrapperClasses {

	public static void main(String[] args) {

		/*
		 * N.B: Se la String passata in input non è valida per il tipo in cui si vuole convertire (per esempio "123.45"), JAVA
		 * 		lancerà un'eccezione.
		 */
		
		// Converte una String in una primitiva int.
		int primitive = Integer.parseInt("123");

		// Converte una String in una classe Wrapper Integer.
		Integer wrapper = Integer.valueOf("123");
		
		int bad1 = Integer.valueOf("a");				// Eccezione NumberFormatException
		Integer bad2 = Integer.valueOf("123.45");		// Eccezione NumberFormatException

	}

}
