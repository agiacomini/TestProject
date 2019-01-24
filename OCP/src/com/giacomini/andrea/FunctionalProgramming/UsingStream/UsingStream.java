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
* */

public class UsingStream {
}
