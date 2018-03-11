package com.giacomini.andrea.OCA.OperatorsAndStatements.AdditionalBinaryOperators;

import java.util.Date;
/*
 * N.B: Gli OPERATORI LOGICI possono essere applicati sia a tipi numerici che a tipi boleani:
 * 		- & (AND), x & y , TRUE se entrambi gli operandi sono TRUE;
 * 		- | (INCLUSIVE OR), x | y, FALSE solo se entrambi gli operandi sono FALSE;
 * 		- ^ (EXCLUSIVE OR), x ^ y, TRUE se gli operandi sono diversi;
 * 
 * 		Gli OPERATORI CONDIZIONALI (short-circuit operators) && e || (short-circuit operators) sono simili agli operatori 
 * 		logici & e | rispettivamente, eccetto per il fatto che il lato destro dell'espressione non sarà mai valutato se 
 * 		il risultato finale può essere determinato dal lato sinistro dell'espressione.
 */

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Indipendentemente dal valore di y, la seguente espressione sarà sicuramente TRUE dal momento che nell'espressione
		// c'è in gioco l'operatore condizionale || per il quale basta un valore TURE per valutare l'intera espressione come
		// TRUE. Quindi, in questo caso specifico, non sarà necessario valutare il lato destro dell'espressione visto che
		// il alto sinistro è già TRUE.
		int y;
		boolean x = true || (y < 4);
		
		System.out.println(x);
		
		// Un'altro esempio di uso degli short-circuit operators.
		// Se aa = null l'operatore "short-circuit operator" previene un NullPointerException dato dalla richeista del
		// metodo aa.getTime().
		Date aa = new Date();
		if(aa != null && aa.getTime() < 5){
			// Do something
		}
		
		// Se per lo stesso esempio visto sopra usassimo un operatore logico "&" al posto di "&&", dell'espressione sarebbe
		// valutata sia il suo lato sinistro che quello destro causando il lancio di una eccezione.
		Date bb = new Date();
		if(bb != null & aa.getTime() < 5){
			// Do something
		}
		
		// Esempio d'esame: qual'è l'output del seguente codice?
		// Dal momento che è stato usato un operatore condizionale (short-circuit operators) può essere valutata solo
		// la parte sinistra dell'espressione. In questo caso "z >= 6" è TRUE, "b" allora sarà sicuramente TRUE
		// e per questo non sarà necessario valutare "++z <= 7" incrementando di un'unità il valore di "z".
		// "z" rimarrà 6.
		int z = 6;
		boolean b = (z >= 6) || (++z <= 7);
		System.out.println(z);	// 6

	}

}
