package com.giacomini.andrea.FunctionalProgramming.UsingStream;

/**
 * Created by Andrea on 01/02/2019.
 */

/*
* N.B: Qunado il codice non funziona come ci si aspetta è pratica comune aggiungere un "println()" o impostare
*      un breakpoint per vedere il valore di un oggetto. Con gli "Stream" è più difficile. Dal momento che le
*      "Intermediate Operations" non vengono eseguite fino a quando non è necessario, e Java è libera di renderle
*      più efficienti, si sono rese necessarie delle nuove tecniche. La tabella 4.5 (pagina 204) mosrta alcune
*      opzioni per stampare il contenuto di uno "Stream". Si scoprirà che si avrà sempre meno bisogno di stampare
*      i valori di uno "Stream" (per capire cosa contiene) mano a mano che si acquisisce maggiore dimestichezza con
*      l'uso gli "Stream" pipeline. Mentre si imparano bene ad usarli la stampa è davvero utile.
*
*      - How to print a "Stream"
*      ----------------------------------------------------------------------------------------------------|
*      |    Option                              Works for infinite "Stream"?      Destructive to "Stream"? |
*      |---------------------------------------------------------------------------------------------------|
*      |    s.forEach(System.out::println);     NO                                YES                      |
*      |                                                                                                   |
*      |    System.out.println(                 NO                                YES                      |
*      |        s.collect(Collectors.toList())                                                             |
*      |    );                                                                                             |
*      |                                                                                                   |
*      |    s.peek(System.out::println)         NO                                NO                       |
*      |     .count();                                                                                     |
*      |                                                                                                   |
*      |    s.limit(5)                                                                                     |
*      |     .forEach(System.out::println);     YES                               YES                      |
*      |---------------------------------------------------------------------------------------------------|
*
*      Si noti come molti di questi approcci sono distruttivi. Questo significa che non si può più usare
*      lo "Stream" dopo averlo stampato. Questo può andare bene quando si cominciano ad usare gli "Stream"
*      e si vuole vedere cosa fa il codice. Diventa un problema quando si cerca di scoprire come appare
*      uno "Stream" quando passa attraverso una certa parte della pipeline.
*      Inoltre, si noti che solo uno di questi approcci funziona per gli "Stream" infiniti. Semplicemente
*      limita (metodo "limit()") il numero degli elementi prima di stamparli. Se si provano gli
*      altri approcci con uno "Stream" infinito continueranno ad eseguire fino a quando non si killa
*      il processo.
*
* */

public class PrintingAStream {
}
