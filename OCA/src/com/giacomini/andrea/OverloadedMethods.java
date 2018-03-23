package com.giacomini.andrea;

/**
 * Created by Andrea on 09/07/2017.
 */
public class OverloadedMethods {

    public void testOverloadedMethods(int... x){
        System.out.println("In ...");
    }

    public void testOverloadedMethods(int x){
        System.out.println("In int");
    }

    /*public void testOverloadedMethods(Integer x){
        System.out.println("In Integer");
    }*/

    /*public void testOverloadedMethods(long x){
        System.out.println("In long");
    }*/

    /*public void testOverloadedMethods(float x){
        System.out.println("In float");
    }*/

    public void testOverloadedMethods(Long x){
        System.out.println("In Long");
    }

    public static void main(String[] args){

        Integer a = 4;
        int b = 44;
        Long c = 55L;

        new OverloadedMethods().testOverloadedMethods(a);

        new OverloadedMethods().testOverloadedMethods(b);

        new OverloadedMethods().testOverloadedMethods(c);
    }
}

class OverloadedMethodsSecondClass extends OverloadedMethods {

    public void testOverloadedMethods(long x){
        System.out.println("In long");
    }

    public void testOverloadedMethods(Long x){
        System.out.println("In Longgggggg");
    }

    public static void main(String[] args){

        Integer a = 4;
        int b = 44;
        long c = 5;
        Long d = 55L;

        new OverloadedMethodsSecondClass().testOverloadedMethods(a);

        new OverloadedMethodsSecondClass().testOverloadedMethods(b);

        new OverloadedMethodsSecondClass().testOverloadedMethods(c);

        new OverloadedMethodsSecondClass().testOverloadedMethods(d);
    }
}
