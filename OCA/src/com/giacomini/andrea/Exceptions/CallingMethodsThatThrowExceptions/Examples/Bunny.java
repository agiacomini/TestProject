package com.giacomini.andrea.Exceptions.CallingMethodsThatThrowExceptions.Examples;

//class NoMoreCarrotsExcpetion extends Exception {}

public class Bunny {

	public static void main(String[] args) throws NoMoreCarrotsExcpetion{ // 2 MODO - dichiara l'eccezione
		
//		eatCarrot();									NON COMPILA - l'eccezione checked "NoMoreCarrotsExcpetion" non è ne gestita ne
//																	  dichiarata;
		// 2 MODO
		eatCarrot();
		
		// 1 MODO
//		try{
//			
//			eatCarrot();
//		} catch(NoMoreCarrotsExcpetion e){ // gestiche l'eccezione
//			
//			System.out.println("sad rabbit");
//		}
	}
	
	private static void eatCarrot() throws NoMoreCarrotsExcpetion {} 
}
