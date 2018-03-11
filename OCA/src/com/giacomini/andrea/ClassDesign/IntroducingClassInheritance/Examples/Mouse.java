package com.giacomini.andrea.ClassDesign.IntroducingClassInheritance.Examples;

public class Mouse extends Rodent {

	protected int tailLenght = 8;
	public void getMouseDetails(){
		System.out.println("[tail=" + tailLenght + ", parentTail=" + super.tailLenght + "]");
	}
	
	public static void main(String[] args){
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();							// [parentTail=4]
		mouse.getMouseDetails();							// [tail=8, parentTail=4]
	}
}
