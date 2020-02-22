package com.giacomini.andrea.AdvancedClassDesign.CreatingNestedClasses.Test;

public class TestNestedMemberClass {

	public String field1 = "test";
	private int filed2 = 3;
	
	class Inner {
		
		// N.B: un campo STATIC non può essere dichiarato all'interno di una classe innestata di tipo membro;
//		public static String field1 = "inner field";
		
		// N.B: una classe innestata di tipo membro può però avere un campo STATIC FINAL;
		public static final String field2 = "";
		
		// N.B: un metodo STATIC non può essere dichiarato all'interno di una classe innestata di tipo memebro; 
//		public static void testMethodStaticInsideNestedClassMember(){
//			
//			System.out.println("method inside a nested class member");
//		}
	}
	
	public static void main(String[] args){
		
	}
}
