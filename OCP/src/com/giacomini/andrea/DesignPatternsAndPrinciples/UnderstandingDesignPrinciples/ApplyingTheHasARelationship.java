package com.giacomini.andrea.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples;

/*
N.B: Nella progettazione orientata agli oggetti, si vuole spesso testare se un'oggetto contiene una particolare
     proprietà o valore. Ci si riferisce alla relazione "has-a relationship" come la proprietà di un'oggetto di avere
     un'oggetto di dati o una primitiva come memebro. La relazione "has-a" è anche conosciuta come test di composizione
     degli oggetti.
     Vediamo un'esempio con le classi "Bird" e "Beak":

        public class Bird {

            private Beak beak;
            private Foot rightFoot;
            private Foot leftFoot;
        }

        public class Beak {

            private String color;
            private double lenght;
        }

     In questo esempio, "Bird" e "Beak" sono entrambi classi ma con differenti attirbuti e valori. Il test "is-a" ovviamente
     fallisce dal momento che "Bird" non è un "Beak" e nemmeno "Beak" è un "Bird". Invece il test "has-a" viene superato come
     "Bird has-a Beak". L'ereditarietà ci permette di dire anche che qualsiasi figlio di "Bird" dovrà avere un "Beak".
     In generale, se una classe parent "has-a" un'oogetto come membro PROTECTED o PUBLIC, allora qualsiasi figlio della classe
     parent dovrà avere quell'oggetto come membro. Si noti che questo non è vero per i memebri PRIVATE definiti nella classe
     parent, perché i memebri PRIVATE non sono ereditati in Java.

     N.B: Uncovering Problems with the Data Model Using "is-a" and "has-a"
     A volte le relazioni sembrano superare il test "is-a" ma falliscono se combinate con il test "has-a" per ereditarietà:
     Per esempio, si veda il seguente codice:

        public class Tail {}
        public class Primate {

            protected Tail tail;
        }

        public class Monkey extends Primate { // Monkey "has-a" Tail since it "is-a" Primate }

        public class Chimpanzee extends Primate { // Chimpanzee "has-a" Tail since it is "is-a" Primate }

      In questo esempio, una classe "Monkey is-a Primate" e "Chimpanzee is-a Primate". Il modello dice anche che "Primate has-a Tail",
      e quindi per via dell'ereditarietà anche "Monkey has-a Tail" comì come "Shimpanzee has-a Tail". Sfortunatamente, gli schimpanzee
      non hanno in realtà una coda così il modello dei dati sottostante non è corretto. Il modello sembrava corretto quando
      è stato analizzato singolarmente ma quanndo si è usata l'ereditarietà si è scoperto un diffetto nel modello dei dati.
      Il risultato è che dovremmo rimuovere la proprietà "Tail" dalla classe "Primate", dal momento che non tutti i primati
      hanno una coda.

 */

public class ApplyingTheHasARelationship {
}
