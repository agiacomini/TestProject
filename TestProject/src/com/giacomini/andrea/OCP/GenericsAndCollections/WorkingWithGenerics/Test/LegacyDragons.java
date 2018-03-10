package com.giacomini.andrea.OCP.GenericsAndCollections.WorkingWithGenerics.Test;

import java.util.ArrayList;
import java.util.List;

public class LegacyDragons {

    public static void main(String[] args){

        // è una lista "raw type" (grezza) senza un generics;
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        printDragons(unicorns);
    }

    private static void printDragons(List<Dragon> dragons){

        for (Dragon dragon : dragons){     // ClassCastException

            System.out.println(dragon);
        }
    }
}

class Dragon {}
class Unicorn {}
