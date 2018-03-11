package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples;

import javax.naming.InsufficientResourcesException;

public class Reptile {

	protected boolean hasLegs() throws InsufficientResourcesException{
		throw new InsufficientResourcesException();
	}
	
	protected double getWeight() throws Exception{
		return 2;
	}
	
	protected double getHeight() throws InsufficientResourcesException{
		return 2;
	}
	
	protected int getLength(){
		return 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
