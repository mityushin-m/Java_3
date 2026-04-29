package com.lab3.collections_benchmark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class CollectionsBenchmark {

	public static final int OPERATIONS_COUNT = 20000;
    private static final Random RANDOM = new Random();

    public static long measureAddArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    public static long measureGetArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            int index = RANDOM.nextInt(list.size());
            list.get(index);
        }
        return System.nanoTime() - start;
    }

    public static long measureRemoveArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            list.add(i);
        }
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            if (list.isEmpty()) break;
            int index = RANDOM.nextInt(list.size());
            list.remove(index);
        }
        return System.nanoTime() - start;
    }
    
    public static long measureAddLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    public static long measureGetLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < OPERATIONS_COUNT; i++) list.add(i);
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            int index = RANDOM.nextInt(list.size());
            list.get(index);
        }
        return System.nanoTime() - start;
    }

    public static long measureRemoveLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < OPERATIONS_COUNT; i++) list.add(i);
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            if (list.isEmpty()) break;
            int index = RANDOM.nextInt(list.size());
            list.remove(index);
        }
        return System.nanoTime() - start;
    }
}
