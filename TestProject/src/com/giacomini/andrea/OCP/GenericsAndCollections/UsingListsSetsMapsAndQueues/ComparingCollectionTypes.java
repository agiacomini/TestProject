package com.giacomini.andrea.OCP.GenericsAndCollections.UsingListsSetsMapsAndQueues;

/*
N.B: Iniziamo con una breve review delle caratteristiche dei differenti tipi di Collection.

        Type        Can contain                 Element             Has keys            Must add/remove
                    duplicate elements?         ordered?            and values?         in specific order?

        List        YES                         YES(by index)       NO                  NO

        Map         YES(for values)             NO                  YES                 NO

        Queue       YES                         YES(retrieved       NO                  YES
                                                in defined order)

        Set         NO                          NO                  NO                  NO

     Java Collections attributes:

        Type        Java Collections            Sorted?         Calls hashCode?         Calls compareTo?
                    Framework interface

        ArrayList   List                        NO              NO                      NO

        ArrayDeque  Queue                       NO              NO                      NO

        HashMap     Map                         NO              YES                     NO

        HashSet     Set                         NO              YES                     NO

        HashTable   Map                         NO              YES                     NO

        LinkedList  List, Queue                 NO              NO                      NO

        Stack       List                        NO              NO                      NO

        TreeMap     Map                         YES             NO                      YES

        TreeSet     Set                         YES             NO                      YES

        Vector      List                        NO              NO                      NO

     All'esame ci si aspetta che si sappia quali strutture dati permettono "null". Molte di queste permettono "null", per
     questo verranno discusse solo le eccezioni. Alcune sono anche logiche.
     Le strutture dati che permettono l'ordinamento non permettono "null". Questo a senso. Non è possibile comparare
     un "null" e una "String". Sono cose completamente diverse tra loro. Non è possibile dire che 5 è minore di "Puppy".
     Non ha nessun senso nemmeno dire che "null" è minore di "Puppy". Questo significa che "TreeSet" non può contenere
     elementi "null" (dal momento che "TreeSet" ha elementi ordinati). Significa anche che "TreeMap" non può contenere
     chiavi "null" mentre sono consentiti valori "null".
     Non e possibile mettere "null" in un "ArrayDeque" perché i metodi come "poll()" usano "null" come valore di ritorno
     speciale per indicare che la collezione è vuota. Dal momento che "null" ha quel significato Java proibisce di mettere
     "null" lì. Porterebbe confusione.
     Infine, "HashTable" non permette di avere chiavi "null" o valori "null". Non c'è una reale ragione per questo.
     E' solo perché è vecchio e viene scritto in questo modo.
     In modo più sintetico, tutte le strutture dati permettono "null" tranne le seguenti:

        TreeMap - no null keys;

        Hastable - no null keys o values;

        TreeSet - no null elements;

        ArrayDeque - no null elements;

     Infine, all'esame ci si aspetta che si sia in grado di scegliere il giusto tipo di collezione data la descrzione del
     problema. La tabella di seguito ci guida attraverso questo tipo di situazione per fare pratica. Prestare attenzione
     alla colonna "Reason".

        (Choosing the right collection type)

        Which class do you choose when             Answer (single          Reason
        you want __________                        best type)

        scegliere la migliore mappa dello          ArrayDeque              La descrizione è una last-in, first-out struttura
        zoo da una pila di mappe                                           dati, per questo si ha bisogno di una pila (stack),
                                                                           che è un tipo di coda "Queue". (Anche "Stack"
                                                                           match con questa descrizione ma questa struttura dati
                                                                           non dovrebbe essere usata nel codice nuovo).

        vendere biglietti alle persone             LinkedList              La descrizione è una struttura dati first-in,
        nell'ordine in cui sono in riga                                    first-out così si ha bisogno di una coda. Si ha
        e chiamarli in funzione della loro                                 bisogno anche di un indice e "LinkedList" è la sola
        posizione in fila                                                  classe che match con entrambi i requisiti.

        per scrivere i nomi di tutti gli           ArrayList               Dal momento che ci possono essere duplicati si ha
        elefanti in modo da dirlo al tuo                                   bisogno di una lista piuttosto che di un insieme "Set".
        amico ogni volta che lo chiede                                     Si accederà alla lista più spesso che aggiornarla
        (gli elefanti non hanno nomi univoci)                              dal momento che l'amico ci chiederà la stessa
                                                                           domanda più volte, rendendo "ArrayList" migliore
                                                                           piuttosto che "LinkedList". "Vector" e "Stack"
                                                                           non vengono usati nel codice nuovo.

       per elencare gli animali (unici/una         HashSet                 La parola chiave qui è "unique" (unico). Quando
       sola volta) che si vogliovo vedere oggi                             si trova la parola "unique" (unico) bisogna
       allo zoo                                                            sempre pensare in prima battuta a "Set". Dal momento
                                                                           che nei requisiti non c'è la richiesta di ordinamento
                                                                           o di ricordare l'ordine di inserimento si usa il
                                                                           più efficiente insieme (Set).

       per elencare gli animali unici che si       TreeSet                 Dal momento che si parla di unicità, si ha bisogno
       vuole vedere allo zoo in ordine                                     di un "Set". Questa volta, si ha bisogno di un ordine,
       alfabetico.                                                         perciò non si può usare "HashSet".

       cercare un' animali                         HashMap                 Cercare per chiave ci dovrebbe far pensare ad una
       basandosi sul loro indetificativo                                   mappa. Dal momento che non si ha un requisito
       unico.                                                              di ordinamento o di ordine si potrebbe usare la
                                                                           mappa più basilare.


    Si raccomanda prima di identificare quale tipo di collection la domanda ci stà chiedendo. Primo, immaginarsi se si
    stà cercando una lista, una mappa, una coda o un'insieme. Questo ci permette di eliminare una serie di risposte.
    Poi ci si può immaginare quali tra le rimanenti possibili soluzioni/scelte è la miglior risposta.


 */

public class ComparingCollectionTypes {
}
