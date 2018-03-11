package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

// Instanziazione usando un blocco STATIC;
public class StaffRegister {

    // Riferimento all'oggetto singleton;
    private static final StaffRegister instance;

    // Inizializzazione STATIC;
    static{

        instance = new StaffRegister();
        // esegue altri step;
    }

    // Costruttore PRIVATE;
    private StaffRegister(){

    }

    public static StaffRegister getInstance(){

        return instance;
    }

    // Metodi di accesso ai dati . . .
}
