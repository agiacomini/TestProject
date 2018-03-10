package com.giacomini.andrea.MethodReference;

import java.util.Arrays;
import java.util.List;

public class TestMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * N.B: I "Method Reference" possono essere visti come delle "Lambda Expression" che NON sono anonime,
		 * 		ma che si riferiscono ad uno specifico metodo di una data classe (o di una sua istanza).
		 * 		Ad esempio, "String::ValueOf" oppure "Integer::compare". 
		 */
		
		List<String> strings = Arrays.asList("Lambda " , "expression " , "are " , "cool");
		
		strings.forEach(System.out::print);

	}

}
