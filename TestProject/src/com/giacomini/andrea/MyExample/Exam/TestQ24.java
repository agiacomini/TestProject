package com.giacomini.andrea.MyExample.Exam;

import java.util.ArrayList;
import java.util.List;

public class TestQ24 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		List list = new ArrayList(1);
		
		/*
		 * N.B: Dal momento che non è stato specificato che cosa la List "list" può contenere è possibile aggiungere
		 * 		qualsiasi tipo di oggetto TRANNE delle primitive.
		 */
		list.add(5);
		list.add("A");
		list.add(new Integer(5));
		
		System.out.print(list);

	}

}
