package com.giacomini.andrea.AdvancedClassDesign.CodingEqualsHashCodeToString;

import java.util.ArrayList;

/*
 * N.B: Si è imparato (nell'esame OCA) come Java chiama automaticamente il metodo "toString()" quando si cerca di stampare 
 *     	un'oggetto. Si è imparato anche che alcune classi supportano un'implementazione leggibile del metodo "toString()"
 *     	e altre invece no.
 *     	"ArrayList" per esempio fornisce un'implementazione del metodo "toString()" elencando il contenuto dell'ArrayList;
 *     		
 *     	Chiaramente fornendo un'output più leggibile si rendeono le cose più facili per gli sviluppatori che lavorano
 *     	con il nostro codice. Loro potranno semplicemente stampare il nostro oggetto e capire cosa rappresenta. 
 *     	Fortunatamente, è facile fare l'overriding del metodo "toString()" e fornire così la propria implementazione del
 *     	metodo (come mostrato nell'esempio di seguito riportato "Hippo" class);
 *     
 *     	Sono di molto aiuto nel fare l'override del metodo "toString()" gli Apache Common Langs: 
 *     	(http://commons.apache.org/proper/commons-lang/);
 *     
 *	    	public String toString() {
 *				return ToStringBuilder.reflectionToString(this);
 *			}
 *     
 *     	(La "Reflection" è una tecnica usata in Java per mostrare informazioni sulla classe a runtime. Questo consente
 *     	alla classe "ToStringBuilder" di determinare quali sono tutte le variabili d'istanza e costruire una String con
 *     	tutte queste variabili messi insieme);
 * 
 */

public class ToString {

	public static void main(String[] args){
		
		System.out.println(new ArrayList());				// [] - il contenuto dell'ArrayList è vuoto;
		System.out.println(new String[0]);					// [Ljava.lang.String;@15db9742
	}
}

class Hippo{
	
	private String name;
	private double weight;
	
	// Costruttore;
	public Hippo(String name, double weight){
		
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		
//		return name;
		
		return "Name: " + name + ", Weight: " + weight ;
		
	}
	
	public static void main(String[] args){
		
		Hippo h1 = new Hippo("Harry", 3100);
		System.out.println(h1);						// Name: Harry, Weight: 3100.0;
	}
}
