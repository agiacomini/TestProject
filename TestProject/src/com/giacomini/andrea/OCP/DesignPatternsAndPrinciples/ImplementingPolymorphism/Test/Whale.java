package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test;

public class Whale implements LivesInOcean {

    // Override del metodo "makeSound()" ereditato dall'interfaccia "LivesInOcean";
    @Override
    public void makeSound() {

        System.out.println("sing");
    }
}
