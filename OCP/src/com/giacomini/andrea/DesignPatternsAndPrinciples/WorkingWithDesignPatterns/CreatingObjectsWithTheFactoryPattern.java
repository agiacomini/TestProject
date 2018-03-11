package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns;

/*
N.B: L'ultimo pattern creazionale che si discuterà è il "facotry pattern".

     Problema: Come si scrive codice che crea oggetti nei quali il tipo preciso dell'oggetto può non essere conosciuto
     fino a runtime?

     Motivazione: Come si è visto nel "builder pattern", la creazione degli oggetti può essere abbastanza complicata.
     Si vorrebbe un modo per incapsulare la creazione di oggetti per affrontare la complessità della creazione dell'oggetto,
     compresa la selezione della sotto-classe da utilizzare, nonché la "loosely coupling" ???

     Soluzione: Il "factory pattern", conosciuto anche come "factory method pattern", è un pattern creazionale basato
     sull'idea di usare una classe factory per produrre un'istanza dell'oggetto basata su un'insieme di parametri di input.
     E' simile al "builder pattern" ed è focalizzato sul supporto del polimorfismo delle classi.
     Il "factory pattern" è spesso, non sempre, implmentato usando metodi STATIC che ritornato oggetti e che non richiedono
     un puntatore ad un'istanza della classe factory. E' anche una buona pratica di codifica posticipare il nome della
     classe con la parola "Facotry", come per esempio "FactoryAnimal", "ZooFactory".

     Vediamo un esempio di factory pattern che riguarda gli animali dello zoo e il cibo che mangiano. Immaginiamo un
     custode dello zoo che ha la necessità di dar da mangiare ad un'ampia varietà di animali dello zoo differenti tipi di cibo.
     Alcuni animali mangiano uno specifico tipo di cibo, altri invece condividono lo stesso tipo di cibo. Inoltre,
     uno specifico valore quantitativo è associato ad ogni distribuzione di cibo per animale.

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.Food;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.Hay;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.Pellets;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.Fish;

     Si definisca ora un "FoodFactory" usando il factory pattern che ritorna un tipo di cibo basato su un'insieme di input,
     come mostrato nel codice di seguito:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.FoodFactory;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.ZooKeeper;

     A seconda del valore della variabile "animalName", viene ritornato un differente tipo di cibo da usare nella nostra
     factory. Il factory pattern ci da un numero di carattertiche. Prima di tutto, differenti animali possono condividere
     lo stesso cibo, come "got" e "rabbit" mangiano entrambi "Pellets" ma con una quantità diversa. Poi, si noti come nel
     metodo "ZooKeeper" non interessa il tipo particolare di cibo che si ottiene, purché estenda la classe astratta "Food".
     Questa "loose coupling" tra le classi "ZooKeepr" e "Food" ci permette di cambiare le regole in "FoodFactory" anche in
     un secondo momento senza richiedere modifiche al codice della classe "ZooKeeper". Naturalmente, lo sviluppatore
     potrà castare l'oggetto ad una particolare sotto-classe di "Food" dopo che è stata ritornata dalla classe "FoodFactory",
     anche se tale pratica è generalmente scoraggiata quando si usa un "factory pattern" in quanto crea una soluzione
     "tightly coupled" (strettamente accoppiata).

     N.B: Factory Pattern and Default Class Constructors
     Si può notare come, nel precedente esempio, tutte le classi Food e i costruttori delle sotto-classi sono marcate
     come PUBLIC. Non è possibile ovviamente marcare il costruttore come PRIVATE, questo impedirebbe alla classe "FoodFactory"
     di creare qualsiasi istanza della classe "Food". Non si potrebbe nemmeno marcarle come PROTECTED, dal momento che la
     classe "FoodFactory" non è sottoclasse di "Food" e nemmeno dovrebbe esserlo.
     L'unico problema del marcarli come PUBLIC è che qualsiasi classe potrebbe bypassare il nostro "factory pattern" e
     creare istanze della classe "Food" direttamente. Se volessimo restringere il controllo degli accessi, si potrebbe
     dichiarare questi costruttori con un modificatore d'accesso di default (package-level access) senza specificare
     quindi nessun tipo di modificatore esplicito.
     Il vantaggio di usare un'accesso di default è che forza qualsiasi classe fuori dal package ad usare la classe
     "FoodFactory" per creare un'istanza dell'oggetto "Food", prevenendo così l'istanziazione diretta dell'oggetto "Food".
     L'unica limitazione è che la classe "FoodFactory" e tutte le sotto-classi di "Food" ("Food" compresa) dovranno
     essere inserite sotto il medesimo package. Se una classe "Food" esiste in un differente package da quello di "FoodFactory"
     e si vuole usare "FoodFactory" per creare un'istanza di quell'oggetto "Food" allora dovrà essere fornito un
     metodo PUBLIC.

     Come alternativa all'uso del "factory pattern" uno sviluppatore potrebbe implementare un'insieme di classi "Animal"
     e definire un metodo "getFood()" in ognuna delle classi che ritorni un'oggetto "Food". La limitazione di questa soluzione
     è che unisce/lega strettamente l'animale al cibo che mangia. Per esempio, se un particolare cibo non fosse più disponibile,
     tutte quelle classi che usavano quel tipo di cibo dovranno essere cambiate. Usando un "factory pattern" si crea
     codice poco accoppiato che è più resistente ai cambiamenti nell'alimentazione degli animali.

     N.B: Design Pattern: Elements of Reusable Object-Oriented Software
     Se si è trovato interessante questo capitolo sui "Design Pattern" è consigliabile allora dare una lettura anche al
     libro "Design Pattern (Addison-wesley Professional, 1994)" degli autori "Gang of Four".
     Il libro "Design Patterns" è considerato uno dei più influenti libri di ingegneria mai scritto, e costituisce
     le fondamenta di molti dei design pattern che si usano oggi.

 */

public class CreatingObjectsWithTheFactoryPattern {
}
