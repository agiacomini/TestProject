package com.giacomini.andrea.OCP.GenericsAndCollections.ReviewingOCACollections;

/*
N.B: Java ha fatto molta strada. Prima di Java 5, si doveva scrivere codice come il seguente e sperare che i programmatori
     ricordassero che si volevano solo oggetti String;

        List names = new ArrayList();

     Non c'era modo di sapere se la variabile "names" si aspettasse di contenere oggetti "String" piuttosto che oggetti
     "StringBuilder". In Java 5, è stato possibile documentare questa assunzione, nel codice, attraverso una nuova caratteristica
     chiamata "generics"! Anche il compilatore aiutava a rafforzare questa assunzione per noi:

        List<String> names = new ArrayList<String>();

     Con l'avvento di Java 7, i suoi sviluppatori lo hanno reso ancora migliore. Il precedente statement richiedeva di digitare
     sei extra caratteri (String). Java 7 permette di abbreviarlo un pò:

        List<String> names = new ArrayList<>();

     Questa forma più compatta usa l'operatore diamond (<>). Viene chiamato così perché "<>" assomiglia ad un diamante.
     Può far sorridere ma questa forma più compatta ci può far risparmiare sei caratteri. L'operatore diamond diventa più utile se si ha un codice
     molto più complesso. Alla fine del capitolo, si imparerà come scrivere codice di questo tipo:

        HasMap<String, HasMap<String, String>> map1 = new HasMap<String, HasMap<String, String>>();

        HasMap<String, HasMAp<String, String>> map2 = new HasMap<>();

     Entrambi questi due statements contengono una mappa annidata. La seconda linea è molto più facile da leggere perché
     non contiene l'informazione di tipo ridondante. Questa mappa annidata potrebbe essere utile se si dispone di un certo
     numero di dati di cache che si vuole interrogare per chiave.
     L'operatore diamond non è limitato alla dichiarazione su una linea. In questo esempio, si può vederlo usato con una
     variabile d'istanza ed una variabile locale:

        import java.util.*;
        class Doggies{

            List<String> names;
            Doggie(){

                names = new ArrayList<>();              // matches instance variable declaration
            }

            public void copyNames(){

                ArrayList<String> copyOfNames;
                copyOfNames = new ArrayList<>();        // matches local variables declaration
            }
        }

     Nel caso del costruttore, giudicate voi se l'operatore diamond rende il codice di più facile lettura. Per l'esame
     basta sapere che anche questa situazione è legale/possibile.
 */

public class TheDiamondOperator {
}
