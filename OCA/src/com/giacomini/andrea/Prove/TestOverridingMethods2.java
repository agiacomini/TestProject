package com.giacomini.andrea.Prove;

public class TestOverridingMethods2 extends TestOverridingMethods {

	public void methodTipically2(){
		methodB();
	}
	
	public void methodB(){
		System.out.println("call methodB() from TestOverridingMethods2 class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestOverridingMethods2 test = new TestOverridingMethods2();
		
		test.methodTipically1();
		test.methodTipically2();

	}
}
