package com.giacomini.andrea.MethodsAndEncapsulation.DesigningMethods;

/*
 * N.B: Il nome del metodo segue le stesse regole seguite per la dichiarazione dei nomi delle variabili visto nel capitolo
 * 		1 "Java Building Block". Un'identificatore può solo contenere lettere, numeri e "$" o "_". Inoltre il primo carattere
 * 		non potrà mai essere un numero e non si potranno mai usare le parole chiave di JAVA.
 * 		Per convenzione, i nomi dei metodi iniziano sempre con la minuscola.
 */

public class MethodName {
	
	public void walk1(){}
//	public void 2walk(){}								// NON COMPILA - il nome del metodo inizia con un numero;
//	public walk3 void(){}								// NON COMPILA - il nome del metodo è prima del tipo di ritorno;
	public void Walk_$(){}
//	public void (){}									// NON COMPILA - manca il nome del metodo;

}
