package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples;

/*
N.B: Nel capitolo "1-Advanced Class Design" si è introdotto l'operatore "instaceof" e mostrato come dovrebbe essere usato per
     determinare quando un'oggetto è un'istanza di una particolare classe, super-classe o interfaccia. Nella progettazione
     orientata agli oggetti, si descrive la proprietà di un'oggetto come istanza di un tipo di dato che ha una relazione "is-a".
     Questa relazione "is-a" è anche conosciuta come test di ereditarietà.
     Il risultato fondamentale del principio "is-a" è che se "A is-a B", allora qualsiasi istanza di A può essere trattata come un'istanza di B.
     Questo è vero per un figlio che è sotto-classe di qualsiasi parent, sia essa sotto-classe diretta oppure un figlio distante.
     Come discusso per il polimorfismo, gli oggetti possono assumere forme differenti.
     Quando si costruisce un modello di dati basato sulla gerarchia, è importante applicare la relazione "is-a" regolarmente,
     così che si possano progettare classi che concettualmente abbiano senso. Per esempio, si immagini di avere una classe "Cat"
     che estende una classe "Pet":

        public class Pet {}
        public class Cat extends Pet {}

     La classe parent "Pet" usa comunemente campi come "name" e "age". Come sviluppatore, si potrebbe anche progettare
     una classe "Tiger" e dal momento che anche le tigri hanno un "age" e un "name", si potrebbe essere inclini ad riusare
     la classe parent "Pet" allo scopo di risparmiare tempo e linee di codice.

        public class Pet {}
        public class Cat extends Pet {}
        public class Tiger extends Pet {}           // Tiger is-a Per

     Purtroppo, la classe "Pet" ha anche un metodo "cuddle()" (coccolare), con il risultato che si incoraggiano le persone
     ad abbracciare le tigri! Riutilizzando la classe parent "Pet", si stà concettualmente affermando che una "Tiger" is-a
     "Pet" (animale domestico), anche se in realtà una tigre non è un'animale domestico. Anche se questo esempio è
     funzionalmente corretto e fa rispariare tempo e linee di codice, il risultato di non applicare la relazione
     "is-a" è che si è creata una relazione che viola il modello dei dati.
     Si provi a fissare/risolvere il problema posizionando "Pet" e "Tiger" sotto la medesima classe parent "Feline" e vedere
     se con questa soluzione di risolve il problema:

        public class Feline
        public class Pet extends Feline {}
        public class Tiger extends Feline {}
        public class Cat extends Pet {}
        public class Dog extends Pet {}

     La gerarchia di classi ora funziona ed è consistente, ma come mostrato nell'esempio qui sopra se si aggiunge un figlio
     "Dog" a "Pet" si incontra un problema con il test "is-a". Un "Dog is-a Pet", e "Pet is-a Feline", ma il modello dei
     dati implica che "Dog is-a Feline" che ovviamente non è possibile.
     Come visto in questo esempio, la relazione "is-a" ci aiuta ad evitare di creare modelli di oggetti che contengono
     contraddizioni. Una soluzione a questo esempio sarebbe quella di NON combinare "Tiger" e "Pet" nello stesso modello,
     preferendo scrivere codice duplicato piuttosto che creare  dati inconsistenti.
     Un'altra soluzione potrebbe essere quella di usare la proprietà di multi-ereditarietà delle interfaccia e dichiarare
     "Pet" come interfaccia piuttosto che come classe parent, come mostrato di seguito:

        public interface Pet {}
        public class Animal {}
        public class Feline extends Animal {}
        public class Dog extends Animal implmenets Pet {}
        public class Cat extends Feline implements Per {}
        public class Tiger extends Feline {}

     Come si può vedere da questo esempio il modello degli oggetti ora è corretto usando il test "is-a". Per esempio,
     "Cat is-a Animal", "Tiger is-a Feline", "Dog is-a Animal". "Pet" è ora separato dal modello delle classi gerarchico, ma
     usando le interfaccie si preserva la relazione che "Cat is-a Pet" e "Dog is-a Pet".
*/

public class ApplyingTheIsARelationship {
}
