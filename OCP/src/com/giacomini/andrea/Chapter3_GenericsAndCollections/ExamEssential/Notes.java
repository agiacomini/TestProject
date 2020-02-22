package com.giacomini.andrea.GenericsAndCollections.ExamEssential;

/*
 * N.B: I "Generics" sono tipi di parametri per il codice. Per creare una classe
 * 		con un parametro generico, bisogna aggiungere <T> prima del nome della classe.
 * 		Si può usare qualsiasi nome si voglia per il tipo di parametro. Generalmente
 * 		vengono scelte letterse singole maiuscole.
 * 		L'operatore <> (diamond) viene usato per dire a Java che il tipo generico 
 * 		corrisponde alla dichiarazione senza doverlo specificare nuovamente.
 * 		L'operatore <> può essere usato per le variabili locali o variabili d'istanza
 * 		noncché per le dichiarazioni su una linea.
 * 		I Generics permettono di specificare wildcards (*). 
 * 		
 * 		<?> è un "wildcard unbounded" che significa qualsiasi tipo. 
 * 		
 * 		<? extends Object> è un "upper bound" che significa qualsiasi tipo che 
 * 		è "Object" o che estende "Object".
 * 
 * 		<? extends MyInterface> significa qualsiasi tipo che implementa "MyInterface".
 * 
 * 		<? super Number> è un "lower bound" che significa qualsiasi tipo che è "Number"
 * 		o che sia super classe di "Number".
 * 
 * 		Risultano errori di compilazione del codice quando si tenta di aggiungere o 
 * 		rimuovere un'elemento in una lista con un "unbounded" o con un "upper-bound wildcard".
 * 		Quando si lavora con codice che non usa i "Generics" (conosciuto anche come codice
 * 		legacy o di tipo grezzo "raw type"), Java mostra dei warning al momento della compilazione.
 * 		Con un "compile warning" a differenza di un "compile error" il compilatore produce
 * 		comunque una file .class. Se si ignora un "compile warning" il codice potrebbe
 * 		lanciare un "ClassCastException" a run-time. L'"Unboxing" da/produce un "compile error"
 * 		quando non vengono usati i "Generics".
 * 		Ogni classe primitiva ha una corrispondente classe "Wrapper". Per esempio, la classe
 * 		"Wrapper" della primitiva "long" è la classe "Long". Java può automaticamente convertire
 * 		primitive e classi "Wrapper" quando necessario. Questa procedura viene chiamata 
 * 		"autoboxing" e "unboxing". Java userà solo l'"autoboxing" se non trova una firma
 * 		di metodo che match con la primitiva. Per esempio, verrà chiamato il metodo "remove(int i)"
 * 		piuttosto che "remove(Object o)" quando viene chiamato con un "int".
 * 
 *  	Il "Jaca Collections Framework" include quattro tipi principali di strutture dati: "list", "sets",
 *  	"queues" e le "maps". L'interfaccia "Collection" è l'interfaccia padre di "List", "Set" e "Queue".
 *  	L'interfaccia "Map" non estende ("extedns") "Collection":
 *  
 *     		- List  - E' una collezione ordinata di elementi che permette di avere anche elementi duplicati
 *     			. ArrayList - E' una lista standard ridimensionabile
 *     			. LinkdList - Può facilmente aggiungere/rimuovere dall'inizio o dalla fine della lista
 *     			. Vector    - E' una vecchia versione di ArrayList (Thread-Safe)
 *     			. Stack     - La vecchia aclasse last-in/first-out
 *     
 *     		- Set   - Non permette duplicati
 *     			. HashSet   - Usa il metodo "hashcode()" per cercare gli elementi non ordinati
 *     			. TreeSet   - Ordinata e navigabile. Non permette valori "null"
 *     
 *     		- Queue - Elementi ordinati per l'elaborazione
 *     			. LinkedList - Può facilmente aggiungere/rimuovere elementi dall'inizio o dalla fine della collezione
 *     			. ArrayDeque - First-in/First-out oppure Last-in/First-out. Non permette valori "nullk"
 *     		
 *     		- Map   - Mappa con coppia chiave/valore unici
 *     			. HashMAp    - Usa il metodo "hashCode()" per trovare la chiave
 *     			. TreeMap    - Mappa ordinata. Non permette chiavi "null"
 *     			. Hashtable  - Vecchia versione di "HashMap". Non permette ne chiavi ne valori "null"
 *     
 *      L'interfaccia "Comparable" dichiara il metodo "compareTo()". Questo metodo ritorna un
 *      numero negativo se l'oggetto è più piccolo del suo argomento, zero se i due oggetti sono 
 *      uguali e un numero positivo se l'oggetto è più grande del suo argomento.
 *      Il metodo "compareTo()" è dichiarato sull'oggetto che viene comparato e prende un solo
 *      parametro. 
 *      L'interfaccia "Comparator" definisce il metodo "compare()". Viene ritornato
 *      un numero negativo se il primo argomento è più piccolo, zero se i due argomenti sono 
 *      uguali, e un numero positivo se il primo argomento è più grande del secondo. Il metodo
 *      "compare()" prende due argomenti e può essere dichiarato in ogni parte del codice.
 *      L'interfaccia "Comparator" viene spesso implementato usando le lambda expressio.
 *      Le classi "Arrays" e "Collections" hanno metodi per "sort()" e "binarySearch()".
 *      Entrambi i metodi prendono un parametro opzionale "Comparator". E' necessario
 *      usare lo stesso ordine di ordinamento sia per l'ordinamento che per la ricerca, affinche
 *      il risultato non sia indefinito. La classe "Collections" ha alcuni metodi che prendono
 *      le lambda expression, inclusi "removeIf()", "forEach()" e "merge()".
 *      Un "method refence" è una sintassi compatta per scrivere le lambda expression che si
 *      riferiscono a metodi. Ci sono quattro tipi: "metodi statici", "instance method reference"
 *      a una specifica istanza, "instance method"  con l'istanza fornita a run-time, e infine
 *      "constructor reference".
 *      
 *         
 *      Exam Essentials:
 *      
 *      Scegliere il corretto tipo di "Collection" data una descrizione. Una "List" permette
 *      duplicati e di ordinare gli elementi. Un "Set" non permette invece elementi duplicati.
 *      Una "Queue" ordina i suoi elementi per permettere di recuperarli dall'inizio o dalla fine
 *      della coda stessa. Una "Map" mappa una chiave con un valore. 
 *      Avere famigliarità con le differenze di implementazione di queste interfacce.
 *      
 *      Saper identificare l'uso valido e l'uso non valido dei "Generics". <T> rappresenta un tipo
 *      di parametro. Può essere usato qualsiasi nome, ma usare una singola lettera maiuscola
 *      è la convenzione. <?> è un "unbounded wildcard". <? extends X> è un "upper-bounded wildcard"
 *      ed è applicabile sia a classi che a interfacce. <? super X> è un "lower-bounded wildcard".
 *      
 *      Riconoscere le differenze tra "compiler warnings" e "errors" quando si usa codice "legacy".
 *      Un "compiler warning" occorre quando si usano tipi non generici, e una eccezione "ClassCastExcpetion"
 *      potrebbe esser elanciata a run-time. Un "compiler error" invece occorre quando si fa l'unbox 
 *      da una collezione legacy.
 *      
 *      Saper distinguere tra "Comparable" e "Comparator". Per le classi che implementano l'interfaccia 
 *      "Comparable" si dice che hanno un ordine naturale e implementano il metodo "compareTo()".
 *      Ad una classe è permesso avere un solo ordine naturale. 
 *      Un "Comparator" prende due oggetti nel metodo "comapre()". Differenti "Comparator" possono
 *      avere differenti ordini di ordinamento. Un "Comparator" è spesso implementato usando le 
 *      lambda expression come: (a, b) -> a.num - b.num
 *      
 *      Conoscere il comportamento e l'uso dei metodi di ordinamento e di ricerca binaria. Le classi
 *      "Collecttions" e "Arrays" forniscono versioni overloaded (stesso nome di metodo ma lista di 
 *      argomenti differenti) dei metodi "sort()" e di "binarySearch()".
 *      Questi metodi prendono anche un parametro opzionale "Comparator". La lista o l'array deve essere
 *      ordinato prima di poter eseguire la ricerca usando la stessa definizione di ordine per entrambi.
 *      
 *      Essere in grado di convertire "method references" in lambda expression regolari e vice versa.
 *      Per esempio, il "method references" System.out::print può essere convertito nella labda expression
 *      "x -> System.out.println(x)". Questi due forme sono equivalenti.
 * 		
 * */

public class Notes {

}
