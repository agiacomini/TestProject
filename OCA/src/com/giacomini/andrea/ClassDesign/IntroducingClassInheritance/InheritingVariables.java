package com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance;

/*
 * N.B: JAVA non permette alle variabili di essere overiding MA solo di essere hiding.
 * 
 * 		Quando si fa l'"hiding" di una variabile, si sta definendo una variabile in una classe figlia con lo stesso nome di una variabile 
 * 		della classe padre. Questa situazione crea due copie della variabile all'interno dell'istanza della classe figlia: un'istanza
 * 		definita per il riferimento al parent e una definita per il riferimento alla figlia.
 * 		
 * 		Esattamente come per l'hiding di un metodo STATIC, non è possibile fare l'overiding di una variabile. Inoltre, sempre
 * 		come per l'hiding di un metodo STATIC, le regole per accedere alle variabili della classe parent e quelle della classe
 * 		figlia sono le medesime. Se ci si sta riferendo alla variabile dall'interno della classe parent, viene usata la variabile
 * 		definita all'interno della classe parent. Alternativamente, se ci si sta riferendo alla variabile dall'interno della classe
 * 		figlia, verrà usata la variabile definita all'interno della classe figlia. Fortunatamente, ci si può riferire al valore
 * 		della variabile nella classe parent con l'uso esplicito della parola chiave "super".
 * 
 *    	Guarda gli esempi: com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Rodent;
 *    					   com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance.Examples.Mouse;
 *    
 *    	Le regole sull'hiding delle variabili tra classe figlia e classe padre valgono sia per le variabili d'istanza sia
 *    	per le variabili STATIC(di classe).
 *    
 *    	E' comunque una buona pratica di programmazione non scegliere un nome di variabile, in una classe figlia, già usato per una 
 *    	variabile PUBLIC o PROTECTED nella classe padre da cui si eredità.
 *    	L'Hiding di una variabile PRIVATE è meno problematico visto che la classe figlia non ha accesso ai membri PRIVATE della
 *    	classe pradre.   
 */

public class InheritingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
