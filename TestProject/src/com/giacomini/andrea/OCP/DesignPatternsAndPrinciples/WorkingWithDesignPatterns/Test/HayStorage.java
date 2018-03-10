package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

public class HayStorage {

    private int quantity = 0;

    // Costruttore. E' PRIVATE in modo da escludere che nessun altra classe possa istanziare un'istanza dell'oggetto;
    private HayStorage(){}

    // Riferimento all'oggetto singleton;
    private static final HayStorage instance = new HayStorage();

    // Metodo che ritorna un riferimento all'oggetto singleton;
    public static HayStorage getInstance(){

        return instance;
    }

    public synchronized void addHay(int amount){

        quantity += amount;
    }

    public synchronized boolean removeHay(int amount){

        if(quantity < amount) return false;
        quantity -= amount;
        return true;
    }

    public synchronized int getHayQuantity(){

        return quantity;
    }
}
