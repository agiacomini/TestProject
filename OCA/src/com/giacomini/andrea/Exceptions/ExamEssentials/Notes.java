package com.giacomini.andrea.OCA.Exceptions.ExamEssentials;

/*
 * N.B: Una eccezione indica qualcosa di inatteso che è accaduto. Un metodo può gestire una eccezione, catturandola (catch) oppure
 * 		dichiarandola nella sua firma. Molte delle eccezioni sono lanciate dalle librerie JAVA. E' anche possibile
 * 		lanciare delle proprie eccezioni attraverso il codice "throw new Exception()".
 * 		La sotto-classe  di "java.lang.Error" sono eccezioni che un programma non dovrebbe tentare di gestire.
 * 		Le sotto-classi di "java.lang.RuntimeException" sono eccezioni (NON checked) a run-time.
 * 		Le sotto-classi di "java.lang.Exception", MA NON le sotto-classi di "java.lang.RuntimeException" sono eccezioni
 * 		checked. JAVA richiede che le eccezioni checked siano gestite o dichiarate.
 * 		
 * 		Se uno statement "try" ha multipli blocchi "catch", almeno uno viene eseguito. JAVA cerca il primo blocco "catch" in grado
 * 		di gestire l'eccezione lanciata (nell'ordine in cui appaiono) ed esegue quello che match.
 * 		Poi l'esecuzione continua dopo il blocco "catch". Se sia il blocco "catch" che il blocco "finally" lanciano una eccezione
 * 		solo quella del blocco "finally" viene eseguita.
 * 
 *   	Le più comuni eccezioni a run-time:
 *   
 *   		- ArithmeticException
 *   		- ArrayIndexOutOfBoundsException
 *   		- ClassCastException
 *   		- IllegalArgumentException
 *   		- NullPointerException
 *   		- NumberFormatException
 *   
 *   	"IllegalArgumentException" e "NumberFormatException" sono tipicamente lanciate dal programma, mentre le altre sono tipicamente 
 *   	lanciate dalla JVM.
 *   
 *   	Le più comuni eccezioni sono:
 *   
 *   		- IOException
 *   		- FileNotFoundException
 *   
 *   	Gli "error" più comuni sono:
 *   
 *   		- ExceptionInInitializerError
 *   		- StackOverflowError
 *   		- NoClassDefFoundError
 *   	
 *   	Quando un metodo fa l'overriding di un altro metodo di una super-classe o di una interfaccia, non è permesso aggiungere
 *   	eccezioni checked. E' permesso dichiarare eccezioni più piccole di quelle presenti nel metodo della super-classe.
 *   	I metodi dichiarano le eccezioni che possono lanciare con la parola chiave "throws".
 *   
 *   	ExamEssential:
 *   
 *   		- La differenza tra eccezioni checked e NON checked. Le eccezini NON checked sono spesso conosciute come
 *   		  "RuntimeException" e sono sotto-classi di "java.lang.RuntimeException". Tutte le altre sotto classi di "java.lang.Exception"
 *   		  sono eccezioni checked.
 *   
 *   		- conoscere il flusso di esecuzione di un blocco "try";
 *   
 *   		- identificare se una eccezione è lanciata dal programma oppure dalla JVM;
 *   
 *   		- dichiarare metodi che dichiarano eccezioni;
 *   
 *   		- riconoscere quando usare la parola chiave "throw" oppure "throws";
 */

public class Notes {

}
