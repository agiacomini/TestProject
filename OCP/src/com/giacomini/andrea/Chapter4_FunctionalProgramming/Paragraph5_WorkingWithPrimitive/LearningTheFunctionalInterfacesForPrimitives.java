package com.giacomini.andrea.FunctionalProgramming.WorkingWithPrimitive;

/**
 * Created by Andrea on 11/02/2019.
 */

/*
* N.B:  Ti ricordi quando ti è stato detto di memorizzare la tabella 4.1 (pagina 173 - Common functional
*       interfaces, capitolo "Working with Build-in Functional Interfaces") dove sono elencate
*       le più comuni interfacce funzionali, all'inizio di questo capitolo?
*       Stiamo per coinvolgerlo di più. Così come ci sono "Stream" speciali e classi "Optional",
*       ci sono iterfacce funzionali speciali.
*       Fortunatamente, molte di loro sono per le primitive di tipo "double", "int" e "long" che si sono
*       viste per gli "Streams" e le classi "Optional". C'è una eccezione, che è "BooleanSupplier".
*       La scopriremo in dettaglio prima di introdurre quelle per "double", "int" e "long".
*
*       - Functional Interfaces for boolean:
*       "BooleanSupplier" è un tipo separato. Ha un metodo da implementare:
*
*           boolean getAsBoolean();
*
*       Funziona proprio come ci si aspetta dalle interfacce funzionali, per esempio:
*
*           12: BooleanSupplier b1 = () -> true;
*           13: BooleanSupplier b2 = () -> Math.random() > .5;
*           14: System.out.println(b1.getAsBoolean());
*           15: System.out.println(b2.getAsBoolean());
*
*       Le linee 12 e 13 creano un "BooleanSupplier", la quale è l'unica interfaccia funzionale per
*       i boolean. La linea 14 strampa "true", dal momento che è il risultato di "b1".
*       La linea 15 stampa "true" o "false", a seconda del valore randomico generato.
*
*       - Functional Interfaces for "double", "int" and "long":
*       Molte delle interfacce funzionali sono per i tipi primitivi "double", "int" e "long" per
*       match con i tipi di "Stream" e le classi "Optional" viste in precedenza per le primitive.
*       La tabella 4.9 (pagina 211) mostra l'equivalente della tabella 4.1 (pagina 173) per queste
*       primitive. E' importante memorizzare anche questa tabella.
*
*       Common functional interfaces for primitives
*       ----------------------------------------------------------------------------------------
*       |   Functional Interface        #Parameters         Return type     Single Abstract    |
*       |                                                                   Method             |
*       ---------------------------------------------------------------------------------------
*       |   DoubleSupplier              0                   double          getAsDouble        |
*       |   IntSupplier                                     int             getAsInt           |
*       |   LongSupplier                                    long            getAsLong          |
*       |                                                                                      |
*       |   DoubleConsumer              1(double)           void            accept             |
*       |   IntConsumer                 1(int)                                                 |
*       |   LongConsumer                1(long)                                                |
*       |                                                                                      |
*       |   DoublePredicate             1(double)           boolean         test               |
*       |   IntPredicate                1(int)                                                 |
*       |   LongPredicate               1(long)                                                |
*       |                                                                                      |
*       |   DoubleFunction<R>           1(double)           R               apply              |
*       |   IntFunction<R>              1(int)                                                 |
*       |   LongFunction<R>             1(long)                                                |
*       |                                                                                      |
*       |   DoubleUnaryOperator         1(double)           double          applyAsDouble      |
*       |   IntUnaryOperator            1(int)              int             applyAsInt         |
*       |   LongUnaryOperator           1(long)             long            applyAsLong        |
*       |                                                                                      |
*       |   DoubleBinaryOperator        2(double,double)    double          applyAsDouble      |
*       |   IntBinaryOperator           2(int, int)         int             applyAsInt         |
*       |   LongBinaryOperator          2(long, long)       long            applyAsLong        |
*       ----------------------------------------------------------------------------------------
*
*       Ci sono alcune cose da notare che sono differenti tra la tabella 4.1 e la tabella 4.9:
*
*           - I "Generics" non ci sono più in alcune interfacce, dal momento che il nome del tipo
*           ci dice quale tipo di primitiva è coinvolta. In altri casi, come "IntFunction", solo
*           il tipo di ritorno "Generics" è necessario;
*           - Il singolo metodo abstract è spesso, ma non sempre, rinominato per riflettere il tipo
*           di primitiva coinvolta;
*           - "BiConsumer", "BiPredicate" e "BiFunction" non sono presenti nella tabella 4.9.
*           I progettisti delle API si sono attenuti alle operazioni più comuni. Per le primitive,
*           le funzioni con due diversi tipi di parametri semplicemente non sono usate spesso.
*
*       In aggiunta alla tabella equivalente 4.1 (pagina 173), alcune interfacce sono specifiche per
*       le primitive. La tabella 4.10 di seguito elenca proprio queste interfacce funzionali:
*
*       - Primitive-Specific functional interfaces
*       -----------------------------------------------------------------------------------------
*       |   Functional Interface        # Paramters     Retunr Type     Single Abstract         |
*       |                                                               Method                  |
*       -----------------------------------------------------------------------------------------
*       |   ToDoubleFunction<T>         1(T)            double          applyAsDouble           |
*       |                                                                                       |
*       |   ToIntFunction<T>                            int             applyAsInt              |
*       |                                                                                       |
*       |   ToLongFunction<T>                           long            applyAsLong             |
*       |                                                                                       |
*       |   ToDoubleBiFunction<T, U>    2(T, U)         double          applyAsDouble           |
*       |                                                                                       |
*       |   ToIntBiFunction<T, U>                       int             applyAsInt              |
*       |                                                                                       |
*       |   ToLongBiFunction<T, U>                      long            applyAsLong             |
*       |                                                                                       |
*       |   DoubleToIntFunction         1(double)       int             applyAsInt              |
*       |                                                                                       |
*       |   DoubleToLongFunction        1(double)       long            applyAsLong             |
*       |                                                                                       |
*       |   IntToDoubleFunction         1(int)          double          applyAsDouble           |
*       |                                                                                       |
*       |   IntToLongFunction           1(int)          long            applyAsLong             |
*       |                                                                                       |
*       |   LongToDoubleFunction        1(long)         double          applyAsDouble           |
*       |                                                                                       |
*       |   LongToIntFunction           1(long)         int             applyAsInt              |
*       |                                                                                       |
*       |   ObjDoubleConsumer<T>        2(T, double)    void            accept                  |
*       |                                                                                       |
*       |   ObjIntConsumer<T>           2(T, int)                                               |
*       |                                                                                       |
*       |   ObjLongConsumer<T>          2(T, long)                                              |
*       -----------------------------------------------------------------------------------------
*
*       Quale interfaccia funzionale si userebbe per riempire lo spazio bianco per rendere il codice
*       seguente compilabile?
*
*           double d = 1.0;
*           ------ f1 = x -> 1
*           f1.applyAsInt(d);                   // DoubleToIntFunction
*
*       Quando si trova una domanda di questo tipo è sempre meglio cercare degli indizzi. Si può
*       vedere che l'interfaccia funzionale in questione prende un parametro double e restituisce
*       un int. Si può anche vedere che ha un singolo metodo abstract chiamato "applyAsInt()".
*       Le interfacce funzionali che rispettano tutti e tre questi criteri sono "DoubleToIntFunction"
*       e "ToIntFunction"
*
* */

public class LearningTheFunctionalInterfacesForPrimitives {
}
