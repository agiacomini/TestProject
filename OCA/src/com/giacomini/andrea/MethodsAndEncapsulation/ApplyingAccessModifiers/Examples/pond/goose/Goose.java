package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.goose;

import com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.shore.Bird;

public class Goose extends Bird {				// "Goose" estende "Bird" stanno in due package diversi;

	public void helpGooseSwim(){
		
		Goose other = new Goose();				// Dal momento che siamo nella sotto-classe "Goose" e abbiamo un riferimento a "Goose"
		other.floatInWater();					// è possibile accedere ai membro PROTECTED della classe padre "Bird".
		System.out.println(other.text);
	}
	
	public void helpOtherGooseSwim(){
		
		Bird other = new Goose();
//		other.floatInWater();					NON COMPILA - Anche se l'oggetto è di tipo "Goose" è memorizzato in un riferimento
//															  di tipo "Bird". Non è permesso di riferirsi ai membri PROTECTED della
//															  classe "Bird" dal momento che non sono nello stesso package e "Bird"
//															  non è sotto-classe di "Bird".
//		System.out.println(other.text);			NON COMPILA - lo stesso discorso vale anche per la variabile "text";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
