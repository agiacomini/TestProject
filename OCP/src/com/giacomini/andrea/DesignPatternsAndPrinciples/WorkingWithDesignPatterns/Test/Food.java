package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

public abstract class Food {

    private int quantity;

    // Costruttore;
    public Food(int quantity){

        this.quantity = quantity;
    }

    public int getQuantity(){

        return quantity;
    }

    public abstract void consumed();

}
