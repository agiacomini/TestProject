package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces;

/**
 * Created by Andrea on 12/01/2019.
 */


/*
* N.B: L'interfaccia "Supplier" (Fornitore) è usata quando si vuole generare o fornire valori senza
*      prenderne nessuno. L'interfaccia "Supplier" è definita come:
 *
 *          @FunctionalInterface
 *          public interface Supplier<T>{
 *              public T get();
 *          }
 *
 *     Nell'esame OCA si è imparato che si potrebbe creare una data usando una facotry (fabbrica).
 *     Se ci si è dimentica come non c'è bisogno di preoccuparsi. Verrà spiegato ancora nel capitolo
 *     5 - "Dates, Strings, and Localization".
 *     Si può usare l'interfaccia funzionale "Supplier" per chiamare la factory:
 *
 *          Supplier<LocalDate> s1 = LocalDate::now;
 *          Supplier<LocalDate> s2 = () -> LocalDate.now();
 *
 *          LocalDate d1 = s1.get();
 *          LocalDate d2 = s2.get();
 *
 *          System.out.println(d1);
 *          System.out.println(d2);
 *
 *     Questo esempio stampa due volte una data come "2015-06-20". E' ancche una buona opportunità
 *     per rivedere "static method references". Il method reference "LocalDate::now;" è usato per
 *     creare un "Supplier" da assegnare ad una variabile di intermediazione "s1". Un "Supplier"
  *    viene spesso usato quando si costruiscono nuovi oggetti. Per esempio, si può stampare due
  *    "StringBuilder" vuoti:
  *
  *         Supplier<StringBuilder> s1 = StringBuilder::new;
  *         Supplier<StringBuilder> s2 = () -> new(StringBuilder);
  *
  *         System.out.println(s1.get());
  *         System.out.println(s2.get());
  *
  *    Questa volta, abbiamo usato un riferimento a costruttore ("constructor references") per creare
  *    l'oggetto. Abbiamo usato i generics per dichiarare che tipo di fornitore stiamo usando. Questo
  *    può richiedere un pò di tempo per essere letto. Si riesce a capire cosa fa quanto il codice seguente?
  *    Basta fare un passo alla volta:
  *
  *         Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
  *         ArrayList<String> a1 = s1.get();
  *         System.out.println(a1);
  *
  *    Abbiamo un "Supplier" di un certo tipo. Questo tipo è un "ArrayLists<String>". Quindi, chiamando
  *    il metodo "get()" dell'interfaccia funzionale di "Supplier" viene creata una nuova istanza
  *    dell'oggetto "ArrayList<String>", la quale è il tipo generico di "Supplier" - in altre parole
  *    un generico che contiene un'altro generico. Non è difficile da capire, diamo uno sguardo più
  *    attento al codice.
  *    Si noti come viene chiamato il metodo "get()" sull'interfaccia funzionale. Cosa succederebbe se
  *    provassimo a stampare direttamente s1? "System.out.println(s1);" stamaperebbe qualcosa come:
  *
  *         functionalinterface.BuiltIns$$Lambda$1/791452441@1fb3ebeb
  *
  *    E' il risultato della chiamata del metodo "toString()" su una lambda expression. Questo in realà
  *    non significa niente. La nostra classe di test è "BuiltIns", ed è in un package che abbiamo creato
  *    e nominato "functionalinterface". Le seguenti $$, che significa che la classe non esiste in nessun
  *    file .class sul fileSystem. Esiste solo in memoria. Non è necessario preoccuparsi del resto.
  *
  *
* */
public class ImplementingSupplier {
}
