package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces;

/**
 * Created by Andrea on 14/01/2019.
 */

/*
* N.B:  Si è usato l'interfaccia funzionale "Predicate" fin dall'esame OCA, e più recentemente
*       lo si è visto ancora con il metodo "removeIf()" nel capitolo 3 - "Generics And Collections".
*       L'interfaccia funzionale "Predicate" viene spesso usata quando si filtra o si cerca un match.
*       Entrambe sono operazioni molto comunini.
*       L'interfaccia funzionale "BiPredicate" è come una interfaccia "Predicate" ad eccezione
*       del fatto che prende due parametri invece che uno.
*       Omettendo qualsiasi metodo "static" o di "default", queste interfaccie funzionali sono
*       definite come:
*
*           @FunctionalInterface
*           public interface Predicate<T>{
*               boolean test(T t);
*           }
*
*           @FunctionalInterface
*           public interface BiPredicate<T, U>{
*               boolean test(T t, U u);
*           }
*
*      Si dovrebbe aver capito che si può usare l'interfaccia funzionale "Predicate" per testare
*      una condizione:
*
*           Predicate<String> p1 = String::isEmpty;
*           Predicate<String> p2 = x -> x.isEmpty();
*
*           System.out.println(p1.test(""));            // TRUE
*           System.out.println(p2.test(""));            // TRUE
*
*     Viene stampato due volte TRUE.
*     Più interessante invece è l'interfaccia funzionale "BiPredicate". Anche questo esempio
*     stampa due volte TRUE:
*
*           BiPredicate<String, String> b1 = String::startsWith;
*           BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
*
*           System.out.println(b1.test("chicken", "chick"));
*           System.out.println(b2.test("chicken", "chick"));
*
*     Il "method reference" combina due tecniche che si sono già viste. Il metodo "startWith()"
*     è un metodo d'istanza. Questo significa che il primo parametro nella lambda expression
*     viene usato come l'istanza sulla quale chiamare il metodo. Il secondo parametro viene passato
*     al metodo "startWith()". Questo è un'altro esempio di come la sinstassi del "method reference"
*     è leggermente più compatta di quella delle lambda expression. Lo svantaggio è che sono
*     meno espliciti, e ci si dovrà sforzare per capire cosa stà succedendo.
*
*
*     Defualt Method or Functional Interface:
*     Per definizione, tutte le interfacce funzionali hanno un singolo metodo abstract.
*     Questo non significa che loro hanno un solo metodo, al contrario. Molte delle più comuni
*     interfacce funzionali forniscono un numero di utili metodo di default. Non si ha bisogno
*     di conoscerli per l'esame, ma sono molto utili quando si comincia a costruire la propria
*     implementazione del mondo reale.
*     Supponiamo di avere questi due predicati:
*
*           Predicate<String> egg = s -> s.contains("egg");
*           Predicate<String> brown = s -> s.contains("brown");
*
*     Ora vogliamo un "Predicate" per brown eggs e uno per tutti gli altri colori di egg.
*     Si potrebbe scrivere come di seguito:
*
*           Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
*           Predicate<String> otherEggs = s -> s.contains("egg") && ! s.contains("brown");
*
*     Questo funziona, ma non è ottimo. E' legermente lungo da leggere e contiene duplicati.
*     E se decidessimo che la lettera "e" deve essere maiscola in "egg"? Si dovrebbe cambiarlo
*     in tre variabili: egg, brownEggs, otherEggs.
*     Un modo migliore per affrontare questa situazione è usare due dei metodi di "default" di
*     "Predicate":
*
*           Predicate<String> brownEggs = egg.and(brown);
*           Predicate<String> otherEggs = egg.and(brown.negate());
*
*     Pulito !!! Ora si è riutilizzato la logica dei predicati originali per costruirne due
*     di nuovi. E' più breve e più chiara la relazione che c'è tra i due predicati.
*     Possiamo anche cambiare l'ortografica dell' "egg" in un luogo, e gli altri due oggetti
*     avranno una nuova logica perché vi faranno riferimento.
*
*
* */
public class ImplementingPredicateAndBiPredicate {
}
