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
*       - count():
*       Il metodo "count()" determina il numero di elementi in uno "Stream" finito.
*       Per uno "Stream" infinito invece si blocca. "count()" è una "Reduction"
*       perché controlla tutti gli elementi nello "Stream" e ritorna un singolo valore.
*
*       La firma del metodo è la seguente:
*
*           - long count()
*
*       Questo esempio mostra la chiamata del metodo "count()" su uno "Stream" finito.
*
*           Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
*           System.out.println(s.count());          // 3
*
*       ----------------------------------------------------------------------------------------------------------------
*
*       - min() / max():
*       I metodi "min()" e "max()" permettono di passare un comparatore personalizzato e trovare
*       il valore più piccolo o più grande all'interno di uno "Stream" finito secondo quell'
*       ordine di ordinamento. Come "count()", i metodi "min()" e "max()" rimangono in attesa su uno
*       "Stream" infinito perché non possono essere sicuri che non ci siano dopo valori più piccoli
*       o più grandi nello "Stream". Entrambi i metodi sono "Reduction" perché ritornano un singolo
*       valore dopo aver dato un'occhiata all'intero "Stream".
*
*       Le firme dei metodi sono le seguenti:
*
*           - Optional<T> min(Comparator<? super T> comparator)       // ?? Lower bound wildcard ??
*           - Optional<T> max(Comparator<? super T> comparator)
*
*       Questo esempio trova/restituisce l'animale (String) con il minor numero di lettere nel proprio nome:
*
*           Stream<String> s = Stream.of("monkey", "ape", "bonobo");
*           Optional<String> min = s.min((s1, s2) -> s1.length() - s2.lenght());
*           min.ifPresent(System.out::println);                                         // ape
*
*       Si noti che il codice ritorna un "Optional" piuttosto che il valore. Questo permette al metodo
*       di specificare di non aver trovato un minimo o un massimo. Si usa poi un metodo "Optional" (ifPresent())
*       ed un "method reference" per stampare il minimo solo se un minimo viene trovato.
*       Come esempio di "Stream" dove non c'è un minimo si dia un'occhiata ad uno "Stream" vuoto:
*
*           Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
*           System.out.println(minEmpty.isPresent());                                   // FALSE
*
*       Dal momento che lo "Stream" è vuoto il comparatore non viene mai chiamato e nessun
*       valore è presente in "Optional".
*
*       -----------------------------------------------------------------------------------------------------------------
*
*       - findAny() / findFirst():
*       I metodi "findAny()" e "findFirst()" ritornano un elemento dello "Stream" a meno che lo "Stream"
*       sia vuoto. Se lo "Stream" è vuoto, i due metodi ritornano un "Opztional" vuoto.
*       Questo è il primo metodo che vediamo che funziona anche con uno "Stream" infinito. Dal momento
*       che Java genera solo la quantità di "Stream" di cui si ha bisogno, lo "Stream" infinito necessita
*       di generare solo un elemento. Il metodo "findAny()" è utile quando si lavora con uno "Stream"
*       parallelo. Da a Java la flessibilità di ritornare, come primo elemento, uno qualsiasi degli
*       elementi che compongono lo "Stream", piuttosto che necessariamente quello che sta in prima
*       posizione in base alle "Intermediate Operations".
*       Questi metodi sono "Terminal Operations" ma non sono "Reduction". La ragione è che qualche
*       volta ritornano senza avere processato tutti gli elementi. Questo significa che ritornano un
*       valore basato sullo "Stream" ma non riducono l'intero "Stream" ad un valore.
*
*       Le firme dei metodi sono le seguenti:
*
*           - Optional<T> findAny();
*           - Optional<T> findFirst();
*
*       In questo esempio si trova un animale:
*
*           Stream<String> s = Stream.of("monkey", "gorilla", "bonono");
*           Stream<String> infinite = Stream.generate( () -> "chimp" );     ?? Genera uno "Stream" infibito ??
*           s.findAny().ifPresent(System.out::println);                     // monkey
*           infinite.findAny().ifPresent(System.out::println);              // chimp
*
*       Trovare un qualsiasi match (corrsipondenza) è più utile di quanto sembri. A volte
*       si vuole solo campionare i risultati e ottenere un elemento rappresentativo, ma
*       non abbiamo bisogno di sprecare eleborazione generandoli tutti. Dopo tutto,
*       se si ha intenzione di lavorare con un solo elemento perché preoccuparsi di
*       guardarli tutti?
*
*       -----------------------------------------------------------------------------------------
*
*       - allMatch(), anyMatch() and noneMatch():
*       I metodi "allMatch()", "anyMatch()" e "noneMatch()" cercano in uno "Stream" e ritornano
*       informazioni riguardo come lo "Stream" si attiene rispetto al predicato.
*       Questi possono o non possono termnare per cicli infiniti. Dipende dai dati.
*       Come i metodi di ricerca, non sono "Reduction" perché non guardano necessariamente tutti
*       gli elementi.
*
*       Le firme dei metodi sono le seguenti:
*
*           - boolean anyMatch(Predicate <? super T> predicate)
*           - boolean allMatch(Predicate <? super T> predicate)
*           - boolean noneMatch(Predicate <? super T> predicate)
*
*       Questo esempio controlla se i nomi degli animali iniziano con lettere:
*
*           List<String> list = Array.asList("monkey", "2", "chimp");
*           Stream<String> infinite = Stream.generate( () -> "chimp" );         ?? Genera uno "Stream" infibito ??
*           Predicate<String> pred  = x -> Character.isLetter(x.charAt(0));
*           System.out.println(list.stream().anyMatch(pred));                   // TRUE
*           System.out.println(list.stream().allMatch(pred));                   // FALSE
*           System.out.println(list.stream().noneMatch(pred));                  // FALSE
*           System.out.println(infinite.anyMatch(pred));                        // TRUE
*
*       Questo esempio mostra come possiamo ri-utilizzare lo stesso predicato, ma di come
*       abbiamo bisogno di un differente "Stream" ogni volta.
*       "anyMatch()" ritorna TRUE perché due dei tre elementi hanno un match con il predicato.
*       "allMatch()" ritorna FALSE perché un elemento dello "Stream" non match con il predicato.
*       Anche "noneMatch()" ritorna FALSE perché c'è un elemento che match con il predicato.
*       Sullo "Stream" infinito viene trovato un match, così la chiamata termina. Se si fosse chiamato
*       "noneMatch()" o un "allMatch()" al posto di "anyMatch()" l'esecuzione continuerebbe
*       fino a quando non si uccide "kill" il programma.
*
*       N.B: Ricordarsi che "anyMatch", "allMatch" e "noneMatch" ritornao tutti e tre un boolean (primitva).
*            Al contrario i metodi di ricerca ritornano un "Optional" perché ritornano un
*            elemento dello "Stream".
*
*       ------------------------------------------------------------------------------------------
*
*       - forEach():
*       E' disponibile anche il costrutto per i cicli. Come ci si potrebbe aspettare, chiamando
*       "forEach()" su uno "Stream" infinito, il ciclo non termina mai. Dal momento che non c'è
*       un valore di ritorno, non è una "Reduction".
*       Prima di utilizzarlo, considerare se esiste un altro approccio migliore. Gli sviluppatori
*       che hanno imparato a scrivere cicli per primi tendono ad utilizzarli per tutto. Per esempio,
*       un ciclo con un "if statement" dovrebbe essere un filtro.
*
*       La firma del metodo è la seguente:
*
*           - void forEach(Consumer <? super T> action)
*
*       Si noti che questa è la sola "Terminal Operation" con un tipo di ritorno vuoto.
*       Se si vuole che succeda qualcosa, bisogna farlo accadere nel ciclo. Di seguito un modo per
*       stampare gli elementi dello "Stream". Ci sono anche altri modi, che scopriremo dopo
*       nel resto del capitolo.
*
*           Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
*           s.forEach(System.out::println);                                 // method reference
*
*       N.B: Si ricordi che si può chiamare il metodo "forEach()" direttamente su una "Collection"
*            o su uno "Stream" come nell'esempio precedente. Non confonderli all'esame quando
*            si vedranno entrambi gli approcci.
*
*       Si noti che non si può usare un ciclo "for" tradizionale su uno "Stream":
*
*           Stream s  = Stream.of(1);
*           for (Integer i : s) {}              // DOES NOT COMPILE
*
*       Anche se "forEach()" suona come un ciclo, in realtà è un "Terminal Operator" per gli "Stream".
*       Gli "Stream" non possono usare i cicli tradizionali perché non implementano l'interfaccia
*       "Iterable".
*
*       ----------------------------------------------------------------------------------------
*
*       - reduce():
*       Il metodo "reduce()" combina/mescola uno "Stream" in un singolo oggetto. Come si può capire
*       dal nome, si tratta di una riduzione "Reduction". Le firme dei metodi sono le seguenti:
*
*           - T reduce(T entity, BinaryOperation<T> accumulator)
*           - Optional<T> reduce(BinaryOperation<T> accumulator)
*           - <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperation<U> combiner)
*
*       Prendiamone uno alla volta. Il modo più comune di fare una riduzione è iniziare
*       con un valore iniziale e continuare a fonderlo (merge) con il valore successivo.
*       Si pensi a come si può concatenare un'array di "String" in una singola "String" senza
*       la programmazione funzionale. Potrebbe assomigliare a qualcosa del genere:
*
*           String[] array = new String[] {"w", "o", "l", "f"};
*           String result = "";
*           for (String s : array) result = result + s;
*           System.out.println(result);                                 // wolf
*
*       Il valore iniziale di una stringa vuota è l'identità. L'accumulatore combina il risultato
*       corrente con la "String" corrente. Con le "lambda expression" è possibile fare la stessa
*       cosa con uno "Stream" e "Reduction".
*
*           Stream<String> stream = Stream.of("w", "o", "l", "f");
*           String word = stream.reduce( "", (s, c) -> s + c );
*           System.out.println(word);                                   // wolf
*
*       Si noti come abbiamo ancora la "String" vuota come entità. Concateniamo ancora la "String"
*       con il valore successivo. E' possibile ri-scrivere il pezzo di codice precedente usando
*       il "method reference":
*
*           Stream<String> stream = Stream.of("w", "o", "l", "f");
*           String word = stream.reduce("", String::concat);
*           System.out.println(word);                                   // wolf
*
*       Proviamone un'altro. E' possibile scrivere una "Reduction" per moltiplicare tutti
*       gli oggetto Integer di uno "Stream"? Proviamo. La nostra soluzione è questa:
*
*           Stream<Integer> stream = Stream.of(3, 5, 6);
*           System.out.println(stream.reduce(1, (a, b) -> a*b ));       // 90
*
*       E' stata settata a 1 l'identità e l'accumulatore alla moltiplicazione. In molti casi,
*       l'identità non è realmente necessaria, per questo motivo Java ci permette di ometterla.
*       Quando non si specifica una identità, viene ritornato un "Optional" perché potrebbe
*       non esserci nessun dato. Ci sono tre scelte possibili per ciò che può essere/assumere l'"Optional":
*
*           - Se lo "Stream" è vuoto, viene ritornato un "Optional" vuoto;
*           - Se lo "Stream" ha un'elemento, viene ritornato;
*           - Se lo "Stream" ha valori multipli, viene applicato l'accumulatore per combinarli;
*
*       Di seguito vengono illustrati ognuno di questi scenari:
*
*           BinaryOperation<Integer> op = (a, b) -> a * b;
*           Stream<Integer> empty = Stream.empty();
*           Stream<Integer> oneElement = Stream.of(3);
*           Stream<Integer> threeElements = Stream.of(3, 5, 6);
*
*           N.B: la variabile "op" viene chiamata "variabile di intermediazione";
*
*           empty.reduce(op).ifPresent(System.out::println);        // no output
*           oneElement.reduce(op).ifPresent(System.out::println);   // 3
*           threeElement.reduce(op).ifPresent(System.out::println); // 90
*
*           N.B: il metdo "ifPresent()" è un metodo dell'oggetto "Optional";
*
*       Perché ci sono due metodi simili? Perché non richiedere sempre l'identità? Java
*       avrebbe potuto farlo. Tuttavia, a volte è meglio differenziare il caso in cui
*       lo "Stream" è vuoto piuttosto che il caso in cui esiste un valore che corrisponde
*       all'identità che viene restituita dal calcolo. La firma che ritorna un "Optional"
*       ci permette di differenziare questi casi. Per esempio, potremmo ritornare un
*       Optional.empty() quando lo "Stream" è vuoto e un Optional.of(3) quando c'è un valore.
*       La terza firma del metodo viene usata quando elaboriamo collezioni in parallelo.
*       Permette a Java di creare riduzioni intermedie e poi combinarle alla fine.
*       Nel nostro esempio sembra simile. Anche se qui non si usa uno "Stream" parallelo
*       Java presuppone che uno "Stream" possa essere parallelo. Questo è utile perché
*       ci permette di passare facilmente ad uno "Stream" parallelo in futuro:
*
*           BinaryOperation<Integer> op = (a, b) -> a * b;
*           Stream<Integer> stream = Stream.of(3, 5, 6);
*           System.out.println(stream.reduce(1, op, op));           // 90
*
*       ------------------------------------------------------------------------------------
*
*       - collect()
*       Il metodo "collect()" è un tipo speciale di riduzione "Reduction" chiamata "mutable
*       reduction". E' più efficente rispetto ad una regolare riduzione "Reduction" perché
*       si usa lo stesso oggetto mutabile mentre si accumula. Tra gli oggetti mutabili più
*       comuni ci sono gli "StringBuilder" e gli "ArrayList". Questo è un metodo vermanete
*       utile, perché ci permette di prendere i dati dallo "Stream" e trasferirili in
*       un'altra forma.
*
*       Le firme dei metodi sono le seguenti:
*
*           <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,
*                         BiConsumer<R, R> combiner)
*
*           <R, A> R collect(Collector<? super T, A, R> collector)
*
*       Iniziamo con la prima firma, la quale viene usata quando si vuole codificare in
*       modo specifico come dovrebbe funzionare la raccolta di dati. L' esempio "wolf"
*       visto per il metodo "reduce()" può essere convertito in "collect()":
*
*           Stream<String> stream = Stream.of("w", "o", "l", "f");
*           StringBuilder word = stream.collect(StringBuilder::new, StringBuilder::append,
*                                               StringBuilder::append);
*
*       Il primo parametro è un "Supplier" (fornitore - non prende niente in input e ristituisce
*       qualcosa in output) che crea l'oggetto che memorizzerà i risultati durante
*       la raccolta (collect) dei dati. Si ricordi che un "Supplier" non prende nessun
*       parametro e ritorna un valore. In questo caso specifico, costruisce un nuovo
*       oggetto "StringBuilder".
*       Il secondo parametro è una interfaccia funzionale "BiConsumer", il quale prende in
*       input due parametri e non restituisce nulla in output. E' responsabile di aggiungere
*       un elemento in più alla raccolta di dati (collect). In questo esempio, appende la
*       "String" successiva all'oggetto "StringBuilder".
*       L'ultimo parametro (il terzo) è un'altra interfaccia funzionale "BiConsumer". Si occupa
*       di prendere due collezioni di dati e di mergiarle / unirle. E' utile quando stiamo
*       elaborando/processando in parallelo. Si formano due collezioni piccole e poi
*       si fondono in una sola. Questo funzionerebbe con "StringBuilder" solo se non
*       ci importasse l'ordine delle lettere. In questo caso, l'accumulatore e il combiner
*       hanno una logica simile.
*       Ora diamo uno sguardo ad un'esempio dove la logica è differente nell'accumulatore
*       e nel combiner:
*
*           Stream<String> stream = Stream.if("w", "o", "l", "f");
*           TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add,
*                                                TreeSet::addAll);
*           System.out.println(set);                                           // [f, l, o, w]
*
*       Il collector ha tre parti come nell'esempio precedente. L'interfaccia funzionale
*       "Supplier" crea un'oggetto TreeSet vuoto. L'accumulatore aggiunge una singola
*       "String" dallo "Stream" al "TreeSet". Il combiner aggiunge tutti gli elementi
*       di un "TreeSet" in un'altro nel caso in cui le operazioni vengano fatte in
*       parallelo e debbano essere unite.
*       Abbiamo iniziato con la firma più lunga perché è così che si implementa il proprio
*       collector. E' importante sapere come fare questo per l'esame e capire come
*       il collector lavora/funziona. In pratica, ci sono molti collector comuni che
*       vengono fuori più e più volte. Piuttosto che far si che gli sviluppatori continuino
*       a reimplementare gli stessi, Java fornisce un'interfaccia con i più comuni collector.
*       Questo approccio rende anche il codice più facile da leggere perché è molto più
*       espressivo. Per esempio, si potrebbe riscrivere il codice dell'esempio precedente
*       come di seguito:
*
*           Stream<String> stream = Stream.of("w", "o", "l", "f");
*           TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
*           System.out.println(set);                        // [f, l, o, w]
*
*       Se non si ha la necessità che il "Set" sia ordinato, si potrebbe rendere il codice
*       anche più corto:
*
*           Stream<String> stream = Stream.of("w", "o", "l", "f");
*           TreeSet<String> set = stream.collect(Collector.toSet());
*           System.out.println(set);                        // [f, w, l, o]
*
*       Si potrebbe ottenere un output diverso per quest'ultimo esempio dal momento che
*       il metodo "toSet()" non garantische quale implementazione di "Set" si otterrà.
*       E' probabile che sia un "HashSet", ma non ci si dovrebbe fare affidamento.
*
*       N.B: All'esame ci si aspetta che si conoscano i collector predefiniti e che si
*       sia in grado di scriverne di propri passando un "Supplier", un accumulatore e un
*       combiner.
*
*       Più avanti nel capitolo, verranno mostrati molti "Collectors" che vengono usati
*       per raggruppare dati. E' un'argomento importante, quindi è meglio prima saper
*       bene come funzionano gli "Stream" prima di aggiungere troppi "Collector".
*
* */

public class UsingCommonTerminalOperations {
}
