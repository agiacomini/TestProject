package com.giacomini.andrea.GenericsAndCollections.ReviewingOCACollections;

/*
N.B: Ogni primitiva ha una corrispondente classe Wrapper, come mostrato di seguito:

        Tipo Primitiva          Wrapper Class       Esempio di inizializzazione

        boolean                 Boolean             new Boolean(true)

        byte                    Byte                new Byte((byte) 1)

        short                   Short               new Short((short) 1)

        int                     Integer             new Integer(1)

        long                    Long                new Long(1)

        float                   Float               new Float(1.0)

        double                  Double              new Double(1.0)

        char                    Character           new Character('c')

     L'Autoboxing converte in modo automatico una primitva nella corrsipondente classe Wrapper quando necessario se
     il tipo generico è specificato nella dichiarazione. Prevedibilmente, l'Unboxing converte all'indietro, in modo automatico, una
     classe Wrapper nella sua primitva.
     Vediamo un'esempio. Cosa pensi che faccia questo codice?

        3: List<Integer> numbers = new ArrayList<Integer>;
        4: numbers.add(1);
        5: numbers.add(new Integer(3));
        6: numbers.add(new Integer(5));
        7: numbers.remove(1);
        8: numbers.remove(new Integer(5));
        9: System.out.println(numbers);

     La risposta è [1]. Vediamo come funziona. Dalla linea 4 alla linea 6 vengono aggiunti tre oggetti Integer alla List "numbers".
     Sulla linea 4 questo viene realizzato con un "AutoBoxing". A questo punto "numbers" contiene [1, 3, 5].
     La linea 7 è più complicata. Il metodo "remove()" è overridden. Una firma prende un "int" come indice dell'elemento da
     rimuovere. L'altra firma prende un "Object" che dovrebbe essere rimosso. Sulla linea 7, Java trova una corrsipondenza
     con la firma del metodo che prende un "int", così in questo caso specifico non è necessario fare l'Autoboxing per richiamare
     il metodo. Ora "numbers" contiene [1,5]. La linea 8 chiama l'altro metodo "remove()", cioè quello che nella firma si aspetta
     di ricevere un "Object", e cancella l'oggetto che match, in questo modo ci lascia con solo [1].
     Java converte anche le classi Wrapper nelle rispettive primitive eseguendo un "Unboxing":

        int num = numbers.get(0);               // Unboxing;
 */

public class WrapperClassesAndAutoboxing {
}
