package com.giacomini.andrea.Prove;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Fluffy";
		String name2 = new String("Fluffy");
		String name3 = "Fluffy";
		String name4 = new String("Fluffy");
		
		if(name == name2){
		
			System.out.println("name and name2 have the same pointer to the same object");
		} else {
			
			System.out.println("name and name2 do NOT have the same pointer to the same object"); // name and name2 do NOT have the same pointer to the same object
		}
		
		System.out.println();
		
		if(name == name3){
			
			System.out.println("name and name3 have the same pointer to the same object");		// name and name3 have the same pointer to the same obje
		} else {
			
			System.out.println("name and name3 do NOT have the same pointer to the same object");
		}
		
		System.out.println();
		
		if(name == "Fluffy"){
			
			System.out.println("name is == to the \"Fully\" string");							// name is == to the "Fully" string
		}
		
		System.out.println();
		
		if(name3 == "Fluffy"){
			
			System.out.println("name3 is == to the \"Fully\" string");							// name3 is == to the "Fully" string
		}
		
		System.out.println();
		
		if(name2 == "Fluffy"){
			
			System.out.println("name2 is == to the \"Fully\" string");
		} else {
			
			System.out.println("name2 is NOT == to the \"Fully\" string");						// name2 is NOT == to the "Fully" string

		}
		
		System.out.println();
		
		if(name2 == name4){
			
			System.out.println("name2 is == to name4");
		} else {
			
			System.out.println("name2 is NOT == to name4");										// name2 is NOT == to name4
		}
		
		System.out.println();
		
		if(name.equals(name2)){
			System.out.println("name is equals() to name2");									// name is equals() to name2
		} else {
			System.out.println("name is NOT equals() to name2");
		}
		
		System.out.println();
		
		String testString1 = "Hello World";
		String testString2 = " Hello World ".trim();
//		String testString2 = " Hello World ";
		
		System.out.println(testString2);
		
		if(testString1 == testString2){
			
			System.out.println("testString1 is == to testString2");
		} else {
			
			System.out.println("testString1 is NOT == to testString2");
		}
		
		if(testString1.equals(testString2)){
			
			System.out.println("testString1 is equals() to testString2");
		} else {
			
			System.out.println("testString1 is NOT equals() to testString2");
		}
		
		System.out.println();
		
		String s = "Hello";
		String t = new String(s); 
		if ("Hello".equals(s)) System.out.println("one");
		if (t == s) System.out.println("two");
		if (t.equals(s)) System.out.println("three");
		if ("Hello" == s) System.out.println("four");
		if ("Hello" == t) System.out.println("five");
		
		System.out.println();
		
		String a = "";
		a += 2;						// a = a + 2 --> a   =   new StringBuilder().append(a).append(2).toString();
		System.out.println(a);
		if ("2" == a) System.out.println("==");
				
	}

}
