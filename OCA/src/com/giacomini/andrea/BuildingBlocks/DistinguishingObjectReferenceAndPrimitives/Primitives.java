package com.giacomini.andrea.BuildingBlocks.DistinguishingObjectReferenceAndPrimitives;

public class Primitives {

	/*
	 * N.B: Le primitive a differenza dei Reference Type non possono essere inizializzati con un valore NULL.
	 * 		Questo porterebbe ad avere un ERRORE DI COMPILAZIONE.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b1 = true, b2 = false;
		
		byte 	b = 123;
		short 	s = 123;
		int 	i = 123;	// 32 bit
		long 	l = 123L;
		
		// VALORI DECIMALI IN VIRGOLA MOBILE
		float 	f = 123.22f; // Per far sapere a Java che si tratta di un numero decimale in virgola mobile di tipo float
						   // è necessario aggiungere alla fine una "f".
		double 	d = 123.222;
		
		char 	c = 'a';
		
		/*
		 * N.B: Un numero presente nel codice viene chiamato LITERAL.
		 */
		
//		l = 3123456789; Non compila perché il numero inserito è out of bound per un tipo int. Va specificato la L di long
		
		l = 3123456789L;
		
		/*
		 * N.B: Java permette di specificare quale formato usare per rappresentare un numero (letterale numerico):
		 * 		- il formato di default è quello decimale (0-9);
		 * 		- ottale (0-7): usa uno 0 come prefisso, per esempio 017;
		 * 		- esadecimale (0-9 e A-F): usa come prefisso uno 0 seguito da una "x", per esempio 0xFF;
		 * 		- binario (0-1): usa come prefisso uno 0 seguito da una "b", per esempio 0b10;
		 * 
		 *		La rappresentazione "esadecimale" (0x) può essere assegnata a molti tipi primitivi, come int e double;  
		 */
		
		System.out.println(56);		// stampa 56 - 5 volte 10 + 6
		System.out.println(0b11);	// stampa 3  - 1 volta 2 + 1
		System.out.println(017);	// stampa 15 - 1 volta 8 + 7
		System.out.println(0x1F);	// stampa 31 - 1 volta 16 + 15

		/*
		 * N.B: In java 7 è stato introdotto un nuovo modo di rappresentare i leterali numerici in modo da facilitarne
		 * 		la lettura. Viene impiegato l'underscore (_) al posto dei punti decimali. E' possibile usare "_" 
		 * 		ovunque tranne che:
		 * 		- all'inzio o alla fine del letterale numerico;
		 * 		- a destra prima di un punto decimale;
		 * 		- a destra dopo un punto decimale;
		 * 		- deve sempre stare racchiuso tra due numeri;
		 */
		i = 1000000;
//		i = 1.000.000; NON COMPILA
		i = 1_000_000;
		
//		d = _1000.00; NON COMPILA
//		d = 1000.00_; NON COMPILA
//		d = 1000_.00; NON COMPILA
		d = 1_00_0.0_0;
	}

}
