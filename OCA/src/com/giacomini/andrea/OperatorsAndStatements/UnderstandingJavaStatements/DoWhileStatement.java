package com.giacomini.andrea.OCA.OperatorsAndStatements.UnderstandingJavaStatements;

/*
 * N.B: Il "do-while" è sempre una struttura di controllo di ripetizione come il ciclo "while".
 * 		L'unica caratteristica di questo ciclo che lo differenzia dal "while" è che il "do-while"
 * 		garantisce sempre che il corpo (body) dello statement venga eseguito almeno una volta.
 * 		Proprio per questa sua caratterstica il ciclo "do-while" posiziona il corpo (body) dello 
 * 		statement PRIMA della valutazione dell'espressione booleana.
 */

public class DoWhileStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		
		do {
			x++;
		} while (false);
		
		System.out.println(x);

	}

}
