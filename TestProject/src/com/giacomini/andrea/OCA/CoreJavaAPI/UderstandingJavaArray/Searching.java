package com.giacomini.andrea.OCA.CoreJavaAPI.UderstandingJavaArray;

import java.util.Arrays;

/*
 * N.B: JAVA fornisce anche dei metodi di ricerca (Arrays.binarySearch()) molto utili (esattamente come per 
 * 		l'ordinamento "sort"), però solo se l'array è già ordinato.
 * 		I possibili scenari di una ricerca possono essere i 3 di seguito:
 * 
 * 			- l'elemento cercato è trovato nell'array già ordinato (viene ritornato l'indice del match);
 * 			- l'elemento cercato NON è trovato nell'array già ordinato (viene ritornato un valore negativo, calcolato 
 * 			  come il valore negativo della posizione che l'elemento cercato dovrebbe avere nella lista -1);
 * 			- l'array NON è ordinato (il risultato non è predicibile);
 */

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Dato un'array ordinato.
		int[] numbers = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numbers, 2));			// 0
		System.out.println(Arrays.binarySearch(numbers, 4));			// 1
		System.out.println(Arrays.binarySearch(numbers, 1));			// -1 (poszione_0 -1)
		System.out.println(Arrays.binarySearch(numbers, 3));			// -2 (posizione -1 - 1)
		System.out.println(Arrays.binarySearch(numbers, 9));			// -5 (posizione -4 -1)
		
		// Dato un array NON ordinato. In questo caso non è possibile predirre quale output verrà stampato.
		// All'esame, in questo caso specifico, scegliere l'opzione "unpredicable output".
		int[] numbers2 = new int[] {3, 2, 1};
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));

	}

}
