package com.giacomini.andrea.FunctionalProgramming.WorkingWithAdvancedStreamPipelineConcepts;

/**
 * Created by Andrea on 16/02/2019.
 */

/*
* N.B:  Si è quasi finito di conoscere/imparare gli "Stream". L'ultimo argomento si base su ciò che si
*       è imparato finora per ragruppare i risultati. Probabilmente già in questo capitolo si è visto
*       l'uso della "terminal operation" "collect()". Ci sono molti raccoglietori predefiniti, inclusi
*       quelli mostrati nella tabella 4.11 seguente. Daremo uno sguardo ai differenti tipi di raccoglitori
*       nella seguente sezione.
*
*       - Examples of grouping/partitioning collectors
*       ----------------------------------------------------------------------------------------------------
*       |  Collector                                Description                 Return Value When Passed   |
*       |                                                                       to collect                 |
*       ----------------------------------------------------------------------------------------------------
*       |   averagingDouble(ToDoubleFunction f)     Calculate the average for   Double                     |
*       |   averagingInt(ToIntFunction f)           our three core primitive                               |
*       |   averagingLong(ToLongFunction f)         types.                                                 |
*       |                                                                                                  |
*       |   counting()                              Counts number of elements   Long                       |
*       |                                                                                                  |
*       |   groupingBy(Function f),                 Creates a map grouping by   Map<K, List<T>>            |
*       |   groupingBy(Function f, Collector dc)    the specified function                                 |
*       |   groupingBy(Function f, Supplier s,      with the optional type and                             |
*       |   Collector dc)                           optional downstream                                    |
*       |                                           collector                                              |
*       |                                                                                                  |
*       |   joining()                               Creates a single String     String                     |
*       |   joining(CharSequence cs)                using cs ad a delimiter                                |
*       |                                           between elements if one                                |
*       |                                           is specified                                           |
*       |                                                                                                  |
*       |   maxBy(Comparator c)                     Finds the lergest/smallest  Optional<T>                |
*       |   minBy(Comparator c)                     elements                                               |
*       |                                                                                                  |
*       |   mapping(Function f, Collector dc)       Add another level of        Collector                  |
*       |                                           collector                                              |
*       |                                                                                                  |
*       |   partitioningBy(Predicate p)             Create a map grouping by    Map<Boolean, List<T>>      |
*       |   partitioningBy(Predicate p,             the specified predicate                                |
*       |   Collector dc)                           with the optional further                              |
*       |                                           downstream collector                                   |
*       |                                                                                                  |
*       |   summarizingDouble(ToDoubleFunction f)   Calculates average, min,    DoubleSummaryStatistics    |
*       |   summarizingInt(ToIntFunction f)         max, and so on              IntSummaryStatistics       |
*       |   summarizingLong(ToLongFunction f)                                   LongSummaryStatistics      |
*       |                                                                                                  |
*       |   summingDouble(ToDoubleFunction f)       Calculates the sum for      Double                     |
*       |   summingInt(ToIntFunction f)             our three core primitive    Int                        |
*       |   summingLong(ToLongFunction f)           types                       Long                       |
*       |                                                                                                  |
*       |   toList()                                Creates an arbitrary type   List                       |
*       |   toSet()                                 of list or set              Set                        |
*       |                                                                                                  |
*       |   toCollection(Supplier s)                Creates a Collection of     Collection                 |
*       |                                           the specified type                                     |
*       |                                                                                                  |
*       |   toMap(Function k, Function v)           Creates a map using         Map                        |
*       |   toMap(Function k, Function v,           functions to map the                                   |
*       |   BinaryOperator m)                       keys, values, an optional                              |
*       |   toMap(Function k, Function v,           merge function, and an                                 |
*       |   BinaryOperator m, Supplier s)           optional type                                          |
*       ----------------------------------------------------------------------------------------------------
*
*       - Collecting Using Basic Collectors
*       Fortunatamente, molti di questi Collector funzionano allo stesso modo. Diamo uno sguardo all'esempio:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           String result = ohMy.collect(Collectors.joining("", ""));
*           System.out.println(result);                                           // lions, tigers, bears
*
*       Si noti come i collector predifiniti sono nella classe "Collectors" piuttosto che nell'interfaccia
*       "Collector". Questa è una situazione molto comune, che si è già visto anche con "Collections" Vs
*       "Collection". Si passa il collettore predefinito "joining()" al metodo "collect()". Tutti gli elementi
*       dello stream vengono mergiati in una "String" con il delimitatore specificato tra una stringa e l'eltra.
*       E' molto importante passare al "Collector" al metodo "collect()". Esiste per aiutare a raccogliere gli
*       elementi. Un "Collector" non fa niente da solo.
*       Porviamone un'altro. Qual'è la lunghezza media dei tre nomi degli animali?
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Double result = ohMy.collect(Collectors.averageInt(String::length));
*           System.out.println(result);                                           // 5.33333333333
*
* */

public class CollectingResults {
}
