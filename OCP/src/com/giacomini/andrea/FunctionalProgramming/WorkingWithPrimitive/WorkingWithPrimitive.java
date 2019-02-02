package com.giacomini.andrea.FunctionalProgramming.WorkingWithPrimitive;

/**
 * Created by Andrea on 02/02/2019.
 */

/*
* N.B:  Fino ad ora, si è usato le classi "Wrapper" quando si aveva bisogno di usare le primitive
*       all'interno degli "Stream". Si è fatto questo con le API "Collections" in modo che sembrasse naturale.
*       Con gli "Stream", esistono degli equivalenti che funzionano con le primitive "int", "double" e "long".
*       Diamo uno sguardo sul perché c'è bisogno di questo. Si supponga che si voglia calcolare la somma
*       di numeri in uno "Stream" finito:
*
*           Stream<Integer> stream = Stream.of(1, 2, 3);
*           System.out.println(stream.reduce( 0, (s,n) -> s + n ));
*
*       Non male. Non è stato difficile scrivere una riduzione. Si è iniziato l'accumulatore con zero. Poi si è
*       aggiunto ogni numero al totale in corso così come è uscito dallo "Stream". C'è un'altro modo per farlo:
*
*           Stream<Integer> stream = Stream.of(1, 2, 3);
*           System.out.println(stream.mapToInt( x -> x ).sum());
*
*       Questa volta lo Stream<Integer> è stato convertito in uno "IntStream" ed è stato chiesto ad "IntStream"
*       di calcolare la somma per noi. Gli "Stream" di primitive sanno come eseguire automaticamente alcune
*       delle operazioni più comuni.
*       Finora, questa sembra una bella/buona convenzione ma non particolarmente importante. Ora si pensi a
*       come si calcola una media. Si deve dividere la somma per il numero degli elementi. Il problema è che
*       lo "Stream" permette un solo passaggio. Java però sa che il cacolo delle media è un'operazione molto comune
*       e per questo motivo fornisce un metodo per calcolare la media sulla classe "Stream" di primitive:
*
*           IntStream intStream = IntStream.of(1, 2, 3);
*           OptionalDouble avg = intStream.average();
*           System.out.println(avg.getAsDouble);
*
*       Non solo è possibile calcolare la media, ma è anche facile farlo. E' chiaro che gli "Stream" di primitive
*       sono importanti. Esamineremo la creazione e l'utilizzo di tali "Stream", inclusi gli "Optional" e le interfacce
*       funzionali.
* */

public class WorkingWithPrimitive {
}
