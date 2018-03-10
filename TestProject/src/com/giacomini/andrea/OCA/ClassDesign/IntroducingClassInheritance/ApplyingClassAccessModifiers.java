package com.giacomini.andrea.OCA.ClassDesign.IntroducingClassInheritance;

/*
 * N.B: Nel capitolo "MethodsAndEncapsulation" abbiamo visto come applicare i modificatori di accesso (public, default(private 
 * 		package), protected, private) sia ai metodi di classe che alle variabili di una classe.
 * 		
 * 		I modificatori di accesso però possono essere applicati anche alla definizione di una classe.
 * 		
 * 		Il modificatore d'accesso "PUBLIC" applicato ad una classe indica che può essere referenziata e usata da qualsiasi altra
 * 		classe. Il modificatore d'accesso "default package", applicabile senza specificare nessun altra modificatore, indica che
 * 		una classe può essere acceduta solo da una classe appartenente allo stesso package.
 * 		
 * 		Ricordiamo che un file java può avere più classi ma solo una di queste potrà essere PUBLIC. Infatti, può anche NON avere
 * 		classi PULBIC. Una caratteristiche dell'uso del modificatore d'accesso "default package private" è che è possibile definire
 * 		molte classe nello stesso file java. 
 * 		Per esempio, le seguenti due definizioni di classi possono apparire in un singolo file java chiamato "Groundhog.java", visto
 * 		che solo una è PUBLIC:
 * 
 * 		Grounghog.java:
 * 
 *  		class Rodent {}
 *  
 *  		public class Groundhog extends Rodent {}
 *  
 *  	Se dovessimo modificare la definizione della classe Rodent con il modificatore di accesso PUBLIC allora la compilazione
 *  	non sarebbe più permessa, e saremmo costretti a mettere la definizione della classe Rodent in un file Rodent.java separato.
 *  
 *  	Le regole di applicazione alle classi dei modificatori d'accesso valgono anche per le interfacce.
 * 		  
 */

public class ApplyingClassAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
