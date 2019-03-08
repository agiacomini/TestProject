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
*       Il pattern è lo stesso. Si passa un raccoglietore (collector) al metodo "collect()" e lui calcola
*       la media per noi. Questa volta, si ha bisogno di passare una funzione per dire al collezionista
*       su cosa fare la media. Si è usato un "Method Reference", il quale ritorna un "int" una volta
*       eseguito. Con gli "Stream" di primitive, il risultato di una media era sempre un "double",
*       indiffirentemente dal tipo degli elementi su cui si stava facendo la media. Per i raccoglitori si tratta
*       di un double visto che hanno bisogno di un "Object".
*       Spesso, ci si troverà ad interagire con codice che è stato scritto prima di Java 8. Questo significa
*       che ci si aspetta una "Collection" piuttosto che uno "Stream". Nessun problema. E' possibile
*       esprimersi ancora usando uno "Stream" e poi convertirlo in una "Collection" alla fine, per esempio:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           TreeSet<String> result = ohMy.filter( s -> s.startsWith("t") )
*                                    .collect(Collector.toCollection(TreeSet::new));
*           System.out.println(result);                     // [tigers]
*
*       Questa volta si hanno tutte e tre le parti dello "Stream" pipeline. "Stream.of()" è la sorgente per
*       lo "Stream". La "Intermediate Operation" è "filter()". Infine, la "Terminal Operation" è "collect()",
*       la quale crea un "TreeSet". Se non ci interessava l'implementazione dell'insieme (set), si avrebbe
*       anche potuto scrivere "Collectors.toSet()".
*       A questo punto, si dovrebbe essere in grado di usare tutti i raccoglitori (Collectors) descritti
*       nella tabella 4.11 (Examples of grouping/partitioning collectors) eccetto "groupingBy()", "mapping()",
 *      "partitioningBy()" e "toMap()".
