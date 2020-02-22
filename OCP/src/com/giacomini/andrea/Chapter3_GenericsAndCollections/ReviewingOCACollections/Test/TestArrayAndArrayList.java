package com.giacomini.andrea.GenericsAndCollections.ReviewingOCACollections.Test;

import java.util.Arrays;
import java.util.List;

public class TestArrayAndArrayList {
	
	public static void main(String[] args){
		
		String[] arrayTest = {"gerbil", "mouse"};			// [gerbil, mouse]
		System.out.println("arrayTest: [" + arrayTest[0] + ", " + arrayTest[1] + "]");
		
		System.out.println("");
		
		System.out.println("--------- Convert an Array into a List -----------");
		List<String> listTest = Arrays.asList(arrayTest);	// [gerbil, mouse]
		System.out.println("listTest: " + listTest);
		
		System.out.println("");
		
		System.out.println("--------- listTest.set(1, \"test\"); ------------");
		listTest.set(1, "test");							// [gerbil, test]
		System.out.println("listTest: " + listTest);
		System.out.println("arrayTest: [" + arrayTest[0] + ", " + arrayTest[1] + "]" );
		
		System.out.println("");
		
		System.out.println("--------- arrayTest[0] = \"new\"; ---------------");
		arrayTest[0] = "new";								// [new, test]
		System.out.println("arrayTest: [" + arrayTest[0] + ", " + arrayTest[1] + "]");
		System.out.println("listTest: " + listTest);
		
		System.out.println("");
		
		String[] arrayTest_2 = (String[]) listTest.toArray();
		System.out.println("---------- Convert a List into an Array ---------");
		System.out.println("arrayTest_2: [" + arrayTest_2[0] + ", " + arrayTest_2[1] + "]");
		
//		listTest.remove(1);			// throw java.lang.UnsupportedOperationException
//		listTest.remove(0);			// throw java.lang.UnsupportedOperationException
		
		
		
		
	}
}