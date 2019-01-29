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
*       Il metodo "flatMap()" prende ogni elemento presente nello "Stream" e rende tutti
*       gli elemento che contiene elementi di primo livello in uno "Stream" singolo.
*       Questo è utile quando si vuole rimuovere elementi vuoti dallo "Stream" o quando
*       si desidera combinare uno "Stream" di liste. Stiamo mostrando la firma del metodo
*       per la coerenza/consistenza con gli altri metodi, così che non si pensi che si
*       stia nascondendo qualcosa. Non ci si aspetta che si sia in grado di leggere la firma
*       del metodo seguente:
*
*           <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
*
*       Questo linguaggio incomprensibile basicamente dice che ritorna uno "Stream" del tipo
*       che la funzione contiene al livello inferiore. Non c'è da preoccuparsi riguardo la
*       firma del metodo. Quello che si dovrebbe comprendere è l'esempio. Questo prende
*       tutti gli animali e li mette tutti insieme allo stesso livello e si sbarazza
*       delle liste vuote:
*
*           List<String> zero = Arrays.asList();
*           List<String> one = Arrays.asList("Bonobo");
*           List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
*
*           Stream<List<String>> animals = Stream.of(zero, one, two);
*
*           animals.flatMap( l -> l.stream() ).forEach(System.out::println);        // Bonobo
*                                                                                   // Mama Gorilla
*                                                                                   // Baby Gorilla
*
*       N.B: Il metodo "stream()" è un metodo tipico delle "List" che permette
*       come si può intuire dal nome di trasformare una "List" in uno "Stream".
*
*       Come si può notare dall'esempio, è stata rimossa la lista vuota "zero" e
*       sono stati cambiati tutti gli elementi per ognuna delle liste per essere
*       al livello più alto dello "Stream".
*
*       -----------------------------------------------------------------------------
*
*       - sorted()
*       Il metodo "sorted()" ritorna una "Stream" i cui elementi sono ordinati.
*       Esattamente come per l'ordinamento degli array, Java usa l'ordinamento
*       naturale senza che ci si preoccupi di specificare un comparatore.
*       Le firme dei metodi sono le seguenti:
*
*           Stream<T> sorted()
*           Stream<T> sorted(Comparator<? super T> comparator)
*
*       Chiamando la prima delle due firme viene usato l'ordinamento di default:
*
*           Stream<String> s = Stream.of("brown-", "bear-");
*           s.sorted().forEach(System.out::print);            // bear-brown-
*
*       Si ricordi che si può passare una lambda expression come comparatore.
*       Per esempio, si può passare una implementazione di "Comparator":
*
*           Stream<String> s = Stream.of("brown bear-", "grizzly-");
*           s.sorted(Comparator.reverseOrder()).forEach(System.out::print);   // grizzly-brown bear-
*
*       In questo esempio è stato passato un "Comparatore" per specificare che si
*       voleva ordinare gli elementi in ordine inverso rispetto all'ordinamento naturale.
*       Prondi per un'esempio più complicato? Riesci a vedere perché questo codice
*       non compila?
*
*           s.sorted(Comparator::reverseOrder);         // DOES NOT COMPILE
*
*       Diamo ancora uno sguardo alla firma del metodo. "Comparator" è una interfaccia
*       funzionale. Questo significa che si possono usare i "method reference" o le
*       "lambda expression" per implementarla. L'interfaccia "Comparator" implementa
*       un metodo che prende due parametri "String" e ritorna una primitiva "int".
*       Però, "Comparator::reverseOrder" non fa quello. E' un riferimento ad una funzione
*       che prende zero parametri e ritorna un "Comparator". Questo non è compatibile con
*       l'interfaccia. Questo significa che dobbiamo usare un metodo e non un "method reference"
*       Ne riparliamo per ricordare che si ha davvero bisogno di conoscere bene i
*       "method reference".
*
*
* */

public class UsingCommonIntermediateOperations {
}
