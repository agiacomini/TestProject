package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples;

public class Marsupial {

//	public static boolean isBiped(){
//		return false;
//	}
	
	public boolean isBiped(){
		return false;
	}
	
	public void getMarsupialDescription(){
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marsupial marsupial = new Marsupial();
		marsupial.getMarsupialDescription();								// Marsupial walks on two legs: false
	}

}
