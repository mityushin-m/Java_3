package com.lab3.collections_benchmark;

public class Main {
	public static void main(String[] args) {
		System.out.println("Сравнение производительности ArrayList и LinkedList");
        System.out.println("Количество операций: " + CollectionsBenchmark.OPERATIONS_COUNT);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s | %-12s | %-15s | %-15s%n", "Операция", "Коллекция", "Время (нс)", "Время (мс)");
        System.out.println("--------------------------------------------------");


        printResult("add", "ArrayList", CollectionsBenchmark.measureAddArrayList());
        printResult("get", "ArrayList", CollectionsBenchmark.measureGetArrayList());
        printResult("remove", "ArrayList", CollectionsBenchmark.measureRemoveArrayList());
        
        System.out.println("--------------------------------------------------");
        
        printResult("add", "LinkedList", CollectionsBenchmark.measureAddLinkedList());
        printResult("get", "LinkedList", CollectionsBenchmark.measureGetLinkedList());
        printResult("remove", "LinkedList", CollectionsBenchmark.measureRemoveLinkedList());
        
        System.out.println("--------------------------------------------------");
    }
	
	private static void printResult(String op, String col, long timeNs) {
        long timeMs = timeNs / 1_000_000;
        System.out.printf("%-10s | %-12s | %-15d | %-15d%n", op, col, timeNs, timeMs);
    }
}
