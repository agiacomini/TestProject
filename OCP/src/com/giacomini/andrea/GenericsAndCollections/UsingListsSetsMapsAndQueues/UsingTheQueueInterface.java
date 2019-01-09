package com.giacomini.andrea.GenericsAndCollections.UsingListsSetsMapsAndQueues;

/*
N.B: Si usa una coda ("queue") quando gli elementi sono aggiunti e rimossi in uno specifico ordine. Le code sono
     tipicamente usate per ordinare elementi prima che vengano processati. Per esempio, quando si vuole comprare un biglietto
     e qualcuno stà aspettando in fila, tu ti metti in fila dietro a quella persona.
     Salvo diverse indicazioni, si presume che una coda sia FIFO (first-in, first-out). Alcune implementazioni di code
     cambiano questo per usare un differente ordine. E' possibile immaginare una coda FIFO come mostrata nella figura
     3.5 alla pagina 135 del libro. L'altra forma comune delle code è quella LIFO (last-in, first-out).

     Tutte le code hanno specifici requisiti per aggiungere e rimuovere l'elemento successivo. Dietro a quello, ognuna
     offre differenti funzionalità. Daremo uno sgurado alle implementazioni da conoscere ed ai metodi disponibili.

                  --------------------------------
            front | FIRST PERSON | SECOND PERSON | back
                  --------------------------------

     Comparing Queue Implementations:
     Si sono viste le "LinkedList" nella sezione precedente riguardante le "List". Oltre ad essere ua lista è anche una
     coda doppia. Una coda doppia è una differente forma di coda regolare nella quale si può inserire e rimuovere elementi
     sia dalla cima che dal fondo della coda.
     Il beneficio principale di una "LinkedList" è che implementa sia l'interfaccia "List" che l'interfaccia "Queue".
     Il compromesso è che però non è molto efficiente come pura coda.
     Un "ArrayDeque" è una pura doppia coda. E' stata introdotta in Java 6 e memorizza i suoi elementi in un array
     serializzabile. Il suo beneficio principale è che è più efficiente di una "LinkedList". "Deque" == "d-queue".



     Working with Queue Methods:
     L'"ArrayDeque" contiene molti metodi. Fortunatamente, ci sono solo otto metodi che bisogna conoscere oltre a quelli
     ereditati da "Collections". Questi metodi sono mostrati di seguito:

        Method                  Description                                     For queue   For stack
        																		(FIFO)		(LIFO)

        boolean add(E e)        Aggiunge un'elemento alla fine delle coda       YES         NO
                                e ritorna TRUE o lancia una eccezione;

        E element()             Ritorna l'elemento successivo o lancia          YES         NO
                                una eccezione se la coda è vuota;

        boolean offer(E e)      Aggiunge un elemento alla fine della coda       YES         NO
                                e ritorna TRUE se ha avuto successo oppure
                                può lanciare una eccezione;

        E remove()              Rimuove e ritorna l'elemento successivo o       YES         NO
                                lancia una eccezione se la coda è vuota;

        void push(E e)          Aggiunge un'elemento in cima alla coda;         NO          YES

        E poll()                Rimuove e ritorna l'elemento successivo o       YES         NO
                                ritorna "null" se la coda è vuota;

        E peek()                Ritorna l'elemento successivo o ritorna null    YES         YES
                                se la coda è vuota;

        E pop()                 Rimuove e ritorna l'elemento successivo o       NO          YES
                                lancia un'eccezione se la code è vuota;


    Eccetto che per i metodi "push()" e "pop()", tutti questi metodi appartengono all'interfaccia "Queue". I metodi "push()"
    e "pop()" sono quelli che rendono una coda una doppia-coda.
    Come si può vedere, ci sono basicamente due insiemi di metodi. Un'insieme lancia una eccezione quando qualcosa
    va storto. L'altro insieme invece usa un differente valore di ritorno quando qualcosa va storto. I metodi offer/poll/peek
    sono i più comuni. Questo il linguaggio standard che usano le persone quando lavorano con le code.
    Diamo un'occhiata ad un'esempio che usa alcuni di questi metodi:

        12: Queue<Integer> queue = new ArrayDeque<>();				// - Doppia coda pura -
        13: System.out.println(queue.offer(10));                    // TRUE
        14: System.out.println(queue.offer(4));                     // TRUE
        15: System.out.println(queue.peek());                       // 10
        16: System.out.println(queue.poll());                       // 10
        17: System.out.println(queue.poll());                       // 4
        18: System.out.println(queue.peek());                       // null

    La figura di seguito riportata mostra come la coda si comporta all'esecuzione dei precedenti step:

        queue.offer(10);    // TRUE     | 10 |
        queue.offer(4);     // TRUE     | 10 | 4 |
        queue.peek();       // 10       | 10 | 4 |
        queue.poll();       // 10       | 4 |
        queue.poll();       // 4
        queue.peek();       // null

    Le linee 13 e 14 aggiungono un'elemento alla fine della coda. Alcune code sono di dimensioni limitate, il che causerebbe
    il fallimento in fase di offerta di un nuovo elemento (offer() method). Non si incontrerà però questo segnario in sede
    di esame. La linea 15 guarda il primo elemento in coda ma non lo rimuove. La linea 16 e 17 rimuovono gli elementi nella
    coda il che ci porta ad avere una coda vuota. La linea 18 prova a guardare il primo elemento della coda, ma essendo ora
    una coda vuota ci viene restituito un valore "null".
    E' stato detto in precedenza che "ArrayDeque" è una coda di tipo doppia-coda. Che cosa succede se si vole aggiungere
    un elemento nell'altra estremità proprio come fa uno "Stack"? Nessun problema. Basta semplicemente chiamare il metodo
    "push()". Funziona come il metodo "offer()" eccetto che inserire il nuovo elemento nell'altra estremità della coda.
    Quando si parla di LIFO (stack), le persone dicono push/pop/peek. Quando si parla di FIFO (single-ended queue), le
    persone parlano di offer/poll/peek.
    Proviamo ora a riscrivere l'esempio di codice precedente usando le funzionalità stack:

        12: ArrayDeque<Integer> stack = new ArrayDeque<>();
        13: stack.push(10);
        14: stack.push(4);
        15: System.out.println(stack.peek());                  // 4
        16: System.out.println(stack.pop());                   // 4
        17: System.out.println(stack.pop());                   // 10
        18: System.out.println(stack.peek());                  // null

    La figura di seguito riportata mostra come viene rappresentata la coda (stack - LIFO) ad ogni passaggio del codice precedente.

        stack.push(10);             | 10 |
        stack.push(4);              | 4 | 10 |
        stack.peek();       // 4    | 4 | 10 |
        stack.pop();        // 4    | 10 |
        stack.pop();        // 10
        stack.peek();       // null

    Le linee 13 e 14 inseriscono un elemento in cima allo stack. Il resto del codice guarda la parte frontale (anteriore).
    La differenza tra un "ArrayDeque" che viene usato come stack e un "ArrayDeque" che viene usato come una coda è veramente
    importante. Ricordiamo che una coda viene vista come una fila di persone. Si entra dal dietro (back) e si esce dalla parte
    anteriore (front). Uno stack invece viene visto come una pila di piatti. Si mette il piatto in cima alla pila e si
    prende il piatto sempre in cima alla pila. Dal momento che lo stack è implementato usando "ArrayDeque", ci si riferisce
    ai termini "top" e "front" in modo intercambiabile.
    Una "LinkedList" funziona allo stesso modo di un "ArrayDeque", per questo motivo eviteremo di mostrare il codice
    per quello.

 */

public class UsingTheQueueInterface {
}
