package com.giacomini.andrea.FunctionalProgramming.WorkingWithPrimitive;

/**
 * Created by Andrea on 06/02/2019.
 */

/*
* N.B:  All'inizio del capitolo è stato scritto un metodo per calcolare la media di un
*       array di int "int[]" e si è promesso di riportarne uno migliore dopo. A questo punto
*       dopo quello che si è imparato sugli "Stream" di primitive, si può calcolare la media
*       su una sola riga:
*
*           IntStream stream = IntStream.rangeClosed(1,10);
*           OptionalDouble optional = stream.average();
*
*       Il tipo di ritorno non è l'"Optional" che si è abituati ad usare. E' un nuovo tipo
*       chiamato "OptionalDouble". Perché si ha un tipo separato a parte, vi chiederete
*       perché? Perché non usare semplicemente "Optional<Double>"? La differenza è che
*       "OptionalDouble" è per una primitiva e Optional<Double> è per la classe Wrapper
*       "Double". Lavorare con la classe "OptionalDouble" sembra simile a lavorare con
*       la classe Optional:
*
*           optional.ifPresent(System.out::println);
*           System.out.println(optional.getAdDouble());
*           System.out.println(optional.orElseGet( () -> Double.NaN ));
*
*       L'unica differenza degna di nota è che si è chiamato il metodo "getAdDouble()"
*       piuttosto che "get()". Questo rende chiaro il fatto che stiamo lavornado con delle
*       primitive. Inoltre, il metodo "orElseGet()" prende un "DoubleSupplier" invece di un
*       "Supplier".
*       Come per gli "Stream" di primitive, ci sono tre tipi specifici di classe per le
*       primitive. La tabella 4.8 (pagina 209) mostra le differenze minime tra queste tre.
*       Non si sarà sorpresi nel capire che si richiede di memoriarla anche questa tabella.
*       E' facile da ricordare dal momento che l'unica cosa che cambia è il nome delle
*       primitiva. Come ci si dovrebbe ricordare dal capitolo delle "Terminal Operations"
*       una serie di metodi di "Stream" ritorna un oggetto Optional come i metodi
*       "min()" o "findAny()". Ognuno di questi ritorna il corrispondente tipo opzionale.
*       Anche l'implementazione degli "Stream" di primitive aggiunge due nuovi metodi che si
*       devono conoscere. Il metodo "sum()" non ritorna un Optional. Se si prova ad aggiungere
*       uno "Stream" vuoto, si avrà semplicemente zero come risultato. Il metodo "average()"
*       ritorna sempre un "OptionalDouble", dal momento che una media può potenzialmente
*       avere dati frazionari per qualsiasi tipo.
*
*       - Optional Types For Primitives
*       ------------------------------------------------------------------------------------
*       |                       OptionalDouble      OptionalInt             OptionalLong   |
*       |----------------------------------------------------------------------------------|
*       |   Getting as a        getAsDouble()       getAsInt()              getAsLong()    |
*       |   primitive                                                                      |
*       |                                                                                  |
*       |   orElseGet()         DoubleSupplier      IntSupplier             LongSupplier   |
*       |   parameter type                                                                 |
*       |                                                                                  |
*       |   Return type of      OptionalDouble      OptionalInt             OptionalLong   |
*       |   max()                                                                          |
*       |                                                                                  |
*       |   Return type of      double              int                     long           |
*       |   sum()                                                                          |
*       |                                                                                  |
*       |   Retunr type of      OptionalDouble      OptionalDouble          OptionalDouble |
*       |   average()                                                                      |
*       |----------------------------------------------------------------------------------|
*
*       Proviamo con un'esempio per essere sicuri di aver capito:
*
*           5: LongStream longs = longStream.of(5, 10);
*           6: long sum = longs.sum();
*           7: System.out.println(sum);                                         // 15
*           8: DoubleStream doubles = DoubleStream.generate( () -> Math.PI );
*           9: OptionalDouble min = doubles.min();                              // esegue all'infinito
*
*       La linea 5 crea uno "Stream" di primitive "long" con due elementi. La linea 6 mostra che
*       non usiamo un'opzionale per calcolare la somma. La linea 8 crea uno "Stream" infinito
*       di primitive "double". La linea 9 è li per ricordarci che una domanda riguardo il codice che
*       viene eseguito all'infinito può apparire anche con gli "Stream" di primitive.
*
*
* */

public class UsingOptionalWithPrimitiveStreams {
}
