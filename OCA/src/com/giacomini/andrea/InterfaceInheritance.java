package com.giacomini.andrea;

/**
 * Created by Andrea on 13/07/2017.
 */
public class InterfaceInheritance {
}

abstract interface TestInterface {

    public static int i = 10;

    default void firstMethodTestInterface(){

        System.out.println("1");
    }

    public static void secondMethodTestInterface(){

        System.out.println("2");
    }

    // Le interfacce non possono avere metodi d'istanza;
    /*public void thirdMethodTestInterface(){

        System.out.println("3");
    }*/
}

abstract interface SecondTestInterface extends TestInterface {

    public static int i = 20;

    // Override Method
    default void firstMethodTestInterface(){

        System.out.println("11");
    }

    // Overloading Method
    default void firstMethodTestInterface(int i){

        System.out.println("11");
    }

    // La sub-interface non può ovveride un metodo di default come metodo static;
    /*public static void firstMethodTestInterface(){

    }*/

    // La sub-interface può fare l'ovveride di un metodo static in un altro metodo static;
    /*public static void secondMethodTestInterface(){

        System.out.println("22");
    }*/

    // La sub-interface può fare l'ovveride di un metodo static in un metodo default;
    public default void secondMethodTestInterface(){

        System.out.println("22");
    }

    // La sub-interface può fare l'OVERLOADING di un metodo static ereditato dalla super-interface;
    public static void secondMethodTestInterface(int i){

    }
}

