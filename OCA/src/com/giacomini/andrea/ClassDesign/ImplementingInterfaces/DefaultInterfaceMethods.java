package com.giacomini.andrea.ClassDesign.ImplementingInterfaces;

/*
 * N.B: In JAVA 8 è stato introdotto un nuovo tipo di metodo d'interfaccia, conosciuto come "Default Method".
 * 		Un default method è un metodo definito all'interno di una interfaccia con la parola chiave DEFAULT per il quale
 * 		viene definito anche un corpo del metodo. Questo in constrasto con tutti gli altri metodi d'interfaccia, per i quali
 * 		si assume essere di tipo abstract e quindi senza la necessità di definire un corpo del metodo.
 * 		Un default method all'interno di una interfaccia definisce un metodo abstract con una implementazione di default.
 * 		In questa maniera, le classi che hanno la possibilità di fare l'overriding di questo metodo di default (perché implementano
 * 		l'interfaccia) possono scegliere se farlo solo se ne hanno bisogono, ma non è necessarimente richiesto.
 * 		Se la classe non esegue l'overiding del metodo di default, allora verrà usata l'implementazione di default.
 * 		In questo modo, la definizione del metodo è concreta e non abstract.
 * 
 * 		Lo scopo di aggiungere un metodo di default al linguaggio JAVA era in parte legato all'aiutare lo sviluppo di codie e 
 * 		permettere la retro compatibilità. Immaginiamo di avere un'interfaccia che è condivisa tra centinaia di utenti
 * 		e per la quale ci piacerebbe aggiungere un nuovo metodo. Se si aggiunge semplicemente all'iterfaccia un nuovo metodo,
 * 		questo forzerebbe tutti i subscriber ad aggiornare il loro codice, dando un'implementazione al nuovo metodo aggiunto.
 * 		Questo potrebbe essere anche un motivo di scoraggiamento per chi avesse intenzione di aggiornare un'interfaccia.
 * 		Fornendo invece un'implementazioendi default al metodo, però, l'interfaccia divenetrebbe retro-compatibile con il codice
 * 		già esistente e sviluppato, dando la possibilità a questi individui di usare il nuovo metodo con l'opzione di scegliere
 * 		se fare un overiding del metodo stesso dando così una loro implementazione personale.
 * 
 *  	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.IsWarmBlooded;
 *  
 *  	Questo esempio d'interfaccia fornire due metodi d'interfaccia, uno è un metodo normale abstract e l'altro un metodo default.
 *  	Si noti come entrambi i metodi sono assunti essere PUBLIC.
 *  	Ogni classe che implementi questa interfaccia può contare sull'implementazione di default per il metodo "getTemperature()"
 *  	oppure dare una propria versione di implementazione attraverso l'overiding del metodo.
 *  	
 *  	Si noti anche che il modificatore d'accesso default visto nel capitolo "MethodsAndEncapsulation" è completamente 
 *  	differente dal metodo default definito qui. Il modificatore d'accesso default indica ad una classe la possibilità
 *  	di accedere ad un'altra classe, oppure di accerede a metodi o valori all'interno di un'altra classe se e solo se entrambe
 *  	le classi risiedono nello stesso package. 
 *  	Qui, invece, stiamo parlando di una parola chiave DEFAULT applicabile ad un metodo all'interno di una interfaccia.
 *  	Dal momento che tutti i metodi all'interno di una interfaccia sono considerati PUBLIC, anche il modificatore d'accesso
 *  	di un metodo default sarà necessarimente di tipo PUBLIC.
 *  
 *   	Di seguito le regole:
 *   
 *   		1- Un metodo default può essere dichiarato solo ed esclusivamente all'interno di una interfaccia;
 *   
 *   		2- Un metodo default deve essere marcato con la parola chiave DEFAULT. Se marchiato con la parola chiave DEFAULT
 *   		   un metodo allora sarà costretto a fornire un'implementazione per il corpo del metodo;
 *   
 *   		3- Un metodo default non può essere ABSTRACT, STATIC o FINAL, e può essere usato così com'è oppure overiding
 *   		   dalla classe che implementa l'interfaccia;
 *   
 *   		4- Come per tutti gli altri metodi d'interfaccia, anche il metodo default si assume essere PUBLIC e non potrà essere
 *   		   marcato come PROTECTED o PRIVATE altrimenti causerebbe un'errore di compilazione;
 *   
 *   	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Carnivore;
 *   
 *   	Diversamente dalle variabili d'interfaccia, per le quali si assume essere STATIC, i metodi di default non possono essere
 *   	marcati come STATIC e richiedono un'istanza della classe che implementa l'interfaccia per essere invocati.
 *   	Sempre i metodi di default non possono essere marcati come FINAL o ABSTRACT perché gli è permesse di essere overiding
 *   	nella classe che implementa l'interfaccia ma questo però non è obbligatorio.
 *   
 *   	Quando un'interfaccia estende un'altra interfaccia che contiene un metodo di default, gli è permesso di scegliere se
 *   	ignorare il metodo di default, nel qual caso allora sarà usata l'implementazione di default del metodo. Alternativamente,
 *   	l'interfaccia può decidere di overiding la definizone del metodo di default seguendo le regole del'overiding dei metodi
 *   	(in generale), come il non limitare l'accessibilità al metodo oppure la regola delle covarianti (riguardo i valori di ritorno).
 *   	In fine, l'interfaccia può ri-dichiarare il metodo come ABSTRACT, richiedendo alla classe che implementerà quest'ultima
 *   	interfaccia di implementare il corpo del metodo. Le medesime situazioni si ripropongono anche quando una classe
 *   	implementa un'interfaccia.
 *   
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.HasFins;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.SharkFamily;
 *      
 *      In questo esempio, nell'interfaccia "HasFins" sono stati definiti tre metodi di default con la loro implementazione.
 *      La seconda interfaccia "SharkFamily" che estende "HasFins" invece fa l'overiding del metodo "getNumberOfFins()" con
 *      un nuovo metodo che ritorna un valore differente. Inoltre, sositutisce il metodo "getLongestFinLength()" con un nuovo
 *      metodo (questa volta di tipo abstract), forzando ogni classe che la implementerà l'interfaccia (SharkFamily) ad fornire
 *      un'implementazione al metodo. In fine, l'interfaccia "SharkFamily" fa l'overding del metodo "doFinsHaveScales()" ma
 *      non marca il nuovo metodo come default, portando ad avere in questo caso un errore di compilazione.
 *      
 *      
 *      
 *      Default Methods and Multiple Inheritance:
 *      Il fatto di poter definire metodi di default per le interfacce insieme al fatto che una classe può implementare interfacce
 *      multiple, questa situazione potrebbe generare problemi di ereditarietà multipla.
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Walk;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Run;
 *      				   com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Cat;
 *      
 *      In questo esempio, la classe "Cat" eredita due metodi default "getSpeed()". Dal momento che sia "Walk" che "Run" sono
 *      considerati fratelli in termini di come sono usati nella classe "Cat", non è chiaro se il codice dovrebbe stampare 5 o 10.
 *      La risposta è che il codice non stampa nessuno dei due perché fallisce la compilazione.
 *      Se una classe che implementa due interfacce che hanno metodi di default con lo stesso nome e stessa firma, il compialtore
 *      lancerà un errore di compilazione. C'è un'eccezione a questa regola: se la sotto-classe overide i metodi di default duplicati
 *      il compialtore allora compilerà senza errori - in questo modo l'ambiguità su quale versione del metodo richiamare verrà
 *      rimossa.
 *      
 *      Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Cat1;
 *      
 *      Avendo una classe che implementa o eredita due metodi di default duplicati questo forza la classe a implementare una nuova
 *      versione del metodo, per evitare un errore di compilazione.
 *      Questa regola vale anche per le classi abstract che implementano interfacce multiple, perché il metodo di default potrebbe
 *      essere richiamato in un metodo concreto all'interno di una classe abstract. 
 */

public class DefaultInterfaceMethods {

}
