package com.giacomini.andrea.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples;

/*
N.B: Un principio fondamentale della progettazione orientata agli oggetti è il concetto di incapsulamento dei dati.
     Nello sviluppo software, l'incapsulamento è l'idea di combinare campi e metodi in una data classe tale che
     i metodi operino sui dati, a differenza dell'utente della classe che accede direttamente ai campi.
     In Java, è comunemente implementato con membri d'istanza PRIVATE che hanno metodi PUBLIC che recuperano e modificano
     i dati, comunemente conosciuti come metodi getter e setter rispettivamente.

     L'idea sottostante dell'incapsulamento è che nessu attore oltre la classe stessa possa avere accesso diretto ai dati.
     Si dice che la classe incapsula i dati in essa contenuti e impedisca a chiunque di accedervi direttamente.
     Con l'incapsulamento, una classe è in grado di mantenere l'invarianza dei suoi dati interni. Un "invariante" è una
     proprietà che viene mantenuta anche dopo la modifica dei dati. Per esempio, si immagini che si stia progettando una
     nuova classe "Animal" e che si hanno i seguenti requisiti di progettazione:

        - ogni animale ha un campo "species" non-null e non vuoto;
        - ogni animale ha un campo "age" che è più grande o uguale a zero;

     L'obiettivo di progettazione della nostra classe "Animal" sarebbe quello di garantire che non si arrivi mai ad un'istanza di Animal
     che violi una di queste proprietà. Usando memebri d'istanza PRIVATE con l'impiego di metodi getter e setter che
     convalidano i dati di input, si potrà garantire che queste invarianti rimangano vere. Nel capitolo "ExcpetionsAndAssertions"
     si descriverà come testare queste classi invarianti usando le asserzioni.
     Un'esempio illustrativo può far luce su questo concetto. Prima di tutto definiamo la classe "Animal" senza incapsulamento:

        public class Animal {

            public String species;
            public int age;
        }

     Così come è definita la classe "Animal" è facile creare un'istanza di "Animal" che violi entrambi i vincoli di progettazione:

        Animal animal = new Animal();
        animal.age = -100;

     In questo esempio, la prima invariante è violata appena l'oggetto viene creato, con il campo "species" settato per default a null.
     L'utente poi setta il campo "age" a -10, dal momento che il campo è pubblicamente accedibile, portando così alla
     violazione anche del secondo vincolo di invarianza. Questo oggetto può ora essere passato ai metodi, con gli utenti
     ignari che entrambe le invarianti sono state violate.

     Come è possibile fissare questo problema usando l'incapsulamento? Per prima cosa è necessario rendere le variabili d'istanza
     PRIVATE. In questo modo, la classe sarà l'unica che potrà modificare i dati direttamente. Poi sarà necessario definire
     un costruttore, i getter e i setter che rafforzeranno queste invarianti. Di seguito un'esempio di implementazione
     che rafforza le invarianti usando l'incapsulamento:

     Guarda gli esempi: com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples.Test.Animal;

     Come si può vedere da questo esempio, "species" e "age" sono entrambe marcate come PRIVATE, con metodi "getSpecies()"
     "getAge()" di tipo PUBLIC per leggere i dati. Inoltre, i metodi "setSpecies()" e "setAge()" validano gli input e lanciano
     eccezioni se una delle invarianti viene violata. In fine, un costruttore non di default è stato aggiunto il quale
     richiede un valore "species" ed usa il metodo "setSpecies()" per validare l'input.
     Il vantaggio di questa nuova implementazione della classe "Animal" è che usa l'incapsulamento per rafforzare
     i principi di progettazione della classe. Ogni volta che un'istanza della classe "Animal" viene passata ad un metodo
     può essere usata senza che le sue invarianti siano validate.

     N.B: Blocking Direct Access to Private Class Variables
          Quando ci si imbatte in un metodo getter o setter, questo viene generato e offre accesso quasi diretto alle sue
          variabili PRIVATE, come nel seguente esempio:

            private String name;

            public String getName(){
                return name;
            }

            public setName(String name){
                this.name = name;
            }

          All'inizio, potrebbe sembrare come un cattivo incapsulamento. Dopo tutto, il campo può essere modificato senza nessuna
          regola. In realtà, questo è comunque ancora meglio che permettere l'accesso diretto alla variabile PRIVATE "name". Il vantaggio
          deriva dal fatto che chi scrive la classe può aggiornare i metodi getter e setter per avere regole più complesse senza causare
          problemi agli utenti della classe costringendoli a ricompilare il loro codice. Si supponga di avere l'obbligo
          di trattare le stringhe vuote o quelle che contengo spazi vuoti come valori null. Il metodo "setName()" potrebbe
          essere riscritto come segue:

            public void setName(String name){
                this.name = (name == null || name.trim().length() == 0) ? null : name;
            }

          Dal momento che la firma del metodo "setName()" non è cambiata, il chiamante del metodo non dovrà modificare
          e ricompilare il suo codice.
          Cosa succederebbe se chi ha scritto la classe che all'inizio permetteva di accedere direttamente al campo "name"
          decidesse di cambiare ed rendere il campo PRIVATE aggiungendo di conseguenza anche i metodo getter e setter?
          Questo forzerebbe gli utilizzatori della classe a ricompilare il loro codice, dal momento che il modo in cui è possibile
          accedere al campo "name" è cambiato. Per questo motivo è considerata una buona pratica sempre l'uso dell'incapsulamento
          di tutte le variabile della classe, anche se non ci sono regole stabilite su di esse, come modo di proteggere i dati
          nel caso in cui in un secondo memmento vengano aggiunte le regole di invarianza.


 */

public class EncapsulatingData {
}
