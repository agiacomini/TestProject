package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns;

/*
N.B: Il terzo pattern creazionale che si discuterà è il "builder pattern".

     Problema: Come si crea un'oggetto che richiede di settare numerosi valori al momento dell'istanziamento dell'oggetto?

     Motivazione: Dato che gli oggetti di dati crescono in grandezza, il costruttore può crescere per contenere molti
     attributi. Per esempio, nella classe immutabile "AnimalImmutable", si hanno tre parametri di input: "species", "age" e
     "favoriteFoods". Se si vuole aggiungere cinque nuovi attributi all'oggetto, si dovrà aggiungere cinque nuovi valori
     nel costruttore. Ogni volta che si aggiunge un parametro, il costruttore cresce in grandezza! Gli utenti che si
     riferiscono a questo oggetto saranno costretti ad aggiornare la loro chiamata al costruttore ogni volta che l'oggetto
     viene modificato, risultando in una classe che in questo modo sarebbe difficile da usare e mantenere. Alternativamente,
     si potrebbe aggiungere un nuovo costruttore ogni volta che si aggiunge un nuovo parametro ma avendo così molti
     costruttori la gestione potrebbe essere abbastanza difficile.
     Una soluzione è usare metodi setter invece di costruttori per configurare l'oggetto, ma questo non funzionerebbe per
     gli oggetti "immutabili" dal momento che non possono essere modificati dopo la loro creazione. Per gli oggetti
     "mutabili" potrebbe anche portare alla rottura temporanea dell'invarianza della classe. Per esempio, gli attributi
     della classe possono essere dipendenti l'uno dall'altro, e impostarli (set) uno alla volta potrebbe esporre uno stato
     dell'oggetto che non è propriamente configurato.

     Soluzione: Il "builder pattern" è un pattern creazionale nel quale i parametri sono passati ad un'oggetto builder,
     spesso attraverso la concatenazione di chiamate di metodi, e un'oggetto viene generato con una chimata finale di
     build (costruzione). Viene spesso usata questa tecnica con gli oggetti immutabili, dal momento che gli oggetti immutabili
     non hanno metodi setter e devono essere creati con tutti i loro parametri settati anche se può essere usato con
     oggetti mutabili.

     La seguente è una classe "AnimalBuilder", la quale usa la classe immutabile "AnimalImmutable":

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test.AnimalBuilder;

     A prima vista questa classe potrebbe sembrare simile alla classe immutabile "AnimalImmutable", tanto più che sembra
     una sua ridefinizione. Ma ci sono alcune importanti differenze. Primo, questa classe è mutabile, mentre la classe
     "AnimalImmutabile" non lo è. E' possibile modificare questa classe mentre la si costruisce, e il risultato del metodo
     build sarà un'oggetto immutabile. In qualche modo, usare il "builder pattern" è analogo a prendere un'oggetto mutabile
     e renderlo read-only.
     Un'latra cosa che si potrebbe notare è che tutti i metodi setter ritornano un'istanza dell'oggetto builder "this".
     I metodi builder sono comunemente concatenati tra di loro, spesso richiamabili in qualsiasi ordine. Per esempio,
     i seguenti due pezzi di codice sono entrambi validi usi di questo builder:


        1-
        AnimalBuilder duckBuilder = new AnimalBuilder();
        duckBuilder.setAge(3).setFavoriteFoods(Array.asList("grass","fish")).setSpecies("Duck");

        AnimalImmutable duck = duckBuilder.build();

        2-
        AnimalImmutable flamingo = new AnimalBuilder().setFavoriteFoods(Array.asList("algae","insects")).setSpecies("flamingo").build();


     Si noti che nel secondo esemipo di "AnimalImmutable" (2-) non si ha mai e poi mai salvato un'istanza dell'oggetto
     builder ("AnimalBuilder"). Spesso, gli oggetti builder (come "AnimalBuilder") vengono usati una volta e poi scartati.
     Infine, viene creato l'oggetto target ("AnimalImmutable") con l'impiego del metodo "build()", permettendogli di
     interagire con il costruttore di "AnimalImmutable" direttamente.
     Si può notare anche non è mai stato settato esplicitamente "age" nel secondo esempio. In questo scenario, "age" può
     non essere richiesto, anche se è possibile certamente scrivere il metodo "build()" per lanciare (throw) un'eccezione
     nel caso in cui certi campi obbligatori non vengono settati. Alternativamente, il metodo "build()" può anche settare
     valori di default per ogni campo che l'utente sbaglia nello specificare sull'oggetto builder.
     Il vantaggio principale del "builder pattern" è che questo approccio porta ad avere un codice facilmente manutenibile.
     Se un nuovo campo opzionale viene aggiunto alla classe "AnimalImmutable", allora il codice che crea l'oggetto usando
     la classe "AnimalBuilder" non dovrà essere cambiato. In pratica, un'oggetto builder supporta spesso dozzine di parametri,
     solo la metà dei quali può essere settata dall'utente del builder in un determinato momento.

     N.B: Builder Pattern and Tightly Coupled Code
     Come detto, la classe "AnimalBuilder" assomiglia molto alla classe target "AnimalImmutable". Inoltre, richiede una
     conoscenza diretta di come usare il costruttore "AnimalImmutable", menzionato prima, il quale potrebbe crescere da
     50 a 60 parametri. In questa maniera, la classe builder e la classe target sono considerate strettamente accoppiate.

     "Tight coupling" è la pratica di sviluppare classi accoppiate che sono altamente dipendenti l'una dall'altra,
     in modo tale che un cambiamento minore in una delle due classi possa avere un impatto notevole invece suull'altra
     classe. Alternativamente, "loose coupling" è la pratica di sviluppare coppie di classi con una dipendenza
     minima tra le due.
     Sebbene in pratica si preferisca la "loose coupling", in questo caso specifico è necessaria la "tight coupling"
     in modo che il chiamante della classe "AnimalBuilder" non debba usare direttamente il costruttore della classe
     "AnimalImmutable" su 60 parametri o più.
     In pratica, una classe builder viene spesso inserita nel medesimo package della classe target, sia come STATIC inner
     class all'interno della classe target o all'interno dello stesso Java package. Un vantaggio del posizionarli nello
     stesso package è che se uno di loro due cambia, allora anche l'altra classe potrà essere facilmente aggiornata.
     Un'altro vantaggio è che lo sviluppatore del codice della classe target può scegliere di rendere il costruttore PRIVATE
     o con un modificatore di default (package default), forzando l'utente ad affidarsi all'oggetto builder per ottenere
     un'istanza della classe target. Per esempio, se la classe "AnimalImmutable" non avesse un costruttore PUBLIC, i
     programmi che lo chiamano da un'altro package dovrebbero usare la classe "AnimalBuilder" per creare un'istanza della
     classe "AnimalImmutable".

 */

public class UsingTheBuilderPattern {
}