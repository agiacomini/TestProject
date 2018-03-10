package com.giacomini.andrea.OCA.OperatorsAndStatements.UnderstandingJavaStatements;

/*
 * N.B: Il WHILE STATEMENT è una struttura di controllo di ripetizione (più comunemente conosciuta come "loop"),
 * 		esattamente come il "do-while" e il "for".
 * 		Come tutti i loop (while, do-while e for) il while ha una condizione di terminazione, implementata come 
 * 		un'espressione booleana. Il ciclo continuerà ad essere eseguito fino a quando questa espressione booleana
 * 		continuerà ad essere TRUE.
 * 		Durante l'esecuzione l'espressione booleana viene valutata prima di ogni iterazione del loop e l'esecuzione
 * 		uscirà dal ciclo quando l'espressione booleana verrà valutata FALSE.
 * 		Il ciclo "while" può terminare anche subito alla prima iterazione se l'espressione booleana viene valutata
 * 		subito come FALSE. In questa situazione il corpo (body) del ciclo non verrà mai eseguito.
 * 
 * 		Per assicurarsi che il ciclo (while, do-while, for) finisca, e quindi non ci si ritrovi con un ciclo infinito,
 * 		è auspicabile che la variabile nell'espressione booleana venga modificata ad ogni iterazione, affinchè la 
 * 		condizione di terminazione si verifichi prima o poi.
 */

public class WhileStatement {
	
	static int roomInBelly = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		eatCheese(roomInBelly);

	}
	
	public static void eatCheese(int bitesOfCheese){
		
		while(bitesOfCheese > 0 && roomInBelly > 0){
			bitesOfCheese--;
			roomInBelly--;
		}
		
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}

}