*
*       - Collecting into Maps:
*       Il codice del Collector (raccoglitore) che comprende le mappe può diventare lungo. Lo costruiremo
*       lentamente. Assicuriamoci di aver capito ogni esempio prima di avanzare al prossimo. Iniziamo con
*       un semplice esempio per creare una mappa dallo stream:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<String, Integer> map = ohMy.collect( Collectors.toMap( s -> s, String::length ) );
*           System.out.println(map);                        // {lions=5, bears=5, tigers=6}
*
*       Quando si crea una mappa, si ha bisogno di specificare due funzioni. La prima funzione dice al
*       collezionista come creare la chiave. Nel nostro esempio, si è usata la "String" fornita come chiave.
*       La seconda funzione dice al collezionista come creare il valore. Nel nostro esempio, si è usato
*       la lughezza della "String" stessa come valore.
*       Ristituire lo stesso valore passato ad una lambda expression è una operazione comune, per questo Java
*       fornisce un metodo per questa attività. Si può scrivere "s -> s" come "Function.identity()". Non è
*       più corta dell'altra e può essere più o meno chiara, quindi si consiglia di usare la soluzione
*       più comprensibile per voi.
*       Ora si vuole fare il contrario e mappare la lunghezza del nome dell'animale al nome stesso. La nostra
*       prima soluzione è questa:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer, String> map = ohMy.collect( Collectors.toMap( String::length, k -> k ) );      // BAD
*
*       Esguendo questo pezzo di codice viene ritornata una eccezione simile alla seguente:
*
*           Exception in thread "main" java.lang.IllegalStateException: Duplicate key 5
*               at java.util.stream.Collectors.lambda$throwingMerger$114(Collectors.java:133)
*               at java.util.stream.Collectors$$Lambda$3/1044036744.apply (Unknown Source)
*
*       Cosa c'è di sbagliato? Due dei nomi degli animali hanno la stessa lunghezza. Noi non diciamo a
*       Java cosa fare. Il collezionista (collector) dovrebbe scegliere il primo che incontra? L'ultimo
*       che incontra? Concatenare i due? Dal momento che il collezionista (collector) non ha idea su
*       cosa fare, "risolve" il problema lanciando una eccezione e rendendolo il nostro problema. Quanto è
*       premuroso. Si supponga che il nostro requisiti sia quello di creare una "String" separata da virgola
*       con i nomi degli animali. Si potrebbe scrivere qualcosa del genere:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer, String> map = ohMy.collect(Collectors.toMap(
*               String::length, k -> k, (s1,s2) -> s1 + "," + s2 ));
*           System.out.println(map);                                    // {5=lions,bears 6=tigers}
*           System.out.println(map.getClass());                         // class java.util.HashMap
*
*       Succede che la mappa ritornata è un "HashMap". Il comportamento non è garantito. Supponiamo
*       che si volgia ordinare/mandare/autorizzare che il codice ritorni un "TreeMap" invece. Nessun
*       problema. Servireebbe solo aggiungere un riferimento a costruttore come parametro:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
*               String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new ));
*           System.out.println(map);                                    // {5=lions,bears, 6=tigers}
*           System.out.println(map.getClass());                         // class java.util.TreeMap
*
*       Questa volto si ottiene il tipo che si è specificato. Finora con noi? Questo codice è lungo
*       ma non particolarmente complicato. Vi avevamo promesso che il codice sarebbe stato lungo!
*
*
*
*       - Collecting Using Grouping, Partitioning and Mapping
*       Ora supponiamo che si voglia prendere un gruppo di nomi in funzione della loro lunghezza.
*       E' possibile fare questo dicendo che si vuole raggruppare per lunghezza:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
*           System.out.println(map);                                    // {5=[lions, bears], 6=[tigers]}
*
*       Il metodo "groupingBy()" del collezionista (collector) dice a "collect()" che dovrebbe raggruppare
*       tutti gli elementi dello "Stream" in una lista, organizzandoli in base alla funzione fornita.
*       Questo rende le chiavi nella mappa il valore della funzione e i valori (della mappa) i risultati
*       della mappa.
*       Supponiamo che non si volgia una "List" come il valore nella mappa e si preferisca invece un "Set".
*       Nessun problema. C'è un'altra firma di metodo che ci permette di passare "downstream collector".
*       Questo è un secondo collezionista che fa qualcosa di speciale con i valori:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer, Set<String>> map = ohMy.collect(
*               Collectors.groupingBy(String::length, Collectors.toSet()));
*           System.out.println(map);                                    // {5=[lions,bears], 6=[tigers]}
*
*       E' possibile anche cambiare il tipo della mappa restituita attraverso ancora un'altro parametro.
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           TreeMap<Integer, Set<String>> map = ohMy.collect(
*               Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
*           System.out.println(map);                                    // {5=[lions, bears], 6=[tigers]}
*
*       Questo è veramente flessibile. Che cosa succede se si vuole cambiare il tipo di mappa restituita
*       ma lasciare il tipo di valori da soli come lista? Non c'è un metodo per questo specificatamente
*       perché è facile abbastanza scrivere con quello che si ha:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           TreeMap<Integer, List<String>> map = ohMy.collect(
*               Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
*           System.out.println(map);
*
*       Il partizionamento è un caso speciale di raggruppamento. Con il partizionamento, ci sono solo due
*       possibili gruppi - vero e falso. Partizionare è come slittare (dividere) una lista in due parti.
*       Supponiamo che si stia facendo un segno per mettere fuori ogni esibizione di animale. Si hanno due
*       grandezze di segno. Una può ospitare nomi con cinque o meno caratteri. L'altra per i nomi più lunghi.
*       E' possibile partizionare la lista secondo quale segno si ha bisogno:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer, List<String>> map = ohMy.collect(
*               Collectors.partitioningBy( s -> s.length <= 5 ));
*           System.out.println(map);                                    // {false=[tigers], true=[lions,bears]}
*
*       Qui si è passato un "Predicate" con la logica per cui ogni nome di animale appartiene al gruppo.
*       Ora supponiamo che si è capito come usare un carattere diverso, e sette caratteri possono ora adattarsi
*       al segno più piccolo. Nessun problema. E' necessario solo cambiare il predicato:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Boolean, List<String>> map = ohMy.collect(
*               Collectors.partitioningBy( s -> s.length() <= 7 ));
*           System.out.println(map);                                    // {false=[], true=[lions, tigers, bears]}
*
*       Si noti come ci siano ancora due chiavi nella mappa - una per ogni valore "boolean". Succede cosi
*       che uno dei valori è una lista vuota, ma è ancora lì. Come per il metodo "groupingBy()" è possibile
*       cambiare il tipo della "List" con qualcos'altro:
*
*
*
*      N.B: - Debugging Complicated Generics: -----------------------------------------------------
*      Quando si lavora con il metodo "collect()" ci sono spesso molti livelli di generics che rendono gli errori
*      di compilazione inleggibili. Di seguito tre utili tecniche per trattare con questa situazione:
*
*           . Inizia con uno statement semple e poi continua ad aggiungerla. Facendo una piccola modifica
*             alla volta si saprà quale pezzo di codice avrà introdotto l'errore;
*           . Estrarre parti dello statement in statement separati. Per esempio, prova a scrivere
*
*                   Collectors.groupingBy(String::length, Collectors.counting());
*
*             Se compila si sa che il problema è altrove. Se non viene compilato invece si ha uno statement
*             molto più piccolo per la rioluzione del problema;
*
*          . Usa i generics wildcard per il tipo di ritorno dello statement finale, per esempio Map<?,?>.
*            Se questa modifica da sola permette la compilazione del codice, si sa allora che il problema
*            è che il tipo di ritorno non è quello che ci si aspetta;
*       -----------------------------------------------------------------------------------------------
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Boolean, Set<String>> map = ohMy.collect(
*               Collectors.partitioningBy( s -> s.length() <= 7, Collectors.toSet() ));
*           System.out.println(map);                                    // {false=[], true=[lions, tigers, bears]}
*
*       Diversamente da "groupingBy()" non è possibile cambiare il tipo di "Map" che viene ritornata.
*       Comunque, ci sono solo due chiavi nella mappa, quindi è davvero importante quale tipo di mappa
*       usare? Invece di usare il "collectr" a valle per specificare il tipo, è possibile usare uno dei tipi
*       di "collector" che si è già mostrato. Per esempio, è possibile raggruppare in base alla lunghezza
*       del nome dell'animale per vedere quanti per ogni lunghezza si hanno:
*
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(
*               String::length, Collectors.counting()));
*           System.out.println(map);                                    // {5=2, 6=1}
*
*       Infine, c'è un "mapping()" collector che ci permette di scendere di livello ed aggiungere
*       un'altro collector. Supponiamo che si volgia prendere la prima lettera del primo animale
*       in ordine alfabetico di ogni lunghezza. Perché? Forse per un compionamento casuale.
*       Anche gli esempi di questa parte dell'esame sono abbastanza artificiosi. Scriveremo
*       quanto segue:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer,Optional<Character>> map = ohMy.collect(
*               Collectors.groupingBy(
*                   String::length,
*                   Collectors.mapping( s -> s.chart(0),
*                       Collectors.minBy(Comparator.naturalOrder()))));
*           System.out.println(map);                                    // {5=Optional[b], 6=Optional[t]}
*
*       Non vi diremo che questo codice è facile da leggere. Vi diremo che è la cosa più
*       complicata che vi aspetterete di vedere all'esame. Confrontandolo con l'esempio
*       precedente si può notare come è stato sostituito il "Collectors.counting()" con il
*       "Collectors.mapping()". Si da il caso che "mapping()" prenda due parametri: la funzione
*       per il valore e come raggrupparlo ulteriormente. Si potrebbero vedere "collector()" usati
*       con uno static import per rendere il codice più corto. Questo significa che si potrebbe
*       vedere qualcosa del genere:
*
*           Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
*           Map<Integer, Optional<Character>> map = ohMy.collect(
*               groupingBy(
*                   String::length,
*                   mapping( s -> s.charAt(0),
*                       minBy(Comparator.naturalOrder()))));
*           System.out.println(map);                                // {5=Optional[b], 6=Optional[t]}
*
*       Questo codice fa esattamente la stessa cosa dell'esempio precedente. Questo significa che
*       è importante riconoscere il nome del collector perché si potrebbe non avere il nome
*       della classe "Collectors" per riconoscerli, come in questo ultimo caso.
*       C'è un altro collector chiamato "reducing()". Non c'è bisogno di saperlo per l'esame. Si tratta
*       di una riduzione generale nel caso in cui tutti i collectors precedenti non soddisfino
*       le vostre esigenze.
*
*
*
*
* */

public class CollectingResults {
}
