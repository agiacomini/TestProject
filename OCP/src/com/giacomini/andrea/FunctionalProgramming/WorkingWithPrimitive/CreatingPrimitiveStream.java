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
*       Questo codice stampa i numeri da 1 a 5
*
*
* */

public class CreatingPrimitiveStream {
}
