package com.giacomini.andrea.GenericsAndCollections.UsingListsSetsMapsAndQueues.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCommonCollectionsMethodClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> birds = new ArrayList<>();
		birds.add("hawk");
		birds.add("hawk");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		
		System.out.println();
		
		List<String> test = Arrays.asList("testElement1","testElement2","testElement3");
		System.out.println(test.isEmpty());
		System.out.println(test.size());
		
		System.out.println();
		
		birds.clear();
		System.out.println("---------- birds.clear(); ------------------------------");
		System.out.println(birds.isEmpty());
		System.out.println(birds.size());
		
		System.out.println();
		
		test.clear();			// Lancia Eccezione: "UnsupportedOperationException"
		System.out.println("--------- test.clear(); --------------------------------");
		System.out.println(test.isEmpty());
		System.out.println(test.size());
	}

}
