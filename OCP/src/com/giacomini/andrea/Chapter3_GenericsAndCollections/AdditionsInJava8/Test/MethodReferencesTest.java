package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test;

import java.util.Comparator;

public class MethodReferencesTest {

	// Uso della lambda expression
	Comparator<Duck> byweight = (d1,d2) -> DuckHelper.compareByWeight(d1,d2);
	
	// Uso del "metodo references" identificato da "::"
	Comparator<Duck> byWeight = DuckHelper::compareByWeight;
	
	public static void mian(String[] args){
		
	}
}
