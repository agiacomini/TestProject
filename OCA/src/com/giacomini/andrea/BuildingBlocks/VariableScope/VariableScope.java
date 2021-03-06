package com.giacomini.andrea.BuildingBlocks.VariableScope;

/*
 * N.B: Lo scope di una variabila è il perimetro entro il quale possono essepre usate.
 * 		Lo scope di una variabile locale è ristretto al corpo del metodo in cui è definita.
 * 		Ogni coppia di parentesi graffe (braces {}) ha il proprio scope.
 */

public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * N.B: In questo metodo si identificano due variabili locali.
	 */
	public void eat(int pieceOfCheese){
		
		int bitesOfCheese;
	}
	
	/*
	 * N.B: Le variabili locali possono anche avere un scope ulteriormente ristretto rispetto al solito corpo del 
	 * 		metodo.
	 */
	public void eatIfHungry(boolean hungry){
		
		if(hungry){
			
			int bitesOfCheese = 1;
			System.out.println(bitesOfCheese);
		}
		
//		System.out.println(bitesOfCheese); ERRORE DI COMPILAZIONE - la variabile "bitesOfCheese" è dichiarata solo
//																	all'interno del blocco condizionale if.															
				
	}
	
	public void eatMore(boolean hungry, int amountOfFood){
		
		int roomInBelly = 5;
		
		if (hungry){
			
			boolean timeToEat = true;
			
			while(amountOfFood > 0){
				
				int amountEaten = 2;
				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
			}
		}
		
		System.out.println(amountOfFood);
	}

}
