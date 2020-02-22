package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces;

/**
 * Created by Andrea on 16/01/2019.
 */

/*
* N.B:  "UnaryOperator" e "BinaryOperator" sono due casi particolari di interfacce
*       funzionali. Richiedono che tutti i tipi di parametri siano dello stesso tipo.
*       Un "UnaryOperator" trasforma il suo valore in uno dello stesso tipo.
*       Per esempio, incrementare di uno è un'operazione unaria. Infatti, "Unary Operator"
*       estende "extends" l'interfaccia funzionale "Function". Un "BinaryOperator"
*       unisce due parametri in uno solo, sempre dello stesso tipo. Aggiungere due
*       numeri è un'operazione binaria. Similmente, "BinaryOperator" estende "extends"
*       l'interfaccia funzionale "BiFunction".
*       Omettendo qualsiasi metodo "default" e "static", queste interfaccia sono definite
*       come di seguito:
*
*           @FunctionalInterface
*           public interface UnaryOperator<T> extends Function<T, T> {
*
*           }
*
*           @FunctionalInterface
*           public interface BinaryOperator<T> extends BiFunction<T, T, T> {
*
*           }
*
*       Questo significa che le firme dei metodo assomigliano alle seguente:
*
*           T apply(T t);
*           T apply(T t1, T t2);
*
*       Se si da un'occhiata ai Javadoc, si noterà che questi metodi sono in realtà
*       dichiarati nella super interface "Function/BiFunction". La dichiarazione
*       generica nella sotto-classe sono quello che forza il tipo ad essere dello stesso
*       tipo. Per l'esempio "unary", si noti come il tipo di ritorno sia dello stesso
*       tipo del parametro:
*
*           UnaryOperator<String> u1 = String::toUpperCase;
*           UnaryOperator<String> u2 = x -> x.toUpperCase();
*
*           System.out.println(u1.apply("chirp"));          // CHIRP
*           System.out.println(u2.apply("chirp"));          // CHIRP
*
*      Viene scritto "CHIRP" due volte. Non dobbiamo specificare il tipo di ritorno
*      tra i "generics" perché "UnaryOperator" richiede che sia dello stesso tipo
*      del parametro.
*      Ora vediamo un esempio di "BinaryOperator":
*
*           BinaryOperator<String, String> b1 = String::concat;
*           BinaryOperator<String, String> b2 = (string, toAdd) -> string.concat(toAdd);
*
*           System.out.println(b1.apply("baby", "chick"));      // baby chick
*           System.out.println(b2.apply("baby", "chick"));      // baby chick
*
*      Si noti come questo faccia la stessa cosa dell'esempio di "BiFunction".
*      Il codice è più succinto, il che mostra l'importanza dell'uso della corretta
*      interfaccia funzionale. E' meglio avere un tipo generico specificato piuttosto
*      che tre.
* */

public class ImplementingUnaryOperatorAndBinaryOperator {
}
