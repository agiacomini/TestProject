package com.giacomini.andrea.MethodsAndEncapsulation.OverloadingMethods;

public class OverloadingAndVarargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingAndVarargs o = new OverloadingAndVarargs();
		o.fly(new int[] {1,2,3});
		o.fly(1, 2, 3);

	}
	
	public void fly(int... lenghts){}
//	public void fly(int[] lenghts){}                        NON COMPILA - i "varargs" sono trattati da JAVA come se fossero array
//																		  quindi le due firme si possono considerare identiche;

}
