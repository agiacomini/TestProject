package com.giacomini.andrea.OCA.Prove;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder stringBuilder1 = new StringBuilder("AAA");
		StringBuilder stringBuilder2 = new StringBuilder("AAA");
		StringBuilder stringBuilder3 = new StringBuilder();
		stringBuilder3.append("stringBuilder3");
		StringBuilder stringBuilder4 = stringBuilder1;
		
		if(stringBuilder1.equals(stringBuilder2)){
			
			System.out.println("stringBuilder1 is equals() to stringBuilder2");
		} else {
			
			System.out.println("stringBuilder1 is NOT equals() to stringBuilder2");
		}
		
		System.out.println();
		
		if (stringBuilder1.toString().equals(stringBuilder2.toString())){
			
			System.out.println("stringBuilder1.toString() is equals() to stringBuilder2.toString()");
		} else {
			
			System.out.println("stringBuilder1.toString() is NOT equals() to stringBuilder2.toString()");
		}
		
		System.out.println();
		
		if (stringBuilder1 == stringBuilder4){
			
			System.out.println("stringBuilder1 is == to stringBuilder4");
		} else {
			
			System.out.println("stringBuilder1 is NOT == to stringBuilder4");
		}
		
		System.out.println();
		
		if (stringBuilder1.equals(stringBuilder4)){
			
			System.out.println("stringBuilder1 is equals() to stringBuilder4");
		} else {
			
			System.out.println("stringBuilder1 is NOT equals() to stringBuilder4");
		}
	}

}
