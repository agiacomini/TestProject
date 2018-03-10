package com.giacomini.andrea.EserciziSupplementari.Modulo4;

public class TestMultipliDiTre {

	public static void main(String[] args) {

		int number = 1;
		
		// 1 MODO
//		for(int i = 0 ; i < 30 ; i++){
//			
//			if(number % 3 == 0) {
//			
//				System.out.println("Numero multiplo di 3 = " + number);
//				number++;
//			} else {
//				number++;
//			}
//		}
		
		// 2 MODO
//		int i = 0;
//		while(i < 30){
//			
//			if(number % 3 == 0) {
//				
//				System.out.println("Numero multiplo di 3 = " + number);
//				number++;
//			} else {
//				number++;
//			}
//			
//			i++;
//		}
		
		for(int i = 1, j = 1; j < 10 ; i++){
			if(i % 3 == 0){
				System.out.println("Numero multiplo di 3 = " + i);
				j++;
			}
		}
		
		// 3 MODO
//		int i = 1, j = 1;
//		while(j < 10){
//			if(i % 3 == 0){
//				System.out.println("Numero multiplo di 3 = " + i);
//				j++;
//			}
//			i++;
//		}
		
		// 4 MODO
//		int i = 1, j = 1;
//		do{
//			
//			if(i % 3 == 0){
//				System.out.println("Numero multiplo di 3 = " + i);
//				j++;
//			}
//			i++;
//			
//		} while(j < 10);

	}

}
