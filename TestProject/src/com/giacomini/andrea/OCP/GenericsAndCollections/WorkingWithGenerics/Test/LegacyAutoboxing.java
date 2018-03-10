package com.giacomini.andrea.OCP.GenericsAndCollections.WorkingWithGenerics.Test;

public class LegacyAutoboxing {

    public static void main(String[] args){

        java.util.List numbers = new java.util.ArrayList();
        numbers.add(5);
//        int result = numbers.get(0);          NON COMPILA - l'Unboxing non funziona perché non usando i generics Java non
//                                                            sa che la lista "numbers" contiene degli oggetti "Integer"
//                                                            ma li vede solo come "Object" e naturalmente Java non può
//                                                            fare l'Uboxing di un Object in una primitva "int";
    }
}
