package com.giacomini.andrea.OperatorsAndStatements.UnaryOperators;

/*
 * N.B: Un'OPERATORE UNARIO è un'operatore che richiede un solo operando, o variabile.
 * 
 *  	- (+) indica un letterale numerico positivo;
 *  	- (- Negation operator) indica un letterale numerico negativo. Non è applicabile ad un booleano;
 *  	- (++ Increment Operator) incrementa un valore di 1. E' applicabile solo a letterali numerici;
 *  	- (-- Decrement Operator) decrementa un valore di 1. E' applicabile solo a letterali numerici;
 *  	- (! Logical Complement Operator) inverte il valore logico booleano. E' applicabile solo a booleani; 
 *  
 *  	Gli operatori unari hanno l'ordine di precedenza più alto di tutti. Quindi in un'espressione con operatori matematici binari e
 *  	operatori unari, questi ultimi vanno valutati per primi.
 */

public class UnaryOperators {
	
	public static void main(String... args){
		
//		int x = !5; 	   NON COMPILA, l'operatore unario "!" è appicabile sono ai boolean;
//		boolean y = -true; NON COMPILA, l'operatore unario "-" è applicabile solo ai letterali numerici;
//		boolean = !0;	   NON COMPILA
		
		/*
		 * N.B: (pre-increment operator) 	++counter ; (pre-decrement operator) 	--counter
		 * 		(post-increment operator) 	counter++ ; (post-decrement operator) 	counter--
		 */
		int counter = 0;
		System.out.println(counter);	// 0
		System.out.println(++counter);	// 1
		System.out.println(counter);	// 1
		System.out.println(counter--);	// 1
		System.out.println(counter);	// 0
		
		/*
		 * Esempio: applicare multipli operatori di incremento/decremento alla stessa variabile nello stesso statement;
		 */
		int x = 3;
		int y = ++x * 5 / x-- + --x; // 4 * 5 / x-- + --x (x = 4)
									 // 4 * 5 / 4 + --x   (x = 3)
									 // 4 * 5 / 4 + 2     (x = 2)
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}

}
