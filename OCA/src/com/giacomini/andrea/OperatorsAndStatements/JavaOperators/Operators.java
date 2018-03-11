package com.giacomini.andrea.OCA.OperatorsAndStatements.JavaOperators;

/*
 * N.B: Un'operatore Java è uno speciale simbolo che può essere applicato ad un insieme di variabili, valori o letterali
 * 		e ritornare poi un valore.
 * 		In java esistono tre tipologie di operatore: 
 * 		- unario 	(applicabile ad un solo operando);
 * 		- binario	(applicabile a due operandi);
 * 		- ternario	(applicabile a tre operandi);
 * 
 * 		Gli operatori java seguono l'ordine delle operazioni (se non sono specificate delle parentesi che modificano l'ordine).
 * 		Hanno un loro ordine di precedenze. Se due operatori hanno lo stesso livello di precedenza Java segue la valutazione
 * 		da sinistra verso destra.
 * 
 * 		PRECEDENZA DEGLI OPERATORI (dalla priorità più alta a quella più bassa):
 * 		- (post-operatori unari) expression++, espression--
 * 		- (pre-operatori unari) ++expression, --expression
 * 		- (operatori unari) +, -, !
 * 		- (moltiplicazione, divisione, modulo) *, /, %
 * 		- (addizione, sottrazione) +, -
 * 		- (operatori di shift) <<, >>, >>>
 * 		- (operatori relazionali) <, >, <=, >=, instanceof
 * 		- (equal, not equal) ==, !=
 * 		- (operatori logici) &, ^, |
 * 		- (short circuit operatori logici) &&, ||
 * 		- (operatore ternario) boolean expression ? expression1 : expression2
 * 		- (Assegnamento) =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
 * 		
 *  
 */

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * N.B: Gli operatori in Java non vengono valutati necessarimanete da sinistra verso destra.
		 * 		In questo caso specifico per esempio prima viene decrementato y di un'unità. Poi viene eseguito
		 * 		l'operatore * ed infine l'operatore +;
		 */
		
		int y = 4;
		double x = 3 + 2 * --y;
		
		System.out.println(x);
		System.out.println(y);

	}

}
