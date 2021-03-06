package com.giacomini.andrea.AdvancedClassDesign.CodingEqualsHashCodeToString;

/*
 * N.B: Ogni volta che si fa l'override del metodo "equals()", ci si aspetta di fare l'override anche del metodo "hashCode()".
 *      Il metodo "hashCode()" viene usato quando l'oggetto viene usato come chiave in una mappa. Si vedrà questo argomento
 *      nel capitolo "GenericsAndCollections".
 *      Un'hasCode è un numero che mette istanze di una classe in un numero finito di categorie.
 *      Si consideri l'esempio del mazzo di carde, dove due carte sono uguali solo se hanno lo stesso valore e lo stesso segno.
 *      Nel costruttore si verifica per primo che nessuna delle variabile d'istanza sia null. Questo controllo permette
 *      al metodo "equals()" di essere più semplice in quanto non lo si costringe a preoccuparsene lui. Il metodo "hashCode()"
 *      è altrettanto semplice. Chiede il valore per il suo has code o usa quello.
 *      Cosa succede se si ha una primitiva e si ha la necessità dell'hascode? L'hashcode è semplicemente un numero. All'esame,
 *      si può usare la primitiva così com'è oppure si può dividerla per avere un int più piccolo. Tutte le variabili d'istanza
 *      non devono essere usate in un metodo "hasCode()". E' comune non includere variabili boolean e char nel' has code.
 *      Il contratto JavaDoce ufficiale si riduce ai seguenti tre punti:
 *      
 *      	- All'interno dello stesso programma, il risultato dell' "hashCode()" non deve cambiare. Questo significa che
 *      	  non si dovrebbero includere variabili che cambiano nella definizione del codice hash. 
 *      
 *      	  Guarda gli esempi: com.giacomini.andrea.OCP.AdvancedClassDesign.CodingEqualsHashCodeToString.ToString;
 *      
 *      	  Nell'esempio della classe "Hippo" è corretto includere la variabile "name", mentre non è corretto includere 
 *      	  la variabile "weight" in quanto può cambiare regolarmente;
 *         
 *      	- Se il metodo "equals()" ritorna TRUE quando viene chiamato con due oggetti, chiamare il metodo "hashCode()" su 
 *      	  ognuno dei due oggetti deve ritornare lo stesso risultato. Questo significa che il metodo "hashCode()" può 
 *      	  usare un sotto-insieme di variabili che il metodo "equals()" usa. Si è visto questo nell'esempio della classe
 *      	  "Card" (qui sotto). Si è usato solo una delle variabili per determinare l'hash code;
 *         
 *      	- Se il metodo "equals()" ritorna FALSE quando viene chiamato con due oggetti, chiamare il metodo "hashCode()" su
 *      	  ognuno di questi oggetti non deve ritornare un risultato diverso. Questo significa che il risultato del metodo 
 *      	  "hashCode()" non deve essere unico quando chiamato su oggetti non uguali;
 *         
 *      Si torni per un momento all'esempio "Lion2",
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCP.AdvancedClassDesign.CodingEqualsHashCodeToString.Equals;
 *      
 *      nel quale si hanno tre variabili d'istanza e solo una di queste viene usata (idNumber) nel metodo "equals()". 
 *      Quali dei seguenti sono metodi "hashCode()" legali?
 *         
 *      	1 -public int hashCode() { return idNumber; }
 *         
 *      	2- public int hashCode() { return 6; }
 *         
 *      	3- public long hashCode() { return idNumber; }
 *         
 *      	4- public int hashCode() { return idNumber * 7 + age; }
 *         
 *      La soluzione 1- è quello che ci si aspetta che sia il metodo "hashCode()". La soluzione 2- è altrettanto legale, non è
 *      però particolarmente efficiente. E' come mettere l'intero mazzo in una unico mucchio gigante. Ma è legale. La soluzione
 *      3- non è un'override del metodo "hashCode()" ereditato dalla classe padre Object. La soluzione 4- non è legale perché
 *      usa più variabili di quelle usate nel metodo "equals()";
 */

public class HashCode {

	public static void main(String[] args){
		
		
	}
}

class Card {
	
	private String rank;
	private String suit;
	
	// Costruttore;
	public Card(String r, String s){
		
		if(r == null || s == null)
			throw new IllegalArgumentException();
		
		rank = r;
		suit = s;
		
	}
	
	// Override del metodo "equals()" ereditato dalla classe Object;
	public boolean equals(Object obj){
		
		if(!(obj instanceof Card)) return false;
		
		Card c = (Card)obj;
		return rank.equals(c.rank) && suit.equals(c.suit);
		
	}
	
	// Override del metodo "hashCode()" ereditato dalla classe Object;
	public int hashCode(){
		
		return rank.hashCode();
	}
}
