package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces;

/**
 * Created by Andrea on 12/01/2019.
 */

/*
* N.B:  Un'interfaccia funzionale ha esattamente ha esattamente un metodo abstract.
*       Tutte le interfacce funzionali della tabella qui di seguito (Tabella 4.1, pag 173)
*       sono state introdotte in Java 8 e vengono fornite all'interno del package "java.util.function".
*       La convenzione è usare il tipo generico "T" come tipo di parametro. Se è necessario un secondo
*       parametro, la lettera successiva che viene usata è "U". Se è necessario ritornare un diverso
*       tipo di parametro, allora viene usato "R" come tipo generico di ritorno.
*
*       Common Functional Interface:
*       ------------------------------------------------------------------------------------|
*       |Functional Interface    # Parameters    Return Type     Single Abstract Method     |
*       ------------------------------------------------------------------------------------|
*       |                                                                                   |
*       |   Supplier<T>             0               T               get                     |
*       |                                                                                   |
*       |   Consumer<T>             1 (T)           void            accept                  |
*       |                                                                                   |
*       |   BiConsumer<T, U>        2 (T,U)         void            accept                  |
*       |                                                                                   |
*       |   Predicate<T>            1 (T)           boolean         test                    |
*       |                                                                                   |
*       |   BiPredicate<T, U>       2 (T, U)        boolean         test                    |
*       |                                                                                   |
*       |   Function<T, R>          1 (T)           R               apply                   |
*       |                                                                                   |
*       |   BiFunction<T, U, R>     2 (T, U)        R               apply                   |
*       |                                                                                   |
*       |   UnaryOperator<T>        1 (T)           T               apply                   |
*       |                                                                                   |
*       |   BinaryOperator<T>       2 (T, T)        T               apply                   |
*       |-----------------------------------------------------------------------------------|
*
*       Molte altre interfacce funzionali sono definite all'interno del package "java.util.Function".
*       Vengono usate per lavorare con le primitive, e le vedremo più avanti nel capitolo.
*       Bisogna memorizzare questa tabella. Vedremo molti usi pratici in questa sezione per
*       aiutare l'assimilamento di questi nuovi concetti. Il più delle volte non si assegnano realmente
*       l'implementazione dell'interfaccia ad una variabile. Il nome dell'interfaccia è sotttinteso/implicito
*       e quello che prende viene passato direttamente al metodo che ne ha bisogno.
*       Si stanno introducendo i nomi delle interfacce così che si possa capire meglio e ricordare cosa
*       sta succedendo. Una volta raggiunta la parte del capitolo relativa agli stream, si suppone che
*       l'utente abbia ben chiaro questo concetto e smetta di creare la variabile di intermediazione.
*       Come si è già visto nel capitolo 2 "Design Patterns And Principles", si può assegnare un
*       nome qualsiasi all'interfaccia funzionale. Gli unici requisiti sono che deve essere un nome di
*       interfaccia valido e che contenga un singolo metodo abstract. La tabella vista qui sopra è
*       significativa perché queste interfacce funzionali vengono spesso usate negli stream ed in altre
*       classi che vengono con Java. Questo è il motivo principale per cui bisogna conoscerle e tenerle
*       bene a mente per l'esame.
*
*       NOTE: Come si vedrà nel capitolo 7 "Concurrency", esiste un'interfaccia chiamata "Runnable".
*             Viene usate per la concorrenza il più delle volte. Comunque/Tuttavia, potrebbe comparire nell'esame
*             quando ci viene chiesto di riconoscere quale interfaccia funzionale utilizzare. Tutto quello
*             che c'è bisogno di sapere è che "Runnable" non prende nessun parametro, ritorna qualsia tipo o
*             usa generics.
*
*       Diamo uno sguardo a come si implementano ognuna di queste interfacce funzionali. Dal momento che sia
*       le lambda expression che i "method references" appaiono dappertutto, dove possibile mostriamo una
*       implementazione utilizzando entrambi.
*
*
* */
public class WorkingWithBuiltInFunctionalInterfaces {
}
