package com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.duck;

public class FatherDuck {
	
	private String noise = "quack";
	private void quack(){
		
		System.out.println(noise);							// accesso PRIVATE permesso
	}
	
	private void makeNoise(){
		
		quack();											// accesso PRIVATE permesso
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
