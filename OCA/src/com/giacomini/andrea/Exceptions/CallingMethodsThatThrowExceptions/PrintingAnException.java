package com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions;

/*
 * N.B: Esistono tre modi per stampare una eccezione. Si può lasciare che JAVA stampi a video, stampare solo il messaggio, 
 * 		o stampare da dove viene lo stack stace. Vediamo questi tre diversi approcci.
 * 
 *  	Di solito stampare lo stack trace è il metodo più utile perché mostra dove è occorsa l'eccezione in ogni metodo attraverso
 *  	il quale è passata.
 *  	Nell'esame si vedrà principalmente il primo approccio.
 *  
 *  	Lo stack trace mostra tutti i metodi nello stack. Ogni volta che si chiama un metodo, JAVA lo aggiunge allo stack fino
 *  	a quando non è completo/pieno. Quando viene lanciata una eccezione, questa viaggia attraverso tutto lo stack fino a quando
 *  	non trova un metodo che la possa gestire.  
 */

public class PrintingAnException {

	public static void main(String[] args){
		
		try{
			hop();
		} catch(Exception e){
			//1
			System.out.println(e);									// java.lang.RuntimeException: cannot hop
			//2
			System.out.println(e.getMessage());						//	cannot hop
			//3
			e.printStackTrace();									//java.lang.RuntimeException: cannot hop
																	//at com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.PrintingAnException.hop(PrintingAnException.java:26)
																	//at com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.PrintingAnException.main(PrintingAnException.java:13)
		}
		
	}
	
	private static void hop(){
		throw new RuntimeException("cannot hop");
	}
}
