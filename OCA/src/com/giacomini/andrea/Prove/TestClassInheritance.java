package com.giacomini.andrea.Prove;

public final class TestClassInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//class classTestFinal extends TestClassInheritance {				NON COMPIAL -
//	
//}

class classA{
	
	public static int i = 123;
	static String s = "string";
	protected static boolean b = true;
	private static long l = 123l;
	
	static void print(){
		System.out.println("method print() in classA");
	}
	
	int i2 = 333;
	void testInheritance(){
		
		System.out.println("method testInheritance() in classA");
	}

}

class classB extends classA {
	
	public static void main(String[] args){
		
//		int i = 11;
		System.out.println(i);
		System.out.println(b);
//		System.out.println(l);				NON COMPILA - il campo "l" è di tipo PRIVATE quindi anche estendendo la classe
//														  non è possibile accedere ad un membro PRIVATE della classe padre;		
		System.out.println(s);			
		
		print();
		classA.print();
		
		classA a = new classA();
		System.out.println(a.i2);
		a.testInheritance();
		
	}
	
	public void wow(){
		
		System.out.println(this.i);
		this.testInheritance();
		super.testInheritance();
	}
}

class classC extends classB {
	
	public static void main(String[] args) {
		
		System.out.println(i);
		System.out.println(b);
//		System.out.println(l);				NON COMPILA -
		
		print();
		
		classA a = new classA();
		System.out.println(a.i2);
		a.testInheritance();

		System.out.println();
		
		classB b = new classB();
		b.wow();
	}
}
