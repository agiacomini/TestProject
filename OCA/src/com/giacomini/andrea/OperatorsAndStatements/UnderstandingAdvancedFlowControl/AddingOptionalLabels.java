package com.giacomini.andrea.OCA.OperatorsAndStatements.UnderstandingAdvancedFlowControl;

/*
 * N.B: E' possibile aggiungere un'etichetta (label) agli statement "if-then", "switch", e ai diversi tipi di cicli (loop).
 * 		Si tratta di un pointer opzionale messo in testa agli statements che permette al flusso applicativo di saltare
 * 		a quel punto preciso. E' una singola parola seguita da (:).
 * 
 * 		Generalmente le "OpzionalLabel" vengono usate escusivamente con gli statement sopra citati. 
 * 
 * 		NON SARA' ARGOMENTO D'ESAME OCA.
 */

public class AddingOptionalLabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray){
			INNER_LOOP: for(int i = 0 ; i < mySimpleArray.length ; i++){
				System.out.println(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}

	}

}
