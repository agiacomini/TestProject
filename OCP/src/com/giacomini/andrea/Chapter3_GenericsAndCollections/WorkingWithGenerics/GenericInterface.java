package com.giacomini.andrea.GenericsAndCollections.WorkingWithGenerics;

/*
N.B: Esattamente come le classi, un'interfaccia può dichiarare un parametro di tipo formale. Per esempio, la seguente
     interfaccia "Shippable" usa un tipo generico come argomento del metodo "ship()":

        public interface Shippable<T>{

            void ship(T t);
        }

     Esistono tre differenti modi che una classe può usare per implementare questa interfaccia. Il primo è di specificare
     il tipo generico nella classe. La seguente classe concreta dice che si tratta solo di robots. Questo lo porta
     a dichiarare il metodo "ship()" con un parametro di tipo "Robot":

        class ShippableRobotCrate implements Shippable<Robot>{

            public void ship(Robot t){}
        }

    Il secondo modo è creare una classe generica. La seguente classe concreta permette al chiamante di specificare il tipo
    del generics:

        class ShippableAbstractCrate<U> implements Shippable<U> {

            public void ship(U t){}
        }

    In questo esempio, il tipo del parametro potrebbe essere chiamato in qualsiasi modo, incluso "T". Abbiamo usato "U"
    in questo esempio così che non si confonda con ciò a cui "T" si riferisce. Durante l'esame è probabile che si cercare
    di confondere le idee usando lo stesso nome per il tipo di parametro.
    L'ultimo modo che la classe ha per implementare l'interfaccia "Shippable" è di non usare proprio i generics. Questo
    è il vecchio modo di scrivere codice. Genererà un warning al momento della compilazione di "Shippable" essendo un "raw type"
    ma comunque sarà permesso compilarlo. Qui il metodo "ship()" ha un "Object" come parametro dal momento che il tipo
    generico non è definito:

        class ShippaleCrate implements Shippable {

            public void ship(Object t){}
        }

 */

public class GenericInterface {
}
