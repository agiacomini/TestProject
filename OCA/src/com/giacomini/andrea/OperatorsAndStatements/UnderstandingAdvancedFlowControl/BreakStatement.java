package com.giacomini.andrea.OCA.OperatorsAndStatements.UnderstandingAdvancedFlowControl;

/*
 * N.B: E' già stato visto come nello statement "switch", lo statement "break" trasferisce/sposta il flusso di
 * 		controllo fuori dallo stesso statement.
 * 		Lo stesso vale anche per gli altri statement "while", "do-while" e anche per i cicli "for" facendo finire il ciclo
 * 		prima.
 * 
 * 		Qui viene spiegato come lo statement "break" può essere accoppiato ad una "OptionalLabel" per spostare il
 * 		flusso di esecuzione in una precisa parte del codice. Ad esempio, in una situazione come quella descritta di
 * 		seguito, dove abbiamo due cicli annidati e uno statement "break" alla fine del ciclo più interno, possiamo
 * 		usare un'etichetta opzionale in coppia allo statement "break" per ri-portare il flusso di esecuzione di nuovo
 * 		al ciclo più esterno. 
 * 		
 */

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i = 0 ; i < list.length ; i++){
			for(int j = 0 ; j <list[i].length ; j++){
				if(list[i][j] == searchValue){
					positionX = i;
					positionY = j;
//					break PARENT_LOOP;
//					break;
				}
			}
		}
		
		if(positionX == -1 || positionY == -1){
			
			System.out.println("Value " + searchValue + " not found");
			
		} else{
			
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}

	}

}
