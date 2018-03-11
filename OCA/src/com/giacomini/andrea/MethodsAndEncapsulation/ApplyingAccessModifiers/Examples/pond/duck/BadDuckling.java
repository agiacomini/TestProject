package com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.duck;

public class BadDuckling {

	public void makeNoise(){
		
		FatherDuck duck = new FatherDuck();
//		duck.quack();										NON COMPILA - si stà cercando di accedere ad un membro privato (metodo) 
//																		  di un'altra classe.
//		System.out.println(duck.noise);						NON COMPILA - si stà cercando di accedere ad una variabile private di
//																		  un'altra classe;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
