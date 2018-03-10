package com.giacomini.andrea.OCP.DesignPatternsAndPrinciples.UnderstandingDesignPrinciples.Test;

public class Animal {

    // Campi PRIVATE;
    private String species;
    private int age;

    // Costruttore che richiama il metodo setter;
    public Animal(String species){

        this.setSpecies(species);
    }

    // Metodi setter;
    public void setAge(int age){

        if(age < 0){

            throw new IllegalArgumentException("Age cannot be a negative number");
        }

        this.age = age;
    }

    public void setSpecies(String species){

        if(species == null || species.trim().length() == 0){

            throw new IllegalArgumentException("Species is required");
        }

        this.species = species;
    }

    // Metodi getter;
    public String getSpecies(){

        return species;
    }

    public int getAge(){

        return age;
    }

}
