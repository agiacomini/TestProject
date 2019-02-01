package com.giacomini.andrea.FunctionalProgramming.UsingStream;

/**
 * Created by Andrea on 24/01/2019.
 */

/*
* N.B:  In Java l'interfaccia "Stream" si trova nel packeage "java.util.stream".
*       Esistono pochi modi per creare uno "Stream" finito:
*
*           1: Stream<String> empty = Stream.empty();           // count 0
*           2: Stream<Integer> singleElement = Stream.of(1);    // count 1
*           3: Stream<Integer> fromArray = Stream.of(1,2,3);    // count 3
*
*       La linea 1 mostra come creare uno "Stream" vuoto. La linea 2 mostra come creare uno
*       "Stream" con un singolo elemento. La linea 3 mostra come creare uno "Stream" da un array.
*       Avrete notato senza dubbio che sulla linea 3 non c'è un array. La firma del metodo
*       usa "varargs", che permette di specificare un array o una degli elementi individuali.
*       Dal momento che gli "Stream" sono nuovi in Java 8, la maggior parte del codice
*       che è già stato scritto usa le "List". Java fornisce un modo convenite per convertire
*       una "List" in uno "Stream":
*
*           4: List<String> list = Arrays.asList("a", "b", "c");
*           5: Stream<String> formList = list.stream();
*           6: Stream<String> fromListParallel = list.parallelStream();
*
*       La linea 5 mostra che si tratta di una semplice chiamata di metodo per creare uno
*       "Stream" da una "List". La linea 6 fa lo stesso, eccetto che crea uno "Stream"
*       che permette di processare elementi in parallelo. Questa è una caratteristica molto
*       importante perché si può scrivere codice che usa il parallelismo ancora prima di
*       imparare che cos'è un "thread". Usare gli "Stream" paralleli è come impostare tavoli di lavoro
*       multipli che sono in grado di fare lo stesso compito. Dipingere i cartelli
*       sarebbe molto più veloce se potessimo avere cinque pittori che dipingono contemporanemamente
 *      cartelli differenti. Tenete a mente che non vale la pena lavorare in parallelo con
 *      "Stream" piccoli. C'è un costo "overhead" maggiore nel coordinare il lavoro di tutti
 *      gli operai che lavorano in parallelo. Per piccole quantità di lavoro è più veloce
 *      farlo in modo sequenziale.
 *      Si scopriranno maggiori dettagli sull'esecuzione parallela nel capitolo 7 - "Concurrency".
 *      Non c'è niente di impressionante fino a questo punto. Si potrebbero fare tutte queste cose
 *      anche con delle "List". Non è possibile però creare una "List" infinita, il che rende
 *      gli "Stream" molto più potenti.
 *
 *          7: Stream<Double> randoms = Stream.generate(Math::random);          ?? Genera uno "Stream" infibito ??
 *          8: Stream<Integer> oddNumbers = Stream.iterate(1, n -> n = 2);
 *
 *      La linea 7 genera uno "Stream" di numeri randomici. Quanti numeri random? Molti più
 *      di quelli che ci servono. Se si chiama "random.forEach(System.out::println)" il
 *      programma stamperà numeri random fino a quando non si uccide il programma stesso.
 *      Più avanti nel capitolo, si impareranno le operazioni come "limit()" per eseguire
 *      "Stream" infiniti in "Stream" finiti.
 *      La riga 8 ci da molto più controllo. Il metodo "iterate()" prende un valore di partenza
 *      come primo parametro. Il secondo parametro invece è una "lambda expression" che ?prende?
 *      il valore precedente e genera il valore successivo.
 *      Come con l'esempio dei numeri randomici, continuerà a produrre numeri dispari finché
 *      se ne ha bisogno.
* */

public class CreatingStreamSource {
}
