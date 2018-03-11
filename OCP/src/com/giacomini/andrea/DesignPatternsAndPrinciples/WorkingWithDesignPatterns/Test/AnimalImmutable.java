package com.giacomini.andrea.DesignPatternsAndPrinciples.WorkingWithDesignPatterns.Test;

import java.util.*;

public final class AnimalImmutable {

    // Campi PRIVATE e FINAL;
    private final String species;
    private final int age;
    private final List<String> favoriteFoods;

    // Costruttore PUBLIC (N.B: il costruttore della classe immutabile può essere forzato a PRIVATE o al modificatore di default
    //                    per costringere il chiamante ad affidarsi all'oggetto builder per avere un'istanza dell'oggetto immutabile);
    public AnimalImmutable(String species, int age, List<String> favoriteFoods){

        this.species = species;
        this.age = age;
        if(favoriteFoods == null){
            throw new RuntimeException("favoriteFoods is required");
        }
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    // Metodi getter delle proprietà della classe;
    public String getSpecies(){
        return species;
    }

    public int getAge(){
        return age;
    }

    public int getFavoriteFoodsCount(){
        return favoriteFoods.size();
    }

    public String getFavoriteFoods(int index){

        return favoriteFoods.get(index);
    }

    // NO metodi setter;
}
