package com.giacomini.andrea.FunctionalProgramming.UsingStream.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Andrea on 26/01/2019.
 */
public class TestUsingForEachMethodOnStreamAndOnCollections {

    List<String> list1 = Arrays.asList("Pippo","Pluto","Paperino");

    public static void main(String[] args){

        TestUsingForEachMethodOnStreamAndOnCollections c = new TestUsingForEachMethodOnStreamAndOnCollections();

        List<String> list2 = new ArrayList<>();
        list2.add("giallo");
        list2.add("verde");
        list2.add("nero");

        Stream<String> streamString = Arrays.asList("Andrew","Eugene","Dowson").stream();
        Stream<Integer> streamInteger = Stream.of(4,6,9);

        c.list1.forEach(System.out::println);

        System.out.println("");

        for (String s : c.list1){

            System.out.println(s);
        }

        System.out.println("");

        for (String s : list2) {
            System.out.println(s);
        }

        System.out.println("");

        for(int i = 0 ; i < list2.size() ; i++){

            System.out.println(list2.get(i));
        }

        System.out.println("");

        streamString.forEach(System.out::println);

        System.out.println("");

        streamInteger.forEach(System.out::println);

        System.out.println("");

//        streamInteger.forEach(System.out.println());
    }
}
