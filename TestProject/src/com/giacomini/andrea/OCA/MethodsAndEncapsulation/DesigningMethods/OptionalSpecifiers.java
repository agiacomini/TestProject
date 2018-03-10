package com.giacomini.andrea.OCA.MethodsAndEncapsulation.DesigningMethods;

/*
 * N.B: A differenza dei modificatori di accesso è possibile avere più specificatori opzionali nella stessa dichiarazione del metodo.
 * 		E' possibile avere zero o più specificatori.
 * 		
 * 		static			: usato per i metodi di classe;
 * 		abstract		: Chapter 5 (Class Design), usato quando non si fornisce il corpo del meotodo;
 * 		final			: Chapter 5 (Class Design), usato quando non si permettere la sovrascrittura del metodo da parte 
 * 						  di una sotto-classe;
 * 		synchronized	: in OCP exam;
 * 		native			: non in OCA e OCP exam;
 * 		strictfp		: non in OCA e OCP exam;
 */

public class OptionalSpecifiers {
	
	public void walk1(){}
	public final void walk2(){}
	public static final void walk3(){}
	public final static void walk4(){}
//	public modifier void walk5(){}			// NON COMPILA - "modifier" non è uno specificatore opzionale;
//	public void final walk6(){}				// NON COMPILA - lo specificatore opzionale "final" è dopo il valore di ritorno;
	final public void walk7(){}

}
