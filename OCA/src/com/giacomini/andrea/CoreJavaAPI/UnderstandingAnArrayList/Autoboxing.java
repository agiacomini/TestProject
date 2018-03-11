package com.giacomini.andrea.CoreJavaAPI.UnderstandingAnArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * N.B: Da JAVA 5 l'Autoboxing è la conversione che fa il compilatore, automaticamente, dei valori primitivi nelle
 * 		corrispondenti classi Wrapper.    
 */

public class Autoboxing {

	public static void main(String[] args) {

		List<Double> weights = new ArrayList<>();
		
		// Viene eseguito l'autobox della primitiva double nella classe Wrapper associata e quest'ultimo poi viene
		// aggiunto alla lista.
		weights.add(50.5);								// [50.5]
		weights.add(new Double(60));					// [50.5, 60.0]
		weights.remove(50.5);							// [60.0]
		
		// Viene eseguito l'unboxing passando dalla classe Wrapper Double alla primitiva double.
		double first = weights.get(0);					// 60.0
		
		List<Integer> heights = new ArrayList<>();
		heights.add(null);
//		int h = heights.get(0);							// NullPointerException
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);									// [1]
		numbers.add(2);									// [1, 2]
		numbers.remove(1);								// [1]
		
		System.out.println(numbers);

	}

}
