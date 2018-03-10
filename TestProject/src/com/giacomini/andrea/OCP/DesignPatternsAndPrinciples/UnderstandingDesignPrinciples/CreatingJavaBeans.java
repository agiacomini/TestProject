package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples;

/*
N.B: L'incapsulamento è un concetto così rilevante in Java che esiste uno standard per la creazione di classi che memorizzano
     dati, chiamati "JavaBeans". Un "JavaBeans" è progettato per incapsulare i dati in un'oggetto Java.
     Di seguito le regole per la "naming convention" dei JavaBean:

        - le pproprietà sono PRIVATE --> private int age;

        - i metodi getter per proprietà "non-boolean" iniziano con "get" --> public int getAge(){ return age; }

        - i metodi getter per proprietà "boolean" possono iniziare con "is" o "get" --> public boolean isBird() { return bird; }
                                                                                        public boolean getBird() { return bird; }

        - i metodi setter iniziano con "set" --> public void setAge(int age) { this.age = age; }

        - il nome del metodo deve avere un prefisso set/get/is seguito dalla prima lettera della proprietà (in Maisucolo) seguito dal
          resto del nome della proprietà --> public void setNumChildren(int numChildren) { this.numChildren = numChildren; }

     Vediamo alcuni esempi. Assumiamo di avere le seguenti due variabili PRIVATE definite nella nostra classe:

        - private boolean playing;
        - private Boolean dancing;

     Quali dei seguenti potrebbero essere inclusi in un JavaBean?

        - public boolean isPlaying() { return playing; }
        - public boolean getPlaying() { return playing; }
        - public Boolean isDancing() { return dancing; }

     La prima delle tre precedenti soluzioni è corretta perché definisce un'appropriato metodo getter per la variabile booleana.
     Anche il secondo esempio è corretto, dal momento che il metodo getter di una variabile boolean piò iniziare sia come "get"
     che come "is". Il terzo esempio invece è scorretto, perché il wrapper Boolean dovrebbe iniziare con "get" dal momento
     che è un'oggetto e non una primitiva booleana.
     Cosa si può dire degli esempi seguenti:

        public String name;
        public String name() { return name; }
        public void updateName(String n) { name = n; }
        public void setname(String n) { name = n; }

     Nessuno dei precedenti segue le corrette pratiche dei JavaBean. La prima riga rende la variabile "name" PUBLIC, dove
     invece dovrebbe essere PRIVATE. La seconda linea non definisce un'appropriato metodo getter infatti dovrebbe essere
     getName(). La ultime due linee rappresentano metodi setter scorretti, dal momento che la prima non inizia con "set"
     e la seconda non ha la prima lettera dell'attributo "name" in maiuscolo.

 */

public class CreatingJavaBeans {
}
