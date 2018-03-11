package com.giacomini.andrea.Prove;

public class TestOverridingMethods {

	public void methodTipically1(){
		methodB();
	}
	
	public void methodB(){
		System.out.println("inside TestOverridingMethods class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOverridingMethods test = new TestOverridingMethods();
		test.methodB();

	}

}
