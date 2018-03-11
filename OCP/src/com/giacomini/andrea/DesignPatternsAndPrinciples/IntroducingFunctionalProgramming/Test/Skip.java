package com.giacomini.andrea.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test;

public interface Skip extends Sprint {

    // Metodo di default;
    public default int getHopCount(Kangaroo kangaroo){

        return 10;
    }

    // Metodo STATIC;
    public static void skip(int speed){}
}
