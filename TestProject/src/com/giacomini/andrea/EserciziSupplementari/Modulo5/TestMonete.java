package com.giacomini.andrea.EserciziSupplementari.Modulo5;

public class TestMonete {

	public static void main(String[] args){
		
//		Moneta moneta = new Moneta(20);
//		Moneta moneta2 = new Moneta(1);
//		Moneta moneta3 = new Moneta(100);
//		Moneta moneta4 = new Moneta(150);
//		Moneta moneta5 = new Moneta(300);
//		Moneta moneta6 = new Moneta(475);
		
		// Crea 8 Monete;
		PortaMonete portaMonete = new PortaMonete(8, 150, 100, 0, 340, 525, 345, 555);
		portaMonete.aggiungi(new Moneta(111));
		portaMonete.aggiungi(new Moneta(222));
		portaMonete.aggiungi(new Moneta(333));
		
		portaMonete.stato();
		
		portaMonete.preleva(new Moneta(150));
		
		portaMonete.stato();
		// Crea 11 Monete;
//		PortaMonete portaMonete2 = new PortaMonete(2, 5, 100, 10, 50, 10, 100, 200, 10, 5, 2);
	}
}
