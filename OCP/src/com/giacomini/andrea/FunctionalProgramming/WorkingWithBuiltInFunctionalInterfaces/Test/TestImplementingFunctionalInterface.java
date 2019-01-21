package com.giacomini.andrea.FunctionalProgramming.WorkingWithBuiltInFunctionalInterfaces.Test;

import java.util.function.Predicate;

/**
 * Created by Andrea on 19/01/2019.
 */
public class TestImplementingFunctionalInterface {

    public static void main(String[] args){

        Predicate<String> p1 = s -> s.equals("");

        System.out.println(p1.test("test"));
    }
}
