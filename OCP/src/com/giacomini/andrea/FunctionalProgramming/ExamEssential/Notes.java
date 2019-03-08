package com.giacomini.andrea.FunctionalProgramming.ExamEssential;

/**
 * Created by Andrea on 06/03/2019.
 */

/*
* N.B:  Le lambda expressione possono riferirsi a variabili statiche, variabili d'istanza,
*       parametri efficacemente final ed a variabili locali efficacemente final. Un'interfaccia
*       funzionale ha un singolo metodo abstract. Si devono conoscere le interfacce funzionali:
*
*           - Supplier<T>:          Method get() return T
*           - Consumer<T>:          Method accept(T t) return void
*           - BiConsumer<T,U>:      Method accept(T t, U u) return void
*           - Predicate<T>:         Method test(T t) return boolean
*           - BiPredicate<T,U>:     Method test(T t, U u) return boolean
*           - Function<T,R>:        Method apply(T t) return R
*           - BiFunction<T,U,R>:    Method apply(T t, U u) return R
*           - UnaryOperator<T>:     Method apply(T t) return T
*           - BinaryOperator<T>:    Method apply(T t1, T t2) return T
*
*       L'oggetto "Optional" può essere vuoto oppure memorizzare/archiviare un valore. E' possibile
*       controllare se contiene un valore con il metodo "isPresent()" e con il metodo "get()"
*       farsi restituire il valore stesso. Ci sono anche tre metodi che prendono interfacce
*       funzionali come parametri:
 *
 *          - "isPresent(Consumer c)",
 *          - "orElseGet(Supplier s)"
*           - "orElseThrow(Supplier s)"
*
 *      Esistono tre tipi opzionali per le primitive:
*
*           - OptionalDouble
*           - OptionalInt
*           - OptionalLong
*
*       Questi hanno i metodi (rispettivamente):
*
*           - getAsDouble()
*           - getAsInt
*           - getAsLong
*
*       Uno "Stream Pipeline" è composto di tre parti. La sorgente è richiesta e crea i dati
*       nello stream. Possono esserci una o più operazioni intermedie (Intermediate Operation)
*       che non vengono eseguite fino all'esecuzione dell'operazione terminale (Terminal Operation).
*       Esempi di operazioni intermedie sono "filter()", "flatMap()", e "sorted()". Esempi di
*       operazioni terminali includono "allMatch()", "count()" e "forEach()".
*       Esistono tre tipi di Stream di primitive:
*
*           - DoubleStream
*           - IntStream
*           - LongStream
*
*       In aggiunta ai metodi classici degli "Stream" questi stream di primitive hanno metodi come
*       "range()" e "rangeClosed()". La chiamata del metodo "range(1,10)" su uno Stream di tipo
*       "IntStream" e "LongStream" crea uno "Stream" di primitive da 1 a 9. Al contrario, il
*       metodo "rangeClosed(1,10)" crea uno "Stream" di primitive da 1 a 10.
*       Gli "Stream" di primitive hanno operazioni matematiche inclusi i metodi "average()", "max()" e
*       "sum()". Inoltre hanno il metodo "summaryStatistics()" per ottenere molte statistiche in una
*       chiamata sola. Ci sono anche interfacce funzionali specifiche per gli "Stream". Ad eccezione
*       di "BooleanSupplier", sono tutte per le primitive "double", "int" e "long".
*       E' possibile usare un "Collector" per trasformare uno "Stream" in una tradizionale "Collections".
*       E' possibile anche raggruppare campi per creare una mappa complessa in una riga sola.
*       Il partizionamento funziona allo stesso modo del ragruppamento, ad eccezione del fatto che
*       le chiavi sono sempre TRUE o FALSE. Una mappa partizionata ha sempre due chiavi anche se
*       il valore è vuoto.
*       Si dovrebbe ri-controllare le tabelle di questo capitolo. Si dovrebbe assolutamente memorizzare
*       la tabella 4.1 (Common Functional Interface). Si dovrebbe memorizzare la tabelle 4.6 (Mapping
*       methods between types of "Stream") e la tabella 4.7 (Function parameters when mapping between
*       types of "Stream"), ma si dovrebbe essere in grado di individuare quantomeno le imcompatibilità,
*       come le differenze di tipo, se non si riesce a memorizzare queste due tabelle.
*       Infine, si ricordi che gli "Stream" sono lazy evaluated. Prendono le lambda expressione o i
*       "method references" come parametri, che si verificano successivamente quando il metodo
*       viene eseguito.
*
* */

public class Notes {
}
