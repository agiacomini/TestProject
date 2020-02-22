package com.giacomini.andrea.FunctionalProgramming.UsingStream;

/**
 * Created by Andrea on 29/01/2019.
 */

/*
* N.B:  Gli "Stream" ci permettono di usare la concatenazione ed esprimere ciò che si
 *      vuole realizzare piuttosto che come farlo. Supponiamo che si voglia ottenere
 *      in ordine alfabatico i primi due nomi che sono lunghi quattro caratteri. In Java 7
 *      avremmo scritto qualcosa del genere:
 *
 *          List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
 *          List<String> filtered = new ArrayList<>();
 *
 *          for (String name : list){
 *              if(name.length() == 4) filtered.add(name);
 *          }
 *
 *          Collections.sort(filtered);
 *
 *          Iterator<String> iter = filtered.iterator();
 *
 *          if(iter.hasNext())  System.out.println(iter.next());
 *          if(iter.hasNext())  System.out.println(iter.next());
 *
 *      Questo funziona. C'è bisogno di leggere bene tutto per capire cosa stà succedendo.
 *      Il problema che si stà cercando di risolvere si perde nella sua attuazione.
 *      E' anche piuttosto focalizzato/concentrato sul modo piuttosto che sul cosa.
 *      In java 8 il codice equivalente sarebbe il seguente:
 *
 *          List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
 *          list.stream().filter( n -> n.length() == 4 ).sorted().limit(2).forEach(System.out::println);
 *
 *      Prima di dire che è difficile da leggere, proviamo a formattarlo meglio:
 *
 *          list.stream().filter( n -> n.length() == 4 )
 *                       .sorted()
 *                       .limit(2)
 *                       .forEach(System.out::println);
 *
 *      La differenza è che in questo esempio si sta esprimendo ciò che sta succedendo.
 *      Ci interessano gli oggetti "String" di lunghezza 4. Poi vogliamo ordinarli.
 *      Poi vogliamo solo i pirmi 2. Alla fine si vuole stamparli. Mappa meglio il problema
 *      che si stà cercando di risolvere ed è più semplice perché non si ha a che fare
 *      con i contatori e così via (come per esempio nei cicli "for").
 *      Una volta che si comincia ad usare gli "Stream" nel proprio codice, ci si può
 *      troavere ad usarli anche in molti altri luoghi. Avere un codice più breve e più
 *      chiaro è sicuramente una buona cosa.
 *      In questo esempio, si vedono tutte e tre le parti della pipeline. La figura 4.5
 *      (pag. 201) mostra come ad ogni "Intermediate Operations" nella pipeline viene
 *      immessa nella successiva o per meglio dire alimenta la "Intermediate Operation" successiva.
 *      Si ricordi che il capo reparto sta cercando di capire come implementare al meglio
 *      la conduttura del flusso. Imposta/Predispone ogni singola stazione della linea con precise
 *      istruzioni e dice ai diversi operai di aspettare un suo preciso ordine prima di
 *      cominciare. Dice all'operaio "limit()" di informarlo quand passano due elementi.
 *      Poi dice all'operaio "sorted()" che lei dovrebbe semplicemente raccogliere tutti
 *      gli elementi che mano a mano entrano ed ordinarli tutti insieme. Dopo questa fase di
 *      ordinamento lei dovrebbe iniziare a passarli all'operaio "limit()" uno alla volta.
 *      Il flusso dei dati assomiglia al seguente:
 *
 *          1. "stream()" spedisce "Toby" a "filter()". L'operario "filter()" che la lunghezza
 *             è quella buona e quindi spedisce "Toby" all'operaio "sorted()". L'operaio
 *             "sorted()" però non può ancora ordinarli perché ha bisogno di tutti i dati,
 *             quindi si limita a contenere al suo interno "Toby".
 *
 *          2. L'operaio "stream()" spedisce "Anna" al collega "filter()". Allora l'operaio
 *             "filter()" deve che la sua lunghezza è quella buona/consentita e quindi spedisce
 *             "Anna" al collega "sort()". Però "sort()" non può ancora ordinarli perché
 *             necessità di tutti gli elementi dello "Stream" per farlo, così allora si
 *             limita a contenere "Anna".
 *
 *          3. "stream()" spedisce "Leroy" a "filter()". "filter()" vede che la lunghezza
 *             non è quella buona/consentita (non match) e quindi scarta "Leroy" e lo fa uscire
 *             dalla linea di assemblaggio.
 *
 *          4. "stream()" spedisce "Alex" a "filter()". "filter()" vede che la lunghezza
 *             è buona e allora lo spedisce a "sorted()". "sorted()" non può ancora
 *             ordinarli percgé ha bisogno di tutti gli elementi, così semplicemente
 *             contiene "Alex". Si scopre che "sorted()" ha tutti i dati richiesti, ma non
 *             lo sa ancora.
 *
 *          5. Il capo reparto dice allora a "sort()" che è il momento di ordinare e
 *             l'ordinamento si realizza.
 *
 *          6. "sort()" spedisce "Alex" a "limit()". "limit()" ricorda che ha visto un'elemento
 *             e spedisce "Alex" a "forEach()" (la "Terminate Operation"), che stampa "Alex".
 *
 *          7. "sort()" spedisce "Anna" a "limit()". "limit()" si ricorda che ha visto passare
 *             due elementi e spedisce "Anna" a "forEach()", che stampa "Anna".
 *
 *          8. "limit()" a questo punto ha visto passare tutti gli elementi di cui aveva
 *             bisogno e lo dice al caporeparto. Il caporeparto allora ferma la linea e non
 *             vengono più processate altre occorrenze.
 *
 *      Ha senso? Si provi altri due esempi per essere sicuri di aver capito bene.
 *      Cosa si pensa che faccia il seguente codice:
 *
 *          Stream.generate( () -> "Elsa" )             ?? Genera uno "Stream" infibito ??
 *                .filter( n -> n.length() == 4 )
 *                .sorted()
 *                .limit(2)
 *                .forEach(System.out::println);
 *
 *      In realtà si blocca finchè non si killa il programma o si genera una eccezione
 *      dopo l'esaurimento della memoria. Il capo squadra ha ordinato a "sort()" di aspettare
 *      finché non ci siano tutti gli elementi da ordinare. Questo non succederà mai perché c'è
 *      uno "Stream" infinito. Che dire invece di questo esempio di seguito riportato?
 *
 *          Stream.generate( () -> "Elsa" )
 *                .filter( n -> n.length() == 4 )
 *                .limit(2)
 *                .sorted()
 *                .forEach(System.out::println);
 *
 *      Questo esempio stampa due volte la stringa "Elsa". "filter()" consente agli elementi
 *      di passare e "limit()" invece interrompe l'operazione del precedente metodo dopo
 *      che sono passati due elementi. A questo punto "sorted()" può tranquillamente eseguire
 *      il proprio dovere ordinando gli elementi perché in questa occazione, a questo punto
 *      del processo non si ha più uno "Stream" infinito ma uno finito di soli due elementi.
 *      Infine, cosa si pensa che faccia il codice seguente?
 *
 *          Stream.generate( () -> "Olaf Lazisson" )
 *                .filter( n -> n.length == 4 )
 *                .limit(2)
 *                .sorted()
 *                .forEach(System.out::println);
 *
 *      Anche questo esempio rimane appeso fino a quando non si uccide il processo/programma.
 *      "filter()" non permette di passare a nessuno degli elementi dello "Stream" perché
 *      tutti con una lunghezza di strigna maggiore di 4, così "limit()" non vedrà mai
 *      due elementi. Questo significa che si deve continuare ad aspettare e sperare che si
 *      presentino.
 *
 *
 *      - Peeking Behind The Scene (Real World Scenario)
 *      Il metodo "peek()" è utile per vedere come uno "Stream" pipeline lavora dietro le
 *      scene. Si ricordi che i metodi vengono eseguiti su ogni singolo elemento uno alla
 *      volta fino a quando il processo/elaborazione non ha finito. Supponiamo di avere
 *      il seguente codice:
 *
 *          Stream<Integer> infinite = Stream.iterate( 1, x -> x + 1 );         // 123456789...
 *          infinite.limit(5)                                                   // 12345
 *                  .filter( x -> x % 2 == 1 )                                  // 135
 *                  .forEach(System.out::println);          // 135
 *
 *      La sorgente è uno "Stream" infinito di numeri. Solo i primi cinque elementi
 *      sono permessi/ammessi prima che il capo squadra ordini di fermare lo catena di
 *      montaggio. L'operazione "filter()" si limita di vedere se questi cinque elementi
 *      da 1 a 5 siano dispari. Solo tre di questi lo sono, e questi sono quelli
 *      che verranno stampati, ritornando 135.
 *      Ora cosa si pensi che stampi il codice di seguito?
 *
 *          Stream<Integer> infinite = Stream.iterate( 1, x -> x + 1 );
 *          infinite.limit(5)
 *                  .peek(System.out::print)
 *                  .filter( x -> x % 2 == 1 )
 *                  .forEach(System.out::print)
 *
 *      La risposta corretta è 11233455. Al passaggio del primo elemento, 1 appare in "peek()"
 *      e "print()". Il secondo elemento supera "limit()" e "peek()" ma non supera invece
 *      "filter()" che non lo lascia passare. Il terzo e il quindo elemento si comportano
 *      come il primo. Il quarto infine si comporta come il secondo.
 *      Invertendo l'ordine delle "Intermediate Operation" cambia di conseguenza anche il
 *      risultato.
 *
 *          Stream<Integer> infinite = Stream.iterate ( 1, x -> x + 1 );        // 123456789101112
 *          infinite.filter( x -> x % 2 == 1 )                                  // 135791113
 *                  .limit(5)                                                   // 13579
 *                  .forEach(System.out::print)                                 //
 *
 *      La sorgente è ancora uno "Stream" infinito di numeri. Il primo elemento scorre
 *      attraverso l'intera pipeline e il metodo "limit()" lo fa passare. Il secondo
 *      elemento non passa attraverso "filter()". Il terzo scorre anchesso attraverso
 *      l'intera pipeline e il metodo "limit()" lo lascia passare come secondo elemento.
 *      Questo processo prosegue fino al nono elemento e il metodo "limit()" ha permesso
 *      al quinto elemento di passare.
 *
 *      Infine, cosa si pensa che stampi il seguente codice?
 *
 *          Stream<Integer> infinite = Stream.iterate( 1, x -> x + 1 );     // 123456789
 *          infinite.filter( x -> x % 2 == 1 )
 *                  .peek(System.out::print)                                // 13579...
 *                  .limit(5)                                               // 13579
 *                  .forEach(System.out::print);
 *
 *      La risposta è 1133557799. Dal momento che "filter()" è prima di "peek()"
 *      si vedranno solo i numeri dispari.
 *
 *
 *
 *
* */

public class PuttingTogetherThePipeline {
}
