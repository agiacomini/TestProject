package com.giacomini.andrea.FunctionalProgramming.WorkingWithAdvancedStreamPipelineConcepts;

/**
 * Created by Andrea on 14/02/2019.
 */

/*
* N.B:  Si dovrebbe essere familiari con i benefici della concatenazione delle operazioni in uno
*       stream pipeline. Alcune delle operazioni intermedie degli stream sono disponibili per
*       "Optional".
*       Si supponga che si sia preso un "Optional<Integer>" e ci è stato chiesto di stamparne il
*       valore, ma solo se è un numero a 3 cifre. Senza la programmazione funzionali si potrebbe
*       scrivere il codice seguente:
*
*           private static void threeDigit(Optional<Integer> optional){
*
*               if(optional.ifPresent()){               // outer if
*
*                   Integer num = optional.get();
*                   String string = "" + num;
*
*                   if(string.length() == 3){           // inner if
*
*                       System.out.println(string);
*                   }
*               }
*           }
*
*       Funziona, ma contiene uno statement "if" annidato. Quella è un'extra complessità. Proviamo
*       ancora questo con la programmazione funzionale.
*
*           private static void threeDigit(Optional<Integer> optional){
*
*               optional.map( n -> "" + n )                 // parte 1
*                       .filter( s -> s.length() == 3 )     // parte 2
*                       .ifPresent(System.out::println);    // parte 3
*           }
*
*       Questo esempio è decismanete molto più corto e molto più espressivo. Con le lambda expression
*       gli esaminatori sono appassionati nel fare una unica dichiarazione identificando i singoli
*       pezzi con dei commenti. E' stato fatto anche qui per mostrare cosa succede sia con la
*       programmazione funzionale sia con l'approccio non funzionale.
*       Supponiamo che ci venga dato un "Optional" vuoto. Il primo approccio ritorna "FALSE" per il
*       ciclo for più esterno "outer if". Il secondo approccio vede un "Optional" vuoto e ha sia
*       "map()" che "filter()" che lo passano attraverso. Allora "ifPresent()" vede un "Optional"
*       vuoto e non chiama il parametro "Consumer".
*       Nel prossimo caso invece abbiamo un "Optional.of(4)". Il primo approccio ritorna "FALSE" per il
*       ciclo if annidato "inner if". Il secondo approccio mappa il numero 4 nella String "4". Il filter
*       allora ritorna un "Optional" vuoto dal momento che filter non match, e "ifPresent()" non
*       chiama il parametro "Consumer".
*       L'ultimo esempio è dove si ha un "Optional.of(123)". Il primo approccio ritorna "TRUE" per
*       esntrmabi gli statement "if". Il secondo approccio mappa il numero 123 nella stringa "123".
*       Il filtro allora ritorna lo stesso "Optional", e "ifPresent()" chiama il parametro "Consumer".
*       Ora si supponga che si voglia prendere un "Optional<Integer>" rappresentante la lunghezza della
*       stringa contenuta in un'altro "Optional". Abbastanza facile:
*
*           Optional<Integer> result = optional.map(String::length);
*
*       E se avessimo un metodo "helper" che fa la logica di calcolo per noi e abbia la firma statica
*       "static Optional<Integer> calculator(String s)"? Usando la mappa non funziona:
*
*           Optional<Integer> result = optional.map(ChainingOptionals::calculator); // DOES NOT COMPILE
*
*
*       //------------------------------------------------------------------------------------------------//
*       (( Real World Scenario ))
*       - Checked Exceptions and Functional Interface
*       Potresti aver notato fino ad ora che le interfacce funzionali non dichiarano "Checked Exceptions".
*       Questa situazione è normalmente OK. Comunque sia, è un problema quando si sta lavorando con metodi
*       che dichiarano "Checked Exceptions". Supponiamo di avere una classe con un metodo che lancia una
*       checked excpetion:
*
*           import java.io.*;
*           import java.util.*;
*
*           public class ExceptionCaseStudy{
*
*               private static List<String> create() throws IOException {
*
*                   throw new IOException();
*               }
*           }
*
*       Ora vediamo come usare questo metodo in uno "Stream":
*
*           ExceptionCaseStudy.create().stream().count();
*
*       Nulla di nuovo fino a qui. Il metodo "create()" lancia una checked exception. La chiamata del metodo
*       la gestiscie o la dichiara? Ora, come si comporta il codice seguente?
*
*           Supplier<List<String>> s = ExceptionCaseStudy::create;      // DOES NOT COMPILE
*
*       Più precisamente l'errore di compilazione è:
*
*           <code>unhandled exception type IOException
*
*       Il problema è che la lambda expression alla quale questo method reference si espande dichiara una
*       eccezione. L'interfaccia "Supplier" non permette checked exception. Esistono due differenti approcci
*       per aggirare questo problema. Uno è catturare l'eccezione (verbo: catch) e trasformarla in una
*       unchecked excpetion:
*
*           Supplier<List<String>> s = () -> {
*
*               try{
*
*                   return ExceptionCaseStudy.create();
*
*               } catch(IOException e){
*
*                   return new RuntimeException(e);
*               }
*           };
*
*       Questo approccio funziona. Ma il codice è sgradevole/brutto. Uno dei benifici della programmazione
*       funzionale è quello che il codice si suppone essere più facile da leggere e più conciso.
*       Un'altra alternativa è creare un metodo wrapper (contenitivo/confezione) con il blocco try/catch:
*
*           private static List<String> createSafe() {
*
*               try{
*
*                   return ExceptionCaseStudy.create();
*
*               } catch(IOException e){
*
*                   trow new RuntimeException(e);
*
*               }
*           }
*
*       Ora è possibile usare il wrapper nella nostra interfaccia funzionale "Supplier" senza problemi:
*
*           Supplier<List<String>> s2 = ExcpetionCaseStudy::createSafe();
*
*       //------------------------------------------------------------------------------------------------//
*
*       Il problema è che il calcolo ritorna "Optional<Integer>". Il metodo "map()" aggiunge un'altro Optional,
*       ritornando "Optional<Optional<Integer>>". Questa situazione non è buona. La soluzione è invece chiamare il
*       metodo "flatMap()":
*
*           Optional<Integer> result = optional.flatMap(ChainingOptionals::calculator);
*
*       Questa soluzione funziona perché il metodo "flatMap()" rimuove i livelli non necessari. In altre parole,
*       appiattisce il risultato. Chaining (incatenare) le chiamate al metodo "flatMap()" è utile quando si vuole
*       trasformare un'"Optional" in un'altro.
* */

public class ChainingOptionals {
}
