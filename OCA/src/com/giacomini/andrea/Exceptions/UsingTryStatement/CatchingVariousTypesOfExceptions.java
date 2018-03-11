package com.giacomini.andrea.OCA.Exceptions.UsingTryStatement;

/*
 * N.B: Fino ad ora abbiamo visto come catturare un solo tipo di eccezione. Vediamo ora cosa succede se diversi tipi
 * 		di eccezioni possono essere lanciate dallo stesso metodo.
 * 		L'esame OCA può definire eccezioni base per mostrarci la gerarchia. Si ha la necessità di fare solo due cose con
 * 		queste informazioni. La prima, essere in grado di identificare/riconoscere se l'eccezione è "checked" o "unchecked".
 * 		Secondo, determinare se una eccezione è sotto-classe di un'altra.
 * 
 * 		class AnimalOutForAWalk extends RuntimeException {}
 * 		class ExhibitClosed extends RuntimeException {}
 * 		class ExhibitClosedForLunch extends ExhibitClosed {}
 * 
 * 		In questo esempio abbiamo tre eccezioni custom. Tutte sono eccezioni "unchecked" perché sono, direttamente o
 * 		indirettamente, estensioni di RuntimeException. Ora catturiamo le eccezioni e le gestiamo stampando un messaggio 
 * 		appropriato:
 * 
 *  		try {
 *			seeAnimal();
 *			} catch(AnimalOutForAWalk e){		// first catch block
 *				System.out.println("try back later");
 *			} catch(ExhibitClosed e){
 *				System.out.println("not today");
 *			}
 * 
 * 		Ci sono tre diverse possibilità di esecuzione quando questo pezzo di codice viene eseguito.
 * 		Se il metodo "seeAnimal()" non lancia eccezioni, non viene stampato nulla. Se "animal is out for a walk", solo
 * 		il primo blocco catch viene eseguito. Se "exhibit è chiuso", allora viene eseguito il secondo blocco.
 * 		
 * 		C'è una regola sull'ordine dei blocchi "catch". JAVA li controlla nell'ordine in cui sono scritti. Se è impossibile,
 * 		per uno dei blocchi catch, essere eseguito, allora un errore di compilazione verrà lanciato. Questo succede quando una
 * 		super-classe è intercettata prima di una sotto-classe.
 * 
 * 		Nell'esempio precedente invece, visto che i due tipi di eccezioni non sono in relazione tra di loro (nessuna relazione
 * 		gerarchica), l'ordine dei blocchi "catch" può essere tranquillamente invertito senza generazre errori di compilazione.
 * 		
 * 		Di seguito invece vediamo il caso in cui due tipi di relazioni sono una sotto-classe dell'altra.
 * 
 * 			public void visitMonkeys(){
 *		
 *				try{
 *					seeAnimal();
 *				} catch(ExhibitClosedForLunch e){
 *					System.out.println("try back later");
 *				} catch(ExhibitClosed e) {
 *					System.out.println("not today");
 *				}
 *		
 *			}
 *
 *		Se una eccezione "ExhibitClosedForLunch" viene lanciata, il primo blocco catch cattura l'eccezione. Altrimenti, JAVA
 *		controlla se l'eccezione di super-classe "ExhibitClosed" viene lanciata e nel caso la gestisce. Questa volta l'ordine
 *		dei blocchi "catch" è importante. Infatti, invertendo l'ordine dei blocchi il codice non funziona più è restituisce
 *		un errore di compilazione.
 *
 * 			public void visitMonkeys(){
 *		
 *				try{
 *					seeAnimal();
 *				} catch(ExhibitClosed e){
 *					System.out.println("not today");
 *				} catch(ExhibitClosedForLunch e) {					// NON COMPILA
 *					System.out.println("try back later");
 *				}
 *		
 *			}
 *
 *		Questa volta, se una eccezzione più specifica "ExhibitClosedForLunch" viene lanciata, il blocco catch "ExhibitClosed"
 *		viene eseguito - il che significa che il secondo blocco catch non avrà modo di essere eseguito e raggiunto. Infatti JAVA
 *		ci avveritrà della presenza di un blocco catch non raggiungibile.
 *
 * 			public void visitMonkeys(){
 *		
 *				try{
 *					seeAnimal();
 *				} catch(RuntimeException e){
 *					System.out.println("runtime excpetion");
 *				} catch(ExhibitClosed e) {					// NON COMPILA
 *					System.out.println("not today");
 *				} catch(Exception e) {
 *					System.out.println("exception");
 *				}
 *		
 *			}
 *
 *		Anche questo esempio ha lo stesso problema del precedente. L'eccezione "ExhibitClosed" è una sotto-classe di "RuntimeException"
 *		quindi se una eccezione di quest'utlimo tipo viene lanciata il primo blocco "catch" la cattura e la gestisce, 
 *		rendendo impossibile raggiungere invece il secondo blocco "catch".
 *		
 *		Nel caso di blocchi "catch" multipli è bene ricordarsi che solo un blocco catch sarà eseguito, nel caso il codice lanci
 *		una eccezione, e sarà in particolare il PRIMO blocco catch in grado di gestire l'eccezione lanciata.  	
 */

public class CatchingVariousTypesOfExceptions {

	
	
}
