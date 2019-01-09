package com.giacomini.andrea.GenericsAndCollections.UsingListsSetsMapsAndQueues;

/*
N.B: Si usa una lista quando si vuole una collezione ordinata che possa contenre anche duplicati. Gli elementi possono
     essere recuperati e inseriti in una specifica posizone della lista basandosi su un indice "int" esattamente come in
     un array. Le liste sono frequentemente usate perché ci sono molte situazioni in programmazione dove si ha la necessità
     di tenere traccia di una lista di oggetti. Per esempio, si potrebbe fare una lista di quello che si vuole vedere allo
     zoo. Prima di tutto vedere i leoni perché loro vanno a dormire presto. Poi vedere i panda perché c'è una fila lunga
     tutto il giorno per vederli.
     La figura di seguito mostra come si può immaginare una "List". Ogni elemento della lista ha un indice e gli indici
     iniziano da 0:

        |   lions   |   pandas  |   zebras |

            0           1           2

     Qualche volta non ci interessa l'ordine degli elementi della lista. La "List" è come il tipo di dato "go to".
     Quando facciamo la lista della spesa prima di andare al negozio, l'ordine della lista capita che sia l'ordine in cui
     abbiamo pensato agli elementi/articoli da comrpare. Probabilmente non siamo collegati ad un particolare ordine ma non
     importa.
     Mentre le classi che implementano l'interfaccia "List" hanno molti metodi, si deve conoscere solo quelli più comuni.
     Convenientemente, questi sono gli stessi per tuttte le implementazioni che potrebbero comparire all'esame.
     La cosa principale che tutte le implementazioni "List" hanno in comune è che sono ordinate e permettono duplicati.
     Dietro quello, ognuno offre differenti funzionalità. Si darà uno sguardo alle implementazioni che si devono
     conoscere ed ai metodi disponibili.

     N.B: Prestare particolare attenzione ai nomi delle classi e delle interfacce. L'esame potrebbe chiedervi quali siano
          le classi migliori o le interfacce migliori per uno specifico scenario.



     Comparing "List" implementations:
     Un "ArrayList" è come un array serializzabile. Quando gli elementi sono aggiunti, l'"ArrayList" automaticmanete
     cresce. Quando non si è sicuri quale collezione usare, è meglio usare un "ArrayList". Questa classe è così comune
     che è già stata testata nell'esame OCA.
     Il principale beneficio di un "ArrayList" è che si può cercare qualsiasi elemento in un tempo costante. Aggiungere
     o rimuovere un'elemento è più lento che accedere ad un'elemento. Questo rende un "ArrayList" una buona scelta quando
     si sa di dover legge più spesso piuttosto che scrivere l'"ArrayList".
     Una "LinkedList" è speciale perché implementa sia l'interfaccia "List" che "Queue". Ha tutti i metodi di "List".
     Ha anche metodi addizionali per facilitare l'aggiunta o la rimozione di elementi dall'inizio e/o fine della lista.
     I principali benefici di una "LinkedList" sono che si può accedere, aggiungere e rimuovere elementi dall'inizio e dalla
     fine della lista in un tempo costante. Il compromesso è che trattare con un indice arbitrario richiede tempo lineare.
     Questo rende una "LinkedList" una buona scelta quando la si userà come "Queue".
     Ci sono anche due vecchie implementazioni. Torniamo indietro a quando "Vector" era l'unica scelta se si voleva una
     lista. In Java 1.2, gli "ArrayList" li hanno essenzialmente sostituiti. I "Vector" fanno la stessa cosa delgi "ArrayList"
     ma molto più lentamente. Il vantaggio di tale diminuzione di velocità è che è trade-safe (sicuro), ma come lo vedremo
     nel capitolo "7- Concurrency", c'è un modo migliore di farlo ora. Questo significa che la ragione reale per cui è
     necessario conoscere "Vector" è che del codice veramente vecchio potrebbe riferirsi ad esso.
     Uno "Stack" è una strttura dati dove si può aggiungere e rimuovere elementi dalla cima dello stack. Pensa ad una
     pila/catasta (stack) di carta come esempio. Come i "Vector" gli "Stack" non sono stati usati per codice nuovo in epoche diverse.
     Infatti, "Stack" estende "Vector". Se si ha bisogno di una pila/catasta è meglio usare un "ArrayDueue". Parleremo
     in maggior dettaglio di questo nella sezione "Queue".



     Working With List Methods:
     I metodi dell'interfaccia "List" lavorano con gli indici. Oltre ad i metodi ereditati da "Collection", le firme dei
     metodi che si ha bisogno di conoscere sono qui riportate:

        Method                                  Description

        boolean add(E element)                  Aggiunge un'elementi alla fine;

        boolean/void add(int index, E element)  Aggiunge un'elemento nella posizione indicata dall'indice e sposta il
                                                resto verso la fine;

        E get(int index)                        Ritorna l'elemento dell'indice specificato;

        int indexOf(Object o)                   Ritorna il primo indice che match con l'elemento passato, altrimenti ritorna -1;

        int lastIndexOf(Object o)               Ritorna l'ultimo indice che match con l'elemento passato, altrimenti ritorna -1;

        E remove(int index)                     Rimuove l'elemento specificato dall'indice passato al metodo e muove il resto
                                                verso l'inizio;

        E set(int index, E e)                   Sostituisce l'elemento all'indice/posizione passato al metodo e ritorna l'originale;


    I seguenti statements dimostrano questi metodi di base per l'aggiunta e la rimozione di elementi dalla lista:

        4: List<String> list = new ArrayList<>();
        5: list.add("SD");                         // [SD]
        6: list.add(0, "NY");                      // [NY, SD]
        7: list.set(1, "FL");                      // [NY, FL]
        8: list.remove("NY");                      // [FL]
        9: list.remove(0);                         // []

    Sulla linea 4 viene dichiarata una lista vuota. La linea 5 aggiunge un elemento alla fine della lista. La linea 6
    aggiunge un elemento all'indice 0 che fa slittare l'elemento originale dell'indice 0 all'indice 1. Si noti come
    l'"ArrayList" è ora automaticamente più largo. La linea 7 sostituisce l'elemento all'indice 1 con un nuovo valore.
    La linea 8 rimuove l'elemento che match con la stringa "NY". Infine, la linea 9 rimuove l'elemento all'indice 0
    e così facendo la lista torna ad essere vuota come all'inizio.
    Vediamo un'altro esempio che interroga la lista:

        5: list.add("OH");                          // [OH]
        6: list.add("CO");                          // [OH, CO]
        7: list.add("NJ");                          // [OH, CO, NJ]
        8: String state = list.get(0);              // OH
        9: int index = list.indexOf("NJ");          // 2

    Dalla linea 5 alla linea 7 vengono aggiunti elementi alla lista. La linea 8 richiede l'elemento all'indice 0. La linea
    9 cerca all'interno della lista fino a quando non trova un lemento con un valore uguale a "NJ". Gli elementi non
    devono essere ordinati affinchè funzioni perché il metodo "indexOf()" cerca attraverso l'intera lista fino a quando
    non trova un match.
    L'output sarebbe stato lo stesso se si provavano questi esempi con un "LinkedList", con un "Vector" o con uno "Stack".
    Sebbene il codice sarebbe stato meno efficente, non si sarebbe notata la differenza fino a quando non si fosse usata
    una lista piuttosto ampia di elementi.



    Looping through a List:
    Nell'esame OCA si è imparato come ciclare attraverso una lista usando un ciclo for "enhanced":

        for(String string : list){
            System.out.println(string);
        }

    Si vedrà un'altro modo più lungo di fare questo in codice scritto prima di Java 5:

        Iterator iter = list.iterator();
        while(iter.hasNext()){

            String string = (String) iter.next();
            System.out.println(string);
        }

    Il vecchio modo richiede un cast perché precede i "generics". Richiede anche di controllare se l'oggetto "Iterator"
    ha altri elementi seguiti dalla richiesta dell'elemento successivo. Esiste anche un modo ibrido dove si usa ancora "Iterator"
    con i "generics". Ci si sbarazza del cast ma bisogna ancora gestirsi la logica di loop da soli:

        Iterator iter = list.iterator();
        while(iter.hasNext()){

            String string = iter.next();
            System.out.println(string);
        }

    Fare attenzione alle differenze tra questi tre metodi. Il metodo "hasNext()" controlla se ci sia un'altro valore
    successivo in lista. In altre parole, ci dice se il metodo "next()" verrà eseguito senza lanciare nessuna eccezione.
    Il metodo "next()" muove l'"Iterator" all'elemento successivo.

 */

public class UsingTheListInterface {
}
