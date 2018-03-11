package com.giacomini.andrea.MethodsAndEncapsulation.DesigningMethods;

/*
 * N.B: La parte finale della dichiarazione di un metodo è il corpo del metodo (eccetto per i metodi "abstract" e per le interfacce).
 * 		Il corso del metodo non è altro che un blocco di codice (zero, uno o più statement) racchiusi tra parentesi graffe "{}".
 */

public class MethodBody {

	public void walk1(){ }
//	public void walk2;							// NON COMPILA - manca sia la lista di parametri sia le parentesi graffe che 
												// 				 delimitano il corpo del metodo;
	public void walk3(int a){ int name = a; }
}
