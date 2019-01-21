package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces;

/**
 * Created by Andrea on 17/01/2019.
 */

/*
* N.B:  E' veramente importante conoscere il numero dei parametri, il tipo, il valore
*       di ritorno e il nome del metodo per ognuna delle interfacce funzionali.
*       Ora sarebbe un buon moemento per memorizzare la tabella "4.1"
*       ("WorkingWithBuiltInFunctionalInterfaces") se non lo si è ancora fatto.
*       Facciamo degli esempi per impratichirci:
*
*           - Ritorna una "String" senza prendere nessun parametro;     //  Supplier OK
*           - Ritorna un "Boolean" e prende UNA "String";               //  Consumer KO
*           - Ritorna un "Integer" e prende DUE "Integer";              //  Function KO
*
*       Pronti? Pensa ad una risposta prima di continuare.
*
*       N.B: Non bisogna concentrarsi troppo sui tipi in se (sia dei parametri in input,
*            sia del valore di ritorno "Booleano" o "String" o "Integer").
*            Quanto piuttosto sulla numerosità e sui tipi di valore di input rispetto
*            a quelli di ritorno (uguali o diversi).
*
*       Il primo è un "Supplier" (fornitore) perché produce un'oggetto e prende in
*       input zero parametri. Il secondo è una "Function" perché prende in input
*       un parametro e ritorna un'altro tipo. E' un pò difficile qui. Potresti pensare
*       che sia un "Predicate". Si noti che "Predicate prende in input un tipo e ritorna
*       un "boolean" primitiva e non un'oggetto "Boolean" come in questo esempio.
*       Infine, il terzo esempio è sia un "BinaryOperator" che un "BiFunction". Entrambi
*       sono una risposta corretta. "BinaryOperator" è la risposta migliore delle due dal
*       momento che è più specifica.
*       Proviamo questo esercizio però questa volta con il codice. E' più difficile con il
*       codice. Con il codice la prima cosa che si deve fare è dare uno sguardo a quanti
*       parametri prende in input la lambda expression e se c'è un valore di ritorno.
*       Quale interfaccia funzionale dovrebbe essere usata negli esempi seguenti:
*
*           6: _______<List> ex1 = x -> "".equals(x.get(0));                // viene testata una condizione
*           7: _______<Long> ex2 = (Long l) -> System.out.println(l);       // non ritorna nulla
*           8: _______<String, String> ex3 = (s1, s2) -> false;             // BiPredicate
*
*       Sulla linea 6 viene passato un parametro di tipo "List" alla lambda expression e viene
*       ritornato un "boolean" (primitiva). Questo ci dice che è un "Predicate" o una "Function".
*       Dal momento che la dichiarazione generica ha un solo parametro (in questo caso T = List),
*       sarà sicuramente un "Predicate" visto che "Function" invece ne prevede due (un parametro di
*       input T e un parametro di ritorno U).
*       Sulla linea 7 viene passato un parametro "Long" alla lambda expresion e non ritorna nulla.
*       Questo ci dice che si tratta di un'interfaccia "Consumer".
*       La linea 8 prende due parametri e ritorna una primitiva "boolean". Quando si trova
*       una valore di ritorno di tipo boolean, è giusto pensare ad un "Predicate" a meno che
*       tra i generics non sia chiaramente specificato un valore di ritorno "Boolean".
*       In questo caso specifico ci sono due parametri, per questo motivo si tratta di un
 *      "BiPredicate".
 *
 *      Ripassare e conoscere a memoria la tabella 4.1 specificata in
 *      "WorkingWithBuiltInFunctionalInterfaces".
 *
 *      Proviamo ora ad identificare gli errori più comuni. Questi di seguito sono pensati
 *      per essere volutamenti difficili:
 *
 *          6: Function<List<String>> ex1 = x -> x.get(0);      // NOT COMPILE, non specifica il tipo di ritorno
 *          7: UnaryOperator<Long> ex2 = (Long l) -> 3.14       // NOT COMPILE
 *          8: Predicate ex3 = String::isEmpty;                 // NOT COMPILE, non specifica i generic
 *
 *      La linea 6 afferma di essere una "Function". Una "Function" però necessità di specificare due generic,
 *      il tipo di paramentro di input (T) e il tipo del valore di ritorno (U). Il tipo del valore di ritorno manca
 *      sulla linea 6 portando ad un codice che non compila.
 *      Sulla linea 7 si parla di un'interfaccia funzionale "UnaryOperator", la quale ritorna lo stesso tipo
 *      di valore di quello passato in input. Nell'esempio però viene ritorna un "double" (3.14) piuttosto
 *      che un "Long" causando di conseguenza un errore di compilazione.
 *      Sulla linea 8 manca proprio il generic necessario per l'interfaccia "Predicate". Questo rende il parametro
 *      che è stato passato un "Object" piuttosto che una "String". La labmda expression però si aspetta una
 *      "String" perché viene chiamato proprio un metodo di "String" (non presente invece nella classe "Object").
 *      Per questo motivo anche questo esempio è un'errore di compilazione.
* */

public class CheckingFunctionalInterfaces {
}
