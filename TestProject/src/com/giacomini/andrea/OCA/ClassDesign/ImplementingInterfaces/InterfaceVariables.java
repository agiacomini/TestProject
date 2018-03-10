package com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces;

/*
 * N.B: All'interno di una interfaccia è anche possibile definire (oltre a metodi) anche delle variabili. Come i metodi d'interfaccia
 * 		anche per le variabili d'interfaccia si assume siano di default PUBLIC.
 * 		Diversamente dai metodi d'interfaccia, però, le variabili d'interfaccia si assume siano anche STATIC e FINAL.
 * 		Di seguito due regole:
 * 		
 * 			1- Le variabili d'interfaccia sono assunte essere come PUBLIC, STATIC e FINAL. Per questo motivo, rendere una variabile
 * 			   d'interfaccia PRIVATE o PROTECTED genererà un'errore di compilazione, come anche quando si rende una variabili ABSTRACT;
 * 
 * 			2- Il valore di una variabile d'interfaccia deve essere settato quando viene dichiarata dal momento che è marcata come
 * 			   FINAL;
 * 
 * 		In questa maniera, le variabili d'interfaccia sono essenzialmente delle variabili costanti definite a livello di interfaccia.
 * 		Dal momento che si assume siano anche STATIC, sono accessibili anche senza un'istanza dell'interfaccia.
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.CanSwim;
 * 
 * 		Come si vede dall'esempio precedente, il compilatore inserirà in modo automatico PUBLIC STATIC FINAL per ogni variabile
 * 		costante d'interfaccia quando non li troverà specificati direttamente. Si noti anche come è uso comune usare le maiscole
 * 		per denotare le variabili costanti all'interno di un'interfaccia o di una classe (questo vale in generale).
 * 		
 */

public class InterfaceVariables {

}
