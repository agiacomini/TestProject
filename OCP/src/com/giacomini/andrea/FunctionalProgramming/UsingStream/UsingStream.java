package com.giacomini.andrea.FunctionalProgramming.UsingStream;

/**
 * Created by Andrea on 19/01/2019.
 */

/*
* N.B:  Uno "Stream" in Java è una sequenza di dati. Uno "Stream pipeline" è l'operazione
*       che viene eseguita su uno "Stream" per produrre un risultato. Si pensi allo "Stream
*       pipeline" come ad una linea di assemblamento (o catena do montaggio) in una fabbrica.
*       Si supponga di gestire una catena di montaggio per fare i cartelli per l'esposizione
*       degli animali allo zoo. Si ha un numero di lavori. Abbiamo un certo numero di lavori
*       E' compito di una persona togliere i cartelli dalla scatola. E' compito di una seconda
*       persona dipingere il cartello. E' compito di una terza persona applicare il nome
*       dell'animale sul cartello. E' compito di una quarta persona mettere il cartello completato
*       nella scatola da portare con se all'esibizione vera e propria.
*       Si noti come la seconda persona non possa fare niente fino a quando la prima non ha
*       tolto dalla scatola il primo cartello. In modo simile, la terza persona non può fare
*       niente fino a quando almeno un cartello non è stato dipinto, e la quarta persona non può
*       fare niente fino a quando il nome dell'animale non è stato applicato sul cartello.
*       La linea di montaggio per fare cartelli è così finita. Una volta che abbiamo processato
*       il contenuto delle nostre scatole di cartelli, abbiamo finito. I flussi (stream) finiti
*       hanno un limite. Altre linee di montaggio/assemblaggio essenzialmente funzionano per sempre,
*       come per esempio quella per la produzione alimentare. Naturalmente, queste si fermano
*       ad un certo punto quando la fabbrica chiude, ma fanno finta che ciò non accada.
*       Oppure pensate ad un ciclo alba/tramonto come infinito, poiché non si esaurisce
*       per un periodo di tempo eccessivamente lungo.
*       Un'altra caratteristica importante di una catena di montaggio è che ogni persona tocca
*       ogni elemento per fare la propria operazione e successivamente quel pezzo di dato
*       se ne va (sparisce). Non torna indietro. A quel punto la prossima persona se ne
*       occuperà. Questo comportamento è diverso dalle "List" o dalle "Queue" che si è visto
*       nell'ultimo capitolo. Con un'elenco "List" è possibile accedere a qualsiasi elemeneto
*       in qualsiasi momento. Con una coda "Queue", si è limitati su quali elementi è possibile
*       accedere, ma tutti gli elementi sono presenti. Con gli "Stream" (flussi) i dati
*       non vengono generati frontalmente, ma vengono creati quando necessario.
*       Lungo il percorso possono accadere molte cose nelle stazioni della catena di montaggio.
*       In programmazione, queste sono chiamate "stream operation". Proprio come per la
*       linea di montaggio, le operazioni si svolgono in una pipeline. Qualcuno deve iniziaire e
*       qualcun'altro deve finire il lavoro, e lì in mezzo ci può essere un numero qualsiasi
*       di stazioni intermedie. Dopo tutto, un lavoro fatto da una sola persona non è una
*       catena di montaggio/assemblaggio. Ci sono tre parti distinte in uno "stream pipeline":
*
*           figura 4.2 "Stream Pipeline" pagina 186
*
*           - Source: da dove lo stream inizia/parte.
*
*           - Intermediate operations: trasforma lo stream in un'altro. Ci possono essere sia poche
*             che tutte le operazioni intermedie che si vuole. Poichè gli "Stream" usano
*             una valutazione "lazy" (pigra), le operazioni intermedie non vengono eseguite
*             fino a quando non viene eseguita "Terminal Operation" (operazione finale).
*
*           - Terminal Operation: in realtà produce un risultato. Dal momento che lo "Stream"
*            può essere usato una sola volta, lo "Stream" non è più valido una volta che
*            è stata eseguita la "Terminal Operation".
*
*       Si noti come "Intermediate Operations" sono una "black box". Quando si guarda la
*       linea di montaggio dall'esterno, ci si preoccupa solo di cosa entra e di cosa esce.
*       Quello che succede nel mezzo è un dettaglio implementativo.
*       Si avrà bisogno di conoscere bene le differenze tra le operazioni "Intermediate"
*       e "Terminal".
*
*       Intermediate Vs Terminal operations
*       ------------------------------------------------------------------------
*       | Scenario                 For Intermediate            For Terminal    |
*       |                          Operations?                 Operations?     |
*       |----------------------------------------------------------------------|
*       | Required part of         NO                          YES             |
*       | a useful pipeline?                                                   |
*       |                                                                      |
*       | Can exist multiple       YES                          NO             |
*       | times in a pipeline?                                                 |
*       |                                                                      |
*       | Return type is a         YES                          NO             |
*       | stream type?                                                         |
*       |                                                                      |
*       | Executed upon method     NO                           YES            |
*       | call?                                                                |
*       |                                                                      |
*       | Stream valid after       YES                          NO             |
*       | call?                                                                |
*       ------------------------------------------------------------------------
*
*       Tipicamente una fabbrica ha un capo reparto "foreman" che osserva/tiene d'occhio il lavoro.
*       Java serve proprio come "foreman" quando si lavoro con gli stream pipelines.
*       Questo è un ruolo veramente importante, specialmente quando si ha a che fare
*       con valutazioni pigre "lazy" e stream (flussi) infiniti. Si pensi alla dichiarare
*       del flusso come all'impartire istruzioni al capo reparto. Quando il capo reparto
*       scopre ciò che deve essere fatto, allestisce le stazioni e dice ai lavoratori
*       quali saranno i loro compiti. Tuttavia, i lavoratori non iniziano a lavorare fino
*       a quando il capo reparto non dice loro di iniziare. Il capo reparto aspetta
*       fino a quando non vede il "Terminal Operation" per dare il via dei lavori. Inoltre,
*       guarda il lavoro e ferma la linea di assemblaggio non appena il lavoro è finito.
*       Diamo uno sguardo ad alcuni esempi. Non stiamo usando codice in questi esempi
*       perché è veramente importante capire il concetto di "Stream pipeline" prima di iniziare
*       a scrivere il codice. La figura 4.3 (pagina 187) mostra uno "Stream pipeline"
*       con una "Intermediate Operation". Diamo uno sguardo a cosa succede dal punto di
*       vista del capo reparto "foreman". Per prima cosa, guarda che la sorgente/fonte
*       "source" stia togliendo i segnali dalla scatola. Il caporeparto allora isctruisce
*       un lavoratore al tavolo per disfare la scatola e gli dice di aspettare un segnale.
*       Poi il capo squadra "foreman" vede l'"Intermediate Operation" per dipingere il cartello.
*       Istruisce un lavoratore con la vernice e gli dice di aspettare un segnale. Infine,
*       il capo reparto "foreman" vede l'"Intermediate Operation" per mettere i cartelli in
*       una pila. Istruisce un lavoratore per fare questa attività e grida a tutti e tre i
*       lavoratori di iniziare.
*       Supponiamo che ci siano due cartelli nella scatola. Al primo step (1) il primo lavoratore
*       prende un cartello e lo consegna al secondo lavoratore. Al passo 2 il secondo
*       lavoratore lo dipinge e lo passa al terzo lavoratore. Allo step 3 il terzo lavoratore
*       lo prende e lo mette sulla pila. Gli step 4-6 eseguono lo stesso processo per
*       l'altro cartello (erano 2 in totale i cartelli). Poi il capo reparto "foreman"
*       vede che non ci sono più cartelli e chiude l'intera impresa.
*       Il capo reparto "foreman" è intelligente. Può prendere decisioni su come fare al meglio
*       il lavoro in base alle necessità. A titolo di esempio, esaminiamo lo stream pipeline
*       di figura 4.4 (pagina 188):
*
*       Il capo reparto "foreman" vede ancora una sorgente dati da cui prelevare i cartelli
*       dalla scatola e assegna l'attività ad un operaio da iniziare solo ad un suo comando.
*       Sempre il capo squadra vede una "Intermediate Operation" per dipindere i cartelli
*       e istruisce un altro operaio con l'istruzione di apsettare e poi dipingere.
*       Poi vede uno step intermediate che ci servono solo due cartelli. Egli istruisce un
*       lavoratore per contare i cartelli che passano e di notificargli quando il lavoratore
*       ne ha visti passare due. Alla fine istruisce un lavoratore per il "Terminal Operation"
*       per mettere i cartelli sulla pila.
*       Questa volta supponiamo che ci siano dieci cartelli nella scatola. Cominciamo come
*       l'ultima volta. Il primo cartello si fa strada lungo la pipeline. Anche il secondo
*       cartello si fa strada lungo la pipeline. Quando il secondo lavoratore il cui compito
*       e quello di contare vede il secondo cartello passare, lo dice subito al capo squadra
*       (come gli era stato ordinato). Il caposquadra allora lascia che il terzo lavoratore
*       finisca la sua attività e poi grida di fermare la linea. Non importa che ci siano
*       altri otto cartelli nella scatola. Non ce ne bisogno, quindi è inutile dipingerli.
*       Naturalmente tutti quanti vogliamo evitare lavoro non necessario.
*       Allo stesso modo, il capo squadra "foreman" avrebbe fermato la linea dopo il primo
*       cartello se la "Terminal Operation" fosse stata quella di trovare il primo cartello
*       creato.
*       Nelle sezioni seguenti, vedremo le tre pati di una pipeline. Discuteremo anche di
*       tipi speciali di stream per primitive e di come stampare uno stream.
*
*
* */

public class UsingStream {
}
