package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns;

/*
N.B: Il primo patter creazionale che si discuterà è il "Singleton pattern".

     Problema: come si crea un oggetto in memoria solamnete una volta per una applicazione e renderlo condiviso per più classi?

     Motivazione: ci sono volte in cui si vuole solo una istanza di un particolare tipo di oggetto in memoria. Per esempio, si potrebbe
     voler gestire la quantità fieno disponibile per il cibo degli animali dello zoo per tutte le classi che la usano.
     Si potrebbe passare lo stesso oggetto "HayManager" ad ogni classe e metodo che lo usa, questo creerebbe una quantità
     extra di puntatori e potrebbe essere difficile gestirlo se l'oggetto viene usato ovunque nell'applicazione.
     Creando un oggetto singleton "HayManager", si centralizzano i dati e ri rimuove il bisogno di passarli attraverso tutta
     l'applicazione.

     Soluzione: Il "Singleton pattern" è un pattern creazionale focalizzato sulla creazione di una sola istanza di un oggetto
     in memoria all'interno di una applicazione, condivisa da tutte le classi e threads all'interno dell'applicazione.
     La disponibilità globale dell'oggetto creato dal singleton pattern è referenziata come "singleton". Il singleton può inoltre
     migliorare le prestazioni caricando dati riutilizzabili che altrimenti richiederebbero tempo per memorizzare e ricaricare
     ogni qual volta che è necessario.

     Presentiamo una semplice implementazione della classe "HayManager" come singleton e si discuterà delle sue varie
     proprietà:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.HayStorage;

     Come mostrato nel precedente esempio, i singleton in Java sono creati come variabili PRIVATE STATIC all'interno della classe,
     spesso con il nome "instance". Queste sono accedute attraverso un singolo metodo PUBLIC STATIC, spesso chiamato "getInstance()",
     il quale ritorna un riferimento all'oggetto singleton. In fine, tutti i costruttori in una classe singleton sono marcati
     come PRIVATE, il quale assicura che nessun altra classe sia in grado di istanziare un'altra versione della classe.
     Marcando il costruttore come PRIVATE, si stà implicitamente marcando la classe come FINAL. Si ricorda che ogni classe
     richiede almeno un costruttore, con il costruttore di default senza argomenti che viene aggiunto nel caso non ne venga
     fornito nessun'altro. Inoltre, la prima linea di qualsiasi costruttore è una chiamata al costruttore della classe parent
     con il comando "super()". Se tutti i costruttori sono dichiarati PRIVATE nella classe singleton, allora è impossibile
     creare una sotto-classe con un costruttore valido; perciò, la classe singleton è effettivamente FINAL.

     N.B: Si noti come è stato aggiunto il modificatore "synchronized" ai metodi "addHay()", "removeHay()" e "getHayQuantity()".
          Si discuterà questo concetto in maggior dettaglio nel capitolo "7-Concurrency". Per ora basta sapere che questo
          modificatore "synchronized" previene due processi di esecuzione dello stesso metodo allo stesso momento.

     Ritornando all'esempio "HayStorage", un processo che vuole usare questo singleton prima chiama "getInstance()" e poi
     chiama l'appropriato metodo public:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.LlamaTrainer;

     Una cosa da tenere a mente è che ci possono essere multipli llama trainers allo zoo ma un solo food stoarge.
     All'interno del data model questo equivarrebbe a molte istanze di "LlamaTrainer" ma una sola istanza di "HayStorage".
     Si è inoltre controllato il valore di ritorno del metodo "removeHay()", in quanto è possibile che qualcun altro
     avrebbe potuto prendere il cibo che abbiamo appena rifornito prima di avere la possibilità di usarlo.
     Nel primo esempio "HayStorage", si è istanziato l'oggetto singleton direttamente nella definizione del riferimento
     "instance". E' possibile istanziare un singleton in altri due modi. Il seguente esempio crea un singleton usando
     un blocco di inizializzazione STATIC quando la classe viene caricata. Per semplicità, saltiamo la definizione del
     modello dei dati di queste classi e presentiamo solo la creazione e la logica di recupero dell'istanza:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.StaffRegister;

     Sia la classe "StaffRegister" che la precedente classe "HayStorage" inizializzano il singleton nel momento in cui
     la classe viene caricata. A differenza della classe "HayStorage", tuttavia, la classe "StaffRegister" istanzia il
     singleton come parte di un blocco di inizializzazione STATIC. Concettualmente, queste due implementazioni sono
     equivalenti, dal momento che entrambe creano il singleton quando la classe viene caricata (per via di STATIC),
     anche se il blocco di inizializzazione STATIC permette di eseguire ulteriori operazioni per impostare il singleton
     una volta che è stato creato. Ci permette anche di gestire casi nei quali il costruttore di "StaffRegister" lanci
     una "Excpetion". Dal momento che il singleton è creato quando la classe viene caricata, saremo in grado di marcare
     il rifeirmento come FINAL, il quale ci garantisce che verrà creata solo un'istanza all'interno dell'applicazione.
     I singletono vengono usati in situazioni dove si ha la necessità di accedere ad un unico insieme di dati durante
     un'applicazione. Per esempio, i dati di configuraione dell'applicazione e la cache dati sono comunemente implementati
     usando i singleton. I singletono possono anche essere usati per coordinare l'accesso a risorse condivise, come
     l'accesso in lettura ad un file.



     APPLYING LAZY INSTANTIATION TO SINGLETON:
     Un'altra tecnica è ritardare la creazione del singleton fino alla prima chiamata del metodo "getInstance()":

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.VisitorTicketTraker;

     La classe "VisitorTicketTraker", come la classi precedenti, dichiara un costruttore PRIVATE, crea un'istanza singleton,
     e ritorna l'oggetto singleto con l'impiego del metodo "getInstance()". La classe "VisitorTicketTraker" tuttavia,
     non crea l'oggetto singleton quando la classe viene caricata ma invece quando viene richiesta dal client la prima
     volta. Creando un'oggetto riusabile, la prima volta che viene richiesto è un "design patter" conosciuto come
     "Lazy Istantiation". Viene usato spesso con il "Singleton Pattern".
     La "Lazy Istantiation" riduce l'uso della memoria e migliora le performance quando un'applicazione parte. Infatti,
     senza la lazy instantiation molti sistemi operativi e applicazioni che si eseguono richiederebbero molto più
     tempo a caricare e consumerebberemo molta più memoria rispetto a quella disponibile sulla macchina. Il rovescio
     della medaglia della "Lazy Instantiation" è che gli utenti potrebbero notare un notevole ritardo la prima volta che un
     particolare tipo di risorsa è richiesta.
     Per esempio, si potrebbe aver visto la "Lazy Instantiation" in applicazioni che si usano per scrivere software e non
     essersene accorti. Un tool per lo sviluppo software liberamente disponibile è Eclipse. Spesso questo tool dimostra un
     leggero ritoardo quando si apre per la prima volta un file java in una finestra dell'editor dopo aver avviato
     il programma. Questo ritardo, tuttavia, scompare quando si aprono ulteriori file java. Questo è un'esempio di
     "Lazy Instantiation" dal momento che Eclipse carica solamente le librerie per analizzare e presentare i file java
     la prima volta che il file java viene aperto.



     CREATING UNIQUE SINGLETONS:
     Per implementare veramente il singleton patter, ci si deve assicurare che una sola istanza del singleton venga creata.
     Marcare il costruttore della classe come PRIVATE è un buon primo passo per prevenire che il singleton venga
     creato da un'altra classe, ma ci si deve assicurare anche che l'oggetto venga creato una sola volta all'interno
     della classe. Si garatisce questa situazione, nelle classi di esempio "StaffRegister" e "HayStorage", usando il
     modificatore FINAL sul riferimento STATIC.
     Sfortunatamente, visto che si è usata la lazy instantiation nella classe "VisitorTicketTraker", il compialtore non
     permette di assegnare il modificatore FINAL al riferimento STATIC. L'implementazione di "VisitorTicketTraker", così
     come viene mostrata, non è considerata trade-safe (sicuro) in quanto due thread potrebbero chiamare il metodo
     "getInstance()" allo stesso momento, portando così alla creazione di due oggetti distinti. Dopo che entrambi i thread
     hanno finito la loro esecuzione, solo un'oggetto sarà impostato e usato dall'altro thread in avanti, ma l'oggetto
     che i due thread iniziali hanno ricevuto non può essere lo stesso.
     Il "Thread safety" è una proprietà di un'oggetto che garantisce l'esecuzione sicura da parte di multeplici thread allo stesso
     istante. Si discuterà di questo argomento nel capitolo "Concurrency" ma per il momento si presenta una semplice
     soluzione che è compatibile con la "lazy initialization" usando il modificatore "synchronized":

        public static synchronized VisitorTicketTracker getInstance(){

            if(instance == null){

                instance = new VisitorTicketTracker();
            }
            return instance;
        }

     Il metodo "getInstance()" è ora sincronizzato, il che significa che solo un thread alla volta sarà consentito
     nel metodo, assicurandosi che venga creato un solo oggetto.

     N.B: Scenario Reale: Singleton con Double-Checked Locking
     L'implementazione "synchcronized" del metodo "getInstance()", mentre previene correttamente la creazione di oggetti
     singleton multipli, ha il problema che ogni singola chiamata al metodo richiederà sincronizzazione. In pratica,
     questo può essere costoso e piò impattare sulle performance. La sincronizzazione è necessaria solo la prima volta che
     l'oggetto viene creato.
     La soluzione è usare un "double-checked locking", un design pattern nel quale si testa prima se la sincronizzazione
     è necessaria prima di eseguire qualsiasi lock. Il seguente è un'esempio rivisto del metodo usando "double-checked locking":

        private static volatile VisitorTicketTracker instance;
        public static VisitorTicketTracker getInstance(){

            if(instance == null){

                synchronized(VisitorTicketTracker.class) {

                    if(instance == null){

                        instance = new VisitorTicketTracker();
                    }
                }
            }

            return instance;
        }

     Come si può notare, si è aggiunto il modificatore "volatile" all'oggetto singleton. Questa parola chiave impedisce
     al compilatore di ottimizzare il codice in modo tale che quell'oggetto sia acceduto prima che sia finita la sua
     costruzione. Per l'esame OCP non è richiesto di sapere come "volatile" funziona o come il compilatore ottimizza.
     Questa soluzione è migliore della precedente, ed esegue la sincronizzazione solo quando il singletono non esiste.
     Se il singleton è acceduto migliaia di volte questo significa che solo le prime chiamate richiedono la sincronizzazione,
     e il resto no.

 */

public class ApplyingTheSingletonPattern {
}
