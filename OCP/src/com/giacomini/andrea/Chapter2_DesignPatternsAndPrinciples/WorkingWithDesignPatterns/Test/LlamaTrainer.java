package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

public class LlamaTrainer {

    public boolean feedLlamas(int numberOfLlamas){

        int amountNeeded = 5 * numberOfLlamas;
        HayStorage haystorage = HayStorage.getInstance();
        if(haystorage.getHayQuantity() < amountNeeded){

            haystorage.addHay(amountNeeded + 10);
        }

        boolean fed = haystorage.removeHay(amountNeeded);
        if(fed) System.out.println("Llamas have been fed");
        return fed;
    }
}
