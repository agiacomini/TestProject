package com.giacomini.andrea.FunctionalProgramming.WorkingWithPrimitive;

/**
 * Created by Andrea on 04/02/2019.
 */

/*
* N.B:  Di seguito tre tipi di "Stream" di primitive:
*
*           - IntStream: usato per le priitive di tipo "int", "short", "byte" e "char";
*           - LongStream: usato per le primitive di tipo "long";
*           - DoubleStream: usato per le primitive di tipo "double" e "float";
*
*       Perché ogni singolo tipo di primitiva non ha il proprio personale "Stream"? Queste tre
*       tipologie sono le più comuni, così i progettisti delle API cono andati avanti con
*       loro.
*
*       N.B: Quando si vede la parola "Stream" all'esame prestare attenzione a come viene
*            scritta. Con una "S" maiscuola, "Stream" è il nome di una classe che contiene
*            un tipo "Object". Con una "s" minuscola, uno "stream" potrebbe essere un concetto
*            uno "Stream", o un "DoubleStream", "IntStream" o "LongStream".
*
*       Alcuni dei metodi per creare uno stream di primitive sono uguali a come si è creato
*       la fonte per un normale "Stream". E' possibile creare uno stream vuoto come di seguito:
*
*           DoubleStream empty = DoubleStream.empty();
*
*       Un'altro modo è usare il metodo factory "of()" con un singolo valore oppure usando
*       il "varargs" overload:
*
*           DoubleStream oneValue = DoubleStream.of(3.14);
*           DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
*           oneValue.forEach(System.out::println);
*           System.out.println();
*           varargs.forEach(System.out::println);
*
*       Questo codice stampa il seguente output:
*
*           3.14
*
*           1.0
*           1.1
*           1.2
*
*       Funziona allo stesso modo per ogni tipo di stream di primitive. Si può inoltre usare
*       i due metodi per creare stream infiniti, esattamente come è stato fatto per
*       "Stream":
*
*           DoubleStream random = DoubleStream.generate(Math::random);
*           DoubleStream fractions = DoubleStream.iterate( .5, d -> d / 2 );
*           random.limit(3).forEach(System.out::println);
*           System.our.println();
*           fractions.limit(3).forEach(System.out::println);
*
*       Dal momento che i due stream sono infiniti, è stata aggiunta l'"Intermediate Operation"
*       "limit()" così che l'output non stampi valori all'infinito. Il primo stream chiama
*       il metodo static "random()" dell'oggetto "Math" per farsi restituire un numero
*       double casuale. Dal momento che i numeri random il vostro output sarà ovviamente
*       diverso. Il secondo stream continua a creare numeri sempre più piccoli dividendo ogni
*       volta il valore precedente per due:
*
*           0.07890654781186413
*           0.28564363465842346
*           0.6311403511266134
*           0.5
*           0.25
*           0.125
*
*       Non c'è bisogno di conoscere questo per l'esame ma la classe "Random" fornisce un
*       metodo per farsi restituire direttamente uno stream di numeri randomici. Per esempio,
*       "ints()" genera uno stream di primitive "int".
*       Quando si ha a che fare con primitive "int" o "long" è comune contare. Si supponga di
*       voler uno stream con i numeri da 1 a 5. Si potrebbe scrivere questo usando quello
*       che è stato spiegato prima:
*
*           IntStream count = IntStream.iterate( 1, n -> n +1 ).limit(5);
*           count.forEach(System.out::println);
*
*       Questo codice stampa i numeri da 1 a 5, uno per linea. Tuttavia è un mucchio di codice
*       per fare una cosa così semplice. Java fornisce un metodo in grado di generare una
*       serie di numeri:
*
*           IntStream range = IntStream.range(1, 6);
*           range.forEach(System.out::println);
*
*       Questo è molto meglio. Il metodo "range()" indica che si vogliono i numeri da 1 a 6,
*       escludendo il numero 6. Tuttavia, potrebbe essere ancora più chiaro. Si vogliono i
*       numeri da 1 a 5. Dovremmo essere in grado di digitare il numero 5, e possiamo farlo
*       nel seguente modo:
*
*           IntStream rangeClosed = IntStream.rangeClosed(1, 5);
*           rangeClosed.forEach(System.out::println);
*
*       Ancora meglio. Questa volta abbiamo espresso che si vuole un'intervallo chiuso
*       o intervallo inclusivo. Questo metodo si adatta meglio a come si esprime una serie di
*       numeri in Inglese semplice.
*       L'ultimo modo di creare uno "Stream" di primitive è mappandolo attraverso un altro
*       tipo di "Stream". La tabella 4.6 (pagine 207) mostra che esiste un metodo per il
*       mappaggio in uno "Stream" di primitive per qualsiasi tipo di "Stream".
*
*       - Mapping methods between types of Streams
*       ------------------------------------------------------------------------------
*       |   Source Stream   To Create   To Create       To Create       To Create    |
*       |   Class           Stream      DoubleStream    IntStream       LongStream   |
*       ------------------------------------------------------------------------------
*       |   Stream          map         mapToDouble     mapToInt        mapToLong    |
*       |                                                                            |
*       |   DoubleStream    mapToObj    map             mapToInt        mapToLong    |
*       |                                                                            |
*       |   IntStream       mapToObj    mapToDouble     map             mapToLong    |
*       |                                                                            |
*       |   LongStream      mapToObj    mapToDouble     mapToInt        map          |
*       ------------------------------------------------------------------------------
*
*       Ovviamente, devono essere di tipo compatibile affinché questo funzioni. Java richiede
*       una funzione di mappatura da fornire come parametro, per esempio:
*
*           Stream<String> objStream = Stream.of("penguin", "fish");
*           IntStream intStream = objStream.mapToInt( s -> s.length() );
*
*       Questa funzione prende un "Object" che in questo caso si tratta di una "String".
*       La funzione restituisce un "int". Le funzioni di mappatura sono intuitive. Prendono
*       il tipo sorgente e restituiscono il tipo di destinazione (target). In questo esempio,
*       il tipo di actual funzione è "ToIntFunction". La tabella 4.7 (pagina 208) mostra
*       i nomi delle funzioni di mapping. Come si può vedere, fanno quello che ci si aspetta:
*
*       - Function parameters when mapping between types of "Stream"
*       -------------------------------------------------------------------------------------
*       |   Source Stream   To Create   To Create           To Create       To Create       |
*       |   Class           Stream      DoubleStream        IntStream       LongStream      |
*       -------------------------------------------------------------------------------------
*       |   Stream          Function    ToDoubleFunction    ToIntFunction   ToLongFunction  |
*       |                                                                                   |
*       |   DoubleStream    Double      DoubleUnary         DoubleToInt     DoubleToLong    |
*       |                   Function    Operator            Function        Function        |
*       |                                                                                   |
*       |   IntStream       IntFunction IntToDouble         IntUnary        IntToLong       |
*       |                               Function            Operator        Function        |
*       |                                                                                   |
*       |   LongStream      Long        LongToDouble        LongToInt       LongUnary       |
*       |                   Function    Function            Function        Operator        |
*       -------------------------------------------------------------------------------------
*
*       Memorizza le due tabelle 4.6 e 4.7. Non è difficile come potrebbe sembrare.
*       Sono tre i pattern nei nomi se si ricordano con poche regole. Per la tabella 4.6 il metodo
*       di mapping verso lo stesso tipo di Stream da cui si parte (sorgente) si chiama sempre
*       "map()". Quando si restituisce uno "Stream" di oggetti il metodo è "mapToObject()".
*       Oltre a questo, è il nome del tipo della primitiva nel nome del metodo del mapping.
*       Per ricordare la tabella 4.7 invece inizia con il pensare al tipo di sorgente e al tipo
*       di target. Quando il tipo target è un'oggetto, salta al...
*       Quando la mappatura è verso lo stesso tipo della sorgente si usa un'operatore
*       unario invece di una funzione per gli "Stream" di primitive.
*
*       N.B: E' anche possibile creare uno "Stream" di primitive da uno "Stream" usando
*       "flatMapToDouble()", o "flatMapToLong()". Per esempio,
*
*           IntStream ints = list.stream()flatMapToInt( x -> IntStream.of(x) );
* */

public class CreatingPrimitiveStream {
}
