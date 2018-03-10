package com.giacomini.andrea.OCA.MethodsAndEncapsulation.WritingSimpleLambdas.Example;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
//		print(animals, new CheckIfHopper());
		
//		print(animals, a -> a.canHop());
		print(animals, a -> ! a.canSwim());

	}
	
	private static void print(List<Animal> animals, CheckTrait cheker){
		
		for (Animal animal : animals) {
			
			if(cheker.test(animal)){						// controllo generale
				System.out.print(animal + " ");
			}
		}
		System.out.println();
	}

}
