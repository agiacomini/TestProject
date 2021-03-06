package com.giacomini.andrea.Exceptions.RecognizingCommonExceptionTypes;

/*
 * N.B: Data una eccezione bisogna essere in grado di ricnoscere di che tipo di eccezione si tratta e se è lanciata dalla JVM o dal
 * 		programma.
 * 
 *  	"Error" estendono la classe "Errors". Vengono lanciate dalla JVM e non dovrebbero essere gestite o dichiarate.
 *  	Gli "Errors" sono rari ma si potrebbero incontrare i seguenti:
 *  
 *   		- ExceptionInInitializerError: lanciate dalla JVM quando una inizializzazione statica lancia una eccezione ma non la gestisce;
 *   
 *    		- StackOverflowError: lanciata dalla JVM quando un metodo chiama se stesso molte volte (questo è chiamato "ricorsione infinita"
 *    							  perché il metodo tipicamente chiama se stesso senza finire);
 *    
 *    		- NoClassDefFoundError: lanciata dalla JVM quando una classe che il codice usa è disponibile a compile-time ma NON a run-time;
 *    
 *    
 *    
 *    	ExceptionInInitializerError:
 *    	JAVA esegue l'inizializzazione statica appena la classe viene usata. Se una delle inizializzazioni statiche lancia una eccezione
 *    	JAVA non può usare la classe. Dichiara la sconfitta lanciando una "ExceptionInInitializerError".
 *    	Il codice seguente mostra una "ArrayIndexOutOfBounds" in una inizializzazione statica:
 *    
 *     		static{
 *     
 *     			int[] countsOfMoose = new int[3];
 *     			int num = countsOfMoose [-1];
 *     		}
 *     
 *     		public static void main(String[] args){	}
 *     
 *     Questo codice produce informazioni su due eccezioni:
 *     
 *     		Exception in thread "main" java.lang.ExceptionInInitializerError
 *			Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
 *
 *		Riceviamo "ExceptionInInitializerError" perché l'errore è successo in un blocco di inizializzazione statico.
 *		Questa informazione da sola non sarebbe particolramente utile per fissare il problema. Perciò JAVA ci dice anche la causa
 *		originale del problema: la "ArrayIndexOutOfBoundsException" che dobbiamo fissare.
 *
 *		La "ExceptionInInitializerError" è un errore perché JAVA fallisce nel caricare l'intera classe e quindi per JAVA non è possible
 *		continuare.
 *
 *
 *
 *		StackOverflowError:
 *		Quando JAVA chiama i metodi, mette i parametri del metodo e le variabili in uno stack. Dopo aver fatto questo molte volte,
 *		lo stack esaurisce lo spazio. Questo è chiamato "StackOverflowError". Molte volte questo succede quando, un metodo chiama
 *		se stesso:
 *
 *			public static void doNotCodeThis(int num){
 *
 *				doNotCodeThis(1);
 *			}
 *
 *		L'output conterrà questo:
 *
 *			Exception in thread "main" java.lang.StackOverflowError
 *
 *		Dal momento che il metodo chiama se stesso, il metodo non finirà mai. Alla fine JAVA esaurirà lo stack e lancerà l'eccezione.
 *		Questo viene chiamato "ricorsione infinita". E' comunque meglio di un ciclo infinito perché almeno JAVA lo catturerà e lancerà
 *		una eccezione. Con un ciclo infinito invece, JAVA userà tutta la nostra CPU fino a quando non decideremo di uccidere il 
 *		processo.
 *
 *
 *
 *		NoClassDefFoundError:
 *		Questo errore non verrà messo nell'esame - c'è bisogno solo di sapere che è un errore.
 *		L'errore "NoClassDefFoundError" si verifica quando JAVA non può trovare la classe a run-time.
 */

public class Errors {

}
