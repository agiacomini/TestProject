package com.giacomini.andrea.BuildingBlocks.DestroyingObjects;

/*
 * N.B: Java ha un Garbage Collection che si occupa in modo automatico di liberare la memoria dagli oggetti
 * 		non più neceseaari al programma.
 * 		Tutti gli oggetti Java del programma in esecuzione vengono memorizzati in uno spazio di memoria 
 * 		chiamato "Heap".
 * 		Il Java Collection si occupa quindi di liberare lo Heap dagli oggetti non più utilizzati.
 * 		Un oggetto rimane nello Heap fino a quando è raggiungibile, il che significa:
 * 		- l'oggetto ha un riferimento che lo punta;
 * 		- tutti i suoi riferimenti sono ancora in scope;
 * 		Fino a quando queste due condizioni sono verificate l'oggetto è per così dire NON eleggibile per il
 * 		Garbage Collection.
 * 
 * 		Un riferimento è una variabile che ha un nome e che può essere usata per accedere al contenuto dell'oggetto
 * 		puntato. Un riferimento può essere assegnato ad un altro riferimento, può essere passato ad un metodo
 * 		oppure può essere ritornato da un metodo. Tutti i riferimenti hanno la stessa grandezza (size).
 * 
 * 		Un oggetto invece non può essere assegnato ad un'altro oggetto, non può essere passato ad un metodo 
 * 		e non può nemmeno essere ritornato da un metodo.
 * 
 * 		Il Garbage Collection lavora sugli oggetti non sui riferimenti.
 * 
 * 		I riferimenti (References) possono o non possono essere creati nello Heap e possono essere acceduti 
 * 		tramite il nome della variabile. Gli oggetti invece sono sempre creati nello Heap, inoltre non hanno un 
 * 		nome e possono essere acceduti solo tramite un riferimento.
 */

public class GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vengono creati due riferimenti che al moento non puntano a nessun oggetto.
		String one, two;
		
		// I due riferimenti precedenti ora puntano a due oggetti.
		one = new String("a");
		two = new String("b");
		
		// Il riferimento "one" ora punta anche'esso all'oggetto puntato dal riferimento "two".
		// C'è stato un assegnamento tra riferimenti.
		one = two;
		
		// Viene vreato un nuovo riferimento e anche quest'ultimo viene fatto puntare all'oggetto già
		// puntato dalla variabile "one".
		String three = one;
		
		// Viene cancellato il riferimento della variabile "one" che significa che non punta più a nulla.
		one = null;

	}

}
