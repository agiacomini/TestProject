package com.giacomini.andrea.OCA.OperatorsAndStatements.AdditionalBinaryOperators;

/*
 * N.B: Operatore di Assegnamento (=): confronta valori aritmetici e ritorna un valore booleano. 
 * 		E' un operatore binario (coinvolge due operandi) che modifica o assegna alla variabile (l'operatore sulla sinistra) il 
 * 		risultato del valore del lato destro dell'equazione.
 * 		ese: int x = 1;
 * 
 * 		Anche con gli operatori di assegnamento Java segue un processo automatico di promozione dal più piccolo (tra id ue) data type 
 * 		al più grande (tra i due) data type. 
 */

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x = 0.0; 				 NON COMPILA - si stà cercando di assegnare un double ad in int. 
//									 Non è possibile ridurre un double ad un int;
//		short y = 1921222;			 NON COMPILA - non è possibile ridurre un int ad uno short;
//		int z = 9f;					 NON COMPILA - non è possibile ridurre un float ad un int;
//		long t = 192301398193810323; NON COMPILA - il letterale è troppo grande per essere un'intero (out of range);
		
		/*
		 * N.B: Casting - per risolvere gli errori di compilazione qui sopra è possibile eseguire un casting dei dati,
		 * 		riducendoli al giusto data type. Il cast in generale avviene da un daty type più grande ad uno più piccolo.
		 * 		E' possibile eseguire un cast solo per le primitive. 
		 */
		int x = (int)0.0;
		short y = (short)1921222; // sarà memorizzato come 20678
		int z = (int)9f;
		long t = 192301398193810323L;
		
		short a = 10;
		short b = 3;
//		short c = a * b; NON COMPILA - come detto in "NumericPromotion.java", le primitive più piccole (short, byte e char)
//									   quando sono in gioco degli operatori aritmetici, come nell'esempio, vengono
//									   automaticamente promosse a "int". Quindi lo statement non compila perché si stà cercando
//									   di assegnare un valore intero (a * b) ad una variabile short;
		short c = (short)(a * b);

	}

}
