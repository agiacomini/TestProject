package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

// Istanziazione Lazy
public class VisitorTicketTracker {

    // Riferimento all'oggetto singleton;
    private static VisitorTicketTracker instance;

    // Costruttore;
    private VisitorTicketTracker(){}

    public static VisitorTicketTracker getInstance(){

        if(instance == null){

            instance = new VisitorTicketTracker();      // NO THREAD-SAFE
        }

        return instance;
    }

    // Metodi di accesso ai dati . . .
}
