package com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.duck;

public class MotherDuck {

	String noise = "quack";								// Per la variabile "noise" non è stato specificato NESSUN 
														// modificatore d'accesso;
	
	void quack(){										// Per il metodo "quack()" non è stato specificato NESSUN
														// modificatore d'accesso;
		
		System.out.println(noise);						// default access OK
	}
	
	private void makeNoise(){
		quack();										// default access OK
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
