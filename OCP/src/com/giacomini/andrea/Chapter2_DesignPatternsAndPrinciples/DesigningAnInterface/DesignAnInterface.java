package com.giacomini.andrea.DesignPatternsAndPrinciples.DesigningAnInterface;

/*
N.B: Una interfaccia è un tipo astratto simile ad una classe, che definisce una listadi di metodi PUBLIC abstract che dovranno
     essere implementati da quelle classi che "implements" l'interfaccia. Una interfaccia può anche includere variabili costanti PUBLIC STATIC FINAL,
     metodi di default e metodi STATIC.

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.DesigningAnInterface.Test.Fly;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.DesigningAnInterface.Test.Eagle;

    Il metodo "getWingSpan()" dell'interfaccia, dichiara che il metodo potrebbe lanciare una eccezione di tipo "Exception" (che è una cheked exception).
    Le regole dell'overriding dei metodi prevedono che il metodo, nella classe (Eagle) che "implements" l'interfaccia, che fa l'ovveride del metodo ereditato dall'interfaccia,
    possa a sua volta dichiararla oppure no. La seconda dichiarazione "MAX_SPPED" è una variabile costante STATIC disponibile ovunque all'interno
    dell'applicazione. Il metodo successivo "land()" è un metodo di default dell'interfaccia che è stato opzionalmente overridden nella classe "Eagle".
    In fine, il metodo "calculateSpeed()" è un membro statico dell'interfaccia ed esattamente come la costante "MAX_SPEED" è disponibile ovunque nel codice
    senza un'istanza dell'interfaccia (N.B: non è possibile istanziare una interfaccia).

    Un'interfaccia può estendere un'altra interfaccia e così facendo eredita i metodi abstract dell'interfaccia padre.

    Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.DesigningAnInterface.Test.Walk;
                       com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.DesigningAnInterface.Test.Run;
                       com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.DesigningAnInterface.Test.Lion;

    In questi esempi, l'interfaccia "Run" estende l'interfaccia "Walk" e eredita tutti i suoi metodi abstract. Si noti come i modificatori d'accesso
    usati nei metodi "isQuadruped()", "getMaxSpeed()" e "canHuntWhileRunning()" tra la classe e l'interfaccia sono PUBLIC e ABSTRACT.
    Il compilatore, aggiunge in modo automatico PUBLIC a tutti i metodi dell'interfaccia e ABSTRACT a tutti i metodi non-STATIC e non-DEFAULT
    se il programmatore non lo fa in modo esplicito. Al contrario, la classe che implementa l'interfaccia è costretta a fornire in modo
    esplicito i modificatori. Per esempio, il codice non compilerebbe se il metodo "getMaxSpeed()" non fosse marcato come PUBLIC nella classe "Lion".

    Dal momento che la classe "Lion" implementa l'interfaccia "Run", e che "Run" estende l'interfaccia "Walk", la classe "Lion"
    dovrà fornire un'implementazione concreta di tutti i metodi abstract ereditati. Come mostrato sempre in questi esempi
    con il metodo "getMaxSpeed()", la definizione del metodo d'interfaccia può essere duplicato in un'interfaccia figlia senza
    creare problemi.

    Si ricordi che un'interfaccia non può estendere una classe e che una classe non può estendere un'interfaccia.
    Per queste ragioni nessuno delle seguenti definizioni compila:

        - public interface Sleep extends Lion {}    // NON COMPILA;

        - public class Tiger extends Walk {}        // NON COMPILA;

    Nella prima definizione, l'interfaccia "Sleep" non può estendere "Lion", dal momento che "Lion" è una classe.
    Allo stesso modo, la classe "Tiger" non può estendere l'interfaccia "Walk".

    Le interfacce servono per fornire supporto limitato per l'ereditarietà multipla all'interno del linguaggio Java,
    come una classe può implementare multiple interfacce. Di seguito un esempio [Ereditarietà multipla di tipo]:

        public interface Swim {}

        public interface Hop {}

        public class Frog implements Swim, Hop {}

    In questo esempio, la classe "Frog" implementa entrambe le interfacce "Swim" e "Hop". Un'istanza di Frog potrà essere
    passata a qualsiasi metodo che accetta come paratro d'ingresso i tipi "Swim", "Hop", "Frog" oppure anche "Object" naturalmente.

    Come mostrato nell'esempio appena sopra, è possibile anche costruire interfacce che non hanno metodi membri e nemmeno classi membro
    tradizionalmente chiamate "marker interface". Nel capitolo 8 ("IO") si vedrà che l'interfaccia "java.io.Serializable",
    la quale non contiene metodi, è un'esempio di "marker interface".
    Le numerose regole, associate all'implementazione di interfacce, che si dovrebbe aver imparato a questo punto sono:

        - le interfacce non possono estendere classi, e nemmeno le classi possono estendere le interfacce;

        - le interfacce non possono essere marcate come FINAL (le parole chiave FINAL e ABSTRACT non vanno mai in coppia)
          e nemmeno istanziate direttamente;

        - se un'interfaccia o una classe eredita da due interfacce le quali hanno definito ciascuna un metodo di defualt
          con lo stesso nome, Java fallirà la compilazione se non verrà fornita una propria implementazione del metodo
          di default ereditato in modo da risolvere l'ambiguità;

 */

public class DesignAnInterface {
}
