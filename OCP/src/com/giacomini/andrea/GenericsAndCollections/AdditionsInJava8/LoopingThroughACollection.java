package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8;

/*
 * N.B: Ciclare su una "Collection" è molto comune. Per esempio, spesso si vuole stampare
 * 		i valori uno per riga. Ci sono pochi modi per fare questo. Potremmo usare un iteratore,
 * 		un ciclo for "enhanced", o un numero di altri approcci - oppure si potrebbe usare una lambda
 * 		espression.
 * 		Iniziamo con il modo tradizionale:
 * 
 * 			List<String> cats = ArrayList.asList("Annie", "Ripley");
 * 			for(String cat : cats)
 * 				System.out.println(cat);
 * 		 
 * 		Questo modo funziona. E' possibile fare la stessa cosa con una lambda expressione su una 
 * 		sola riga:
 * 
 * 			cats.forEach(c -> System.out.println(c));
 * 
 * 		Questa volta, si è usato un "Consumer", il quale prende un singolo parametro e noo ritorna
 * 		nulla. Però questo approccio non si vedrà molto spesso perché è molto più comune invece
 * 		usare un "method references":
 * 
 * 			cats.foreach(System.out::println);
 * 
 * 		Nel prossimo capitolo si imparerà ad usare il metodo "stream()" usato per fare cose molto
 * 		più potenti con le lambda expression.
 * */

public class LoopingThroughACollection {

}
