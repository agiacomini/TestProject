package com.giacomini.andrea.OCA.ClassDesign.ImplementingInterfaces;

/*
 * N.B: JAVA non permette l'ereditarietà multipla, ma permette alle classi di implemetare quasiasi numero di interfacce.
 * 		Un'interfaccia è un tipo di dato astratto che definisce una lista metodi PUBLIC abstract che la classe che la implemeta
 * 		deve fornire. 
 * 		Un'interfaccia, inoltre, può fornire una lista di variabili costanti e metodi di default.
 * 		In JAVA un'interfaccia è definita con la parola chiave INTERFACE, analoga alla parola chiave CLASS quando si definisce
 * 		una clase. 
 * 		Una classe invoca un'interfaccia con la parola chiave IMPLEMENTS.
 * 
 * 		Una classe può implementare più di una interfaccia, ognuna separata da una virgola. Se ognuna di queste interfacce 
 * 		definisce dei metodi abstract, la classe concreta che le implementa dovrà fornire un'implmentazione di tutti i loro metodi
 * 		abstract.
 */

public abstract interface ImplementingInterfaces {

	public static final int MINIMUM_DEPTH = 2;
	public final int i = 3;
	
//	protected static final int MINIMUM_DEPTH2 = 2;			NON COMPIAL - idem
//	private static final int MINIMUM_DEPTH3 = 3;			NON COMPIAL - le variabili all'interno di una interfaccia possono essere 
//																		  solo PUBLIC o DEFAULT (PRIVATE PACKAGE);
	
	// Si noti che i modificatori del metodo (public, abstract) sono assunti, in altre parole se vengono o non vengono fornite nella
	// definizione del metodo il compilatore li inserirà in modo automatico come parte della definizione del meotdo stesso.
	public abstract int getMaximumDepth();
	
	// i modificatori PUBLIC e ABSTRACT sono assunti;
	int getMaximumDepth2();

}

interface test {
	
}
