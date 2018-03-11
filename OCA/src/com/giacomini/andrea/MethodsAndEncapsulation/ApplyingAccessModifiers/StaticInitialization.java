package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers;

/*
 * N.B: L'inizializzazione statica antepone la parola chiave STATIC al nome del membro (metodo o campo che sia).
 * 		La parola STATIC serve per indicare a JAVA che questi membri dovranno essere eseguiti/inizializzati la prima volta 
 * 		che la classe è usata.
 */

public class StaticInitialization {

	// N.B: L'ordine dei modificatori opzionali "STATIC" e "FINAL" è indifferente;
	private static final int NUM_SECOND_PER_HOUR;
	private final static int NUM_SECOND_PER_HOUR_2 = 2;
	
	/*
	 * N.B: L'inizializzazione statica (di metodi e campi) avviene la prima volta che la classa viene usata. 
	 */
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECOND_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
		
	}
	
	// Esempio 2
	// Le variabili FINAL possono essere inizializzate una sola volta in un blocco static.
	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;								NON COMPILA - non viene mai inizializzata e questo non è permesso;
	
	static {
		one = 1;
		two = 2;
//		three = 3;												NON COMPILA - si sta tentando di ri-assegnare un nuovo valore
//																			  ad una variabile FINAL già inizializzata;
//		two = 4;												NON COMPILA - si sta tentando di ri-assegnare un nuovo valore
//																			  ad una variabile FINAL già inizializzata;
	}
	
	/*
	 * N.B: L'inizializzazione statica viene generalmente fatta all'interno di un costruttore.
	 */	
	public StaticInitialization(){
		
		final int five = 5;
		final int six = 6;
	}

}
