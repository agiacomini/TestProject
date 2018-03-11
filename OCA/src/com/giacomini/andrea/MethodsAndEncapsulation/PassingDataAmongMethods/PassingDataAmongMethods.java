package com.giacomini.andrea.MethodsAndEncapsulation.PassingDataAmongMethods;

/*
 * N.B: JAVA lavora per "passaggio di valore" quando passa parametri ad un metodo. 
 * 		Il che significa che prima che una variabile venga passata ad un metodo
 * 		viene prima fatta una copia di questa variabile e poi passata al metodo.
 * 		Gli assegnamenti fatti nel metodo non hanno effetto sul chiamante.
 * 
 * 		Caso particolare è lo StringBuilder.
 * 
 * 		Generalmente un metodo ritorna un valore. Anche in questo caso viene fatta una copia della primitiva o del
 * 		riferimento e poi ritornato dal metodo. Molto spesso questo valore di ritorno viene poi usato dal chiamante.
 * 		Per esempio potrebbe essere memorizzato in una variabile. Se invece il valore di ritorno non viene usato allora
 * 		viene praticamente ignorato. 
 */

public class PassingDataAmongMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4;
		newNumber(num);
		System.out.println(num);							// 4
		
		
		String name = "Webby";
		speak(name);
		System.out.println(name);							// Webby
		
		// CASO PARTICOLARE - Lo StringBuilder
		StringBuilder name2 = new StringBuilder();
		speak2(name2);
		System.out.println(name2);							// Webby
		
		
		int number = 1;										// 1
		String letters = "abc";								// abc
		number(number);										// 1
		letters = letters(letters);							// abcd
		System.out.println(number + letters);				// 1abcd	

	}
	
	public static void newNumber(int num){
		
		// "num" è il parametro passato al metodo e non la variabile d'istanza;
		num = 8;
	}
	
	public static void speak(String name){
		
		name = "Sparky";
	}
	
	// "s" è una copia della variabile "name". Entrambi puntano allo stesso oggetto StringBuilder, il che significa che
	// modificando l'oggetto punato da "s" si modifica anche l'oggetto puntato da "name" che è lo stesso.
	public static void speak2(StringBuilder s){
		
		s.append("Webby");
	}
	
	public static int number(int number){
		
		number++;
		return number;
	}
	
	public static String letters(String letters){
		
		letters += "d";
		return letters;
	}

}
