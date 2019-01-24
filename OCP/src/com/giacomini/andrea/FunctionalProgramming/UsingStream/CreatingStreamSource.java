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
*       importante perché si può scrivere codice
* */

public class CreatingStreamSource {
}
