package com.giacomini.andrea.EserciziSupplementari.Modulo4;

import java.util.Scanner;

public class ProgrammaInterattivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String string = "";
		
		System.out.println("Digita qualcosa e batti eneter, oppure scrivi \"fine\" per terminare il programma");
		
		while(!(string = scanner.next()).equals("fine")){
			string = moderaStringa(string);
			System.out.println("Hai digitato " + string.toUpperCase() + "!");
		}
		System.out.println("Fine programma!");

	}
	
	private static String moderaStringa(String string){
		
		switch(string){
		
			case "accidenti":
		
			case "perbacco":
			
			case "stupido":
				string = "CENSURATA!";
				break;
			
			default: break; 
		}
		
		return string;
	}

}
