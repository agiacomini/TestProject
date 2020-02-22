package com.giacomini.andrea.DesignPatternsAndPrinciples.IntroducingFunctionalProgramming.Test;

// Interfaccia funzionale (potrei marcarla con l'annotazione @FunctionalInterface);
@FunctionalInterface
public interface CheckTrait {

    // Metodo public abstract;
    public boolean test(Animal a);
}
