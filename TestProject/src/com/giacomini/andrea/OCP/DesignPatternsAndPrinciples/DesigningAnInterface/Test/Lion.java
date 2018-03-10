package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.DesigningAnInterface.Test;

public class Lion implements Run {

    // Implementa il metodo abstract ereditato dall'interfaccia "Walk";
    public boolean isQuadruped(){

        return true;
    }

    // Implementa il metodo abstract ereditato dall'interfaccia "Run";
    public boolean canHuntWhileRunning(){

        return true;
    }

    // Implementa il metodo abstract ereditato dall'interfaccia "Run" che a sua volta aveva fatto l'override del metodo
    // ereditato dall'interfaccia padre "Walk";
    public double getMaxSpeed(){

        return 100;
    }
}
