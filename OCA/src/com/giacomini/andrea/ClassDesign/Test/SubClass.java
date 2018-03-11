package com.giacomini.andrea.OCA.ClassDesign.Test;

public class SubClass extends SuperClass implements TestInterfaceA, TestInterfaceB {

	public static void main(String[] args){
		
//		TestExplicitCast c = new TestExplicitCast();
//		TestClassA a = c;
//		TestInterfaceA iA = c;
		
//		TestClassA a = new TestClassA();
//		TestExplicitCast t = (TestExplicitCast) a;	ECCEZIONE A RUNTIME
//		TestInterfaceA iA = (TestExplicitCast) a;	ECCEZIONE A RUNTIME
		
		/*SuperClass a = new SubClass();
		SubClass t = (SubClass)a;	// DOWN-CAST
		TestInterfaceA i = (TestInterfaceA) a;
		TestInterfaceA ii = (TestInterfaceA) t;*/
		
		SuperClass s = new SuperClass();
		//SubClass sub = (SubClass) s;
		TestInterfaceA i = (TestInterfaceA)s;
		//TestInterfaceB ii = (TestInterfaceB)s;
		
		
	}
}

interface TestInterfaceA{}

interface TestInterfaceB {}

class SuperClass implements TestInterfaceA{}
