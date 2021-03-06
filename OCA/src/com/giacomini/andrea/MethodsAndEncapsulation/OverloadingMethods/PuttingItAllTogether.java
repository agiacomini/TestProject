package com.giacomini.andrea.MethodsAndEncapsulation.OverloadingMethods;

/*
 * N.B: JAVA chiama sempre il metodo (overloading) più specifico che riesce.
 */

public class PuttingItAllTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(glide("a"));					// 1
		System.out.print(glide("a","b"));				// 4
		System.out.print(glide("a", "b", "c"));			// 2

	}
	
	public static String glide(String s){
		
		return "1";
	}
	
	public static String glide(String... s){
		
		return "2";
	}
	
	public static String glide(Object o){
		
		return "3";
	}
	
	public static String glide(String s, String t){
		
		return "4";
	}
}

class TooManyConversion{
	
	public static void play(Long... l){	}
	
	public static void main(String[] args){
		
//		play(4);										NON COMPILA - JAVA non è in grado di gestire una conversione in due step,
//																	  un int 4 in un long 4, e poi un long 4 in un Long 4.
		play(4L);
	}
}
