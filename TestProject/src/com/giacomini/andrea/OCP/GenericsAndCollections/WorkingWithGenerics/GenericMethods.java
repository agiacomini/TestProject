package com.giacomini.andrea.OCP.GenericsAndCollections.WorkingWithGenerics;

/*
N.B: Fino a questo punto, abbiamo visto parametri di tipo formale dichiarati a livello di classe o a livello di
     interfaccia. E' anche possibile dichiararli a livello di metodo. Questo è utile spesso per metodi STATIC dal
     momento che loro non sono parte di un'istanza che può dichiarare il tipo. Inoltre, è anche possibile averli a livello
     di metodi NON-STATIC.
     In questo esempio il metodo usa un parametro generico:

        public static <T> Crate<T> ship(T t){

            System.out.println("Preparing " + t);
            return new Crate<T>();
        }

     Il parametro del metodo è di tipo "T". Il tipo di ritorno è un "Crate<T>". Prima del tipo di ritorno, è stato dichiarato
     il parametro di tipo formale <T>.
     A mneo che il metodo non ottenga il generic parametro di tipo formale dalla classe o interfaccia, il generic viene specificato
     immediatamente prima del tipo di ritorno del metodo. Questo può portare ad un interessante codice!

        3: public static <T> void sink(T t){}
        4: public static <T> T identity(T t) { return t; }
        5: public static T noGood(T t) { return t; }            // NON COMPILA -

     La linea 3 mostra un tipo di parametro formale immediatamente prima del tipo di ritorno di tipo "void". La linea 4
     mostra che il tipo di ritorno è un tipo di parametro di tipo formale. Può sembrare strano ma funziona. La linea 5
     omette il tipo di parametro formale, per questo motivo non compila.


     OPTIONAL SYNTAX FOR INVOKING A GENERIC METHOD:
     E' possibile chiamare un metodo generic normalmente, e il compilatore capirà quale si vuole. Alternativamente, è
     possibile specificare il tipo esplicitamente per renderlo ovvio qual'è il tipo:

        Box.<String>ship("package");
        Box<String[]>ship(args);

     Spetta a noi decidere se ciò renda le cose più chiare. Si dobrebbe essere almeno consapevoli che questa sintassi
     esiste.
 */

public class GenericMethods {
}
