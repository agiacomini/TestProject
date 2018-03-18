package com.giacomini.andrea.MyExample.Exam;

class TestQ5 {

	static Integer i;
	
	public static void main(String[] args){
		
		try{
			
			System.out.println(i.compareTo(0));
			
		} catch(ArithmeticException | NullPointerException e){ // Compilation fails with javaSE1.7.
			
			System.out.println("Exception");
			
		}
		
	}
}
