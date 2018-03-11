package com.giacomini.andrea.OCA.MethodsAndEncapsulation.WorkingWithVarargs;

/*
 * N.B: E' possibile usare anche i "varargs" nella lista dei paramtri di un metodo, come se fosse un array.
 * 		Un varargs deve essere l'ultimo elemento nella lista dei parametri. Questo implica che è possibile avere un solo
 * 		varargs per metodo.   
 */

public class WorkingWithVarargs {
	
	public static void main(String[] args){
		
		walk5(1);												// 0
		walk5(1, 2);											// 1
		walk5(1, 2, 3);											// 2
		walk5(1, new int[] {4,5});								// 2
//		walk5(1, null);											// LANCIA ECCEZIONE - NullPointerExcpetion
		
		run(11, 22);											// 22
	}

	public void walk1(int... nums){ }
	public void walk2(int start, int... nums){ }
//	public void walk3(int... nums, int start){ }				 // NON COMPILA - la posizione del varargs nella lista dei parametri
																 //               non è l'ultima;
//	public void walk4(int... start, int...is nums){ }			 // NON COMPILA - i varargs nella lista dei paramtri sono più di uno;
	
	/*
	 * N.B: Quando viene chiamato un metodo che ha un parametro varargs è possibile passargli un array oppure è possibile elencare
	 * 		gli elementi dell'array e lasciare che JAVA lo crei per te.
	 * 		E' possibile anche omettere i valori varargs dalla chiamata del metodo così che JAVA crei un array di dimensione zero. 
	 */
	public static void walk5(int start, int... nums){
		
		System.out.println(nums.length);
	}
	
	/*
	 * N.B: Accedere agli elementi di un varargs è come accedere agli elementi di un array, specificando gli indici.
	 */
	public static void run(int... nums){
		
		System.out.println(nums[1]);
	} 

}
