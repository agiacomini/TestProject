package com.giacomini.andrea.OperatorsAndStatements.UnderstandingJavaStatements;

public class IfThenElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hourOfDay = 9;
		
		// OPZIONE 1
//		if(hourOfDay < 11){
//			System.out.println("Good Morning");
//		} 
//		if(hourOfDay >= 11){
//			System.out.println("Good Afternoon");
//		}
		
		// OPZIONE 2
//		if(hourOfDay < 11){
//			System.out.println("Good Morning");
//		} else {
//			System.out.println("Good Afternoon");
//		}
		
		// OPZIONE 3
		if(hourOfDay < 11){
			System.out.println("Good Morning");
		} 
		else if (hourOfDay < 15){
			System.out.println("Good Afternoon");
		}
		else {
			System.out.println("Good Evening");
		}
		
		/*
		 * N.B: L'ordine è importante. Infatti, nel codice seguente, il secondo blocco if non sarà mai
		 * 		raggiungibile.
		 */
		if(hourOfDay < 15){
			System.out.println("Good Morning");
		} 
		else if (hourOfDay < 11){
			System.out.println("Good Afternoon"); // Non è raggiungibile.
		}
		else {
			System.out.println("Good Evening");
		}
		
		// Errori comuni:
		int x = 3;
//		if(x){ NON COMPILA
//			
//		}
		
//		if (x = 5){ NON COMPILA
//			
//		}
		
		/*
		 * N.B: Operatore Ternario (o Operatore Condizionale) ? : - E' un operatore con tre operandi.
		 * 		booleanExpression ? expression1 : expression2
		 * 
		 * 		Il primo operando deve essere un'espressione booleana, e il secondo e terzo operando possono
		 * 		essere espressioni che ritornano un valore.
		 */
		
		// Il seguente pezzo di codice può essere riscritto con l'operatore ternario.
//		int y = 10;
//		final int i;
//		if(y < 5){
//			i = 2 * y;
//		} else{
//			i = 3 * y;
//		}
		
		// Operatore ternario
		int y = 10;
		int i = (y < 5) ? (2 * y) : (3 * y);
		
		// Non è necessario che il secondo e il terzo operandi nell'espressione ternaria siano dello stesso tipo.
		System.out.println((y < 5) ? 21 : "Zebra");
//		int animal = (y < 5) ? 9 : "Horse";
		
		int a = 1;
		int b = 1;
		final int c = a < 10 ? a++ : b++;
		System.out.println(a + "," + b);

	}

}
