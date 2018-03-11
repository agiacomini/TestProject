package com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.duck;

public class GoodDuckling {

	public void makeNoise(){
		MotherDuck duck = new MotherDuck();						// Le classi "GoodDuckling" e "MotherDuck" stanno nello stesso
																// package;
		
		duck.quack();											// default access
		System.out.println(duck.noise);							// default access
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
