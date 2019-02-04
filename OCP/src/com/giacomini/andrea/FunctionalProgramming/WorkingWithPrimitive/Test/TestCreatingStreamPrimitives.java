package com.giacomini.andrea.FunctionalProgramming.WorkingWithPrimitive.Test;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * Created by Andrea on 04/02/2019.
 */
public class TestCreatingStreamPrimitives {

    public static void main(String... args){

        IntStream count = IntStream.iterate( 1, n -> n + 1 ).limit(5);
        count.forEach(System.out::println);

        System.out.println();

        DoubleStream count2 = DoubleStream.iterate( 1, n -> n + 1 );
        count2.limit(5).forEach(System.out::println);
    }
}
