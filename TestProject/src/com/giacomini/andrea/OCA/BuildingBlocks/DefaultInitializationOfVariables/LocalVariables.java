package com.giacomini.andrea.OCA.BuildingBlocks.DefaultInitializationOfVariables;

/*
 * N.B: Le variabili locali sono quelle definite all'interno di un metodo e devono essere SEMPRE
 * 		inizializzate prima di essere usate. Non hanno un valore di default.  
 */

/*
 * N.B: In java una variabile per essere usata ha bisogno prima di un valore assegnato.
 * 		Alcune variabili hanno un valore di default mentre altre no.
 * 		Le variabili locali non hanno un valore di default assegnato.
 */

public class LocalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int notvalid(){
		
		int y = 10;
		int x;
//		int reply = x + y; NON COMPILA - si stà usando una variabile non inizializzata.
		
		x = 3;
		int reply = x + y;
		
		return reply;
	}
	
	public void findAnswer(boolean check){
		
		int answer;
		int onlyOneBranch;
		
		if(check){
			
			answer = 1;
			onlyOneBranch = 1;
		} else {
			
			answer = 2;
		}
		
		System.out.println(answer);
//		System.out.println(onlyOneBranch); 	ERRORE DI COMPILAZIONE - nel caso in cui check fosse FALSE
//																	 la variabile onlyOneBranch non sarebbe inizializzata.
		
	}

}
