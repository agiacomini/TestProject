package com.giacomini.andrea.ClassDesign.UnderstandingPolymorphism.Examples;

public class Capybara extends Rodent {

	public static void main(String[] args){
		Rodent rodent = new Rodent();
		Capybara capybara = (Capybara)rodent;			// Lancerebbe "ClassCastException" a runtime;
	}
}
