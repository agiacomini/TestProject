package com.giacomini.andrea.OperatorsAndStatements.UnderstandingJavaStatements;

/*
 * N.B: Il ciclo (loop) "for" è un'altra struttura di controllo di ripetizione. 
 * 		A partire da JAVA 5 esistono due tipi di cicli "for":
 * 		1- il ciclo "for" basic;
 * 		2- il ciclo "for" enhanced (aumentato/migliorato), conosciuto anche come ciclo "for-each". E' stato introdotto
 * 		   specificatamente per effettuare iterazioni su array e oggetti "Collection";
 * 
 * 		Il ciclo "for" basic ha un'espressione booleana condizionale e un corpo (body) come gli altri cicli "while" 
 * 		e "do-while", MA in più ha un blocco di inizializzazione e uno statement di update.
 * 		Il ciclo "for" è molto più compatto degli altri cicli "while" e "do-while".
 * 		Le variabili dichiarate e inizializzate nel blocco di inizializzazione hanno uno "scope" limitato al corpo del ciclo.
 * 		Al contrario, le variabili dichiarate prima del ciclo "for" e inizializzate nel blocco di inizializzazione del
 * 		ciclo stesso hanno uno scope che va oltre il body del ciclo "for".
 * 
 *  	Come nel ciclo "while" il blocco condizionale viene valutato prima di ogni singola iterazione e quindi dell'esecuzione
 *  	del body.
 *  	Le componenti del ciclo "for" come il blocco condizionale, il blocco dichiarativo e lo statement di update sono
 *  	tutti opzionali. Non specificando nessuno di questi componenti si crea un ciclo infinito.
 *  	I componenti "required" nella definizione del ciclo "for" sono i ";".
 *  
 *    	Il ciclo "for" enached (for-each) è composto di un blocco di inizializzazione e di un oggetto su cui iterare.
 *    	Il lato destro del ciclo "for-each" deve essere un java array oppure un'oggetto che implementa "java.lang.Iterable".
 *    	Il lato sinistro del ciclo invece, deve contenere una dichiarazione per un'istanza di una variabile, il cui tipo
 *    	match con quello dei membri dell'array su cui si stà iterando. 
 *    	Ad ogni singola iterazione del ciclo "for-each", viene assegnato alla variabile sul lato sinistro un nuovo valore 
 *    	prelevato dall'array o Collection del lato destro.
 *    	 
 */ 
public class ForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.print(i + "");
		}
		
		// 1 - Esempio ciclo "for" basic
		// Esempio di ciclo infinito.
//		for ( ; ;){
//			System.out.println("Hello World");
//		}
		
		
		// 2 - Esempio ciclo "for" basic
		// Il blocco di inizializzazione, quello condizionale e lo statement di update possono includere anche avriabili
		// che non vengono usate nel body del ciclo.
//		int x = 0;
//		for(long y = 0, z = 4 ; x < 5 && y < 10 ; x++, y++){
//			
//			System.out.println(y + " ");
//		}
//		System.out.println(x);
		
		
		// 3 - Esempio ciclo "for" basic - Ri-dichiarazione di una variabile nel blocco di inizializzazione.
		// ERRORE DI COMPILAZIONE: abbiamo messo nel blocco di inizializzazione del ciclo "for" un nome di variabile 
		// già usata prima del ciclo stesso. A differenza dell'esempio 2- 
//		int x = 0;
//		for(long y = 0, x = 4 ; x < 5 && y < 10 ; x++, y++){
//			System.out.println(x + " ");
//		}
		
		// Questa soluzione è per correggere l'errore di compilazione dell'esempio 3-, infatti qui vengono solo inizializzate
		// (nel blocco di inizializzazione del ciclo for) le due variabili "x" e "y" e non dichiarate. La dichiarazione
		// è stata spostata prima del ciclo.
		int x = 0;
		long y = 10;
		for(y = 0, x = 4 ; x < 5 && y < 10 ; x++, y++){
			
			System.out.println(y + " ");
		}
		
		// 4- Esempio ciclo "for" basic - Tipi di Data Type diversi nel blocco di inizializzazione.
		// ERRORE DI COMPILAZIONE: le variabili nel blocco di inizializzazione del ciclo "for" devono essere tutte dello
		// stesso tipo.
//		for(long y = 0, int x = 4 ; x < 5 && y < 10 ; x++, y++){
//			System.out.println(x + " ");
//		}
		
		
		// 5- Esempio ciclo "for" basic - Variabili del ciclo usate fuori dal ciclo.
		// ERRORE DI COMPILAZIONE: non è possibile usare una variabile dichiarata nel ciclo fuori dal ciclo.
//		for(long a = 0, b = 4 ; b < 5 && a < 10 ; a++, b++){
//			System.out.println(a + " ");
//		}
//		System.out.println(a + " ");
		
		
		/************
		 * FOR-EACH *
		 ************/
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for (String name : names) {
			System.out.println(name + ",");
			
		}
		
		/************
		 * FOR-EACH *
		 ************/
		java.util.List<String> values = new java.util.ArrayList<String>();
		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for (String value : values) {
			System.out.println(value);
		}
		
		// ERRORE DI COMPILAZIONE - Non è possibile ciclare su qualcosa che non è un array o un oggetto che non implementa "Iterable".
//		String names2 = "Lisa";
//		for (String name : names2) {
//			System.out.println(name + " ");
//		}
		
		// ERRORE DI COMPILAZIONE - Il tipo di variabile (int), sul lato sinistro dello statement, non coincide con il tipo
		//						    degli oggetti su cui si stà iterando (String).
//		String[] names2 = new String[3];
//		for (int name2 : names2) {
//			System.out.println(name2 + " ");
//		}
		
		
	}

}
