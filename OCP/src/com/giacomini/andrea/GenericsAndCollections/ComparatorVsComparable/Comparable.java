package com.giacomini.andrea.GenericsAndCollections.ComparatorVsComparable;

/*
N.B: L'interfaccia "Comparable" ha solo un metodo. Infatti, questa di seguito è l'interfaccia:

        public interface Comparable<T>{
            public int compareTo(T o);
        }

     L'uso dei generics consente di evitare il cast quando si implementa il metodo "compareTo()". Qualsiasi oggetto può
     essere "Comparable". Per esempio, si ha un mucchio di anatre e si vuole ordinarle per nome:

        import java.util.*;
        public class Duck implements Comparable<Duck> {

            private String name;

            public Duck(String name){
                this.name = name;
            }

            public String toString(){           // use readable output;
                return name
            }

            public int compareTo(Duck d){

                return name.compareTo(d.name);  // chiama il metodo "compareTo()" di String;
            }

            public static void main(String[] args){

                List<Duck> ducks = new ArrayList<>();
                ducks.add(new Duck("Quack"));
                ducks.add(new Duck("Puddles"));
                Collections.sort(ducks);        // ordina per nome
                System.out.println(ducks);      // [Puddles, Quack]
            }
        }

     La classe "Duck" implementa l'interfaccia "Comparable". Senza l'implementazione di quell'interfaccia, tutto quello che
     si ha è un metodo chiamato "compareTo()" ma non sarebbe un'oggetto "Comparable".
     La classe "Duck" fa l'override del metodo "toString()" ereditato dalla super-classe "Object", così è possibile visualizzare
     utili informazioni di output quando viene stamapto "ducks". Senza questo override l'output sarebbe qualcosa di simile a
     [Duck@70dea4e, Duck@5c647e05], poco utile per vedere quale nome di anatra viene per prima.
     Infine, la classe "Duck" implementa il metodo "compareTo()". Dal momento che "Duck" confronta oggetti di tipo "String"
     e la classe "String" ha già un metodo "compareTo()", esso può solo delegare.
     Si ha ancora bisogno di sapere cosa il metodo "compareTo()" ritorna così che si possa scrivere il proprio. Esistono
     tre regole da sapere:

        - Il numero zero è ritornato quando l'oggetto corrente è uguale all'argomento passato al metodo "compareTo()";
        - Un numero minore di zero viene ritornato quando l'oggetto corrente è più piccolo dell'argomento passato al metodo "compareTo()";
        - Un numero maggiore di zero viene ritornato quando l'oggetto corrente è più grande dell'argomento passato al
          metodo "compareTo()";

     Si veda un'implementazione del metodo "compareTo()" che confronta numeri invece di oggetti "String":

        1: public class Animal implements Comparable<Animal>{
        2:  private int id;
        3:  public int comareTo(Animal a){
        4:      return id - a.id;
        5:  }
        6:  public static void main(String[] args){
        7:      Animal a1 = new Animal();
        8:      Animal a2 = new Animal();
        9:      a1.id = 5;
        10:     a2.id = 7;
        11:     System.out.println(a1.compareTo(a2));       // -2
        12:     System.out.println(a1.compareTo(a1));       // 0
        13:     System.out.println(a2.compareTo(a1));       // 2
        14: } }

    Le linee 7 e 8 creano due oggetti di tipo "Animal".  Le linee 9 e 10 settano i loro campi "id". Questo però non è un
    buon modo per settare i campi d'istanza. Sarebbe meglio usare un metodo setter. Dal momento che l'esame OCP mostra codice
    non tradizionale per assicurarsi di aver compreso le regole, anche qui si vedrà codice non tradizionale.
    Dalla linea 3 alla linea 5 viene implementato il metodo "compareTo()" ereditato dall'interfaccia "Comparable". Dal
    momento che "int" è una primitiva, non è possibile richiamare metodi su di essa. Si potrebbe creare una classe Wrapper
    Integer e richiamare il metodo "comapreTo()" su quella. Non è necessario, tuttavia, dal momento che è facile implementare
    da soli in modo corretto il metodo "compareTo()".
    Dalla linea 11 alla linea 13 si conferma che si è implementato in modo corretto il metodo "compareTo()". La linea 11
    confronta un "id" (5) con un "id" (7) più grande e per questo viene stampato un numero negativo (-2). La linea 12
    confronta un animale con lo stesso "id" e perciò viene stamapato 0. La liena 13 invece confronta un "id" (7) con un
    "id" (5) più piccolo e perciò viene ritornato un numero positivo (2).

    N.B: Si ricorda che "id - a.id" ordina in modo acendente mentre "a.id - id" ordina in modo decrescente.

    Quando si ha a che fare con codice legacy (senza generics), il metodo "comapreTo()" richiede un cast dal momento che viene passato
    un oggetto "Object":

        public class LegacyDuck implements Comparable {
            private String name;
            public int compareTo(Object obj){
                LegacyDuck d = (LegacyDuck) obj;    // down-cast;
                return name.comapreTo(d.name);
            }
        }

    Dal momento che non viene specificato un tipo generics per "Comparable", Java assumeche si voglia un oggetto "Object"
    il che significa che si è costretti a castare l'oggetto "Object" a "LegacyDuck" prima di accedere alla sua variabile
    d'istanza.
    Si potrebbe aver notato che è stato scritto "java.util.Comparable". Questo è perché l'interfaccia "Comparable" è
    all'interno del package "java.util".


    N.B: "comapreTo()" and "equals()" Consistency

         Se si scrive una classe che impementa l'interfaccia "Comparable" si introduce una nuova logia di business per
         determinare l'uguaglianza. Il metodo "comapreTo()" ritorna 0 se i due oggetti sono uguali, mentre il metodo
         "equals()" ritorna TRUE se due oggetti sono uguali. Un ordine naturale che usa il metodo "compareTo()" è detto
         consistente con equals se e solo se "x.equals(y)" è TRUE ogni volta che "x.compareTo(y)" è uguale a 0 (vale anche
         quando "e.equals(y)" è FALSE e "x.compareTo(y)" è uguale ad un int più piccolo di zero o più grande di zero).
         Si incoraggiati a rendere la propria classe "Comparable" consistente con equals perché non tutte le classi "Collection" si comportano
         in modo prevedibile se il metodo "compareTo()" e il metodo "equals()" non sono consistenti.
         Per esempio, la seguente classe "Product" definisce un metodo "compareTo()" che non è consistente con equals:

            public class Product implements Comparable<Product>{
                int id;
                String name;
                public boolean equals(Object obj){
                    if(!(obj instanceOf Product))
                        return false;
                    Product other = (Product) obj;
                    return this.id == other.id;
                }
                public int compareTo(Product obj){
                    return this.name.compareTo(obj.name);
                }
            }

        Si potrebbe ordinare gli oggetti "Product" per nome, ma la variabile "name" non è unica. Quindi, il valore di ritorno
        di "compareTo()" potrebbe non essere 0 quando si confrontano due oggetti "Product" uguali, quindi questo metodo
        "comapreTo()" non è consistente con equals. Un modo per fissare questo è usare un "Comparable" per defnire un
        ordine alternativo.

 */

public class Comparable {
}
