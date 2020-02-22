package com.giacomini.andrea.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming;

/*
N.B: Di seguito un'esempio di interfaccia funzionale e di una classe che la implementa.

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Sprint;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Tiger;

     In questi esempi l'interfaccia "Sprint" è un'interfaccia funzionale perché contiene esattamente un metodo abstract, e la
     classe "Tiger" è una classe valida che implementa l'interfaccia.

     N.B: Applicare l'annotazione @FunctionalInterface - mentre è buona pratica marcare un'interfaccia con l'annotazione
          @FunctionalInterface per chiaraezza, non è richiesto con la programmazione funzionale. Il compilatore Java
          assume implicitamente che qualsiasi interfaccia che contiene esattamente un metodo abstract sia un'interfaccia
          funzionale. Al contrario se un'interfaccia, che contiene più di un metodo abstract o non contiene proprio
          metodo abstract, viene marcata con l'annotazione @FunctionalInterface il compilatore non permetterà di compilare
          ed evidenzierà un errore.

          Un problema derivante dal non annotare sempre un'interfaccia funzionale con l'appropriata annotazione è che
          un'altro sviluppatore potrebbe trattare qulasiasi interfaccia che si è creata con un solo metodo come un'interfaccia
          funzionale. In questo modo, nel momento in cui si dovesse modificare l'interfaccia aggiungendo alri metodi abstract,
          improvvisamente il codice del secondo sviluppatore non funzionerebbe più in quanto l'interfaccia non sarebbe più di
          tipo funzionale.

          Per questo motivo si raccomanda di marcare esplicitamente con l'annotazione "@FunctionalInterface" le interfacce
          create con un solo metodo abstract per permettere agli altri sviluppatori di sapere a quali interfacce possono
          applicare con sicurezza le lambda expression, senza avere il problema che queste cessino di essere funzionali lungo il percorso.

     Si consideri le seguenti tre interfacce, assumendo "Sprint" sia la nostra precedente interfaccia funzionale:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Sprint;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Run;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.SprintFaster;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Skip;

     Quali di queste tre (Run, SprintFaster, Skip) sono interfacce funzionali come "Sprint"? Tutte e tre sono valide interfacce
     funzionali. L'interfaccia "Run" non definisce nuovi metodi ma dal momento che estende "Sprint", la quale definisce un singolo
     metodo abstract, anchessa di conseguenza sarà di tipo funzionale. L'interfaccia "SprintFaster" estende "Sprint" e definisce
     un metodo abstract ma questo non è altro che un'override del metodo asbrtact "sprint()" della classe parent "Sprint" che
     è funzionale; perciò l'interfaccia risultante ha un solo metodo abstract e per questo viene considerata anchessa una
     interfaccia funzionale. L'interfaccia "Skip" estende "Sprint" e definisce un metodo statico e un metodo di default, ognuno
     con una sua implementazione. Dal momento che nessuno di questi due metodi è di tipo abstract l'interfaccia risultante ha solo
     un metodo abstract e perciò viene considerata anchessa un'interfaccia funzionale.

     Queste interfacce appena descritte (Run, SprintFester, Skip) sono variazioni di una valida interfaccia funzionale.

     Diamo un'occhiata ora ad alcune variazioni non valide usando sempre la nostra precedente definizione di interfaccia
     funzionale "Sprint":

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Walk;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Dance;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test.Crawl;

     Tutte e tre le interfacce (Walk, Dance, Crawl) compilano correttamente ma nessuna di queste viene considerata una
     interfaccia funzionale. L'interfaccia "Walk" non estende nessuna classe interfaccia funzionale e non definisce
     nessu metodo abstract, quindi non potrà essere considertata una interfaccia funzionale. L'interfaccia "Dance" estende l'interfaccia
     "Sprint", la quale già include un metodo abstract, portando il totale di metodi abstract per quella classe a due; quindi
     "Dance" non potrà essere considerata una interfaccia funzionale. In fine, l'interfaccia "Crawl" definisce due metodi
     abstract perciò nemmeno questa potrà essere considerata una interfaccia funzionale.
     In questi ultimi tre esempi, se si dovesse riportare su ognuna di queste tre interfacce l'annotazione @FunctionalInterface
     il compilatore Java ritornerebbe errore, così come tentando di utilizzarle implicitamente come interfacce funzionali
     in una lambda expression.
 */

public class DefiningAFunctionalInterface {
}
