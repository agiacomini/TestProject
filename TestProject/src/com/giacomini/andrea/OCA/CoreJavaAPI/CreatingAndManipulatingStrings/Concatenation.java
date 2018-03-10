package com.giacomini.andrea.OCA.CoreJavaAPI.CreatingAndManipulatingStrings;

/*
 * N.B: Concatenare due stringhe significa posizionarle una vicina all'altra e combinarle insieme con l'operatore (+) somma.
 * 		L'operatore (+) somma, a seconda di come viene posizionato può avere effetti diversi seguendo queste regole:
 * 		- tra due operandi numerici, 1 + 2 (somma numerica) = 3;
 * 		- tra due operandi di cui uno String, "a" + 2 (concatenazione) = a2;
 * 		- L'espressione è valutata da sinistra verso destra;
 */

public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1 + 2); 						// Entrambi gli operandi numerici, quindi (+)= somma numerica;
		System.out.println("a" + "b");					// Entrambi gli operandi String, quindi (+)= concatenazione;
		System.out.println("a" + "b" + 3);				// Due opernadi String e uno numerico, quindi (+)= "ab" + 3 = "ab3";
		System.out.println(1 + 2 + "c");				// Due operandi numerici e uno String, quindi (+) = 3 + "c" = "3c";
		
		System.out.println();
		
		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);		// 64
		
		System.out.println();
		
		// Operatore assegnamento
		String s = "1";									// s = "1"
		s += "2";										// s = "12"
		s += 3;											// s = "123"
		System.out.println(s);							// s = "123"

	}

}
