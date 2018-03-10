package com.giacomini.andrea.MyExample.Exam;

public class TestQ16 {

	public static void main(String[] args) {

		final int j;
		j=2;
		int x = 0;
			
		switch(x){
		
			case 0 : {
				
					System.out.print("A");
				}
			
			case 1 : 
				
				System.out.print("B");
				break;
			}
			
			/*
			 * Errore di compilazione. Nello statement "switch" l'espressio "case" deve essere una costante. 
			 */
//			case j :
//				
//				System.out.print("C");

	}
	
	/*
	 * Di seguito l'uso standard dello statement switch. 
	 */
	
	//	int month = 3;
	//	String monthString = null;
	//	
	//	switch(month){
	//	
	//		case 1 : monthString = "January";
	//				 break;
	//		
	//		case 2 : monthString = "February";
	//				 break;
	//		
	//		case 3 : monthString = "March";
	//				 break;
	//	}
	//	
	//	System.out.println(monthString);

}
