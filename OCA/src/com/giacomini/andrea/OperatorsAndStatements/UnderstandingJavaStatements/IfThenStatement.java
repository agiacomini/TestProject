package com.giacomini.andrea.OperatorsAndStatements.UnderstandingJavaStatements;

/*
 * N.B: Lo statement If-Then viene usato quando si vuole eseguire un particolare blocco di codice
 * 		se e solo se un'espressione booleana è valutata come TRUE a runtime.
 */

public class IfThenStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hourOfDay = 9;
		int morningGreetingCount = 0;
		if (hourOfDay < 11){
			
			System.out.println("Good Morning");
			morningGreetingCount++;
		}

	}

}
