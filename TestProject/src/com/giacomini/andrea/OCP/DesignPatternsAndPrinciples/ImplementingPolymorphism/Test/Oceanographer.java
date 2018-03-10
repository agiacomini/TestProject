package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test;

public class Oceanographer {

    public void checkSound(LivesInOcean animal){

        animal.makeSound();
    }

    public static void main(String[] args){

        Oceanographer o = new Oceanographer();
        o.checkSound(new Dolphin());                // whistle
        o.checkSound(new Whale());                  // sing
    }
}
