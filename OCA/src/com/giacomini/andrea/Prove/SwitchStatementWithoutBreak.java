package com.giacomini.andrea.Prove;

public class SwitchStatementWithoutBreak {

	static String string = "prova";
	
	/*
	 * N.B: I tipi consentiti sono  byte Byte, short Short, int Integer, String, enum, char Character 
	 */
	public void switchStatement(String a){
		
		switch(a){
		
			case "prova": System.out.println("prova");
			break;
		
			case "A": System.out.println("A");

			case "Prova": System.out.println("Prova");
//						  break;
//			
//			case "prova": System.out.println("prova");
//						  break;
				
			case "string": System.out.println("string");
		}
	}
	
	public static void main(String[] args){
		
		SwitchStatementWithoutBreak s = new SwitchStatementWithoutBreak();
		s.switchStatement(string);
	}
}
