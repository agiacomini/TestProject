package com.giacomini.andrea.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test;

public class Animal {

    // Variabili d'istanza
    private String species;
    private boolean canHop;
    private boolean canSwim;

    // Costruttore;
    public Animal(String speciesName, boolean hopper, boolean swimmer){

        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    // Metodi d'istanza;
    public boolean canHop(){
        return canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    // Override del metodo "toString()" ereditato dalla classe Object;
    public String toString(){
        return species;
    }
}
