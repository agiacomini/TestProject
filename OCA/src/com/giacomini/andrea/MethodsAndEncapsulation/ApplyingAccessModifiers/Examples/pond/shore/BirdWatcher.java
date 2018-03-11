package com.giacomini.andrea.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.shore;

public class BirdWatcher {									// Le classi "BirdWatcher" e "Bird" stanno nel medesimo package;

	public void watchBird(){
		
		Bird bird = new Bird();
		bird.floatInWater();								// In questo caso specifico la chiamata al metodo PROTECTED "floatinWater()"
															// è possibile in quanto sia la classe "Bird" che la classe "BirdWatcher"
															// stanno nel medesimo package.
		
		System.out.println(bird.text);						// Lo stesso discorso vale anche per l'accesso al campo "text" di "Bird".
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
