package com.giacomini.andrea.OCA.CoreJavaAPI.UderstandingJavaArray;

/*
 * N.B: Il modo più comune per creare un'array è il seguente: int[] numbers1 = new int[3];
 * 		Con le parentesi quadre [] si sta dicendo che si tratta di un'array, e con "int" si sta dicendo che
 * 		si tratterà di una lista di primitive intere (int).
 * 		Quando si definisce un'array in questo modo, vengono inizializzati tutti gli elementi dell'array con il valore 
 * 		di default del tipo "int" (in questo caso è 0).
 * 		Anche per gli array l'indicizzazione dei suoi elementi parte da 0.  
 */

public class CreatingAnArrayOfPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers1 = new int[3];
		
		/*
		 * N.B: Questo è un'altro modo per creare un'array, specificando anche gli elementi che conterrà.
		 * 		Anche in questo caso si è creato un'array di 3 elementi, ma si è specificato anche il valore contenuto
		 * 		dagli elementi dell'array che non sarà più il valore di defualt (per int è 0) assegnato da JAVA per gli
		 * 		elementi di memoria vuoti.
		 * 		Dal momento che, si stanno specificando gli elementi che saranno contenuti nell'array, non sarà necessario
		 * 		indicare a JAVA la dimensione dell'array (3) come è stato fatto nell'esempio precedente.
		 */
		int[] numbers2 = new int[]{42, 55, 99};
//		int[] numbers4 = new int[3]{42, 55, 99};		// ERRORE DI COMPILAZIONE - quando dichiaro e inizliazzo un array è sbagliato
														//							riportare la dimensione dell'array;
		int[] numbers5;
		numbers5 = new int[]{42, 55, 99};
		
		/*
		 * N.B: Per sintetizzare la sintassi è possbile definire l'array precedente anche con la seguente dicitura.
		 * 		Questo approccio è chiamato "array anonimo". E' anonimo perché non si sta specificando nè la grandezza
		 * 		nè il tipo.  
		 */
		int[] numbers3 = {42, 55, 99};
//		int[] numbers6;									// ERRORE DI COMPILAZIONE - non è possibile spezzare su due righe la definizione
//		numbers6 = {42, 55, 99};						//							di un array "anonimo";
		
		/*
		 * N.B: Di seguito tutti i modi equivalenti per definire un'array:
		 */
		int[] numAnimals;
		int [] numAnimals2;
		int numAnimals3[];
		int numAnimals4 [];
		

	}

}
