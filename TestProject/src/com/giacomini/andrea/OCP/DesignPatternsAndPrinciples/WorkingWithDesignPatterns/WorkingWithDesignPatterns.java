package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns;

/*
N.B: Un "Design Pattern" è una soluzione generale consolidata per risolvere problemi comuni nello sviluppo software.
     Lo scopo di un "design patter" è quello di sfruttare la ricchezza di conoscenza degli sviluppatori che sono venuti prima
     di noi al fine di risolvere vecchi problemi che si possono incontrare facilmente lungo il percorso. Dà agli sviluppatori anche un vocabolario
     comune in cui possono discutere dei problemi e delle soluzioni. Per esempio, se si dice di aver scritto i getter/setter
     o di aver implementato il "singleton pattern", molti sviluppatori capiranno la struttura del tuo codice senza dover
     entrare nei dettagli di basso livello.

     In questo capitolo, ci si focalizzerà sui "creational patterns", un tipo di patter per lo sviluppo software che gestisce
     la creazione di oggetti all'interno di un'applicazione. Ovviamente, si saprà già come creare un'oggetto in Java con la
     parola chiave "new", come mostrato di seguito:

        Animal animal = new Camel();

     Il problema con la creazione di oggetti, tuttavia, risiede in come creare e gestire oggetti in sistemi più complessi.
     In questo esempio, si richiede di sapere esattamente quale tipo di oggetto "Animal", in questo caso "Camel", si vuole creare
     al momento della compilazione. Ma cosa succede se questo non è noto fino a runtime? Inoltre, cosa succede se volessimo creare
     un singolo oggetto "Animal" in memoria che sia condiviso da tutte le classi all'interno della nostra applicazione?
     Investigheremo su questo tipo di questioni di creazione e i loro pattern associati in questa sezione.
     Una cosa importante da tenere a mente mentre si legge questa sezione è che la parola chiave "new" viene ancora
     usata per creare oggetti in memoria. Il "creational pattern" semplicemente applica un "livello di indirezione" alla
     creazione dell'oggetto creando l'oggetto in qualche altra classe, piuttosto che creare l'oggetto direttamente nell'
     applicazione. Il "livello di indirezione" è un termine generale per risolvere un problema di design pattern
     concettualmente separando l'attività in livelli multipli.

     N.B: Per l'esame OCP si richiede di sapere solo i primi due dei quattro design patter che verranno presentati:
          il "singleton pattern" e l'"immutable object pattern".


 */

public class WorkingWithDesignPatterns {
}
