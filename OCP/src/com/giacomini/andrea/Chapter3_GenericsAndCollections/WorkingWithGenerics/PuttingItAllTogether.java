package com.giacomini.andrea.GenericsAndCollections.WorkingWithGenerics;

/*
N.B: A questo punto si conosce tutto quello che è necessario sapere per rispondere alle domande d'esame sui "genrics".
     E' possibile mettere insieme tutti questi concetti per scrivere del codice veramente confuso, come agli esaminatori
     piace fare.
     Questa sezione sarà difficile da leggere. Contiene le domande più difficili che si possano incontrare riguardo i "generics".
     Le domande d'esame saranno probabilmente più facili da leggere di queste. Qui però si vuole testare le nostre abilità prima
     dell'esame. In altre parole, "niente panico". Rileggete il codice più volte se serve.
     Proviamo un esempio. Prima di tutto, dichiariamo tre classi che l'esempio userà:

        class A {}
        class B extends A {}
        class C extends B {}

     Riesci a capire perché alcuni compilano e altri no? Inoltre, riesci a capire cosa fanno?

        6:  List<?> list1 = new ArrayList<A>();
        7:  List<? extends A> list2 = new ArrayList<A>();
        8:  List<? super A> list3 = new ArrayList<A>();
        9:  List<? extends B> list4 = new ArrayList<>(A);            // NON COMPILA -
        10: List<? super B> list5 = new ArrayList<A>();
        11: List<?> list6 = new ArrayList<? extends A>();           // NON COMPILA -

     La linea 6 crea un "ArrayList" che può ospitare istanze della classe A. Viene memorizzata in una variabile con un
     "unbonded wildcard". Qualsiasi tipo generico può essere referenziato da un "unbounded wildcard", rendendo questa
     istruzione OK.
     La linea 7 prova a memorizzare una lista in una dichiarazione di variabile con un "upper-bounded wildcard".
     Questa situazione è OK. Tu puoi avere "ArrayList<A>", "ArrayList<B>" o "ArrayList<C>" memorizzate in quel riferimento.
     La linea 8 è OK. Questa volta, si ha un "lower-bound wildcard". Il tipo più basso che si può referenziare è "A".
     Dal momento che quello è quello che si ha, il codice compila.
     La linea 9 ha un "upper-bound wildcard" che permette ad "ArrayList<B>" e "ArrayList<C>" di essere referenziati. Dal
     momento che si ha "ArrayList<A>" quello stà tentando di essere referenziato, il codice non compila.
     La linea 10 ha un "lower-bounded wildcard" il quale permette un riferimento ad "ArrayList<A>", "ArrayList<B>" e "ArrayList<Object>".
     Infine, la liena 11 permette un riferimento a qualsiasi tipo generico dal momento che ha un "unbounded wildcard".
     Il problema è che si ha bisogno di sapere cosa sarà quel tipo quando si inizializza l'ArrayList. Non è comunque utile,
     perché non è possibile aggiungere nessu elemento a quel ArrayList.
     Passiamo ora ai metodi. Stessa domanda: prova a capire come mai il codice non compila e cosa fanno. Presentiamo i
     metodi uno alla volta perché c'è ancora molto da pensare.

        <T> T method1(List<? extends T> list){

            return list.get(0);
        }

     Il "method1()" è un'uso perfettamento normale dei generics. Utilizza un parametro di tipo specifico del metodo, T.
     Prende un parametro "List<T>", o qualunque sotto-classe di "T", e ritorna un singolo oggetto di quel tipo "T". Per esempio,
     si potrebbe chiamarlo con un parametro "List<String>" e avere una "String" come ritorno. Oppure si potrebbe chiamarlo
     con un parametro "List<Number>" ed avere come ritorno un "Number".
     Dato il precedente, si dovrebbe essere in grado di capire cos'è che non va nel codice seguente:

        <T> <? extends T> method2(List<? extends T> list) {             // NON COMPILA -

            retunr list.get(0);
        }

     Il "method2()" non compila perché il tipo di ritorno non è in realtà un tipo. Si stà scrivendo il metodo. Si conosce
     quale tipo si suppone venga restituito. Non si specifica questo come wildcard.
     Ora si faccia attenzione - questo è molto complicato:

        <B extends A> B method3(List<B> list){

            return new B();             // NON COMPILA -
        }

     Il "method3()" non compila. "<B extends A>" dice che si vuole usare "B" come tipo di parametro solo per questo metodo
     e che c'è bisogno di estendere la classe "A". Simultaneamente, "B" è solo il nome di una classe. Non è solo una
     coincidenza. E' un trucco cattivo. All'interno dello "scope" del metodo, "B" può rappresentare "A", "B" o "C"
     perché tutti estendono la classe "A". Dal momento che "B" non si riferisce più alla classe "B" nel metodo,
     non è possibile istanziarla.
     Dopo di che sarebbe bello ottenre qualcosa di simile:

        void method4(List<? super B> list){


        }

     Il metodo "method4()" è un normale uso dei generics. E' possibile passare il tipo "List<B>", "List<A>" o "List<Object>".
     Infine, questa è l'ultima domanda:

        <X> void method5(List<X super B> list){             // NON COMPIAL -

        }

     Il metodo "method5()" non compila perché prova a mischiare un parametro di tipo specifico del metodo con un wildcard.
     Un wildcard deve avere un "?" in esso.
     Il resto del capitolo sarà più semplice da capire, e solo le basi dei generics saranno usate nel resto del capitolo.

 */

public class PuttingItAllTogether {
}
