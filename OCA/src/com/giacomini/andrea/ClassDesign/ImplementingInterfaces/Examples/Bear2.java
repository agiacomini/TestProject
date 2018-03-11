package com.giacomini.andrea.ClassDesign.ImplementingInterfaces.Examples;

public class Bear2 implements Herbivore2, Omnivore2 {

	public int eatPlants(int quantity){
		System.out.println("Eating plants: " + quantity);
		return quantity;
	}
	
	public void eatPlants(){
		System.out.println("Eating plants");
	}
}
