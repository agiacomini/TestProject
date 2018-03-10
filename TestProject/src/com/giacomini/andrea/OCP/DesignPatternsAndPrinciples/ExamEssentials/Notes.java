package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ExamEssentials;

/*
 * N.B: Uno dei principali obiettivi di questo capitolo è stato quello di insegnare come scrivere un codice migliore.
 *      Si sono dimostrate tecniche per progettare la struttura di una classe facilmente scalabile, che si integra bene con le
 *      altre applicazioni, e che sia facile per gli altri programmatori da leggere e comprendere.
 *
 *      Si è iniziato con un breve ripasso delle interfacce studiate nell'esame OCA mostrado come si dichiarano, come si
 *      implementano e come si estendono. Ci siamo poi mossi verso la programmazione funzionale e si sono riviste le varie
 *      opzioni di sintassi disponibili per definire le "interfacce funzionali" e le "lambda expression". Data l'importanza
 *      delle lambda expressione in Java 8 si consiglia di prendere maggiore dimestichezza nello scrivere ed usare le
 *      lambda expression. Si è poi conclusa la discussione rivedendo l'interfaccia "Predicate" basata sui generics e mostrato
 *      come può essere usata al posto delle nostre interfacce funzionali. Si ritornerà in maggior dettaglio sul discroso
 *      delle lambda expression e su quello degli "stream" nei capitoli "Generics And Collections" e "Functional Programming".
 *
 *      In questo capitolo si è introdotto il concetto di "polimorfismo", che è un concetto centrale nel linguaggio Java,
 *      e si è mostrato come gli oggetti possono essere acceduti in una varietà di forme. E' importante essere sicuri di aver capito
 *      quando è necessario un cast per accedere ad un'oggetto ed essere in grado di individuare le differenze tra
 *      i problemi di cast a compile-time e quelli a run-time.
 *
 *      Nella sezione riguardante i "design pattern" è stato insegnato come incapsulare le classi in Java, permettere di
 *      rafforzare l'invarianza della classe nel proprio modello dei dati. Si è poi descritto il principio alla base della
 *      relazione "is-a" e "has-a" e come applicarle al proprio data model. Infine, si è introdotta la tecnica di creare
 *      la struttura delle classi usando la composizione di oggetti che si affidano al principio "has-a" come
 *      alternativa all'ereditarietà.
 *
 *      Si è poi concluso questo capitolo spiegando cos'è un design pattern e presentando i quattro principali design pattern
 *      creazionali. I design pattern forniscono un modo comune di risolvere problemi che si incontrano nello sviluppo
 *      software usando soluzioni che altri sviluppatori hanno già usato e generalizzato per noi. Il "Singleton pattern"
 *      è eccellente per gestire una singola istanza condivisa di un'oggetto all'interno di una applicazione.
 *      Il "Immuable Object pattern" è utile per creare oggetti read-only che non possono essere modificati da altre classi.
 *      Il "Builder pattern" risolve il problema di come creare oggetti complessi con precisione, ed è spesso usato in
 *      congiunzione con "Immutable Object pattern". Infine, il "Facotry pattern" è utile per creare vari oggetti senza
 *      esporre i costruttori sottostanti e le regole complesse per la selezione di un particolare sotto-tipo di oggetto.
 *
 *      Exam Essential:
 *      Essere in grado di scrivere codice che dichiara, implementa e/o estende un'interfaccia. Un'interfaccia è come
 *      una classe abstract che definisce un'insieme di metodi abstrac PUBLIC, che le classi che la implementano dovranno
 *      fornire (fornire un corpo). Una classe può implementare multiple interfacce e inoltre estendere classi che implementano
 *      altre interfacce permettendo così una ereditarietà multipla limitata in Java. Le interfacce possono estendere altre
 *      interfacce, ma non possono estendere una classe e viceversa. Le interfacce possono anche contenere variabili
 *      costanti PUBLIC STATIC FINAL, metodi PUBLIC STATIC, e metodi PUBLIC DEFAULT.
 *
 *      Sapere come creare e riconoscere un'interfaccia funzionale. Un'interfaccia funzionale è una interfaccia che ha esattamente
 *      un solo metodo abstract. E' il modo principale nel quale le lambda expression vengono passate tra metodi.
 *      Java include un'interfaccia "Predicat" per testare un tipo generico e ritornare un'espressione booleana.
 *
 *      Essere in grado di scrivere una valida lamda expression. Una lambda expression è come un metodo anonimo che può
 *      essere passato ad un metodo, affidandosi/basandosi sulla esecuzione differita per elaborare l'epressione in un
 *      secondo momento. Ha diverse opzioni di sintassi, sia lunghe che corte. Le lambda expression sono usate ovunque
 *      in Java 8 e in numerose domande dell'esame.
 *
 *      Comprendere il "Polimorfismo". Un'oggettoin Java può assumere diverse forme, a seconda del riferimento usato per
 *      accede all'oggetto. Il tipo dell'oggetto determina quali proprietà esistono all'interno dell'oggetto in memoria,
 *      mentre il tipo del riferimento che punta all'oggetto in memoria determina quali metodi e variabili sono accedibili
 *      dal programma Java. Un'istanza può essere automaticmanete castata ad una super-classe o interfaccia senza l'impiego
 *      di un cast esplicito. In laternativa, un cast esplicito è richiesto se il riferimento viene ristretto ad una sotto-classe
 *      dell'oggetto. Il compilatore Java non permette il cast tra tipi di oggetti non relazionati tra di loro. Infine,
 *      si dovrebbe essere in grado distinguere errodi di cast a "compile-time" e gli errori di cast a "run-time" che
 *      lanciano eccezioni del tipo "ClasCastExcpetion".
 *
 *      Comprendere l'importanza dei "design principles" e dei "design pattern". Un "design principle" è un'idea stabilita
 *      o best practice che facilita il processo di design (progettazione) del software. Un "design pattern" invece è una
 *      soluzione generale stabilita per risolvere determinati problemi di sviluppo software.
 *
 *      Sapere come implementare l'incapsulamento. L'incapsulamento è basato sull'idea di combinare campi e metodi in una
 *      classe tale che i metodi operino sui dati, al contrario degli utenti della classe che accedono ai campi direttamente.
 *      L'incapuslamento può essere usato per evitare che gli utenti creino stati di oggetti che violino l'invarianza della
 *      classe. In Java, viene spesso implementato con i JavaBeans, usando modificatori di accesso PRIVATE sulle variabili
 *      d'istanza e modificatori PUBLIC sui metodi getter e setter.
 *
 *      Essere in gradi di eseguire il test "is-a" e "has-a". Il test "is-a" viene usato per testare se un'oggetto +
 *      di un caprticolare tipo, ed è usato sia per le classi che per le interfacce. Il test "has-a" viene usato per
 *      determinare se un'oggetto contiene un riferimento ad un altro oggetto come una proprietà d'istanza.
 *
 *      Essere in grado di applicare la composizione di oggetti e saperla distinguere dall'ereditarietà. La composizione di
 *      oggetti è l'idea di creare una classe connettendo altre classi come membri usando il principio "has-a".
 *      L'ereditarietà è l'idea di creare una classe che eredita tutti i suoi metodi ri-usabili e oggetti dalla classe
 *      padre. Entrambe sono usate per creare modelli di dati complessi, ognuno con i propri personali vantaggi e svantaggi.
 *
 *      Essere in grado di applicare i pattern creazionali incluso il "Singleton pattern" e l'"Immutable Object pattern".
 *      Entrambi questi due pattern sono pattern creazionali, i quali sono progettati per facilitare la creazione
 *      di oggetti con una applicazione. Il singleton pattern risolve il problema di come creare un'istanza singola di un'oggetto
 *      in memoria tale che più classi possano condividerla centralizzando il meccanismo di creazione dell'oggetto.
 *      Il "Immutable Object pattern" viene usato per creare oggetti read-only che non possono essere modificati da altre
 *      classi. Anche se gli oggetto immutabili non possono essere modificati, possono essere copiati in nuovi oggetti
 *      immutabili con informazioni aggiornate.
 */

public class Notes {

}
