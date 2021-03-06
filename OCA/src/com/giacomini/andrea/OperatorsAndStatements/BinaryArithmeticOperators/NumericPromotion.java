package com.giacomini.andrea.OperatorsAndStatements.BinaryArithmeticOperators;

/*
 * N.B: Come è già stato detto nel capitolo 1 "Java Building Blocks" i tipi primitive hanno una grandezza massima (data dal tipo) 
 * 		per contenere un determinato dato. Per esempio il "long" ha una grandezza maggiore di spazio di una primitiva "int", la quale
 * 		a sua volta ha una grandezza maggiore di una primitiva "short".
 * 
 * 		Nel momento in cui si stà eseguendo un'operazione aritmetica (con uno degli operatori) tra due primitve di tipo diverso
 * 		entrano in gioco a questo punto le "Regole di Promozione":
 * 
 * 		- se due valori hanno tipi diversi, Java promuove uno dei due valori al tipo più grande dei due;
 * 		- se uno dei due valori è integrale e l'altro e a virgola mobile (floating-point), Java promuove il valore integrale a 
 * 		  valore in virgola mobile;
 * 		- i tipi "byte", "short" e "char" (i tipi più piccoli) vengono promossi a "int" quando vengono usati con operatori aritmetici binari
 * 		  anche se nessuno degli operandi è un "int" (questa regola non vale per gli operatori unari ++);
 * 		- dopo aver eseguto una promozione, così che gli operandi abbiano lo stesso tipo di dato, il risultato avrà lo stesso tipo
 * 		  della promozione;
 *    
 */

public class NumericPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
