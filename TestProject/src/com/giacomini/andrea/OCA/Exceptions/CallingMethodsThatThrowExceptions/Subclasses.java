package com.giacomini.andrea.OCA.Exceptions.CallingMethodsThatThrowExceptions;

/*
 * N.B: Vediamo come avviene l'overriding di metodi con eccezioni nella dichirazione del metodo.
 * 		Quando una classe fa l'overriding di un metodo di una super-classe o quando implementa un metodo di una interfaccia,
 * 		non è permesso aggiungere una nuova eccezione checked alla firma del metodo.
 * 		
 * 		Guarda l'esempio: com.giacomini.andrea.OCA.Exceptions.CallingMethodsThatThrowExceptions.Examples.Bunny3;
 * 
 * 		JAVA conosce il metodo "hop()" e non gli è permesso di lanciare nessnu tipo di eccezione checked in quanto nella super
 * 		classe Hopper lo stesso metodo non ne dichiara nessuna.
 * 		Ad una sotto-classe è permesso dichiarare eccezioni più piccole di quelle della super-classe o dell'interfaccia.
 * 		  
 *  	Guarda l'esempio: com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.Examples.Bunny4;
 *  
 *  	Questa è una situazione del tutto legale in quanto il chiamante conosce già come gestirle.
 *  	Una sotto-classe non dichiarando una eccezione è simile ad un metodo che la dichiara lanciando una eccezione che non viene
 *  	mai realmente lanciata. Allo stesso modo, alla sotto-classe è permesso dichiarare un sotto-tipo dell'eccezione. L'idea è
 *  	la stessa.
 *  
 *   	Guarda l'esempio: com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.Examples.Bunny5;
 *   
 *   	"Bunny5" potrebbe dichiarare di lanciare "Exception" direttamente, oppure potrebbe dichiarare di lanciare una eccezione
 *   	più specifica di "Exception". Potrebbe anche dichiarare di non lanciarne proprio nessuna.
 *   	
 *   	Questa regola vale solo per le eccezioni checked (sotto-classi di Exception).
 *   
 *   	Guarda l'esempio: com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.Examples.Bunny6;
 *   
 *   	L'esempio "Bunny6" invece è perfettamente legale perché nella sottoclasse si ha una "RuntimeException" che non è una 
 *   	checked exception.
 *   	I metodi sono liberi di lanciare qualsiasi tipo di runtimeExcpetion anche senza menzionarli nella firma del metodo.
 */

public class Subclasses {

}
