package com.giacomini.andrea.ClassDesign.ImplementingInterfaces.Examples;

public class Cat1 implements Walk, Run {

	// Overiding
	public int getSpeed(){
		return 1;
	}
	
	public static void main(String[] args){
		System.out.println(new Cat1().getSpeed());
	}
}
