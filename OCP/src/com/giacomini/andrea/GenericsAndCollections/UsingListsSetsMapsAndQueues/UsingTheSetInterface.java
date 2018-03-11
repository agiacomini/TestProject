package com.giacomini.andrea.GenericsAndCollections.UsingListsSetsMapsAndQueues;

/*
N.B: Si una un'insieme ("Set") quando non si vuole permettere elementi duplicati. Per esempio, si vorrebbe tenere traccia
     degli animali unici che si vuole vedere allo zoo. Non si è interessati all'ordine con cui si vedono questi animali,
     ma non c'è tempo per vederli più di una volta. Si vuole solo essere sicuri di vedere quegli animali veramente importanti per noi
     e rimuoverli dall'insieme una volta visti.
     La figura 3.3 (pag. 132 del libro) mostra come ci si può immaginare un "Set". La cosa principale che tutte le
     implementazioni di "Set" hanno in comune è che loro non permettono elementi duplicati. Oltre questo ognuno di loro
     offre differenti funzionalità. Vedremo ora ognuna delle implementazioni che si deve conoscere per l'esame e come
     scrivere del codice che usi "Set".


     Comaparazione delle implementazioni di "Set":
     Un "HasSet" memorizza i suoi elementi in una tabella hash. Questo significa che usa il metodo "hasCode()" degli oggetti
     per recuperarli in modo più efficente. Se si è dimenticato come funziona il metodo "hasCode()" è meglio rivedersi
     il capitolo "1- Advanced Class Design".
     Il beneficio principale è che aggiungendo elementi e controllando se un'elemento è presente nel "Set" entrambi
     hanno un tempo costante. Il compromesso è che si perde l'ordine con il quale si sono inseriti gli elementi.
     La maggior parte delle volte non si è interessati a questo quando si ha a che fare con un "Set", rendendo "HashSet"
     il set/insieme più comune.
     Un "TreeSet" memorizza i suoi elementi in una struttura ad albero ordinata. Il beneficio principale è che l'insieme
     è sempre ordinato. Il compromesso è che aggiungendo e controllando se un elemento è presente sono entrambi O(log n)
     [Complessità computazionale]. Il "TreeSet" implementa una speciale interfaccia chiamata "NavigableSet", la quale
     permette di affettare la collezione come si vedrà nella prossima sidebar, "The NavigableSet Interface".
     La figura 3.4 (pag. 133 del libro) mostra come sono memeoriccati gli "HashSet" e i "TreeSet". L'"HashSet" è più
     complicato in realtà perché ha anche righe vuote, ma questo va bene per l'esame.

        HashSet:                                TreeSet:

        | -705903059 | zebras |                     pandas
        | -995544615 | pandas |
        |102978519   | lions  |                 lions     zebras



     Working With Set Methods:
     L'interfaccia "Set" non aggiunge nessun extra metodo che bisogna conoscere per l'esame. Bisogna sapere solo come
     si comporta "Set" rispetto ai tradizionali metodi di "Collection". Bisogna sapere inoltre le differenze tra i tipi
     di "Set". Iniziamo con "HashSet":

        3: Set<Integer> set = new HashSet<>();
        4: boolean b1 = set.add(66);                                        // TRUE
        5: boolean b2 = set.add(10);                                        // TRUE
        6: boolean b3 = set.add(66);                                        // FALSE
        7: boolean b4 = set.add(8);                                         // TRUE
        8: for (Integer integer : set) System.out.println(integer + ",");   // 66, 8, 10,

    Il metodo "add()" dovrebbe essere chiaro. Ritorno TRUE se l'elemento non è già presente nell'insieme. La linea 6
    ritorna FALSE perché si ha già l'elemento 66 nell'insieme e "Set" deve preservare l'unicità degli elementi. La linea
    8 stampa gli elementi dell'insieme in un ordine arbitrario. In questo caso specifico non è l'ordine di inserimento o
    memorizzazione e nemmeno l'ordine in cui sono ordinati gli elementi.
    Ricorda che il metodo "equals()" è usato per determinare l'uguaglianza. Il metodo "hashCode()" è usato per sapere
    quali contenitori/file cercare in modo che Java non debba guardare attraverso l'intero insisme "Set" per scoprire se
    c'è un oggetto. Il caso migliore è che l'hasCode sia unico, e Java debba chiamare il metodo "equals()" su un solo
    oggetto. Il caso peggiore è che tutte le implementazioni ritornino lo stesso "hashCode()", e Java debba chiamare il
    metodo "equals()" per tutti gli elementi dell'insieme "Set".
    Diamo ora uno sguardo ad un esempio di "TreeSet":

        3: Set<Integer> set = new TreeSet<>();
        4: boolean b1 = set.add(66);                                        // TRUE
        5: boolean b2 = set.add(10);                                        // TRUE
        6: boolean b3 = set.add(66);                                        // FALSE
        7: boolean b4 = set.add(8);                                         // TRUE
        8: for (Integer integer : set) System.out.println(integer + ",");   // 8, 10, 66,

    Questa volta gli elementi sono stampati nel loro ordina naturale (crescente).I numeri implemetano l'interfaccia
    "Comparable" in Java, la quale è usata per ordinare. Dopo questo capitolo, si imparerà come creare il proprio
    oggetto "Comparable".



    The "NavigableSet" interface:
    "TreeSet" implementa l'interfaccia "Navigable". Questa interfaccia fornisce alcuni interessanti metodi. Le firme di
    di questi metodi sono le seguenti:

        Method                      Description

        E lower(E e)                Ritorna l'elemento più grande che è < e, o null se non ci sono elementi

        E floor(E e)                Ritorna l'elemento più grande che è <= e, o null se non ci sono elementi

        E ceiling(E e)              Ritorna l'elemento più piccolo che è >= e, o null se non ci sono elementi

        E higher(E e)               Ritorna l'elemento più piccolo che è > e, o null se non ci sono elementi

    Questi metodi sono stati aggiunti all'esame con Java 6, in modo da poterli incontrare.
    Diamo un'occhiata ad un esempio di questi metodi:

        36: NavigableSet<Integer> set = new TreeSet<>();
        37: for (int i = 1 ; i <= 20 ; i++) set.add(i);
        38: System.out.println(set.lower(10));                  // 9
        39: System.out.println(set.floor(10));                  // 10
        40: System.out.println(set.ceiling(20));                // 20
        41: System.out.println(set.higher(20));                 // null

    Il "TreeSet" contiene 20 oggetti "Integer" i cui valori vanno da 1 a 20. In questo esempio, la linea 38 deve ritornare
    l'elemento più grande che sia minore di 10. La linea 39 deve ritornare l'elemento più grande che non sia più grande
    di 10. Vedi la differenza? Uno (39:) include nell'intervallo il valore target (10) mentre l'altro (38:) no.
    La linea 40 deve ritornare l'elemento più piccolo più grande o uguale al valore target 20. La linea 41 ritorna l'elemento
    più piccolo più grande del valore target 20. In quest'ultimo caso, non ci sono elementi che rispecchiano questi criteri
    quindi viene ritornato un valore "null".
    Questi metodi suonano molto simili. Ricorda solo che l'elemento più piccolo o più grande non include l'elemento target.


 */

public class UsingTheSetInterface {
}
