package com.giacomini.andrea.MethodsAndEncapsulation.DesigningMethods;

/*
 * N.B: JAVA offre la possibilità di scegliere tra 4 diversi modificatori di accesso:
 * 
 * 			1- public		: il metodo può essere chiamato da qualsiasi classe;
 * 			2- private		: il metodo può essere chiamato solo all'interno della stessa classe;
 * 			3- protected	: il metodo può essere chiamato solo dalle classi che appartengono allo stesso package;
 * 			4- "default"    : il metodo può essere chiamato dall'interno della stessa classe (private) e anche dalle altre classi 
 * 							  nello stesso package;
 */

public class AccessModifier {
	
	public void walk1(){}
	
//	default void walk2(){}	// NON COMPILA - perché "default" non è un modificatore di accesso valido;
	
//	void public walk3(){}	// NON COMPILA - perché il modificatore di accesso è specificato dopo il tipo di ritorno;
	
	void walk4(){}

}
