package com.giacomini.andrea.FunctionalProgramming.WorkingWithAdvancedStreamPipelineConcepts;

/**
 * Created by Andrea on 14/02/2019.
 */

/*
* N.B:  Quale pensi che sia l'output del codice seguente:
*
*           25: List<String> cats = new ArrayList<>();
*           26: cats.add("Annie");
*           27: cats.add("Ripley");
*           28: Stream<String> stream = cats.stream();
*           29: cats.add("KC");
*           30: System.out.println(stream.count());
*
*       La risposta corretta è 3. Le linee 25-27 creano una "List" con due elementi. La linea 28
*       richiede che sia creato uno "Stream" a partire da quella lista. Si ricordi che gli "Stream"
*       sono "lazily evaluated". Questo significa che gli "Stream" non sono in realtà creati sulla linea
*       28. Un'oggetto viene creato che conosce dove cercare il dato quando ne ha bisogno. Sulla linea
*       29, la "List" prende un nuovo elemento. Sulla linea 30, lo stream pipeline in realtà viene eseguito.
*       Lo stream pipeline prima viene eseguito, da uno sguardo alla sorgente e vede tre elementi.
* */

public class LinkingStreamsToTheUnderlyingData {
}
