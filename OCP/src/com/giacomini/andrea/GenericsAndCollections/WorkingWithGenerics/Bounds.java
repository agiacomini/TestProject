package com.giacomini.andrea.GenericsAndCollections.WorkingWithGenerics;

/*
N.B: Per ora si potrebbe aver notato che i generics non sembrano particolarmente utili dal momento che sono trattati
     come "Object" e perciò non hanno molti metodi a disposizione. Il wildcard legato/limite (*) risolve questa situazione
     restringendo quali tipi possono essere usati nella posizione del wildcard (*).
     Un "bounded parameter type" è un tipo generico che specifica un limite per il generic. Questa è la sezione più difficile
     del capitolo, quindi non ci si deve preoccupare se alla prima lettura del codice non si capirà molto.
     Un "wild card generic type" è un tipo generico sconosciuto rappresentato con un segno interrogativo (?). E' possibile
     usare i "generic wildcard" in tre modi differenti come mostrato di seguito. Vedremo in dettaglio ognuno di queste
     tecniche:

        Type of bound                       Syntax              Example

        Unbounded wildcard                  ?                   List<?> l = new ArrayList<String>();

        WildCard with un upper bound        ? extends type      List<? extends Excpetion> l = new ArrayList<RuntimeExcpetion>();

        WildCard with a lower bound         ? super type        List<? super Exception> l = new ArrayList<Object>();



     UNBOUNDED WILDCARDS:
     Un "Unbounded wildcard" rappresenta qualsiasi tipo di dato. Si usa "?" quando si vuole specificare che qualsiasi tipo
     di dato è OK (accettato). Supponiamo che si vuole scrivere un metodo che guardi/scandisca una lista di qualsiasi tipo:

        public static void printList(List<Object> list){

            for (Object x : list) System.out.println(x);
        }

        public static void main(String[] args){

            List<String> keywords = new ArrayList<>();
            keywords.add("java");
            printList(keywords);                // NON COMPILA - stò passando una lista di "String" ad un metodo che si aspetta
                                                //               una lista di "Object";
        }

     Aspetta. Cosa c'è di sbagliato? Una "String" è una sotto-classe di "Object". Questo è vero. Tuttavia, "List<String>"
     non può essere assegnata ad List<Object>. Non sembra logico ma è vero! Java stà tentando di proteggerci da noi stessi.
     Prova ad immaginare se scrivessimo codice come questo:

        4: List<Integer> numbers = new ArrayList<>();
        5: numbers.add(new Integer(42));
        6: List<Object> objects = numbers;         // NON COMPILA -
        7: objects.add("forty two");
        8: System.out.println(numbers.get(1));

     Sulla linea 4 il compilatore ci promette che solo oggetti "Integer" saranno permessi in "numbers". Se la linea 6
     fosse compilabile, la linea 7 romperebbe la promessa che Java ci aveva fatto permettendo di mettere un'oggetto "String"
     nella lista dal momento che "numbers" e "object" referenziano lo stesso oggetto. La cosa buona è che il compilatore
     previene tutta questa situazione.



     N.B: STORING THE WRONG OBJECTS-ARRAY VS. ARRAYLISTS
     Non possiamo scrivere "List<Object> l = new ArrayList<String>();" perché Java stà tentando di proteggerci da una
     possibile eccezione a "run time".  Si potrebbe pensare che questo significherebbe anche che non si può scrivere
     "Object[] o = new String[0];". Questo però non è il caso infatti il codice compila:

        Integer[] numbers = {new Integer(42)};
        Object[] objects = numers;
        objects[0] = "forty two";               // throws ArrayStoreException;

     Anche se il codice compila, lancia una eccezione a "runtime". Con gli Arrays, Java conosce il tipo che è permesso
     aggiungere all'array. Solo perché si è assegnato un Integer[] ad un Object[] non cambia il fatto che Java sa che si
     tratta di un Integer[]. A causa della cancellazione di tipo (type erasure), non abbiamo la stessa protezione per
     gli ArrayList. A "runtime", l'ArrayList non sa cosa è permesso aggiugere alla lista. Perciò Java usa il compilatore
     per prevenire questa situazione si presenti in primo luogo. OK, quindi perché Java non aggiunge questa conoscenza agli
     ArrayList? La ragione è per via della retro compatibilità, cioè Java è attenta ad non rompere il codice esistente.


     Tornando indietro alla stampa di una lista, non possiamo assegnare una List<String> ad List<Object>.
     Questo va bene; non abbiamo bisogono di una List<Object>. Quello di cui abbiamo davvero bisogno è una "List" di "qualsiasi cosa".
     Ecco che cos'è "List<?>". Il seguente codice fa quello che ci aspettiamo:

        public static void printList(List<?> list){

            for (Object x : list) System.out.println(x);
        }

        public static void main(String[] args){

            List<String> keywords = new ArrayList<>();
            keywords.add("Java");
            printList(keywords);
        }

     Il metodo "printList()" accetta qualsiasi tipo di lista come parametro. La variabile "keywords" è un tipo di
     lista "List<String>" che accetta stringhe. Abbiamo così un match! "List<String"> è una lista di "qualsiasi cosa".
     "qualsiasi cosa" qui è una stringa.



     UPPER-BOUNDED WILDCARDS:
     Proviamo a scrivere un metodo che aggiunge il totoale di una lista di numeri. Abbiamo stabilito che un tipo generico
     non può usare solo una sotto-classe:

        ArrayList<Number> list = new ArrayList<Integer>();          // NON COMPILA-

     Invece, dobbiamo usare un wildcard:

        List<? extends Number> list = new ArrayList<Integer>();

     L'upper bounded wildcard dice che quasiasi classe che estende (extends) "Number" o "Number" stesso può essere usato
     come tipo di parametro formale:

        public static long total(List<? extends Number> list){

            long count = 0;
            for (Number number : list){

                count += number.longValue();
            }

            return count;
        }

     Ricordiate come abbiamo continuato a dire che "type erasure" (cancellazione di tipo) porta Java a pensare che un
     tipo generico è un'"Object"? E' appena successo qui. Java converte il precedente codice in qualcosa di equivalente
     al seguente codice:

        public static long total(Lisr list){

            long count = 0;
            for (Object obj : list){

                Number number = (Number) obj;
                count += number.longValue();
            }

            return count;
        }

     Succede qualcosa di interessante quando si lavora con gli "upper bounds" o con gli "unbounded wildcards".
     La lista diventa logicamente immutabile. "Immutabile" significa che l'oggetto non può essere modificato, come si
     è visto nel capitolo "2- Design Patterns and Principles". Tecnicamente, si può rimuovere elementi dalla lista,
     ma l'esame non chiederà questo.

         2: static class Sparrow extends Bird {}
         3: static class Bird {}
         4:
         5: public static void main(String[] args){
         6:     List<? extends Bird> birds = new ArrayList<Bird>();
         7:     birds.add(new Sparrow());                               // NON COMPIAL -
         8:     birds.add(new Bird());                                  // NON COMPILA -
         9: }

     Il problema deriva dal fatto che Java non conosce che tipo è realmente List<? extends Bird>. Può essere una lista
     "List<Bird>" oppure una lista "List<Sparrow>" o qualche altro tipo generico che non è stato ancora scritto.
     La linea 7 non compila perché non è possibile aggiungere uno "Sparrow" (passero) ad una lista "List<? extends Bird>",
     e la linea 8 non compila perché non è possibile aggiungere un "Bird" in una lista "List<Sparrow>".
     Dal punto di vista di Java, entrambi gli scenari sono ugualmente possibili così nessuno dei due è permesso.
     Ora vediamo un'esempio con una interfaccia. Si ha un'interfaccia e due classi che la implementano:

        interface Flyer { void fly(); }
        class HangGlider implements Flyer { public void fly(){} }
        class Goose implements Flyer { public void fly(){} }

     Si hanno anche due metodi che la usano. Uno elenca solo l'interfaccia e l'altro usa un "upper bound":

        private void anyFlyer(List<Flyer> flyer) {}
        private void groupOfFlyers(List<? extends Flyer> flyer) {}

     Si noti che si è usato la parola chiave "extends" piuttosto che "implements". Gli "upper bound" sono come classi
     anonime nelle quali si usa "extends" indifferentemente se si stà lavorando con una classe oppure con una interfaccia.
     Si è già imparato che una variabile di tipo "List<Flyer>" può passata ad entrambi i metodi. Una variabile di tipo
     "List<Goose>" può essere passata solo al metodo con l'"upper bound". Questo mostra uno dei benefici dei "generics".
     Volatili casuali non volando insieme. Si vuole che il metodo "groupOfFlyer()" sia chiamato solo con lo stesso tipo.
     Le oche (Geese) volano insieme ma non volano con il deltaplano.



     LOWER-BOUNDED WILDCARDS:
     Proviamo a scrivere un metodo che aggiunge una stringa "quack" alle due liste:

        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);

     Il problema è che vogliamo passare una lista "List<String>" ed una lista "List<Object>" allo stesso metodo.
     In primo luogo, assicuriamoci di aver capito perché i primi tre esempi nella tabella seguente non risolve
     questo problema:

        Code                                Method compiles                 Can pass a List<String>     Can pass a List<Object>

        public static void                  NO (i generics "unbounded"      YES                         YES
        addSound(List<?> list) {list.       sono immutabili)
        add("quack");}


        public static void                  NO (i generics "upper bounded"  YES                         YES
        addSound(List<? extends Object>     sono immutabili)
        list) { list.add("quack"); }


        public static void                  YES                             NO (con i generics          YES
        addSound(List<Object> list)                                         bisogna passare
        { list.add("quack"); }                                              l'esatto match)


        public static void                  YES                             YES                         YES
        addSound(List<? super String>
        list) { list.add("quack"); }

     Per risolvere questo problema, dobbiamo usare il "lower bound":

        public static void addSound(List<? super String> list) {        // lower bound

            list.add("quack");
        }

     Con un "lower bound" stiamo dicendo a Java che la lista sarà una lista di oggetti "String" o una lista di oggetti
     che sono super-classe di "String". Entrambi i modi, assicurano l'aggiunta di una "String" a quella lista.
     Proprio come le classi generiche, probabilmente non lo si userà nel proprio codice a meno che non si stia scrivendo
     codice per altri riutilizzi. Sarà comunque raro anche in quel caso. Ma saranno presenti all'esame, quindi è meglio
     conoscerli.

     Understanding Generic Supertypes:
     Quando si hanno sotto-classi e super-classi, i "lower bound" possono essere difficili:

        3: List<? super IOException> exceptions = new ArrayList<Exception>();
        4: exceptions.add(new Exception());         // NON COMPILA -
        5: exceptions.add(new IOException());
        6: excpetions.add(new FileNotFoundException());

     La linea 3 referenzia una "List" che potrebbe essere "List<IOException>" o "List<Exception>" o "List<Object>".
     La linea 4 non compila perché potremmo avere una lista "List<IOException>" e l'oggetto "Excpetion" che non si adatta
     alla lista.
     La linea 5 va bene. "IOExcpetion" può essere aggiunta a qualsiasi di quei tipi. Anche la linea 6 va bene. "FileNotFoundExcpetion"
     può anche essere aggiunta a qualsiasi di quei tre tipi. E' difficile perché "FileNotFoundExcpetion" è sotto-classe di
     "IOExcpetion" e la parola chiave dice "super". Quello che succede è che Java dice "Bene, FileNotFoundExcpetion è
     anche una IOException, quindi va ancora tutto bene".

 */

public class Bounds {
}
