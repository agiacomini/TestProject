package com.giacomini.andrea.GenericsAndCollections.UsingListsSetsMapsAndQueues;

/*
N.B: L'interfaccia "Collection" contiene metodi utili per lavorare con liste ("List"), insiemi ("Set") e code ("Queue").
     Discuteremo anche delle mappe ("Maps"). Nelle sezioni seguenti, verranno presentati i metodi più comuni di queste "Collection".
     Discuteremo l'argomento degli "stream" nel prossimo capitolo e discuteremo anche di una coppia di altri metodi aggiunti
     alla versione di Java 8 alla fine di questo capitolo.
     Si noterà più avanti che questo libro copre più "Collection" di quelle effettivamente necessarie per raggiungere l'obiettivo
     dell'esame. La versione di Java 7 ha coperto più implementazioni. Dal momento che si comportano allo stesso modo,
     le discuteremo anche per assicurarci che siate preparati nel caso in cui all'esame si debba rispondere a vecchie domande
     e anche come avvertimento di non usarle alucne.

     add():
     Il metodo "add()" inerisce un nuovo elemento nella "Collection" e ritorna il un valore booleano che indica se l'operazione
     ha avuto successo o meno. La firma del metodo è la seguente:

        boolean add(E element)

     Ricorda che il "Collection Framework" usa i generics. Vedremo "E" apparire frequentemente. Indica il tipo generico
     che viene usato per creare la collezione. Per alcuni tipi di collezioni, il metodo "add()" ritorna sempre TRUE.
     Per altri tipi, esiste una logica per stabilire se l'aggiunta ha avuto successo.  Il seguente codice mostra come
     usare questo metodo:

        3: List<String> list = new ArrayList<>();
        4: System.out.println(list.add("Sparrow"));         // TRUE
        5: System.out.println(list.add("Sparrow"));         // TRUE
        6:
        7: Set<String> set = new HashSet<>();
        8: System.out.println(set.add("Sparrow"));          // TRUE
        9: Sustem.out.println(set.add("Sparrow"));          // FALSE

     Una "List" permette duplicati, rendendo in questo esempio il valore di ritorno sempre TRUE. Un "Set" invece non
     permette duplicati. Sulla linea 9 infatti si è provato ad aggiungere un duplicato così Java ha ritornato un valore
     FALSE dopo la chimata del metodo "add()".


     remove():
     Il metodo "remove()" rimuove un singolo valore dalla "Collection" e ritorna il valore booleano che indica se l'operazione
     è andata a buon fine o meno. La firma del metodo è la seguente:

        boolean remove(Object object)

     Questa volta, il valore booleano ritornato ci dice se un match è stato rimosso. Il seguente codice mostra come usare
     questo metodo:

        3: List<String> birds = new ArrayList<>();
        4: birds.add("hawk");                               // ["hawk"]
        5: birds.add("hawk");                               // ["hawk", "hawk"]
        6: System.out.println(birds.remove("cardinal"));    //  FALSE
        7: System.out.println(birds.remove("hawk"));        //  TRUE
        8: System.out.println(birds);                       // ["hawk"]

     La linea 6 prova a rimuovere un elemento che non è presente nella lista "birds". Per questo motivo il metodo restituisce
     un valore booleano FALSE (nessun match è stato trovato). La linea 7 prova a rimuovere un lemento che invece è presente
     nella lista "birds", per questo motivo il metodo ritorna un valore booleano TRUE. Si noti come venga rimosso un solo
     elemento anche se nella lista erano presenti due match.
     Chiamando il metodo "remove()" passandogli un "int" questo viene interpretato come un indice. Usando però un indice
     che non esiste verrà generata una eccezzione "IndexOutOfBoundExcpetion". Per esempio, "birds(100)" lancia l'eccezione.
     Si ricorda che esistono versioni overloaded del metodo "remove()" (cioè che accettano parametri diversi). La prima versioni
     del metodo "remove()" prende l'elemento da rimuovere. L'altra versione prende l'indice dell'elemento da rimuovere.


     isEmpty() e size():
     I metodi "isEmpty()" e "size()" controllano quanti elementi ci sono nella "Collection". La firma di questi metodi è
     la seguente:

        boolean isEmpty()
        int size()

     Il seguente codice mostra come usare questi metodi:

        System.out.println(birds.isEmpty());                // TRUE
        System.out.println(birds.size());                   // 0
        birds.add("hawk");                                  // ["hawk"]
        birds.add("hawk");                                  // ["hawk", "hawk"]
        System.out.println(birds.isEmpty());                // FALSE
        System.out.println(birds.size());                   // 2

     All'inizio la lista "birds" ha una grandezza ("size") di 0 ed è vuota. Ha una capacità che è più grande di 0.
     Al passo successivo sono stati aggiunti degli elementi, così la sua grandezza è diventata positiva ed la lista
     non è stata più vuota.


     clear():
     Il metodo "clear()" fornisce un modo semplice di eliminare tutti gli elementi della "Collection". La firma del
     metodo è la seguente:

        void clear()

     Il seguente codice mostra come usare questo metodo:

        List<String> birds = new ArrayList<>();
        birds.add("hawk");                              // ["hawk"]
        birds.add("hawk");                              // ["hawk", "hawk"]
        System.out.println(birds.isEmpty());            // FALSE
        System.out.println(birds.size());               // 2
        birds.clear();                                  // []
        System.out.println(birds.isEmpty());            // TRUE
        System.out.println(birds.size());               // 0

    Dopo la chiamata del metodo "clear()", la lista "birds" è tornata all'inizio quando è stata dichiarata ed inizializzata
    come un "ArrayList" vuoto e di grandezza 0.


    contains():
    Il metodo "contains()" controlla se un certo valore è presente nella "Collection". La firma del metodo è la seguente:

        boolean contains(Object object)

    Il seguente codice mostra come usare questo metodo:

        List<String> birds = new ArrayList<>();
        birds.add("hawk");                              // ["hawk"]
        System.out.println(birds.contains("hawk"));     // TRUE
        System.out.println(birds.contains("robin"));    // FALSE

    Questo metodo chiama il metodo "equals()" su ogni elemento dell'"ArrayList" per vedere se esiste un match.


 */

public class CommonCollectionsMethods {
}
