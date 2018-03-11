package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.swam;

import com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.duck.MotherDuck;

public class BadCygnet {

	public void makeNoise(){
		
		MotherDuck duck = new MotherDuck();
//		duck.quack();									NON COMPILA - Non è possibile per la classe "BadCygnet" accedere ai membri
//																	  (metodi e variabili) della classe "MotherDuck" per i quali non 
//															    	  è stato definito nessun modificatore di accesso. 
//																	  Quindi per il Default è permesso l'accesso solo alle classi
//																	  presenti nel medesimo package;
//		System.out.println(duck.noise);					NON COMPILA - lo stesso vale anche per le variabili;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
