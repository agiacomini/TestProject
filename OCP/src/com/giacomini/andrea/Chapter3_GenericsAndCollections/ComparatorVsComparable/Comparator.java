package com.giacomini.andrea.GenericsAndCollections.ComparatorVsComparable;

/*
N.B: Alcune volte si vuole ordinare un oggetto che non implementa l'interfaccia "Comparable", o si vuole ordinare oggetti
     in differenti modi in modmenti diversi.
     Supponiamo di aver sggiunto il campo "weight" alla classe "Duck" vista in precedenza:

        public class Duck implements Comparable<Duck>{
            private string name;
            private int weight;
            public Duck(String name, int weight){
                this.name = name;
                this.weight = weight;
            }
            public String getName() { return name; }
            public int getWeight() { return weight; }
            public String toString() { retunr name; }
            public int compareTo(Duck d){
                return name.compareTo(d.name);
            }
        }

     La classe "Duck" stessa può definire il metodo "compareTo()" in un solo modo. In questo caso è stato scelto il campo "name".
     Se si vuole ordinare per qualcosa d'altro si deve definire quell'ordine di ordinamento fuori dal meotdo "compareTo()".

        public static void main(String[] args){
            Comparator<Duck> byWeight = new Comparator<Duck>() {
                public int compare(Duck d1, Duck d2){
                    return d1.getWeight() - d2.getWeight();
                }
            };
            List<Duck> ducks = new ArrayList<>();
            ducks.add(new Duck("Quack", 7));
            ducks.add(new Duck("Puddles", 10));
            Collections.sort(ducks);
            System.out.println(ducks);              // ["Puddles", "Quack"]
            Collections.sort(ducks, byWeight)
            System.out.println(ducks);              // ["Quack", "Puddles"]
        }

     Per prima cosa è stata definita una classe inner con "Comparator". Poi si è ordinato senza il comparatore (Comparator)
     e con il Comparator per vedere i due differenti output prodotti.
     "Comparator" è una interfaccia funzionale dal momento che esiste un solo metodo abstract da implementare. Questo
     significa che si può riscrivere il camparatore del precedente esempio come uno qualsiasi dei seguenti:

        Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight() - d2.getWeight();

        Comparator<Duck> byWeight = (Duck d1, Duck d2) -> d1.getWeight() - d2.getWeight();

        Comparator<Duck> byWeight = (d1, d2) -> { return d1.getWeight() - d2.getWeight(); };

        Comparator<Duck> byWeight = (Duck d1, Duck d2) -> { return d1.getWeight() - d2.getWeight(); };

    Ognuno di questi esempi mostra di prendere in input due parametri e di ritornare un "int" - esattamente come "Comparator"
    specifica. Si ricorda che il tipo è opzionale. Java lo deduce da solo da ciò che è necessario in quel punto del codice.
    Questo è ottimo (cool). Si può riscrivere cinque linee di codice usando una sintassi bizzarra su una unica linea.
    E' veramente ottimo in quanto si ottiene utilizzando la lambda syntax. Si userà un mix di lambda expression e classi
    interne anonime nel corso del libro dal momento che ci si aspetta di incontrarle anche all'esame.

    N.B: Is "Comparable" a Functional Interface?
         Si è detto che "Comparator" è un'interfaccia funzionale perché ha esattamente un solo metodo abstract. Anche "Comparable"
         è un'interfaccia funzionale dal momento che anche lui ha un solo metodo abstract. Tuttavia, usando una lambda expression
         con "Comparable" sarebbe stupido. Il punto di "Comparable" è di implementarla all'interno dell'oggetto da confrontare.

    C'è un buon numero di differenze tra "Comparable" e "Comparator". Di seguito un elenco:

        Difference                  Comparable          Comparator

        package name                java.lang           java.util

        L'interfaccia deve essere   YES                 NO
        implementata dalla classe
        da confrontare?

        il nome del metodo          compareTo()         compare
        nell'interfaccia

        il numero di parametri      1                   2

        comune a dichiarare         NO                  YES
        l'uso di una lamda
        expression

    L'esame si tenterà di confondere l'esaminato giocando proprio su queste differenze. Per esempio, si riconosce perché
    questo esempio non compila?

        Comparator<Duck> byWeight = new Comparator<Duck>{       // NON COMPIAL -
            public int compareTo(Duck d1, Duck d2){
                return d1.getWeight - d2.getWeight();
            }
        };

    Il nome del metodo è sbagliato (dovrebbe essere "compare()"). Un "Comparator" deve implementare un metodo chiamato
    "compare()". Prestare attenzione al nome del metodo e al numero di parametri.

    N.B: Real World Scenario: An easier way of comparing multiple fields
         Quando si scrive un "Comparator" che confronta più variabili d'istanza, il codice diventa un pò disordinato.
         Si supponga di avere una classe "Squirrel" e di assumere che il nome della specie non sarà mai "null". Si potrebbe
         scrivere un costruttore per imporre

            public class Squirrel {
                private int weight;
                private String species;
                public Squirrel(String theSpecies){
                    if(theSpecies == null) throw new IllegalArgumentException();
                    species = theSpecies;
                }
                public int getWeight(){ return weight; }
                public void setWeight(int weight){ this.weight = weight; }
                public int getSpecies(){ return species; }
            }

         Si vuole scrivere un "Comparator" per ordinare in funzione del nome della specie. Se due squirrels (scoiattoli)
         sono forme della stessa specie si vuole ordinarle in funzione del loro peso dal meno pesante al più pesante. Si
         potrebbe fare questo con il codice seguente:

            public class MultiFieldComparator implements Comparator<Squirrel>{
                public int compare(Squirrel s1, Squirrel s2){
                    int result = s1.getSpecies().compareTo(s2.getSpecies());
                    if(result != 0) return result;
                    return s1.getWeight()-s2.getWeight();
                }
            }

         Questo funziona. Controlla un campo. Se non c'è un match allora l'ordinamento finisce. Se invece esiste un match
         di specie (stesso nome di specie) allora si controlla il prossimo campo. Questo non è così facile da leggere. E'
         anche facile sbagliare. Cambiando "!=" con "==" si rompre completamente il sistema.
         Java 8 rende questo molto più facile. Con l'introduzione dei metodi static e quelli di default in un'interfaccia,
         ci sono ora alcuni nuovi metodi helper in "Comparator". Il codice potrebbe essere scritto in questo modo:

            public class ChainingComparator implements Comparator<Squirrel> {
                public int comapre(Squirrel s1, Squirrel s2){
                    Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
                    c = c.thenComparingInt(s -> s.getWeight());
                    return c.compare(s1,s2);
                }
            }

        La lambda expression serve per prendere il valore "species" dello scaiottolo e pssarlo al metodo. Nel prossimo
        capitolo si vedrà molto codice funzionale.
        Entrambe le versioni hanno lo stesso numero di righe di codice, ma il secondo è molto più facile da leggere.
        Descrive meglio quello che si stà facedno.

     Si avrà notato che si è ignorato il controllo dei valori "null" sia nel controllo di uguaglianza che controllo di ordinamento
     degli oggetti. Questo funziona bene per l'esame. Nel mondo reale però non sono così ordinate. Si dovrà decidere come
     gestire "null" o prevenirli. E' comune decidere che "null" viene prima di qualsiasi altro valore.

 */

public class Comparator {
}
