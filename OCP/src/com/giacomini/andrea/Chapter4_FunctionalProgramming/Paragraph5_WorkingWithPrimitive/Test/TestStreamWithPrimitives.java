package com.giacomini.andrea.FunctionalProgramming.WorkingWithPrimitive.Test;

import java.util.OptionalDouble;
import java.util.stream.Stream;
import java.util.stream.IntStream;

/**
 * Created by Andrea on 02/02/2019.
 */
public class TestStreamWithPrimitives {

    public static void main(String... args){

        // Calcola la somma degli elementi dello "Stream"
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println("stream: " + stream.reduce(0,(s,n) -> s + n) + " la somma calcolata di (1, 2, 3)");

        // Calcola la somma degli elementi dello "Stream" (usando però "IntStream")
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        System.out.println("stream2: " + stream2.mapToInt(x -> x).sum() + " la somma calcolata di (1, 2, 3)");

        // Calcola la media
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println("intStream: " + avg.getAsDouble() + " la media (avg) calcolata di (1, 2, 3)");

    }

}
