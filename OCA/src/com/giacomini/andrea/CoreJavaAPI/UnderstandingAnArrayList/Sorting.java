package com.giacomini.andrea.CoreJavaAPI.UnderstandingAnArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * N.B: Ordinare una List è molto simile a ordinare un Array.
 */

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		
		// "Collections" è la classe helper che permette di ordinare una List.
		Collections.sort(numbers);
		
		System.out.println(numbers);						// [5, 81, 99]

	}

}
