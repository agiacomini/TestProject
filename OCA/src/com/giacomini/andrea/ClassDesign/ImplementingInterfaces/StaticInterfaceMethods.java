package com.giacomini.andrea.ClassDesign.ImplementingInterfaces;

/*
 * N.B: JAVA 8 ora include anche il supporto per i metodi static all'interno di interfacce. Questi metodi sono definiti esplicitamente
 *		con la parola chiave STATIC e funzionano quasi come i metodi static definiti in una classe, come discusso nel capitolo 
 *		"MethodsAndEncapsulation". Infatti, c'è una sola distinzione tra i metodi static definiti in una classe e quelli definiti
 *		in una interfaccia. Un metodo static defintito in una interfaccia non viene ereditato dalla classe che implementa quell'
 *		interfaccia.
 *		Di seguito le regole:
 *		
 *			1- Come tutti i metodi in una interfaccia, anche un metodo static si assume sia PULBIC. Se di tipo private o protected 
 *			   non compilerà;
 *
 * 			2- Per referenziare un metodo static, deve essere usato un riferimento al nome dell'interfaccia;
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Hop;
 * 
 * 		Il metodo "getJumpHeight()" come un metodo static definito in una classe. Può essere acceduto senza un'istanza della classe
 * 		usando la sinstassi "Hop.getJumpHeight()".
 * 
 * 		Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces.Examples.Bunny;
 * 
 * 		In seguito, data una classe che implementa due interfacce contentneti metodi static con la stessa firma, il programma
 * 		continuerà a compilare perché i metodi static non sono ereditati dalla sotto-classe e devono essere acceduti con un riferimento
 * 		al nome dell'interfaccia. Tutto questo è in contrasto con quello che è stato visto per i metodi d'interfaccia di default:
 * 		il codice compilerà se la sotto-classe overide i metodi di defualt oppure il codice non compielrà altrimenti.
 * 		I metodi d'interfaccia static non hanno le questioni dell'ereditarietà multipla e le regole dei metodi d'interfaccia
 * 		di default. 
 * 		
 */

public class StaticInterfaceMethods {

}
