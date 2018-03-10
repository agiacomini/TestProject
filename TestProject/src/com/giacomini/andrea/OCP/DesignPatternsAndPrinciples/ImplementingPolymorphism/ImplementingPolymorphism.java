package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism;

/*
N.B: Il "Polimorfismo" è l'abilità di una singola interfaccia di supportare molteplici forme sottostanti.
     In Java, questo permette a multeplici tipi di oggetti di essere passati ad un singolo metodo o classe.
     Vediamo un esempio per illustrarne lo scopo del polimorfismo:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test.LivesInOcean;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test.Dolphin;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test.Whale;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test.Oceanographer;

     In questo semplice codice la classe "Oceanographer" include un metodo chiamato "checkSound()" in grado di accettare
     qualsiasi oggetto che implementa l'interfaccia "LivesInOcean". E' possibile creare anche altri oggetti, come "Fish" e "Lobster",
     che implementano anchessi l'interfaccia "LivesInOcean" e renderli così compatibili per la classe "Oceanographer".
     Il polimorfismo permette inoltre ad un'oggetto di prendere molte forme differenti. Come già visto nell'esame OCA,
     un'oggetto Java può essere acceduto usando un riferimento dello stesso tipo dell'oggetto, oppure con un riferimento che
     è super-classe di quell'oggetto, o ancora con un riferimento del tipo dell'interfaccia che l'oggetto implementa,
     sia direttamente che attraverso la super-classe. Inoltre, un cast non è richiesto se l'oggetto viene riassegnato ad
     un super-tipo o interfaccia di quell'oggetto.
     Gli esempi seguenti illustrano queste proprietà del polimorfismo:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test.Primate;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test.HasTail;
                        com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test.Lemur;

     La cosa più importante da notare qui è che solo un'oggetto "Lemur" viene creato e referenziato. L'abilità dell'oggetto
     "Lemur" di essere passato come un'istanza di un'interfaccia che implementa ("HasTail") e come un'istanza della super-classe
     da cui eredita ("Primate") è la natura del POLIMORFISMO.

     Se si usa una variabile per referenziare un'oggetto, allora solo i metodi e le variabili che fanno parte del tipo di riferimento
     della variabile possono essere chiamati senza un'esplicito cast. Per esempio, il semplice codice riportato di seguito non funziona:

        HasTail hasTail = lemur;
        System.out.println(hasTail.age);                // NON COMPILA - perché l'interfaccia "HasTail" non ha una variabile "age";

        Primate primate = lemur;
        System.out.println(primate.isTailStriped());    // NON COMPILA - perché la super-classe "Primate" non ha il metodo "isTailStriped()"
                                                        //               ma ha solo il metodo "hasHair()";

     Il riferimento "hasTail" ha accesso diretto solo ai metodi definiti con l'interfaccia "HasTail"; quindi lui non sa che
     la variabile "age" è parte dell'oggetto. Allo stesso modo, il riferimento "primate" ha accesso solo ai metodi definiti
     nella classe "Primate" e non ha accesso diretto al metodo "isTailStriped()" che invece è definito nell'interfaccia "HasTail"
     ed implementato nella classe concreta "Lemur" che implementa l'interfccia.

 */

public class ImplementingPolymorphism {
}
