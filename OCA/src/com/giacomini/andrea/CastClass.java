package com.giacomini.andrea;

/**
 * Created by Andrea on 13/07/2017.
 */
public class CastClass {


}

abstract class AbstractClass{

    int i = 10;

}

abstract interface In {

    int i = 20;

}

class SecondCastClass extends CastClass implements In {

    /*public static void main(String[] args){

        CastClass c = new CastClass();
        Object o = c;
        //Object o = (Object) c;

        System.out.println("1");

        SecondCastClass sc = (SecondCastClass) o;
    }*/

    public static void main(String[] args){

        SecondCastClass sc = new SecondCastClass();
        Object o = sc;
        //Object o = (Object) sc;
        In i = sc;

        System.out.println("1");

        SecondCastClass sc1 = (SecondCastClass) i;

        System.out.println("2");

        ThirdCastClass tcc = new ThirdCastClass();
        sc.testSecondCastClass(tcc);
        sc.testSecondCastClass(sc);

    }

    public void testSecondCastClass(CastClass c){

        System.out.println("3");
    }
}

class ThirdCastClass extends CastClass {

}
