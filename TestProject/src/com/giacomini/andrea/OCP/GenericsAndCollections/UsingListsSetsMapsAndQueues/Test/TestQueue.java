package com.giacomini.andrea.OCP.GenericsAndCollections.UsingListsSetsMapsAndQueues.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args){

        Queue<Integer> queue = new ArrayDeque<>();
        System.out.println(queue.offer(10));
        System.out.println(queue.offer(4));
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}

