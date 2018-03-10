package com.giacomini.andrea.OCA.MethodsAndEncapsulation.DesigningMethods;

/*
 * N.B: La lista dei parametri è obbligatoria (required) ma può essere anche vuota.
 * 		Quando invece la lista ha più di un elementi, questi devono essere separati da una virgola. 
 */

public class ParameterList {
	
	public void walks1(){}
//	public void walks2{}								// NON COMPILA - mancano le parentesi tonde e cioè la lista di parametri
														//				 che può essere anche vuota ();
	public void walks3(int a){}
//	public void walks4(int a; int b){}					// NON COMPILA - i parametri sono separati da un punto e virgola ";"
	public void walks5(int a, int b){}

}
