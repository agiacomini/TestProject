package com.giacomini.andrea.OCA.MethodsAndEncapsulation.CreatingConstructor;

/*
 * N.B: Qualsiasi classe JAVA ha un costruttore anche se non è stato direttamente dichiarato.
 * 		Se l'utente non include un costruttore nella propria classe, JAVA (in modo automatico) ne creerà uno ad hoc senza parametri.
 * 		
 * 		Questo costruttore creato in modo automatica da JAVA viene chiamato "costruttore di default".
 * 		
 * 		Il costruttore di default non ha una lista di parametri e ha un corpo (body) vuoto.
 * 		Creando un costruttore con un modificatore d'accesso "private" si stà dicendo a JAVA che si vuole che nessuno riesca ad avere
 * 		un'istanza di quella classe. Se presente un costruttore "private" JAVA non sarà in grado di creare in modo automatico
 * 		il costruttore di default.
 */

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Viene chiamato il coastruttore di default. Tipicamente = "public DefaultConstructor(){ }".
		DefaultConstructor d = new DefaultConstructor();

	}

}
