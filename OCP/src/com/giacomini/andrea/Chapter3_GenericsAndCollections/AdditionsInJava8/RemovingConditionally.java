package com.giacomini.andrea.GenericsAndCollections.AdditionsInJava8;

/*
 * N.B: Java 8 introduce un nuovo metodo chiamato "removeIf()". Prima di questo, avevamo
 * 		l'abilità di rimuovere uno specifico oggetto da una collezione o uno specifico indice
 * 		da una lista. Ora è possibile specificare quale dovrebbe essere eliminato usando un
 * 		blocco di codice. 
 * 		La firma del metodo è quella di seguito:
 * 
 * 			boolean removeIf(Predicate<? super E> filter)
 * 
 * 		Usa un "Predicate" (interfaccia funzionale), la quale è una lambda expression che prende
 * 		un parametro e ritorna un booleano. Dal momento che lambda usa l'esecuzione deferenziata,
 * 		questo permette di specificare una logica da eseguire quando quel punto nel codice
 * 		viene raggiunto. Diamo uno sguardo ad un'esempio:
 * 
 *  		4: List<String> list = new ArrayList<>();
 *  		5: list.add("Magician");
 *  		6: list.add("Assistant");
 *  		7: System.out.println(list);		// [Magician, Assistant]
 *  		8: list.removeIf(s -> s.startWith("A"));
 *  		9: System.out.println(list);		// [Magician]
 *  
 *  		La linea 8 mostra come remuovere tutte le stringhe che iniziano con la lettera "A".
 *  		Questo ci permette di non far più apparire la stringa "Assistant".
 *  		Come si può sostituire la linea 8 con un "method references"? Domanda complicata -
 *  		non si può. Dal momento che il metodo "startWith()" si aspetta un parametro che
 *  		non è "s", deve essere specificato "the long way".
 *  		Non c'è molto "removeIf()" se non si ricorda come "Predicate" funziona. Se non è 
 *  		molto familiare questo argomento rivedere il capitolo 2 (Design Patter and Principles).
 *  		Verranno usato molto le lambda nel proddimo capitolo, quindi è importante averle
 *  		bene in mente. La cosa più importante da ricordare circa il metodo "removeIf()" è
 *  		che è uno dei due metodi che sono su una collezione e che prende un parametro lambda.    
 * */

public class RemovingConditionally {

}
