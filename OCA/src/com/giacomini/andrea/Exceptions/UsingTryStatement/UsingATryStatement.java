package com.giacomini.andrea.Exceptions.UsingTryStatement;

/*
 * N.B: Ora che si sa cosa sono le eccezioni, vediamo come gestirle. 
 * 		JAVA usa uno statement "try" per separare la logica che potrebbe lanciare una eccezione dalla logica che gestisce
 * 		quell'eccezione.
 * 
 * 			try {
 * 
 * 			} catch(Exception_type identificatore){
 * 
 * 			}
 * 
 * 		Il codice all'interno di un blocco "try" è eseguito normalmente. Se qualsiasi statement lancia una eccezione che può essere
 * 		catturata dal tipo di eccezione elencata nel blocco "catch", il blocco "try" ferma l'esecuzione e l'eccezione va allo statement
 * 		"catch". Se nessuno degli statement nel blocco "try" lancia una eccezione che può essere catturata, la clausola "catch"
 * 		viene ignorata.
 * 		Le parole "blocco - block" e "clausola - clause" vengono usate in modo intercambiabile.
 * 		Le parentesi graffe sono obbligatorie sia per il blocco "try" che per il blocco "catch".
 * 		Di seguito un esempio non corretto di blocco "try" in quanto sprovvisto di parentesi graffe:
 * 
 * 			try				// NON COMPILA
 * 				
 * 				fall();
 * 
 * 			catch(Exception e)
 * 
 * 				System.out.println("get up");
 * 		
 * 
 * 		Di seguito un altro esempio di codice sbagliato:
 * 
 * 			try {			// NON COMPILA
 * 
 * 				fall();
 * 			}
 * 
 * 		Il codice non compila perché ad ogni blocco "try" deve SEMPRE seguire un blocco "catch".
  */

public class UsingATryStatement {

	void explore(){
		
		try{
			
			fall();									// 1 - chiama il metodo "fall()" saltando all'implementazione del metodo stesso;
			System.out.println("never get here");
			
		} catch(RuntimeException e){
			
			getUp();								// 3 - viene catturata l'eccezione lanciata al punto 2 e viene eseguito il
													//	   metodo "getUp()";	
		}
		
		seeAnimals();								// 4 - una volta eseguito il metodo "getUp()" il blocco "try" finisce e si procede
	}												//     con le istruzioni successive "seeAnimals()";
	
	void fall(){
		throw new RuntimeException();				// 2 - lancia una eccezione "RunetimeException";
	}
	
	void getUp(){
		
	}
	
	void seeAnimals(){
		
	}
	
	void testTryWithoutCatchBlock(){
		
		try {
			
		} finally {
			
		}
	}
}
