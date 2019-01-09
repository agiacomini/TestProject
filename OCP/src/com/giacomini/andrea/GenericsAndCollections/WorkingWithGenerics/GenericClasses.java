package com.giacomini.andrea.GenericsAndCollections.WorkingWithGenerics;

/*
N.B: E' possibile introdurre i generics nelle proprie classi personali. La sintassi per introdurre un generic è dichiarare
     un parametro di tipo formale tra prentesi angolari. Per esempio, la seguente classe chiamata "Crate" ha un variabile di tipo
     generic dichiarata dopo il nome della classe:

        public class Crate<T>{

            private T contents;
            public T emptyCrate(){

                return contents;
            }

            public void packCrate(T contents){

                this.contents = contents;
            }
        }

     Il tipo generico T è disponibile ovunque all'interno della classe "Crate". Quando si istanzia la classe, si dice
     al compilatore cosa dovrebbe essere T per quella particolare istanza.

     N.B: Naming Conventions for Generics
     Un tipo parametro può essere chiamato qualsiasi cosa si desideri. La convenzione prevede di usare una singola lettera maiuscola
     per rendere evidente che non sono veri nomi di classe. Le seguenti sono lettere comuni da usare:

        - E per element;
        - K per chiave mappa;
        - V per valore mappa;
        - N per numero;
        - T per un tipo generico di dato;
        - S, U, V e così via per i tipi più generici;

     Per esempio, si supponga che esista la classe "Elephant" e che stiamo muovendo il nostro elefante in un nuovo e più
     grande recinto nel nostro zoo.

        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();

     Per essere onesti, non abbiamo impacchettato la cassa tanto quanto che l'elefante ci possa entrare. Tuttavia,
     si può vedere che la classe "Crate" è in grado di trattare con un "Elephant" senza sapere nulla su di esso.
     Questo probabilmente non sembra particolarmente interessante ancora. Avremmo potuto inserire "Elephant" invece di "T"
     quando abbiamo scritto la classe "Crate". E se volessimo creare un'altra "Crate" (cassa) per un'altro animale?

        Crate<Zebra> crateForZebra = new Crate<>();

     Ora non avremmo potuto avere semplicemente "Elephant" nella classe "Crate", dal momento che "Zebra" non è un "Elephant".
     Tuttavia, avremmo potuto usare in "Crate" una super-class "Animal" oppure un'interfaccia.
     Le classi generics diventano utili quando le classi usate come tipi di parametro non hanno assolutamente nulla a che
     fare con le altre. Per esempio, si immagini di dover spedire il proprio robot da 120 kg in un'altra città:

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);

        // spedita a St. Louis
        Robot atDestination = robotCrate.emptyCrate();

     Ora inizia ad essere interessante. La classe "Crate" funziona con qualsiasi tipo di classe. Prima dei generics,
     avremmo avuto bisogno che "Crate" usasse la classe "Object" per le sue variabili d'istanza, il quale avrebbe imposto
     al chiamante l'onere di dover di castare l'oggetto che riceve svuotando la cassa (crate).
     In aggiunta, "Crate" non ha bisogno di conoscere l'oggetto che gli sarà passato, e nemmeno quegli oggetti passati hanno bisogno
     di sapere niente su "Crate". Non si stà chiedendo che gli oggetti implementino un'interfaccia chiamata "Crateable" o simili.
     Una classe può essere passata a "Crate" senza nessun cambiamento/adattamento.
     Non ci si deve preoccupare se non si trova una applicazione pratica delle classi generiche nel proprio progetto. A meno che non
     si stia scrivendo delle librerie per il ri-utilizzo da parte di altri, i generics difficilmente appaiono nelle
     definizioni delle classi che si scrivono. Compaiono invece frequentemente nel codice che si ri-chiama, come ad esempio nel
     "Java Collections Framework".
     Le classi generics non si limitano ad avere un singolo tipo di parametro. Questa classe per esempio mostra due tipi di parametri
     generics:

        public class SizeLimitedCrate<T, U> {

            private T contents;
            private U sizeLimit;
            public SizeLimitedCrate(T contents, U sizeLimit){

                this.contents = contents;
                this.sizeLimit = sizeLimit;
            }
        }

     "T" rappresenta il tipo che si sta mettendo nella cassa (crate). "U" rappresenta l'unità che si stà usando per
     misurare la grandezza massima per la cassa (crate). Per usare questa classe generica, noi possiamo scrivere il
     seguente codice:

        Elephant elephant = new Elephant();
        Integer numPounds = 15_000;
        SizelimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(elephant, numPounds);

     Qui abbiamo specificato che il tipo è "Elephant" e l'unità è Integer. Ricordiamoci che i tipi letterali sono
     in grado di contenere gli underscore (_) da Java 7.



     TYPE ERASURE:
     Specificando un tipo generico (generics) si permette al compilatore di imporre l'uso corretto del tipo generico.
     Per esempio, specificando il tipo generico di "Crate" come "Robot" sarebbe come sostituire la "T" nella classe
     "Crate" con "Robot". Inoltre sarebbe solo per il momento della compilazione.
     Dietro la scena, il compilatore sostituisce tutti i riferimenti di "T" nella classe "Crate" con "Object". In altre
     parole, dopo che il codice è stato compilato, i propri generics saranno di tipo "Object". La classe "Crate"
     assomiglierà alla seguente:

        public class Crate {

            private Object contents;
            pubblic Object emptyCrate(){

                return contents;
            }

            public void packCrate(Object contents){

                this.contents = contents;
            }
        }

     Questo significa che c'è un solo file di classe. Non ci sono differenti copie per tipi parametrizzati.
     Questo processo di rimozione della sintassi generics dal proprio codice si riferisce con il termine "Type Erasure"
     (cancellazione di tipo). Questa cancellazione permette al codice di essere compatibile con le vecchie versioni di
     Java che non contenevano i generics.
     Il compilatore aggiunge il giusto cast per il proprio codice per funzionare con questo tipo di classe "cancellata".
     Per esempio, immaginiamo di scrivere il seguente codice:

        Robot r = crate.emptyCrate();

     e il compilatore lo tramuta nel seguente:

        Robot r = (Robot) crate.emptyCrate();
 */

public class GenericClasses {
}
