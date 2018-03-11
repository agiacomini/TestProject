package com.giacomini.andrea.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test;

public class Dolphin implements LivesInOcean {

    // Override del metodo "makeSound()" ereditato dall'interfaccia "LivesInOcean";
    public void makeSound(){

        System.out.println("whistle");
    }
}
