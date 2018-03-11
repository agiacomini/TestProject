package com.giacomini.andrea.BuildingBlocks.DeclaringInitializingVariables;

/*
 * N.B: Una variabile è un nome per identificare un locazione di memoria che contiene un particolare dato.
 * 		Quando si dichiara una variabile va inidcato il tipo che dovrà coincidere con il tipo di dato in memoria. 
 */
public class Variables {
	
	/*
	 * N.B: Se le variabili sono variabili d'istanza, al momento della dichiarazione non serve
	 * 		necessariamente inizializzarle perché hanno un valore di default.
	 */
	int prova;		// Valore di default di un int è 0.
//	prova = 123;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * DICHIRAZIONE E INIZIALIZZAZIONE DI UNA VARIABILE
		 */
		String zooName;
		int numberAnimals;
		
		zooName = "The Best zoo";
		numberAnimals = 100;
		
		String newZooNmae = "The new Best zoo";
		int newNumberAnimals = 100;
		
		/*
		 * N.B: E' possibile dichiarare e inizializzare variabili multiple (sulla stessa riga) se sono tutte 
		 * 		delle stesso tipo. Il tipo nella dichirazione multipla deve comparire solo all'inizio dello statement.
		 */
		int a = 1, b = 2, c; // 3 var dichiarate ma solo 2 inizializzate.
		
//		int d, int e;		ERRORE DI COMPILAZIONE
		int d; int e;
//		int d; e;			ERRORE DI COMPILAZIONE
//		int d, String s;	ERRORE DI COMPILAZIONE - si sta cercando di dichiarare vairabili multiple sulla stessa
//													 riga ma di tipi diversi.		
	}

}
