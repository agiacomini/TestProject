package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.ImplementingPolymorphism.Test;

public class Lemur extends Primate implements HasTail {

    public int age = 10;

    // Override del metodo ereditato dall'interfaccia "HasTail";
    @Override
    public boolean isTailStriped(){

        return false;
    }

    public static void main(String[] args){

        Lemur lemur = new Lemur();
        System.out.println(lemur.age);                      // 10

        // up-cast;
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());        // FALSE

        // up-cast;
        Primate primate = lemur;
        System.out.println(primate.hasHair());              // TRUE
    }
}
