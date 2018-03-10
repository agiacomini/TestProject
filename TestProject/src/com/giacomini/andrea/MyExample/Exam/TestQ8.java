package com.giacomini.andrea.MyExample.Exam;

public class TestQ8 {

	/* N:B: La posizione della dichiarazione di una variabile ne definisce lo scope, ovvero la sua visibilità
	 * 		e il ciclo di vita della stessa.
	*/
	
	// Variabile d'Istanza - viene creata nel momento in cui viene creata un'istanza della classe "TestQ8".
	int value = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new TestQ8().print();

	}
	
	public void print(){
		
		// Variabile locale - viene creata nel momento in cui viene richiamato il metodo che la contiene.
		// N.B: La variabile locale oscura la variabile d'istanza.
		int value = 8;
		
		System.out.print(value);
	}

}
