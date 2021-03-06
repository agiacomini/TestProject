package com.giacomini.andrea.CoreJavaAPI.UnderstandingEquality;

public class TigerExample {

	String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TigerExample t1 = new TigerExample();
		TigerExample t2 = new TigerExample();
		TigerExample t3 = t1;
		
		System.out.println(t1 == t1);			// TRUE
		System.out.println(t1 == t2);			// FALSE
		
		/*
		 * N.B: Tutti gli oggetti ereditano il metodo standard "equals()" ma non necessarimanete lo implementano.
		 * 		Questo metodo servirebbe per confrontare il contenuto di due oggetti della stessa classe.
		 * 		Nel caso in cui il metodo "equals()" non viene implementano (come nel nostro caso) JAVA si occupa
		 * 		di confrontare i riferimenti come succede con l'operatore di uguaglianza (==). 
		 */
		System.out.println(t1.equals(t2));		// FALSE
		System.out.println(t1.equals(t3));		// TRUE

	}

}
