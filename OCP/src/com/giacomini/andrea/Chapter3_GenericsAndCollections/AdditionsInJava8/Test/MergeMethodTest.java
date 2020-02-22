package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeMethodTest {

	public static void main(String[] args){

		System.out.println("Test1 - ");
		System.out.println();
		
		// Funzione di mappatura (Mapping function)
		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", "Tram");
		
		String jenny = favorites.merge("Jenny", "Skyride", mapper);
		String tom = favorites.merge("Tom", "Skyride", mapper);
		
		System.out.println(favorites);		// {Tom=Skyride, Jenny=Bus Tour}
		System.out.println(jenny);			// Bus Tour
		System.out.println(tom);			// Skyride
		System.out.println();
		
		
		/*
		 * The method "merge()" manage "null" value and key missing
		 * */ 
		System.out.println();
		System.out.println("Test2 - ");
		System.out.println();
		
		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Sam", null);	// valore "null"
		
		favorites2.merge("Tom", "Skyride", mapper);		// chiave non presente
		favorites2.merge("Sam", "Skyride", mapper);
		
		System.out.println("mapper: " + favorites2);		// {Tom=Skyride, Sam=Skyride}
		System.out.println();
		
		/*
		 * La funzione di mappatura ritorna "null". La chiave viene rimossa se c'è un match
		 * */ 
		System.out.println();
		System.out.println("Test3 - BiFunction return null");
		System.out.println();
		
		// Funzione di mappatura (Mapping function)
		BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
		Map<String, String> favorites3 = new HashMap<>();
		favorites3.put("Jenny", "Bus Tour");
		favorites3.put("Tom", "Bus Tour");
		
		favorites3.merge("Jenny", "Skyride", mapper2);
		favorites3.merge("Sam", "Skyride", mapper2);
		
		System.out.println("mapper2: " + favorites3);		// {Tom=Bus Tour, Sam=Sakyride}
	}
}
