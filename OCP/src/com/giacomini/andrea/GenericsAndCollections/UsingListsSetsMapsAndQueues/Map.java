package com.giacomini.andrea.GenericsAndCollections.UsingListsSetsMapsAndQueues;

/*
N.B: Si usa una "Map" quando si vuole identificare un valore attraverso una chiave. Per esempio, quando si usa la lista
     di contatti nel proprio telefono cellulare, si cerca "George" piuttosto che guardare attraverso ogni singolo numero
     di telefono.
     Si può immaginare una "Map" come quella mostrata nella figura di seguito riportata:

        -------------------------
        | George | 555-555-5555 |
        |  Mary  | 777-777-7777 |
        -------------------------

    Non si ha bisogno di sapere il nome delle specifiche interfacce che le differenti mappe implementano, ma si ha bisogno
    si sapere the "TreeMap" è ordinata e navigabile.
    La cosa principale che tutte e quattro le classi, che implementano l'interfaccia "Map", hanno in comune sono le coppie 
    chiave/valore. Oltre a questo, ognuna offre differenti funzionalità. Verranno analizzate le implementazioni che si deve
    conoscere e i metodi disponibili.



    Comparing Map Implementation:
    Una "HashMap" memorizza le chiavi in una tabella di hash. Questo significa che viene usato il metodo "hasCode()" delle
    chiavi per recuperare il loro valore in modo più efficace.
    Il principale beneficio è che aggiungere elementi e recuperare un elemento per chiave ha lo stesso tempo costante.
    Il lato negativo invece è che si perde l'ordine nel quale si è inserito gli elementi. Molte volte, non si è interessati
    a questo aspetto quando si usa una mappa. Se invece questo aspetto è rilevante per il problema che si stà risolvendo
    si potrebbe usare una "LinkedHashMap".
    Una "TreeMap" memorizza le chiavi in una struttura ordinata ad albero. Il principale beneficio di ciò è che le chiavi
    sono sempre ordinate in ordine. Il lato negativo è che aggiungere e controllare se una chiave è presente sono entrambe
    operazioni di complessità O(log n) (Tempo Logaritmico, come la ricerca binaria).
    Una "Hashtable" è come un "Vector" in quanto è veramente vecchio e "thread-safe" e non è quello che ci si aspetta di usare.
    Contiene una "t" minuscola come errore. Tutto quello che bisogna fare è essere in grado di individuarla.
    Usando una analogia "ArrayList" sta a "Vector" come "HashMap" sta a "Hashtable".



    Working with Map Methods:
    Dato che "Map" non estende "Collection" ci sono molti metodi specificati nell'interfaccia "Map". Dal momento che ci sono
    sia chiavi che valori si ha bisogno di un parametro di tipo generico per entrambi. La classe usa "K" come chiave e
    "V" come valore. Molte delle firme dei metodi che bisogna conoscere per l'esame sono mostrati di seguito:

        Method                          Description

        void clear()                    Rimuove tutte le chiavi e valori dalla mappa;

        boolean isEmpty()               Ritorna se la mappa è vuota;

        int size()                      Ritorna il numero di elementi (coppie chiave/valore) presenti nella mappa;

        V get(Object key)               Ritorna il valore mappato dalla chiave oppure "null" se non è mappato;

        V put(K key, V value)           Aggiunge o sostituisce la coppia chiave/valore. Ritorna il precedente valore oppure "null";

        V remove(Object jey)            Rimuove e ritorna il valore mappato dalla chiave. Ritorna "null" se non è presente;

        boolean                         Ritorna il valore se presente nella mappa;
        containsValue(Object value)

        Set<K> keySet()                 Ritorna un'insieme ("Set") di tutte le chiavi;

        Collection<V> values()          Ritorna Collecttion di tutti i valori;

     Come sempre compariamo l'esecuzione dello stesso codice con due differenti tipi di mappa. Iniziamo con "HashMap":

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");             // bamboo
        for(String key : map.keySet()){
            System.out.println(key + ",");          // koala, lion, giraffe,
        }

     Java usa il metodo "hashCode()" della chiave per determinare l'ordine. L'ordine qui non viene ordinato, o l'ordine
     in cui si è digitato i valori. Vediamo ora come si comporta con una "TreeMap":

        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala");             // bamboo
        for(String key : map.keySet()){
            System.out.println(key + ",");          // koala, lion, giraffe,
        }

     "TreeMap" ordina le chiavi come ci si aspetta. Se si avesse chiamato il metodo "values()" invece di "keySet()" l'ordine
     dei valori corrisponderebbe all'ordine delle chiavi.
     Sempre con la nostra semplice mappa, si può provare qualche controllo booleano:

        System.out.println(map.contains("lion"));               // NON COMPIAL -
        System.out.println(map.containsKay("Lion"));            // TRUE
        System.out.println(map.containsValue("lion"));          // FALSE
        System.out.println(map.size());                         // 3

    La prima riga è leggermente complicata. Il metodo "contains()" è un metodi dell'interfaccia "Collection" ma non della
    interfaccia "Map". Le due righe successive mostrano che le chiavi e i valori sono controllati separatamente. Infine,
    si vede che ci sono tre coppie chiave/valore nella mappa.
 */

public class Map {
}
