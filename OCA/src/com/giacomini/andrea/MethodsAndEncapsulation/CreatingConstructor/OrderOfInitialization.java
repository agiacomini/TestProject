package com.giacomini.andrea.OCA.MethodsAndEncapsulation.CreatingConstructor;

/*
 * N.B: Esiste un ordine preciso nell'inizializzazione delle variabili d'istanza:
 * 
 * 			1- se si stratta di una classe estesa (extends), vengono inizializzate le variabili d'istanza della super-class;
 * 			2- le variabili STATIC e la loro STATIC inizializzazione nell'ordine in cui appaiono nel codice;
 * 			3- le variabili d'istanza e la loro inizializzazione nell'ordine in cui appaiono nel codice;
 * 			4- il costruttore;
 * 
 * 		Queste quattro regole sono applicabili solo nel caso in cui l'oggetto viene istanziato.
 * 		Se ci si riferisce alla classe senza una chiamata "new" allora solo le prime due saranno applicabili.
 */

public class OrderOfInitialization {
	
	public static void main(String[] args){
		
		CallOrderOfInitialization o = new CallOrderOfInitialization();			// 0 10 Torchie constructor
		
	}

}

class YetMoreInitializationOder{
	
	static {
		add(2);
	}
	
	static void add(int num){
		System.out.println(num + " ");
	}
	
	// Costruttore
	YetMoreInitializationOder(){
		
		add(5);
	}
	
	static {
		
		add(4);
	}
	
	{
		add(6);
	}
	
	static {
		
		new YetMoreInitializationOder();
	}
	
	{
		add(8);
	}
	
	// print - 2 4 6 8 5
}

class CallOrderOfInitialization{
	
	// 4
	private String name = "Torchie";
	
	// 5
	{
		System.out.println(name);
	}
	
	// 1
	private static int COUNT = 0;
	
	// 2
	static {
		System.out.println(COUNT);
	}
	
	// 3
	static {
		COUNT += 10;
		System.out.println(COUNT);
	}
	
	// 6
	public CallOrderOfInitialization(){
		System.out.println("constructor");
	}

}
