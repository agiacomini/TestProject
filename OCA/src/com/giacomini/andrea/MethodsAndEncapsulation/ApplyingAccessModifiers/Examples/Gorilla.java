package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples;

public class Gorilla {

	// campo STATIC
	public static int count;
	
	// Metodo STATIC
	public static void addGorilla(){
		
		count++;						// N.B: il metodo STATIC richiama un campo sempre STATIC; 
	}
	
	// Metodo d'istanza
	public void babyGorilla(){
		
		count++;						// N.B: il metodo d'istanza richiama un campo STATIC;
	}
	
	// Un metodo d'istanza può chiamare altri metodi d'istanza MA anche metodi STATIC.
	public void announceBabies(){
		
		addGorilla();
		babyGorilla();
	}
	
	// Un metodo STATIC non può chiamare metodi d'istanza
	public static void announceBabiesToEveryone(){
		
		addGorilla();
//		babyGorilla();												NON COMPILA - il metodo STATIC "announceBabiesToEveryone" sta
//																				  cercando di richiamare il metodo d'istanza "babyGorilla()";
	}
	
	public int total;
//	public static int average = total / count;						NON COMPILA - la variabile STATIC "average" sta cercando di usa 
//																				  la variabile d'istanza "total";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

class Counter{
	
	/*
	 * N.B: Un'uso comune delle variabili STATIC è quello di contare il numero delle istanze della classe;  
	 */
	
	private static int count;

	// Costruttore
	public Counter(){
		
		count++;
	}
	
	public static void main(String[] args){
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		// Ogni volta che viene creato un nuovo oggetto "Count" viene chiamato il costruttore della classe
		// che incrementa di una unità la variabile STATIC "count";
		System.out.println(count);									// 3
	}
}
