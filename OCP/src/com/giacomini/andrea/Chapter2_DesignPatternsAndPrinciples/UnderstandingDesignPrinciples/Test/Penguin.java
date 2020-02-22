package com.giacomini.andrea.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples.Test;

public class Penguin {

    // Campi PRIVATE;
    // Composizione di oggetti (Has-a relationship);
    private final Flippers flippers;
    private final WebbedFeet webbedFeet;

    // Costruttore;
    public Penguin(){
        this.flippers = new Flippers();
        this.webbedFeet = new WebbedFeet();
    }

    public void flap(){

        this.flippers.flap();
    }

    public void kick(){

        this.webbedFeet.kick();
    }
}
