package com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses;

/*
 * N.B: Una classe inner locale è una classe innestata definita all'interno di un metodo. Esattamente come per le variabili
 *      locali, una classe inner locale non esiste fino a quando il metodo non viene invocato e va fuori scope una volta che
 *      il metodo ritorna ("return"). Questo significa che si possono creare istanze solo dall'interno del metodo. Queste
 *      istanze possono ancora essere ritornate dal metodo. Questo è proprio come funzionano le variabili locali.
 *      Le classi inner locali hanno le seguenti proprietà:
 *        
 *      	- Non hanno uno specificatore d'accesso;
 *         
 *         	- Non possono essere dichiarate STATIC e non possono dichiarare campi o metodi STATIC a meno che non siano campi
 *         	  STATIC FINAL;
 *         
 *         	- Possono accedere a tutti i campi e metodi della classe a cui il metodo in cui è innestata appartiene;
 *         
 *         	- Non hanno accesso alle variabili locali del metodo a meno che non siano definite FINAL (di seguito un'esempio
 *         	  che spiega in maggior dettaglio questa situazione) oppure "effectively final";
 *         
 *      Guarda gli esempi: com.giacomini.andrea.OCP.AdvancedClassDesign.CreatingNestedClasses.Test.TestNestedLocalClass;
 *        
 *      In precedenza si è detto che i riferimenti alle variabili locali sono permessi solo se sono FINAL o "effectively final".
 *      Il compilatore stà generando un file class a partire dalla classe inner. Una classe separata non ha modo di riferirsi 
 *      alle variabili locali. Se la variabile locale è FINAL, Java può gestirla passandola al costruttore della classe inner
 *      oppure memorizzandola nel file class. Se invece non fosse "effectively final" questi trucchetti non funzionerebbero,
 *      perché il valore potrebbe cambiare dopo aver fatto una copia. Fino a Java 7, il programmatore era costretto ad inserire
 *      manualmente la parola chiave FINAL. In Java 8 invece è stato introdotto il concetto di "effectively final".
 *      Se il codice può essere ancora compilato con la parola chiave FINAL inserita prima della variabile locale, allora la
 *      variabile è effettivamente final. Di seguito un esempio che spiega meglio il concetto:
 *        
 *         		public void isItFinal(){
 *         
 *         			int one = 20;
 *         			int two = one;
 *         			two++;
 *         			int three;
 *         			
 *         			if (one == 4) three = 3;
 *         			else three = 4;
 *         
 *         			int four = 4;
 *         
 *         			class Inner { }
 *         
 *          		four = 5;
 *         		}
 *         
 *       Le variabili locali "effectively fianl" del codice mostrato sopra sono "one" e "three". "one" perché viene settata una
 *       sola volta nella riga stessa in cui viene dichiarata. "three" perché viene assegnata una sola volta. 
 *       La variabile locale "two" invece NON è "effectively final" perché una volta dichiarata e settata, nella riga successiva
 *       cambia subito di valore. Anche la variabile locale "four" NON è "effectively final" perché anche se il riassegnamento
 *       di un nuovo valore accade dopo la inner class, rimane comunque non permesso richiamarla all'interno della inner class.
 */

public class LocalInnerClasses {

	public static void main(String[] args){
		
	}
}
