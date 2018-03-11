package com.giacomini.andrea.DesignPatternsAndPrinciples.ImplementingPolymorphism;

/*
N.B: Nel precedente esempio si è creata una singola istanza dell'oggetto "Lemur" e si è acceduto ad esso attraverso un
     riferimento di super-classe e uno di interfaccia. Una volta cambiato il tipo di riferimento, si perde l'accesso a molti
     metodi specifici definiti nella sotto-classe che ancora esistono all'interno dell'oggetto in memoria.
     Si può reclamare questi riferimenti castando l'oggetto all'indietro (down-cast) alla specifica sotto-classe da cui si proviene:

        Primate primate = lemur;

        Lemur lemur2 = primate;         // NON COMPILA - il down-cast ha bisogno sempre di un cast esplicito:

        Lemur lemur3 = (Lemur)primate;
        System.out.println(lemur3.age);

     In questo esempio, si è prima provato a convertire all'indietro (down-cast) il riferimento "primate" verso un riferimento di tipo "Lemur",
     "lemur2", senza un'esplicito cast. Il risultato è che il codice non compilerà. Nel secondo esempio, si è esplicitamente
     castato l'oggetto alla sottoclasse dell'oggetto "Primate", e così facendo si ha avuto modo ancora di accedere ai metodi
     disponibili nella classe "Lemur" ed alla sua variabile "age".
     Di seguito alcune regole base per il casting delle variabili:

        1- Castare un'oggetto da una sotto-classe ad una super-classe non richiede un'esplicito cast;
        2- Castare un'oggetto da una super-classe ad una sotto-classe richiede sempre un cast esplicito;
        3- Il compilatore non permetterà cast verso tipi non correlati;
        4- Anche quando il codice compila senza errori, un'eccezione potrebbe essere lanciata a runtime se l'oggetto
           che si stà castando non è istanza di quella classe;

     La regola (3-) è molto importante; durante l'esame potrebbe capitare che si tenti di confondere le idee usando un cast
     che il compilatore non permette. Per esempio, si era in grado di castare un riferimento "Primate" ad un riferimento "Lemur"
     perché "Lemur" è sotto-classe di "Primate" e quindi relazionate tra loro.
     Si consideri ora l'esempio di seguito riportato:

        public class Bird {}

        public class Fish {

            public static void main(String[] args){

                Fish fish = new Fish();
                Bird bird = (Bird)fish;     // NON COMPILA - le due classi non sono correlate tra di loro;
            }
        }

     In questo esempio, le classi "Fish" e "Bird" non sono relazionate tra di loro attraverso nessuna gerarchia di classe;
     quindi il codice non compila a causa del cast sbagliato.

     Il cast come operazione non è senza limitazioni. Anche se due classi sono relazionate da una gerachia di classi,
     non vuol dire che un'istanza di una sia automaticamente castabile nell'altra. Di seguito un'altro esempio:

        public class Rodent {}

        public class Capybara extends Rodent {

            public static void main(String[] args){

                Rodent rodent = new Rodent();
                Capybara capybara = (Capybara)rodent;       // Throws "ClassCastExcpetion" a runtime;
            }
        }

      Questo codice crea un'istanza di "Rodent" e prova a castarla ad una sotto-classe di "Rodent", che è "Capybara".
      Sebbeno questo codice compili correttamente, lancerà un'eccezione "ClassCastExcpetion" a runtime dal momento che
      l'oggetto referenziato in memoria non è un'istanza della class "Capybara". Come detto nel capitolo "AdvanceClassDesign" è
      possibile usare l'operatore "instanceof" prima di eseguire il cast dell'oggetto per evitare il lancio
      dell'eccezione "ClassCastExcpetion" a runtime:

        if(rodent instanceof Capybara){

            Capybara capybara = (Capybara)rodent;
        }

      Durante l'esame, di fronte ad una domanda che riguarda il cast e il polimorfismo, assicurarsi di riconoscere prima
      qual'è l'istanza dell'oggetto in memoria. Una volta fatto questo, fare attenzione se il compilatore permetterà all'oggetto
      di essere referenziato con o senza un cast esplicito.

 */

public class CastingObjectReferences {
}
