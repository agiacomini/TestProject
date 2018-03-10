package com.giacomini.andrea.OCP.GenericsAndCollections.ComparatorVsComparable.Test;

import java.util.*;

public class Duck implements Comparable<Duck> {

    private String name;

    public Duck(String name){
        this.name = name;
    }

    public String toString(){           // use readable output;
        return name;
    }

    public int compareTo(Duck d){

        return name.compareTo(d.name);  // chiama il metodo "compareTo()" di String;
    }

    public static void main(String[] args){

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);        // ordina per nome
        System.out.println(ducks);      // [Puddles, Quack]
    }
}
