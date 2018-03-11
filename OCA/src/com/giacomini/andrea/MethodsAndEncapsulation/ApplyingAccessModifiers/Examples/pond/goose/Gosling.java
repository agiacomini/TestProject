package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.goose;

import com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.shore.Bird;

/*
 * N.B: Esternder una classe significa avere la possibilità di accedere a tutti i membri (metodi e campi) della classe
 * 		padre che sono etichettati sia come PUBLIC che come PROTECTED.
 * 		Inoltre, in questo caso specifico, "Gosling" può accedere ai membri protected della classe classe padre anche se
 * 		sono localizzati in package differenti.
 */
public class Gosling extends Bird {						// Le classi "Gosling" e "Bird" stanno in due package diversi;

	public void swim(){
		
		floatInWater();									// Chiama il metodo PROTECTED della classe padre
		System.out.println(text);						// Usa il campo PROTECTED della classe padre
	}
	
	public void testCallProtectedMember(){
		
		Bird bird = new Bird();
//		bird.floatInWater();							NON COMPILA - 
		
//		System.out.println(bird.text);					NON COMPILA -
		
		Gosling gosling = new Gosling();
		gosling.floatInWater();
		
		System.out.println(gosling.text);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
