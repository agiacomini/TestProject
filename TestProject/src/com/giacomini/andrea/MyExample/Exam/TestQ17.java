package com.giacomini.andrea.MyExample.Exam;

public class TestQ17 {

	public static void main(String[] in) {
		// TODO Auto-generated method stub
		
		/*
		 * ERRORE DI COMPILAZIONE: Non è possibile avere due variavili con lo stesso nome nel medesimo "scope".
		 * 						   In questo caso specifico abbiamo nella firma del metodo "main()" definito il parametro
		 * 						   "String[] in" e nel body del metodo stesso un'altra variabile con lo stesso nome "int []in". 
		 */
//		int []in = {1,2,3};
		
		for(int x = 0 ; ++x < 4 ; x++){
			
			System.out.print(in[x]);
		}

	}

}
