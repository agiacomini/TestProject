package com.giacomini.andrea.FunctionalProgramming.UsingStream;

/**
 * Created by Andrea on 25/01/2019.
 */

/*
* N.B:  E' possibile eseguire una "Terminal Operation" anche senza eseguire una "Intermediate
*       Operation", ma non il viceversa. Questo è il perché parleremo prima delle
*       "Terminal Operation". "Reductions" sono un tipo speciale di "Terminal Operation" dove
*       tutto il contenuto dello "Stream" viene combinato in una singola primitiva oppure
*       in un "Object". Per esempio, si potrebbe avere un "int" o una "Collection".
*       La tabella 4.4 (pagina 190) riassume questa sezione:
*
*       Terminal Stream Operations:
*       --------------------------------------------------------------------------
*       |   Method          What happens for        Reruen Value        Reduction   |
*       |                   infinite Streams                                        |
*       |---------------------------------------------------------------------------|
*       |   allMatch()      Sometimes terminate     boolean             NO          |
*       |   /anyMatch()                                                             |
*       |   /noneMatch()                                                            |
*       |                                                                           |
*       |   collect()       Does not terminate      Varies              YES         |
*       |                                                                           |
*       |   count()         Does not terminate      long                YES         |
*       |                                                                           |
*       |   findAny()       Terminates              Optional<T>         NO          |
*       |   /findFirst()                                                            |
*       |                                                                           |
*       |   forEach()       Does not terminate      void                NO          |
*       |                                                                           |
*       |   min()/max()     Does not terminate      Optional<T>         YES         |
*       |                                                                           |
*       |   reduce()        Does not terminate      Varies              YES         |
*       ----------------------------------------------------------------------------
*
*       - count()
*       Il metodo "count()" determina il numero di elementi in uno "Stream" finito.
*       Per uno "Stream" infinito invece si blocca. "count()" è una "Reduction"
*       perché controlla tutti gli elementi nello "Stream" e ritorna un singolo valore.
*       La firma del metodo è la seguente:
*
*           - long count()
*
*       Questo esempio mostra la chiamata del metodo "count()" su uno "Stream" finito.
*
*           Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
*           System.out.println(s.count());          // 3
*
*       - min() / max()
* */

public class UsingCommonTerminalOperations {
}
