package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ComputeIfAbsentMethodTest {

	public static void main(String[] args){
		
		/*
		 * Test1
		 * */
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);
		
		Function<String, Integer> mapper = (k) -> 1;
		Integer jenny = counts.computeIfAbsent("Jenny", mapper);		// 15
		Integer sam = counts.computeIfAbsent("Sam", mapper);			// 1
		Integer tom = counts.computeIfAbsent("Tom", mapper);			// 1
		
		System.out.println(counts);										// {Tom=1, Jenny=15, Sam=1}
		
		/*
		 * Test2
		 * */
		Map<String, Integer> counts2 = new HashMap<>();
		counts2.put("Jenny", 1);
		
		counts2.computeIfPresent("Jenny", (k, v) -> null);
		counts2.computeIfAbsent("Sam", k -> null);
		
		System.out.println(counts2);									// {}
	}
}
