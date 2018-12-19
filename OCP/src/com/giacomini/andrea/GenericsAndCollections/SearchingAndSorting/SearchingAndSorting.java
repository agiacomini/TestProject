package com.giacomini.andrea.GenericsAndCollections.SearchingAndSorting;

/*
N.B: Già si conoscono le basi della ricerca e dell'ordinamento. Ora si conosce anche un pò di più
	 riguardo le interfacce "Comparable" e "Comparator".
	 Il metodo di ordinamento usa il metodo "comareTo()" per l'ordinamento. Ci si aspetta che l'oggetto per 
	 essere ordinato sia "Comparable".
	 
	 com.giacomini.andrea.GenericsAndCollections.SearchingAndSorting.Test.SortRabbits;
	 
	 Java conosce che la classe "Rabbit" non è "Comparable". Sa che l'ordinamento fallirà, per
	 questo motivo non permette che il codice compili. Si può fissare qsta situazione passando un 
	 "Comparator" al metodo "sort()". E' importante ricordare che un "Comparator" è utile quando si
	 vuole specificare un ordine di ordinamento senza usare un metodo "compareTo()".
	 
	 Il metodo "sort()" e il metodo "binarySearch()" permettono di passare un'oggetto "Comparator"
	 quando non si vuole usare l'ordine naturale. C'è un trucco per questo. Qual'è l'output del
	 seguente codice?:
	 
	 3: List<String> names = ArrayList.asList("Fluffy","Hoppy");
	 4: Comparator<String> c = Comparator.reverseOrder();
	 5: int index = Collections.binarySearch(names, "Hoppy", c);
	 6: System.out.println(index);
	 
	 La risposta è -1. Si deve sapere che la risposta non è definita. La liena 3 crea una lista, 
	 ["Fluffy", "Hoppy"]. Questa lista sembra essere ordinata in ordine ascendente. La linea 4
	 crea un "Comparator" che inverte l'ordine naturale. La linea 5 richiede una ricerca binaria
	 in ordine discendente. Dal momento che la lista è in ordine ascendente, non si incontrano
	 le precondizioni per fare una ricerca.
	 In questo capitolo si è parlato delle collezioni e cioè che si richiede alle classi di implementare
	 l'interfaccia "Comparable". Diversamente dall'ordinamento, per le collections non si controlla 
	 a run-time che si abbia implementato l'interfaccia "Comparable".
	 Si torni alla classe "Rabbit" che non implementa l'interfaccia "Comparable" e si provi ad
	 aggiungerla ad un "TreeSet".
	 
	 com.giacomini.andrea.GenericsAndCollections.SearchingAndSorting.Test.UseTreeSet;
	 
	 La linea "ducks.add(new Duck("Puddles"));" va bene. La classe "Duck" implementa l'interfaccia
	 "Comparable". "TreeSet" è in grado di ordinarlo nella posizione corretta all'interno dell'insieme.
	 La liena "rabbit.add(new Rabbit());" ha un problema invece. Quando "TreeSet" prova ad
	 ordinarlo, Java scopre che l'oggetto "Rabbit" non implementa l'interfaccia "Comparable".
	 A questo punto Java lancia l'eccezione seguente:
	 
			 Exception in thread "main" java.lang.ClassCastException: 
			  		com.giacomini.andrea.GenericsAndCollections.SearchingAndSorting.Test.UseTreeSet$Rabbit 
			  		cannot be cast to java.lang.Comparable
	  		
	 Sembra strano che questa eccezione venga lanciata quando viene aggiunto il primo oggetto
	 all'insieme. Dopotutto, non ci sono altri oggetti con cui compararlo ancora.
	 Java funziona in questo modo per la consistenza.
	 Esattamente come per la ricerca e l'ordinamento, si può dire anche alle collections di richiedere
	 uno specifico ordinamento usando uno specifico "Comparator", per esempio
	 
			 Set<Rabbit> rabbit = new TreeSet<>(new Comparator<Rabbit>() {
			 
			 	public int compare(Rabbit r1, Rabbit r2){
			 		return r1.id = r2.id;
			 	}
			 });
			 rabbit.add(new Rabbit());
	 
	 Ora Java sa che si vuole ordinare per "id". I "Comparator" sono oggetti utili. 
	 Permettono di separare l'ordine dell'ordinamento dall'oggetto da ordinare.
	  
 */

public class SearchingAndSorting {
}
