package com.giacomini.andrea.GenericsAndCollections.ReviewingOCACollections.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDeleteElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arrayTest = {"gerbil", "mouse"};			// [gerbil, mouse]
		System.out.println("arrayTest: [" + arrayTest[0] + ", " + arrayTest[1] + "]");
		
		System.out.println("");
		
//		arrayTest = ArrayUtils.removeElement(arrayTest,"gerbil");		// in Java 8 not working
		
		List<String> list = new ArrayList<String>(Arrays.asList(arrayTest));
		list.removeAll(Arrays.asList("gerbil"));
		arrayTest = list.toArray(arrayTest);
		
															// [mouse, null]
		System.out.println("arrayTest: [" + arrayTest[0] + ", " + arrayTest[1] + "]");
	}

}
