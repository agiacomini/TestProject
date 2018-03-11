package com.giacomini.andrea.OCA.CoreJavaAPI.UsingStringBuilderClass;

public class CreatingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("animal");
		
		/*
		 * In Questo esempio specifico stiamo dicendo a JAVA che vogliamo un'oggetto StringBuilder la cui capacità sia 10 slot.
		 * A differenza dei due esempi precedenti, dove invece è JAVA stesso ad occuparsi della gestione dell'occupazione 
		 * di memoria per noi, in questo esempio stiamo dicendo a JAVA di prevedere un'oggetto StringBuilder di una data
		 * capacità. 
		 */
		StringBuilder sb3 = new StringBuilder(10);
		sb3.append("123456789101112");
		
		System.out.println("sb3 = " + sb3);

	}

}
