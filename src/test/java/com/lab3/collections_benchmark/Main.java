package com.lab3.collections_benchmark;

public class Main {
	public static void main(String[] args) {
		System.out.println("Сравнение производительности ArrayList и LinkedList");
        System.out.println("Количество операций: " + CollectionsBenchmark.OPERATIONS_COUNT);
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-23s | %-12s | %-14s | %-15s%n", "Операция", "Коллекция", "Время (нс)", "Время (мс)");
        System.out.println("---------------------------------------------------------------------");


        printResult("add(to end)", "ArrayList", CollectionsBenchmark.measureAddArrayList());
        printResult("insert(to random index)", "ArrayList", CollectionsBenchmark.measureInsertArrayList());
        printResult("get(random element)", "ArrayList", CollectionsBenchmark.measureGetArrayList());
        printResult("remove(random element)", "ArrayList", CollectionsBenchmark.measureRemoveArrayList());
        
        System.out.println("---------------------------------------------------------------------");
        
        printResult("add(to end)", "LinkedList", CollectionsBenchmark.measureAddLinkedList());
        printResult("insert(to random index)", "LinkedList", CollectionsBenchmark.measureInsertLinkedList());
        printResult("get(random element)", "LinkedList", CollectionsBenchmark.measureGetLinkedList());
        printResult("remove(random element)", "LinkedList", CollectionsBenchmark.measureRemoveLinkedList());
        
        System.out.println("---------------------------------------------------------------------");
    }
	
	private static void printResult(String op, String col, long timeNs) {
        long timeMs = timeNs / 1_000_000;
        System.out.printf("%-23s | %-12s | %-14d | %-15d%n", op, col, timeNs, timeMs);
    }
}
