package com.giacomini.andrea.OperatorsAndStatements.UnderstandingAdvancedFlowControl;

/*
 * N.B: Il CONTINUE STATEMENT permette di concludere l'esecuzione del ciclo corrente.
 * 		L'uso dello statement "continue" è simile a quello dello statement "break", quello che li differenzia
 * 		è il risultato finale. Mentre lo statement "break" ri-porta il flusso di esecuzione allo statement che lo include,
 * 		lo statement "continue" trasferisce il controllo all'espressione booleana che determina se il ciclo deve continuare
 * 		con una nuova iterazione.
 * 		Esattamente come lo statement "break" anche il "continue" è applicato al ciclo annidato più vicino in esecuzione,
 * 		oppure usando etichette opzionali è possibile modificare questo comportamento e saltare così al ciclo più esterno.  
 */

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FIRST_CHAR_LOOP: for(int a = 1 ; a <= 4 ; a++){
			for (char x = 'a' ; x <= 'c' ; x++){
				if(a == 2 || x == 'b')
//					continue FIRST_CHAR_LOOP;
					continue;
				
				System.out.println(" " + a + x);
			}
		}

	}

}
