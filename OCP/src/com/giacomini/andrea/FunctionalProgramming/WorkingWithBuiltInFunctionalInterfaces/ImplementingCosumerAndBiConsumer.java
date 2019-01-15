package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces;

/**
 * Created by Andrea on 14/01/2019.
 */

/*
* N.B:  Si usa un "Consumer" quando si vuole fare qualcosa con un parametro ma non si vuole
*       ritornare nulla. "BiConsumer" fa la stessa cosa eccetto che prende due parametri.
*       Omettendo il metdo "default", le interfacce sono definite come si seguito:
*
*           @FunctionalInterface
*           public interface Consumer<T>{
*               void accpet(T t);
*           }
*
*           @FunctionalInterface
*           public interface BiConsumer<T, U>{
*               void accept(T t, U u);
*           }
*
*       Si è usato l'interfaccia "Consumer" nel capitolo 3 - "Generics And Collections"
*       con il "forEach". In Questo esempio in realtà è stato assegnato all'interfaccia
*       "Consumer":
*
*           Consumer<String> c1 = System.out::println;
*           Consumer<String> c2 = x -> System.out.println(x);
*
*           c1.accept("Annie");
*           c2.accept("Annie");
*
*       Questo esempio stampa la stringa "Annie" due volte. Si potrebbe notare che
*       gli esempi di "Consumer" hanno usato il "method reference" System.out::println.
*       Questo è OK, Java usa il contesto delle lambda expression per determinare quale
 *      metodo overloaded di "println()" dovrebbe essere chiamato.
 *      "BiConsumer" è chiamato con due parametri. Questi non devono essere dello stesso
 *      tipo. Per esempio, si potrebbe mettere una chiave e un valore in una mappa
 *      usando questa interfaccia:
 *
 *          Map<String, Integer> map = new HashMap();
 *          BiConsumer<String, Integer> b1 = map::put;                  // method reference
 *          BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);   // lambda expression
 *
 *          b1.accept("chicken", 7);
 *          b2.accept("chick", 1);
 *
 *          System.out.println(map);
 *
 *      L'output è {chicken=7, chick=1}, il quale mostra che entrambe le implementazioni di
 *      "BiConsumer" sono state chiamate. Questa volta si è usato un riferimento ad un metodo
 *      d'istanza visto che si vuole chiamare un metodo sulla variabile locale "map".
 *      E' anche la prima volta che si è passato due parametri ad un method reference.
 *      Il codice per instanziare "b1" è leggermente più corto del codice per istanziare
 *      "b2". Questp è probabilmente il perché l'esame è così concentrato sul "method references".
 *      In questo altro esempio, si usa lo stesso tipo di parametro:
 *
 *          Map<String, String> map = new HasMap<>();
 *          BiConsumer<String, String> b1 = map::put;
 *          BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);
 *
 *          b1.accept("chicken", "Cluck");
 *          b2.accept("chick", "Tweep");
 *
 *          System.out.println(map);
 *
 *       L'output è {chicken=Cluck, chick=Tweep} il quale mostra che un interfaccia funzionale
  *      "BiConsumer" può usare lo stesso tipo per entrambi i parametri generici "T" e "U".
 *
 *
* */

public class ImplementingCosumerAndBiConsumer {
}
