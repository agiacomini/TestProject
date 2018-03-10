package com.giacomini.andrea.OCA.Prove;

public class TestAbstractClass2 extends TestAbstractClass{

	public void testMethodAbstract(){
		System.out.println("implemented the methods abstract inheritance from abstract class \"TestAbstractClass\" ");
	}
	
	public void test(){
		TestAbstractClass.testMethodStatic();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestAbstractClass2 t = new TestAbstractClass2();
		t.test();
		t.testMethod();
	}

}
