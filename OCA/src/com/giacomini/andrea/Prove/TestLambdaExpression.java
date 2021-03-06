package com.giacomini.andrea.Prove;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * LAMBDA EXPRESSION: Argument List -- Arrow Token -- Body
		 * Sono funzioni anonime (come nel linguaggio C), senza una dichiarazione che le dia un nome.
		 * Il Body può essere sia un'espressioen singola che un blocco di statements. Viene valutato e poi 
		 * ritorna un valore. Viene valutato come il corpo di un metodo e lo statement "return" ritorna il controllo
		 * al chiamante del metodo anonimo. Il body va sempre incluso tra le parentesi {}.
		 * Nella "Argument List" è possibile omettere i tipi di dati dei parametri passati in input. 
		 */
		
		List<String> strings = Arrays.asList("Lambda " , "expression " , "are " , "cool");
		
		/*
		 * INNER CLASS
		 */
		strings.forEach(new Consumer<String>() {
			
			public void accept(String s){
				System.out.print(s);
			}
		});
		
		System.out.println("");
		
		/*
		 * LAMBDA EXPRESSIONE 1
		 */
		strings.forEach((String s) -> System.out.print(s));
		
		System.out.println("");
		
		/*
		 * LAMBDA EXPRESSIONE 2 - forma compatta
		 */
		strings.forEach(s -> System.out.print(s));
	}

}
