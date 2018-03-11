package com.giacomini.andrea.CoreJavaAPI.UderstandingJavaArray;

/*
 * N.B: Gli array sono oggetti e naturlmente possono contenere altri oggetti, e per questo motivo
 * 		possono contenere anche altri array. Si parla, in questo caso, di array multi-dimensionali.
 * 		
 */

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Array multi-dimensionale a 2 dimensioni.
		int[][] vars1;
		
		// Modi alternativi di dichiarare un array multidimensionale
		int vars2[][];								// 2D
		int[] vars3[];								// 2D
		int[] vars4[], space[][];					// 2D and 3D
		
		String[][] rectangle = new String[3][2];	// Si tratta di un array di 3 elementi, ognuno dei quali contiene 
													// un'array di 2 elementi.
		
		rectangle[0][1] = "set";					// Stiamo dicendo con questa dicitura che il primo elemento [0] dell'array 
													// a 3 dimensioni punta ad un'altro array di 2 dimensioni, il quale
													// conterrà un puntamento/riferimento ad una stringa "set";
		
		// Array ASIMMETRICO
		// Si tratta ancora di un array a 3 dimensioni, MA al livello successivo abbiamo array di diverse dimensioni.
		int[][] differentSize = {{1,4} , {3} , {9,8,7}};
		int[][] differentSize2 = new int[3][];
		int[][][] differentSize3 = {   { {1} } ,   { {1,1} , {2,2} }   ,   { {1,1} , {2,2} , {3,3} }   };
		int[][][] differentSize4 = new int[3][][];
		int[][][] differentSize5 = new int[][][]{ {   { 1,2 } , { 1,2 }  }   ,   {  { 1,2 } , { 1,2 }  }   ,   {  { 1,2 } , { 1,2 }  }   };
		
		// Un altro modo di creare un array ASIMMETRICO è quello di specificare la dimensione di uno solo dei due array
		// nella dichiarazione e specificare poi la dimensione degli altri array in statement diversi.
		int[][] args2 = new int[4][];
		args2[0] = new int[5];
		args2[1] = new int[3];
		
		/*
		 * N.B: L'operazione più comune fatta sugli array multidimensionali è ciclare su di essi.
		 */
		int[][] twoD = new int[3][2];
		// 1 MODO
//		for(int i = 0 ; i < twoD.length ; i++){
//			for(int j = 0 ; j < twoD[i].length ; j++){
//				System.out.println(twoD[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// 2 MODO - molto più compatto
		for (int[] inner : twoD) {
			for (int num : inner) {
				System.out.println(num);
			}
			System.out.println();
		}

	}

}