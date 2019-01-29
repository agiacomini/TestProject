package com.giacomini.andrea.FunctionalProgramming.UsingStream;

/**
 * Created by Andrea on 28/01/2019.
 */

/*
* N.B:  Diversamente dalle "Terminal Operations" le "Intermediate Operations" si occupano
*       di "Stream" infiniti semplicemente ritornando uno "Stream" infinito.
*       Dal momento che gli elementi sono prodotti solo se sono necessari, questo funziona bene.
*       L'addetto alla catena di montaggio non deve preoccuparsi di quanti elementi passano
*       attraverso la linea ma piuttosto deve concentrasi sull'elemento corrente.
*
*       - filter()
*       Il metodo "filter()" ritorna uno "Stream" con elementi che match con una data espressione.
*       Di seguito la firma del metodo:
*
*           Stream<T> filter(Predicate<? super T> predicate)
*
*       N.B: "Predicate" è una interfaccia funzionale "java.util.Function" che prende in input
*            un parametro e ritorna un boolean (primitva);
*
*       Questa operazione è facile da ricordare e molto potente perché si può passare
*       qualsiasi "Predicate". Per esempio, di seguito viene usato il metodo "filter()"
*       per filtrare tutti gli elementi che iniziano con la lettera "m":
*
*           Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
*           s.filter( x -> x.startWith("m") ).forEach(System.out::println);     // monkey
*
*       -------------------------------------------------------------------------------------
*
*       - distinct()
*       Il metodo "distinct()" ritorna uno "Stream" da dove sono stati rimossi i duplicati.
*       I duplicati non necessitano di essere adiacenti per essere rimossi. Come si può
*       immaginare, Java chiama il metodo "equals()" per determinare se gli oggetti sono
*       gli stessi. La firma del metodo è la seguente:
*
*           Stream<T> distinct()
*
*       Di seguito un'esempio:
*
*           Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
*           s.distinct().forEach(System.out::println);                      // duck, goose
*
*       --------------------------------------------------------------------------------------
*
*       - limit() and skip()
*       I metodi "limit()" e "skip()" rendono lo "Stream" più piccolo. Loro potrebbero rendere
*       uno "Stream" finito più piccolo, oppure potrebbero rendere uno "Stream" infinito
*       in uno finito. Di seguito le firme dei metodi:
*
*           Stream<T> limit(long maxSize)
*           Stream<T> skip(long n)
*
*       Il codice seguente crea uno "Stream" infinito di numeri a partire 1. L'operazione
*       "skip()" restituisce uno "Stream" infinito che inizia con il conteggio dei numeri
*       a partire da 6, poiché salta i primi 5 numeri. La chiamata al metodo "limit()"
*       prende i primi due di questi elementi. Così facendo abbiamo ora uno "Stream" finito
*       con due elementi:
*
*           Stream<Integer> s = Stream.iterate(1, n -> n + 1);
*           s.skip(5).limit(2).forEach(System.out::print);        // 67
*
*       ----------------------------------------------------------------------------------------
*
*       - map()
*       Il metodo "map()" crea un mapping one-to-one dagli elementi dello "Stream" agli
*       elementi dello step successivo dello "Stream". La firma del metodo è la seguente:
*
*           <R> Stream<R> map(Function<? super T, ? extends R> mapper)
*
*       Questo metodo sembra più complicato rispetto agli altri visti fino ad ora.
*       Usa le lambda expression per capire il tipo di dato passato a quella funzione e
*       quello restituito. Il tipo di ritorno è lo "Stream" che viene restituito.
*
*       N.B: il metodo "map()" sugli "Stream" serve per trasfomrare i dati. Non bisogna
*       confonderlo con l'interfaccia "Map", il quale mapppa una chiave con un valore.
*
*       Come esempio, il codice seguente converte una List di oggetti "String" in una lista
*       di oggetti "Integer" rappresentanti la loro lunghezza:
*
*           Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
*           s.map(String::lenght).forEach(System.out::print);               // 676
*
*       Si ricordi che "String::length" è la versione compatta della lambda expression
*       "x -> x.length()", la quale mostra chiaramente che si tratta di una funzione che
*       converte una "String" in un "Integer".
*
*       --------------------------------------------------------------------------------------
*
*       - flatMap()
* */

public class UsingCommonIntermediateOperations {
}
