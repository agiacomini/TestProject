package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces;

/**
 * Created by Andrea on 15/01/2019.
 */

/*
* N.B:  Una "Function" è responsabile di trasformare un parametro in un valore
*       di tipo potenzialmente diverso, e di restituirlo. In modo simile, una
*       "BiFunction" è responsabile di trasformare due parametri in un valore
*       e di restituirlo. Omettendo qualsiasi metodo "default" o di tipo "static",
*       le interfacce sono definite come di seguito:
*
*           @FunctionalInterface
*           public interface Function<T, R>{
*               R apply(T t);
*           }
*
*           @FunctionalInterface
*           public interface BiFunction<T, U, R>{
*               R apply(T t, U u);
*           }
*
*       Per esempio, questa funzione trasforma una "String" alla lunghezza della
*       "String" stessa.
*
*           Function<String, Integer> f1 = String::length;
*           Function<String, Integer> f2 = x -> x.length();
*
*           System.out.println(f1.apply("cluck"));      // 5
*           System.out.println(f2.apply("cluck"));      // 5
*
*       Questa "Function" trasforma una "String" in un "Integer". Bene, tecnicamente
*       trasforma una "String" in una primitiva "int", sulla quale viene applicato
*       l'autoboxing e trasformata nel corrispondente oggetto wrapper "Integer".
*       Il tipo non deve essere differente.
*       Di seguito si combinano due oggetti "String" e se ne produce un'altro:
*
*           BiFunction<String, String, String> b1 = String::concat;
*           BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
*
*           System.out.println(b1.apply("baby","chick"));   // bacy chick
*           System.out.println(b2.apply("baby","chick"));   // bacy chick
*
*       I primi due tipi in "BiFunction" sono i tipi di input. Il terzo è il tipo
*       ritornato. Per il caso con il "method reference", il primo parametro è l'istanza
*       su cui il metodo "concat()" viene chiamato e il secondo parametro invece è
*       quello passato al metodo.
*
*
*       Creating your Own Functional Interface:
*       Java fornisce fornisce una versione "built-in" (integrata) dell'interfaccia
*       per funzioni con uno o due parametri. Cosa si ha bisogno in più? Nessun problema.
*       Supponiamo che si voglia creare una interfaccia funzionale per la velocità
*       delle ruote per ogni ruota di un triciclo. Si potrebbe creare un'interfaccia
*       funzionale come quella di seguito:
*
*           interface TriFunction<T, U, V, R>{
*               R apply(T t, U u, V v);
*           }
*
*       Ci sono quattro tipi di parametri. I primi tre forniscono i tipi di velocità
 *      delle tre ruote. Il quarto è il tipo di ritorno. Ora supponiamo che si voglia
 *      creare una funzione per determinare quanto veloce il vostro "quad-corter" sta
 *      andando data la potenza dei quattro motori. Si potrebbe creare una interfaccia
 *      funzionale come quella di seguito:
 *
 *          interface QuadFunction<T, U, V, W, R>{
 *              R apply(T t, U u, V v, W w);
 *          }
 *
 *      Qui ci sono cinque tipi di parametri. I primi quattro forniscono i tipi dei
 *      quattro motori. Idealmente questi tre dovrebbero essere dello stesso tipo, ma
 *      non si sa mai. Il quinto è ul tipo di ritorno.
 *
 *      Le interfacce "built-in" (integrate) di Java hanno lo scopo di facilitare
 *      le interfacce funzionali più comuni di cui avrete bisogno. Non si tratta
 *      affatto di un'elenc esaustivo. Ricordate che potete aggiungere qualsiasi
 *      interfaccia funzionale che volete, e Java li abbina quando usate le lambda
 *      expressiono o i "method references".
 *
*
*
* */

public class ImplementingFunctionAndBiFunction {
}
