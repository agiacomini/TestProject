package com.giacomini.andrea.FunctionalProgramming.WorkingWithPrimitive;

/**
 * Created by Andrea on 11/02/2019.
 */

/*
* N.B: Si è imparato abbastanza per essere in grado di recuperare il valore massimo da uno "Stream"
*      di primitive "int". Se lo "Stream" è vuoto, allora si vuole lanciare una eccezione:
*
*           private static int max(IntStream ints){
*
*               OptionalInt optional = ints.max();
*               return optional.orElseThrow(RuntimeException::new);
*           }
*
*       Questo dovrebbe essere ormai chiaro come codice. Abbiamo un "OptionalInt" perché si ha un
*       "IntStream". Se l'optional contiene un valore viene ritornato. Altrimenti, viene lanciata la
*       creazione di una nuova "RuntimeException".
*       Vogliamo ora cambiare il metodo in modo che prenda in input un "IntStream" e ritorni un range.
*       Il "range" è il valore minimo sottratto dal valore massimo. Uh-no!!! Sia "min()" che "max()"
*       sono "Terminal Operations", il che significa che usano lo "Stream" quando sono in esecuzione.
*       Non è possibile eseguire due "Terminal Operations" sullo stesso "Stream". Fortunatamente, questo
*       è un problema comune e lo "Stream" di primitive lo risolve per noi con "summary statistics".
*       "Statistics" è solo una grossa parola per un numero che è stato calcolato dai dati.
*
*           private static int range(IntStream ints){
*
*               IntSummaryStatistics stats = ints.summaryStatistics();
*               if(stats.getCount() == 0) throw new RuntimeException();
*               return stats.getMax() - stats.getMin();
*           }
*
*       Qui si è chiesto a Java di eseguire molti calcoli sullo "Stream". Tra questi sono stati inclusi
*       il minimo, il massimo, la media, la grandezza e il numero dei valori nello "Stream".
*       Se lo "Stream" fosse stato vuoto, si avrebbe avuto un count pari a zero. Altrimenti, è possibile
*       prendere il minimo e il massimo dalla somma.
* */

public class SummarizingStatistics {
}
