package com.giacomini.andrea.OCA.CoreJavaAPI.CreatingAndManipulatingStrings;

public class ImportantStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * N.B: Il metodo "lenght()" ritorna il numero di caratteri nella stringa.
		 */
		String string = "animals";
		System.out.println(string.length()); 						// 7
		
		/*
		 * N.B: Il metodo "charAt()" ritorna (un char) il carattere presente all'indice passato come parametro.
		 */
		System.out.println(string.charAt(0)); 						// a
		System.out.println(string.charAt(6)); 						// s
//		System.out.println(string.charAt(7)); 						// throws excpetion "StringIndexOutOfBoundException"
		
		/*
		 * N.B: Il metodo "indexOf()" cerca nei caratteri della stringa e trova il primo indice che match con il valore desiderato.
		 * 		Il metodo funziona sia con un singolo carattere che con un'intera stringa come input. Può anche ricercare 
		 * 		il carattere o la stringa a partire da un'indice specificato sempre in input.
		 * 		"indexOf()" ritorna -1 quando non trova nessun match nella stringa.
		 */
		System.out.println(string.indexOf('a'));					// 0
		System.out.println(string.indexOf("al"));					// 4
		System.out.println(string.indexOf('a',4));					// 4
		System.out.println(string.indexOf("al",5));					// -1
		System.out.println(string.indexOf("animal"));				// 0
		
		/*
		 * N.B: Il metodo "substring()" cerca caratteri in una stringa (a partire da un'indice), ritornando parte della stringa stessa.
		 * 		Il primo parametro è l'indice da cui far partire la ricerca. Può anche esserci un secondo (opzionale)
		 * 		parametro di input che specifica l'indice dove fermare la ricerca (escluso quello), specificando in questo modo
		 * 		un range di indici.  
		 */
		System.out.println(string.substring(3));					// mals - from index 3 to end
		System.out.println(string.substring(string.indexOf('m')));	// mals - from index 3 to end
		System.out.println(string.substring(3,4));					// m	- from index 3 until, but not included, index 4
		System.out.println(string.substring(3,7));					// mals	- from index 3 until the end of the string (there is a invisible position)
		
		System.out.println(string.substring(3, 3));					// stringa vuota
//		System.out.println(string.substring(3, 2));					// lancia eccezione
//		System.out.println(string.substring(3, 8));					// lancia eccezione
		
		/*
		 * N.B: I metodi "toLowerCase()" e "toUpperCase()" convertono tutto in minuscolo e tutto in maiuscolo rispettivamente
		 * 		la stringa passata in input.
		 * 		E' importante ricordare che le String sono IMMUTABILI, quindi in questo caso specifico la stringa originale
		 * 		rimane la stessa. 
		 */
		System.out.println(string.toUpperCase());					// ANIMALS
		System.out.println("Abc123".toLowerCase());					// abc123
		
		/*
		 * N.B: I metodi "equals()" e "equalsIgnoreCase()". Il primo metodo controlla se due oggetti String contengono 
		 * 		esattamente gli stessi caratteri nello stesso ordine. Il secondo metodo controlla se due oggetti String
		 * 		contengono gli stessi caratteri nello stesso ordine non facendo caso alle minuscole e maiuscole.
		 */
		System.out.println("abc".equals("ABC"));					// FALSE
		System.out.println("ABC".equals("ABC"));					// TRUE
		System.out.println("abc".equalsIgnoreCase("ABC"));			// TRUE
		
		/*
		 * N.B: I metodi "startsWith()" e "endsWith()" controllano rispettivamente se il primo o l'ultimo carattere
		 * 		dell'oggetto String match con il valore fornito in input. Java esegue sempre un controllo case-sensitive. 
		 */
		System.out.println("abc".startsWith("a")); 					// TRUE
		System.out.println("abc".startsWith("A")); 					// FALSE
		System.out.println("abc".endsWith("c")); 					// TRUE
		System.out.println("abc".endsWith("a")); 					// FALSE
		
		/*
		 * N.B: Il metodo "contains()" cerca sempre dei match nell'oggetto String. A differenza di "startsWith()" e "endsWith()"
		 * 		questo metodo controlla se c'è un match con ogni carattere dell'oggetto String.
		 */
		System.out.println("abc".contains("b"));					// TRUE
		System.out.println("abc".contains("B"));					// FALSE
		
		/*
		 * N.B: Il metodo "replace()" cerca sempre un carattere o una porzione di stringa nell'oggetto String e la sostituisce
		 * 		con un'altro carattere. Esistono due versioni del metodo: 1- quello che si occupa della ricerca e sostituzione 
		 * 		di un singolo carattere e 2- quello che si occupa della ricerca e sostituzione di una sequenza di caratteri. 
		 */
		System.out.println("abcabc".replace('a', 'A'));				// AbcAbc
		System.out.println("abcabc".replace("a", "A"));				// AbcAbc
		System.out.println("abcabc".replace("ab", "ABCD"));			// ABCDcABCDc
		
		/*
		 * N.B: Il metodo "trim()" elimina tutti gli spazi bianchi tra l'inizio e la fine della String.
		 * 		Gli spazi bianchi sono considerati quegli spazi all'inizio della String \t e alla fine della String \n.
		 * 		Il metodo lascia invece invariati gli spazi bianchi tra i caratteri della stringa.
 		 */
		System.out.println("abc".trim());							// abc
		System.out.println("\t a b c\n".trim());					// abc
		System.out.println(" a b c ".trim());						// abc

	}

}
