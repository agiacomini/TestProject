package com.giacomini.andrea.FunctionalProgramming.UsingVariablesInLambdas.Test;

//interface Gorilla { String move(); }

public class GorillaFamily {

	String walk = "walk";
	
	void everyonePlay(boolean baby){
		
		String approach = "amble";
//		approach = "run";
		
		play(() -> walk);								// use of instance variable
		play(() -> baby ? "hitch a ride" : "run");		// use of parameter of method. It's effectively final because there is not other assign
		play(() -> approach);							// use of local variable. It's effectively final because the line "approach = "run" " is commented
	}
	
	void play(Gorilla g){
		
		System.out.println(g.move());
	}
}
