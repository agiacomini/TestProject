package com.giacomini.andrea.GenericsAndCollections.ReviewingOCACollections;

/*
N.B: Il nostro ultimo argomento da rivedere è la ricerca e l'ordinamento. Perchè il seguente codice funziona?

        11: int[] numbers = {6, 9, 1, 8};
        12: Arrays.sort(numbers);                                    // [1, 6, 8, 9]
        13: System.out.println(Arrays.binarySearch(numbers, 6));    // 1
        14: System.out.println(Arrays.binarySearch(numbers, 3));    // -2 --> -1 -1 = -2

     La linea 12 ordina l'array perché la ricerca binaria (binarySearch()) assume che gli input siano ordinati.
     La linea 13 stampa l'indice del match trovato. La linea 14 stampa un valore negativo un (-1 che significa match non trovato)
     meno il valore negativo dell'indice dove il valore richiesto dovrebbe essre inserito. Il numero 3 dovrebbe essere inserito in
     posizione 1 (dopo il numero 1 e prima del numero 6). Negando quel numero ci dà -1 e sottraendogli 1 ci ritorna -2.
     Proviamolo di nuovo con una "List":

        15: List<Integer> list = Arrays.asList(9, 7, 5, 3);
        16: Collections.sort(list);                                 // [3, 5, 7, 9]
        17: System.out.println(Collections.binarySearch(list,3));   // 0
        18: System.out.println(Collections.binarySearch(list,2));   // -1

     Analogamente, dobbiamo ordinarlo prima. La linea 17 stampa l'indice del match trovato. Per la linea 18, si vorrebbe
     inserire 2 all'indice 0, dal momento che è più piccolo degli altri numeri nella lista. Negando 0 rimane ancora 0
     e sottraendogli 1 ci ritorna -1 (match non trovato).

     N.B: Abbiamo chiamato i metodi "sort()" e "binarySearch()" su "Collections" piuttosto che su "Collection".
          In passato, "Collection" non poteva avere metodi concreti perché è un'interfaccia. Alcuni sono stati aggiunti
          in Java 8. Si discuteranno di questi nel capitolo "4- Functional Programming".

     Si vedranno di nuova la ricerca e l'ordinamento in questo capitolo, dopo aver studiato l'interfaccia "Comparable".
 */

public class SearchingAndSorting {
}
