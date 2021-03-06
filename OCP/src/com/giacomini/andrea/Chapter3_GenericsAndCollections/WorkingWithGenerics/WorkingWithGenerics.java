package com.giacomini.andrea.GenericsAndCollections.WorkingWithGenerics;

/*
N.B: Perchè abbiamo bisogno dei generics? Ricordi quando abbiamo detto che dobbiamo sperare che il chiamante non metta
     qualcosa nella lista che non ci si aspetta? Nel seguente codice si realizza proprio questa situazione:

        static void printName(List list){

            for(int i = 0 ; i < list.size() ; i++){

                String name = (String) list.get(i);     // class cast exception here
                System.out.println(name);
            }
        }

        public static void main(String[] args){

            List names = new ArrayList();
            names.add(new StringBuilder("Webby"));
            printName(names);
        }

     Questo codice lancia una eccezione "ClassCastExcpetion". Nel metodo "main()" viene aggiunto uno "StringBuilder" alla
     lista. Questo è permesso/legale perché le liste non-generics possono contenere qualsiasi cosa. Comunque, nel metodo
     "printName()" è stato scritto che ci si aspetta una specifica classe e questo viene dichiarato attraverso il cast a "String".
     Dal momento che l'assunzione è incorretta, il codice lancia una "ClassCastException" dal momento che uno "StringBuilder"
     non può essere castato in nessun modo in una "String".
     I Generics risolvono questa situazione permettendoci di scivere e usare un tipo parametrizzato. Si specifica che si
     vuole un "ArrayList" di oggetti "String". Ora il compilatore ha abbastanza informazioni per prevenire questo tipo
     di problemi di cast:

        List<String> names = new ArrayList<String>();
        names.add(new StringBuilder("Webby"));              // NON COMPILA -

     Ritornerà un errore di compilazione. Ci permetterà di sapere subito che qualcosa è sbagliato piuttosto che aspettare e
     sperare di scoprirlo dopo.
 */

public class WorkingWithGenerics {
}
