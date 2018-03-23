package com.giacomini.andrea;

/**
 * Created by Andrea on 23/06/2017.
 */
public class operators {

    public static void main(String[] args){

        // Operatore di confronto matematico "=="
        System.out.println("OPERATORE DI CONFRONTO \"==\" TRA UN'OGGETTO E UNA PRIMITIVA");
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e una primitiva boolean (Boolean.TRUE == Boolean.parseBoolean(\"true\")): " + (Boolean.TRUE == Boolean.parseBoolean("true")));
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e una primitiva boolean (Boolean.TRUE == true): " + (Boolean.TRUE == true));
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e una primitiva boolean (Boolean.TRUE == false): " + (Boolean.TRUE == false));
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e un'altra costante statica (Boolean.TRUE/FALSE) (Boolean.TRUE == Boolean.TRUE): " + (Boolean.TRUE == Boolean.TRUE));
        System.out.println();

        System.out.println();System.out.println();

        System.out.println("OPERATORE DI CONFRONTO \"==\" TRA DUE OGGETTI");
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e il metodo statico helper valueOf() (Boolean.valueOf(\"yes\") == Boolean.FALSE): " + (Boolean.valueOf("yes") == Boolean.FALSE));
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e il metodo statico helper valueOf() (Boolean.valueOf(false) == Boolean.FALSE): " + (Boolean.valueOf(false) == Boolean.FALSE));
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e il metodo statico helper valueOf() (Boolean.valueOf(false) == Boolean.TRUE): " + (Boolean.valueOf(false) == Boolean.TRUE));
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e il metodo statico helper valueOf() (Boolean.valueOf(false) == new Boolean(false)): " + (Boolean.valueOf(false) == new Boolean(false)));
        System.out.println();
        System.out.println("Confronto (\"==\") tra la costante statica (Boolean.TRUE/FALSE) e un nuovo oggetto Boolean (Boolean.TRUE == new Boolean(\"TrUe\")): " + (Boolean.TRUE == new Boolean("TrUe")));
        System.out.println();
        System.out.println("Confronto (\"==\") tra riferimenti di oggetti di tipo diverso NON E' POSSIBILE, ritoran ERRORE di COMPILAZIONE: new Macchina() == new Trattore()");
        System.out.println();

        System.out.println();System.out.println();

        System.out.println("OPERATORE DI CONFRONTO \"==\" TRA DUE PRIMITIVE");
        System.out.println();
        System.out.println("Confronto (\"==\") tra due primitive (Boolean.parseBoolean(\"true\") == true): " + (Boolean.parseBoolean("true") == true));
        System.out.println();
        System.out.println("Confronto (\"==\") tra due primitive (Boolean.parseBoolean(\"_true\") == true): " + (Boolean.parseBoolean("_true") == true));
        System.out.println();
        System.out.println("Confronto (\"==\") tra due primitive (Boolean.parseBoolean(\"yes\") == false): " + (Boolean.parseBoolean("yes") == false));
        System.out.println();

        System.out.println();System.out.println();

        String s = "ciao";
        StringBuilder sb = new StringBuilder("ciao");
        //s == sb;
        System.out.println("Confronto (\"==\") tra due oggetti di tipo diverso (String s == StringBuilder sb) NON E' POSSIBILE, ritoran ERRORE di COMPILAZIONE: ");

        int i = 3;
        int i2 = 3;
        long l = 3L;
        long l2 = 3L;
        if(i == l){
            System.out.println("Confronto (\"==\") tra due primitive di tipo diverso (int i = 3, long l = 3L) i == l: " + (i == l));
        } else {
            System.out.println("confronto KO");
        }
        System.out.println();System.out.println();

        // Operatore di confronto "equals()" tra oggetti
        System.out.println("OPERAOTRE DI CONFRONTO \"equals()\" TRA OGGETTI (es: Wrapper Boolean, Integer, ...)");
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti Boolean (Boolean.TRUE.equals(new Boolean(true))): " + (Boolean.TRUE.equals(new Boolean(true))));
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti Boolean (Boolean.TRUE.equals(new Boolean(\"true\"))): " + (Boolean.TRUE.equals(new Boolean("tRuE"))));
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti Boolean (Boolean.TRUE.equals(new Boolean(false))): " + (Boolean.TRUE.equals(new Boolean(false))));
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti Boolean (Boolean.TRUE.equals(new Boolean(\"_true\"))): " + (Boolean.TRUE.equals(new Boolean("_true"))));
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti Boolean (new Boolean(false).equals(Boolean.FALSE)): " + (new Boolean(false).equals(Boolean.FALSE)));
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti Boolean (new Boolean(false).equals(Boolean.TRUE)): " + (new Boolean(false).equals(Boolean.TRUE)));
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti Boolean (Boolean.valueOf(true).equals(Boolean.FALSE)): " + (Boolean.valueOf(true).equals(Boolean.FALSE)));
        System.out.println();
        System.out.println("Confronto (equals()) tra due oggetti di tipo diverso COMPILA MA RITORNA SEMPRE FALSE (new Macchina().equals(new Trattore())): " + (new Macchina().equals(new Trattore())));
        System.out.println();System.out.println();System.out.println();

        System.out.println("OPERAOTRE DI CONFRONTO \"equals()\" TRA UN'OGGETTO E UNA PRIMITIVA");
        System.out.println();
        System.out.println("Confronto (equals()) tra un oggetto Boolean e una primitiva boolean (Boolean.TRUE.equals(Boolean.parseBoolean(\"true\"))): " + (Boolean.TRUE.equals(Boolean.parseBoolean("true"))));
        System.out.println();
        System.out.println("Confronto (equals()) tra un oggetto Boolean e una primitiva boolean (Boolean.TRUE.equals(Boolean.parseBoolean(\"false\"))): " + (Boolean.TRUE.equals(Boolean.parseBoolean("false"))));
        System.out.println();
        System.out.println("Confronto (equals()) tra un oggetto Boolean e una primitiva boolean (Boolean.TRUE.equals(false)): " + (Boolean.TRUE.equals(false)));
        System.out.println();
        System.out.println("Confronto (equals()) tra un oggetto Boolean e una primitiva boolean (Boolean.TRUE.equals(true)): " + (Boolean.TRUE.equals(true)));
        System.out.println();
        System.out.println("Confronto (equals()) tra una primitiva boolean e un'oggetto Boolean NON è POSSIBILE");
        System.out.println();
    }
}

class Macchina{
    private int velocita;
    private String marca;
    private String modello;

    public Macchina(){

    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }
}

class Trattore {
    private int velocita;
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}