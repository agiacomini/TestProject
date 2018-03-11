package com.giacomini.andrea.AdvancedClassDesign.Test;

public class BobcatKitten extends Bobcat {

	// Overriding - stessa firma (nome più lista di parametri);
	public void findDen(){}
	
	// Overloading - stesso nome ma lista di parametri diversa (tipi diversi o ordine diverso dell'elenco);
	public void findDen(boolean b){}
	
	// Other method - nome diverso;
	public int findden() throws Exception { return 0; }
	
	/*
	 * Overloading rules:
	 * 
	 * 		1- match esatto;
	 * 		2- match con un tipo di super-classe;
	 * 		3- conversione alla primitiva più grande;
	 * 		4- conversione al tipo Wrapper associato (auto-boxing);
	 * 		5- varargs;
	 * 
	 * Overriding rules:
	 * 
	 * 		1- il modificatore d'accesso deve essere lo stesso o più accessibile;
	 * 		2- il tipo di ritorno deve essere lo stesso oppure un tipo di più restrittivo (covariante);
	 * 		3- se il metodo da overriddare (overridden) lancia una eccezione "checked" allora il metodo che fa l'overriding può lanciare
	 * 		   la stessa eccezione oppure una sua sotto-classe;
	 * 
	 * 		N.B: Se il metodo è STATIC allora non può essere overriding ma solo hidding;
	 * */
}
