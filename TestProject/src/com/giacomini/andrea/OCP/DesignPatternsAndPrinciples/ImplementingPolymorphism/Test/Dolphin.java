package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test;

public class Dolphin implements LivesInOcean {

    // Override del metodo "makeSound()" ereditato dall'interfaccia "LivesInOcean";
    public void makeSound(){

        System.out.println("whistle");
    }
}
