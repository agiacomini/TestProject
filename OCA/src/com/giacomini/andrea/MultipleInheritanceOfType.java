package com.giacomini.andrea;

/**
 * Created by Andrea on 06/07/2017.
 */
public class MultipleInheritanceOfType {

    public static void main(String[] args){

        new childClass().testChildClass();
    }
}

class childClass extends fatherClass {

    public void testChildClass(){

        if(b){
            System.out.println("test della variabile di stato ereditata dalla classe padre");
            System.out.println();

            System.out.println("La variabile statica (static int j = 3) eredita dalla classe padre (fatherClass) vale: " + (j));
            System.out.println("La variabile statica (static boolean a = ture) eredita dalla classe padre (fatherClass) vale: " + (a));
        }
    }
}

class fatherClass{

    // Variabili d'istanza
    int i = 5;
    boolean b = true;

    // Variabili di classe
    static int j = 3;
    static boolean a = true;

    public void testFatherClass(){

    }

    public static void main(String[] args){}
}
