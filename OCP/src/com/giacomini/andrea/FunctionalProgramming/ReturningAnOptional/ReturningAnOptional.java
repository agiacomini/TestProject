package com.giacomini.andrea.FunctionalProgramming.ReturningAnOptional;

/**
 * Created by Andrea on 19/01/2019.
 */

/*
* N.B:  Supponiamo che si stia seguendo un corso introduttivo di Java e che si riceva
*       un punteggio di 90 e 100 nei primi due esami. Ora, se vi viene chiesta la media
*       dei vostri esami la risposta è 190/2 = 95.
*       Supponiamo invece adesso che si stia seguendo un secondo corso di Java, ancora però
*       nelle sue fasi iniziali. Se qualcuno chiede qual'è la nostra media sul corso in essere
 *      non possiamo rispondere perché non si è ancora sostenuto nessun esame. Non sarebbe
 *      corretto rispondere che la media è zero. Semplicemente, non ci sono ancora dati
 *      per fare questo tipo di calcolo, quindi non c'è ancora una media.
 *      Come è possibile esprimere questo concetto di risposta "non lo so" o "non è applicabile"
 *      in Java? Con Java 8 si è iniziato ad usare il tipo "Optional". Un "Optional" viene
 *      creato usando una factory. Si può richiedere sia un "Optional" vuoto o passare un valore
  *     per "Optional" da incartare/pacchettizzare.
  *     Si pensi ad un "Optional" come ad una scatola che potrebbe contenere qualcosa o che
  *     potrebbe invece essere vuota.
  *
  *     Figura 4.1 pagina 182 del libro.
  *
  *     Di seguito il metodo che calcola la media:
  *
  *         10: public static Optional<Double> average(int... scores){
  *         11:     if (scores.length == 0) return Optional.empty();
  *         12:     int sum = 0;
  *         13:     for (int score: scores) sum += score;
  *         14:     return Optional.of( (double) sum / scores.length );
   *        15: }
   *
   *    La linea 11 ritorna un "Optional" vuoto se non è possibile calcolare una media.
   *    La linea 12 e 13 somma il punteggio. Esiste anche un modo "functional programming"
   *    per fare questo calcolo, ma lo vedremo più avanti nel corso di questo capitolo.
   *    Infatti, l'intero metodo potrebbe essere scritto tutto su una linea.
   *    La linea 14 crea un oggetto "Optional" per pacchettizzare la media.
   *    Chiamando il metodo ci viene mostrato cosa c'è dentro le due scatole:
   *
   *        System.out.println(average(90,100));        // Optional[95.0]
   *        System.out.println(average());              // Optional.empty
   *
   *    Si può chiaramente vedere come un "Optional" contiene un valore e l'altro
   *    è vuoto. Normalmente, con un "Optional" si vuole controllare se un determinato valore
   *    è presente oppure prelevarlo dalla scatola. Di seguito un modo per fare questo:
   *
   *        20: Optional<Double> opt = average(90,100);
   *        21: if (opt.isPresent())
   *        22:     System.out.println(opt.get());      // 95.0
   *
   *    La linea 21 controlla se "Optional" in realtà contiene un valore. La linea 22 lo stampa.
   *    Ma cosa succederebbe se non fosse fatto un controllo sulla presenza o meno di un valore
   *    e l'oggetto "Optional" fosse vuoto.
   *
   *        26: Optional<Double> opt = average();
   *        27: System.out.println(opt.get());          // BAD
   *
   *    Si avrebbe un'eccezione dal momento che non ci sono valori all'interno di "Optional".
   *
   *        java.util.NoSuchElementException: No value present
   *
   *    Quando si crea un "Optional" è comune voler usare "empty" quando il valore è "null".
   *    Si può fare questo con un "if" statement o un'operaotre ternario. Usiao un'operatore
   *    ternario per ripassare come funziona:
   *
   *        Optional o = (value == null) ? Optional.empty : Optional.of(value);
   *
   *    Se "value" è "null", alla variabile di tipo "Optional" (o) viene assegnato "null".
   *    Altrimenti viene impacchettato il valore "value". Dal momento che questo è un patter
   *    comune, Java fornisce un metodo "factory" per fare la medesima cosa:
   *
   *        Optional o = Optional.isNullable(value);
   *
   *    Questo è un metodo "static" di "Optional" che si deve conosce.
   *    La tabella 4.2 (di seguito riportata - pagina 183) raggruppa molti dei metodo d'istanza
   *    di "Optional" che si deve conoscere per l'esame. Ci sono altri metodi che vedremo
   *    più avanti nel capitolo.
   *
   *
   *    "Optional" instance methods
   *    ------------------------------------------------------------------------
   *    |   Method                  When "Optional"     When "Optional"        |
   *    |                           is Empty            contains a Value       |
   *    ------------------------------------------------------------------------
   *    |   get()                   Throws an           return value           |
   *    |                           exception                                  |
   *    |                                                                      |
   *    |   ifPresent(Consumer c)   Does nothing        Call Consumer c        |
   *    |                                               with value             |
   *    |                                                                      |
   *    |   ifPresent()             Returns false       Returns true           |
   *    |                                                                      |
   *    |   orElse(T other)         Return other        Returns value          |
   *    |                           parameter                                  |
   *    |                                                                      |
   *    |   orElseGet(Supplier s)   Return result of    Return value           |
   *    |                           calling Supplier                           |
   *    |                                                                      |
   *    |   orElseThrow(Supplier s) Throws exception    Return value           |
   *    |                           created by calling                         |
   *    |                           Supplier                                   |
   *    |                                                                      |
   *    ------------------------------------------------------------------------
   *
   *    Si sono già visti i metodi "get()" e "ifPresent()". Gli altri metodi ci permettono
   *    di scrivere codice che usa un "Optional" su una sola riga piuttosto che dover
   *    usare l'operatore ternario. Questo rende il codice più facile da leggere.
   *    Invece di usare un "if statement", che abbiamo usato quando abbiamo controllato
   *    la media in precedenza, si può specificare una interfaccia "Consumer" da eseguire
   *    quando c'è un valore dentro ad "Optional". Quando non c'è, il metodo semplicemente
   *    salta l'esecuzione di "Consumer":
   *
   *        Optional<Double> opt = average(90,100);
   *        opt.ifPresent(System.out::println);
   *
   *    Usando il metodo d'istanza "ifPresent()" si esprimono meglio le nostre intenzioni.
   *    Si vuole fare qualcosa quando il valore è presente. Gli altri metodi ci permettono
   *    di specificare cosa fare se un valore non è presente. Ci sono tre scelte:
   *
   *        30: Optional<Double> opt = average();
   *        31: System.out.println( opt.orElse( Double.NaN ) );
   *        32: System.out.println( opt.orElseGet( () -> Math.random() ) );
   *        33: System.out.println( opt.orElseThrow( () -> new IllegalStateException() ) );
   *
   *    Queste righe stampano qualcosa del genere:
   *
   *        NaN
   *        0.49775932295380165
   *        Exception in thread "main" java.lang.IllegalStateException
   *            at optional.Average.lambda$3(Average.java:56)
   *            ...
   *
   *    La linea 31 mostra che si può ritornare un valore specifico o una variabile. Nel nostro
   *    caso, è stato stamapato un valore "Not a Number" (NaN).
   *    La linea 32 mostra l'uso di una interfaccia funzionale "Supplier" (fornitore, non prende
   *    parametri di input ma ritorna un valore in output) per generare un valore a run-time da
   *    ritornare all'evenienza.
   *    La linea 33 mostra l'uso di un differente tipo di "Supplier" per creare un'eccezione
   *    che dovrebbe essere lanciata.
   *    Si noti che i due metodi ("orElseGet" e "orElseThrow") che prendono in input un "Supplier"
   *    hanno nomi differenti.
   *    Si capisce perché questo codice non compila?
   *
   *        System.out.println( opt.orElseGet( () -> new IllegalStateException() ) );   // DOES NOT COMPILE
   *
   *    "opt" è un'oggetto "Optional<Double>". Questo significa che l'interfaccia funzionale
   *    "Supplier" deve ritornare un'oggetto "Double". Dal momento che questo "Supplier" ritorna
   *    una eccezione, il tipo di ritorno non match.
   *    L'ultimo esempio con "Optional" è veramente semplice. Cosa si pensa che faccia il seguente
   *    codice?
   *
   *        Optional<Double> opt = average(90,100);
   *        System.out.println( opt.orElse( Double.NaN ) );
   *        System.out.println( opt.orElseGet( () -> Math.random() ) );
   *        System.out.println( opt.orElseThrow( () -> new IllegalStateException() ) );
   *
   *    Stampa tre volte "95.0". Dal momento che il valore esiste, non c'è bisogno della logica "orElse".
* */

public class ReturningAnOptional {
}
