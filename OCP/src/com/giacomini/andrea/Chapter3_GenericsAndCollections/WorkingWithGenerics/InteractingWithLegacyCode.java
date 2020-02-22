package com.giacomini.andrea.GenericsAndCollections.WorkingWithGenerics;

/*
N.B: "Legacy code" è il vecchio codice. Generalmente è codice che è scritto in un differente stile rispetto a quello
     che si stà scrivendo oggi. In questa sezione, ci riferiamo al codice che è stato scritto in Java 4 o precedenti
     versioni, e che quindi non utilizzava i generics. Le collections scritte senza generics sono anche conosciute come
     "raw collections".
     Ricorda che usando i generics ci da sicurezza al momento della compilazione. Almeno lo fa quando tutto il codice
     in questione utilizza i generics. Quando invece c'è del codice che lo usa e altro codice che invece non lo usa,
     è facile farsi cullare in un falso senso di sicurezza. Vediamo un esempio:

        class Dragon {}
        class Unicorn {}
        public class LegacyDragons {

            public static void main(String[] args){

                // è una lista "raw type" (grezza) senza generics;
                List unicors = new ArrayList();
                unicorns.add(new Unicorn());
                printDragons(unicorns);
            }

            private static void printDragons(List<Dragons> dragons){

                for (Dragons dragon : dragons){     // ClassCastException

                    System.out.println(dragon);
                }
            }
        }

     In questo esempio abbiamo un "ClassCastException" sulla linea che lavora con i generics. A prima vista questi sembrano
     essere dispari. Questo è il problema che i "generics" si suppone siano in grado di risolvere. La differenza è che tutto il codice
     non usa i "generics". Il metodo "main()" chiama il metodo "printDragons()" con un "raw type" (una Collections senza generics, grezzi).
     A causa della cancellazione del tipo ("type erasure"), Java non riconosce questo come un problema fino al momento
     dell'esecuzione, quando tenta di castare un "Unicorn" in un "Dragon". Il cast è difficile perché non appare nel codice.
     Con i tipi generics, Java scrive il cast per noi.
     Inoltre Java non riconosce che c'è un problema, sa solo che potrebbe esserci un problema. Java sa che i "raw type" (tipi di dati grezzi)
     portano ad avere dei problemi e quindi ci viene presentato un warning al momento della compilazione. Un warning al momento
     della compilazione è differente da un errore in compilazione in quanto il codice continua ad essere compilabile anche
     in presenza di un warning. Ci avverte che dovremmo prestare maggiore attenzione su una parte di codice in particolare.

     REAL WORLD SCENARIO - COMPILER WARNING
     All'esame, si dovrebbe identificare quando potrebbe comparire un warning. Non ci si aspetta che si sappia eseguire i
     comandi per elencare gli avvisi di warning del compilatore o leggere l'output. Nel mondo reale, invece si avrà bisogno
     anche di questa abilità. Quando si compila la classe "LegacyDragon" gli avvisi del compilatore assomiglieranno a questi:

        $ javac *.java
        Note: Some input files use unchecked or unsafe operations.
        Note: Recompile with -Xlint:unchecked for details.

     Java sta fondamentalmente dicendo che sa che stiamo usando codice "legacy" e ci chiede se vogliamo saperne di più.
     Se si passa quel flag (-Xlint:unchecked) si otterrà qualcosa del genere:

        $ javac -Xlint:unchecked *.java
        LegacyDragons.java:9: warning: [unchecked] unchecked call to add(E) as a member
        of the raw type List
        unicorns.add(new Unicorn());
        ^
        where E is a type-variable:
        E extends Object declared in interface List
        LegacyDragons.java:11: warning: [unchecked] unchecked method invocation: method
        printDragons in class LegacyDragons is applied to given types
        printDragons(unicorns);
        ^
        required: List<Dragon>
        found: List
        LegacyDragons.java:11: warning: [unchecked] unchecked conversion
        printDragons(unicorns);
        ^
        required: List<Dragon>
        found: List
        3 warnings

     I messaggi sembrano un pò spaventosi ma Java stà tentando di dirci che si dovrebbero proprio usare i generics.


     Non dovrebbe essere una sorpresa che si potrebbe avere un "ClassCastException" anche nella direzione opposta:

        1: public class LegacyUnicorns {

        2:    public static void main(String[] args){

        3:        java.util.List<Unicorn> unicorns = new java.util.ArrayList<>();
        4:        addUnicorn(unicorns);
        5:        Unicorn unicorn = unicorns.get(0);          // ClassCastExcpetion;
        6:    }

        7:    private static void addUnicorn(java.util.List unicorn){

        8:        unicorn.add(new Dragon());
        9:    }
        10:}

     Il metodo "main()" usa correttamente i "generics". Il problema è che chiama un metodo "legacy" (che non usa i "generics")
     "addUnicorn" che cerca di aggiungere un "Unicorn" alla lista che invece dovrebbe contenere solo Dragon". Ma invece questo metodo
     in realtà non funziona come ci si aspettava ed aggiunge invece un "Dragon" sulla linea 8. Così quando la linea 5
     prova a mettere quel "Dragon" in un riferimento di tipo "Unicorn" scatta una "ClassCastExcpetion". Naturalmente, questo codice
     ha degli avvisi di warning al momento della compilazione.
     Questo problema è abbastanza semplice. Se il codcie "legacy" non usa il giusto tipo, il codice che usa invece i generics
     continuerà a fallire a "run time". L'Autoboxing ha un differente problema:

        1: public class LegacyAutoboxing {

        2:     public static void main(String[] args){

        3:        java.util.List numbers = new java.util.ArrayList();
        4:        numbers.add(5);
        5:        int result = numbers.get(0);            // NON COMPILA;
        6:    }
        7: }

    La buona notizia è che l'Unboxing fallisce con un errore al momento della compilazione piuttosto che con un errore
    a "run time". Sulla linea 3 è stata creata una "List" grezza (raw - senza generics). Sulla linea 4 si stà provando
    ad aggiungere un "int" ad una lista. Questo funziona perché Java automaticamente esegue l'Autoboxing convertendo l'"int"
    in un "Integer". Sulla linea 5 si ha invece un problema. Dal momento che non si stanno usando i generics, Java non sa
    che la lista contine un oggetto "Integer". Sa solo che si ha un "Object". Per questo motivo un "Object" non può essere
    "Unboxed" in una 'primitiva "int".
    Ricapitolando, la cosa da ricordare qui è di prestare molta attenzione quando nel codice non vengono usati i generics.
    Prestare particolare attenzione alla ricerca di warning al momento della compilazione, che si possono tramutare in
    ClassCastException, ed agli errori al momento della compilazione.

 */

public class InteractingWithLegacyCode {
}
