package com.giacomini.andrea;

/**
 * Created by Andrea on 10/07/2017.
 */
public class OverriddenMethods {

    // Fileds
    int i = 11;
    boolean b = true;

    // Methods
    public void testOverriddenMethods(int i) throws Exception{

        System.out.println("In testOverriddenMethods() method, class OverriddenMethods. Value i = " + i);
    }

    public static void newTestOverriddenMethods() throws Exception{

        System.out.println("In newTestOverriddenMethods() method static, class OverriddenMethods");
    }

    public static void main(String[] args){

        int a = 3;
        try{

            //OverriddenMethodsSecondClass ref = new OverriddenMethodsSecondClass();
            //OverriddenMethods ref = new OverriddenMethods();
            OverriddenMethods ref = new OverriddenMethodsSecondClass();

            ref.testOverriddenMethods(a);

            ref.newTestOverriddenMethods();
            newTestOverriddenMethods();

            System.out.println("Field a = " + ref.i + " , class OverriddenMethods");

        } catch(Exception e){}

    }
}

class OverriddenMethodsSecondClass extends OverriddenMethods {

    // Fileds
    int i = 22;
    boolean b = true;

    // Methods

    /*public void testOverriddenMethods(int i){

        System.out.println("In testOverriddenMethods() method, class OverriddenMethodsSecondClass. Value i = " + i");
    }*/

    /*public void testOverriddenMethods(int i) throws FileNotFoundException{

        System.out.println("In testOverriddenMethods() method, class OverriddenMethodsSecondClass. Value i = " + i");
    }*/

    public void testOverriddenMethods(int i) throws Exception{

        System.out.println("In testOverriddenMethods() method, class OverriddenMethodsSecondClass. Value i = " + i);
    }

    public static void newTestOverriddenMethods() throws Exception{

        System.out.println("In newTestOverriddenMethods() method static, class OverriddenMethodsSecondClass");
    }

    public static void main(String[] args){

        int i = 5;

        try{

            //OverriddenMethodsSecondClass ref = new OverriddenMethodsSecondClass();
            OverriddenMethods ref = new OverriddenMethodsSecondClass();
            //OverriddenMethods ref = new OverriddenMethods();

            ref.testOverriddenMethods(i);
            ref.newTestOverriddenMethods();

            System.out.println("Field a = " + ref.i + " , class OverriddenMethodsSecondClass");

        } catch(Exception e){}

    }
}
