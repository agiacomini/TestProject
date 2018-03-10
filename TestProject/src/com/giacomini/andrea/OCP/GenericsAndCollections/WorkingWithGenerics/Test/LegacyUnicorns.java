package com.giacomini.andrea.OCP.GenericsAndCollections.WorkingWithGenerics.Test;

public class LegacyUnicorns {

    public static void main(String[] args){

        java.util.List<Unicorn> unicorns = new java.util.ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns.get(0);          // ClassCastExcpetion;
    }

    private static void addUnicorn(java.util.List unicorn){

        unicorn.add(new Dragon());
    }
}
