package com.giacomini.andrea.AssessmentTest;

interface HasTail {

	/*
	 * Dal momento che non è specificato nessun modificatore di accesso per il metodo "getTailLength()"
	 * (in quanto si tratta di un metodo di una interfaccia) si assume di default che sia "public".
	 */
	int getTailLength();
}

abstract class Puma implements HasTail{
	
	/*
	 * ERRORE DI COMPILAZIONE: Non è possibile cambiare il modificatore di accesso del metodo "getTailLength()" 
	 * 						   in quanto eredita dall'interfaccia.
	 */
	/*protected int getTailLength() {
		
		return 4;
	}*/
}

/*
 * ERRORE DI COMPILAZIONE: la classe "Cugar" implementa una versione overloading del metodo "getTailLength()",
 * 						   ma dal momento che la dichiarazione della classe padre "Puma" è invalida per via del modificatore di accesso,
 * 						   è necessario implementarne una versione public del metodo.
 */
/*public class Cougar extends Puma {
	
	public static void main(String[] args){
		
		*//*
		 * ERRORE DI COMPILAZIONE: non è possibile istanziare una classe di tipo "Abstract".
		 *//*
		Puma puma = new Puma();
		System.out.println(puma.getTailLenght());
	}
	
	public int getTailLength(int length){
		
		return 2;
	}

}*/
