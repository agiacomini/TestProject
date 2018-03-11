package com.giacomini.andrea.OperatorsAndStatements.AdditionalBinaryOperators;

/*
 * N.B: E' possibile accoppiare/comporre gli operatori di assegnamento (=, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=).
 * 		Per l'esame sono importanti solo += e -=.
 * 		Gli operatori composti di assegnamento sono applicabili solo a variabili già dichiarate.
 * 		Inoltre, questi operatori composti, sono utili oltre a scrivere codice compatto anche perché ci salva dall'esplicitare
 * 		il cast di un valore. 
 */ 
public class CompoundAssignmentOperators {

	public static void main(String[] args){
		
		int x = 2, z = 3;
//		x = x * z; Questo statement è equivalente a quello di seguito, dove viene usato l'operatore composto di assegnamento;
		x *= z;
		
		long a = 10;
		int b = 5;
//		b = b * a; NON COMPILA - si stà cercando di associare il risultato (b * a) di tipo long ad una variabile di tipo int;
		
		
//		b = (int) (b * a); N.B: Il problema si potrebbe risolvere eseguendo un cast esplicitio;
//		b *= a;					Oppure usando l'operatore composto di assegnamento che si occupa da solo di fare il cast 
//								di "b" ad long, di eseguire la moltiplicazione tra due long ed infine fare il cast del 
//								risultato a "int" cioè al data type del valore sulla sinistra dell'operatore composto;
		
		long aa = 5;
		long bb = (aa = 3);	/* N.B: (aa = 3) esegue due cose; 1- setta il valore della variabile "aa" a 3
															  2- ritorna un valore all'assegnamento, che è sempre 3	*/
		
		
		System.out.println(aa); // Output 3
		System.out.println(bb);	// Output 3
		
	}
}
