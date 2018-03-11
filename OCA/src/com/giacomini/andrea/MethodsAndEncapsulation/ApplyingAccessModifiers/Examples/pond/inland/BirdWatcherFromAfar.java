package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.inland;

import com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.shore.Bird;

public class BirdWatcherFromAfar {							// Le classi "BirdWatcherFromAfar" e "Bird" stanno in due package diversi
															// inoltre "BirdWatcherFromAfar" non estende (extends) la classe "Bird";
	public void watchBird(){
		
		Bird bird = new Bird();
		
//		bird.floatInWater();								// NON COMPILA - la classe "BirdWatcherFromAfar" e la classe "Bird"
															// 				 stanno in due package differenti, inoltre la classe
															//               "BirdWatcherFromAfar" non estende "Bird" quindi questo
															//				 non è il caso in cui è possibile richiamare un membro
															//				 (metodo o campo che sia) PROTECTED di un altra classe;
		
//		System.out.println(bird.text);						// NON COMPILA - per lo stesso motivo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
