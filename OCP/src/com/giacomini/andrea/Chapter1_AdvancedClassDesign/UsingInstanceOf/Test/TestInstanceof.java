package com.giacomini.andrea.AdvancedClassDesign.UsingInstanceOf.Test;

public class TestInstanceof {

	public static void main(String[] args){
		
		// N.B: il tipo di riferimento è "HeavyAnimal", ma questo può puntare ad un'oggetto di tipo "Hippo" (new Hippo()) in quanto 
		//		un'oggetto "Hippo" è (per definizione) sicuramente anche un oggetto "HeavyAnimal".
		//		A runtime, Java sa che anche se il riferimento è di tipo "HeavyAnimal" l'oggetto puntato però è di tipo "Hippo".
		HeavyAnimal hippo = new Hippo();
		
		boolean b1 = hippo instanceof Hippo;			// TRUE - hippo è un'istanza di se stesso;
		boolean b2 = hippo instanceof HeavyAnimal;		// TRUE - hippo è un'istanza della sua super-classe;
		boolean b3 = hippo instanceof Elephant;			// FALSE - hippo NON è un'istanza della classe Elephant (non sono correlate in nessun modo);
		
		HeavyAnimal hippo2 = new Hippo();
		boolean b4 = hippo2 instanceof Object;			// TRUE - Hippo estende (indirettamente) Object come tutte le altre classi;
		Hippo nullHippo = null;
		boolean b5 = nullHippo instanceof Object;		// FALSE - la variabile "nullHippo" contiene un riferimento "null" e "null"
														//		   non è di certo un'istanza di Hippo;
		
		Hippo anotherHippo = new Hippo();
//		boolean b5 = anotherHippo instanceof Elephant;	NON COMPILA - il compilatore Java conosce già che una variabile di tipo "Hippo"
//																  	  non potrà MAI puntare/riferirsi ad un'oggetto di tipo "Elephant"
//																	  in quanto Hippo non estende (nè direttamente nè indirettamente)
//																	  la classe "Elephant";
		
		HeavyAnimal hippo3 = new Hippo();
		// "Mother" è una interfaccia;
		boolean b6 = hippo3 instanceof Mother;			// N.B: Hippo non "implements Mother" ma lo statement è corretto perché in
														//		in seguito potrebbe esserci una classe come questa:
														//			"class MotherHippo extends Hippo implements Mother {}"
		System.out.println(b6);
		
		
	}
}
