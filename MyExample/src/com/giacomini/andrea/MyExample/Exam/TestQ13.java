package com.giacomini.andrea.MyExample.Exam;

class TestQ13 {

	/*
	 * N.B: Il modificatore di accesso "PROTECTED" ragiona a livello di package. Cio�, questo metodo � richiamabile
	 * 		solo dalle classi appartenenti allo stesso package.
	 */
	protected void method(int x){
		
		System.out.print("TestQ13 " + x);
	}

}

class TestQ133 extends TestQ13{

	/*
	 * N.B: Overloading Method: quando una classe estende una classe padre e vuole sovrascrivere uno dei suoi metodi,
	 * 		deve per prima cosa cambiare la lista degli argomenti (o parametri) passati al metodo sovrascritto
	 * 		(= cambiare la firma) e nel caso � anche possibile cambiare il tipo del valore di ritorno oppure � anche
	 * 		possibile nuovi tipi di Eccezioni. 
	 */
	public void methos(){
		
	}
	
	/*
	 * Di seguito un esempio di Overloading di un metodo che NON � consentito in quanto la lista degli argomenti 
	 * non � cambiata.
	 */
//	private final int method(int i){
//		
//		return i;
//	}
	
	private final void method(String s) throws Exception{

	}
	
	/*
	 * DOMANDA: Quindi � possibile invece fare Overloading di un metodo passando la stessa lista di argomenti
	 * 			ma cambiando polo il suo comportamento interno??????
	 */
	protected void methos(int i){
		
		System.out.print("TestQ133 " + i);
	}

}
