package com.lab3.collections_benchmark;

public class Main {
	public static void main(String[] args) {
		System.out.println("Сравнение производительности ArrayList");
        System.out.println("Количество операций: " + CollectionsBenchmark.OPERATIONS_COUNT);
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s | %-15s | %-15s%n", "Операция", "Время (нс)", "Время (мс)");
        System.out.println("--------------------------------------------------");

        long addTime = CollectionsBenchmark.measureAdd();
        long getTime = CollectionsBenchmark.measureGet();
        long removeTime = CollectionsBenchmark.measureRemove();

        System.out.printf("%-10s | %-15d | %-15d%n", "add", addTime, addTime / 1000000);
        System.out.printf("%-10s | %-15d | %-15d%n", "get", getTime, getTime / 1000000);
        System.out.printf("%-10s | %-15d | %-15d%n", "remove", removeTime, removeTime / 1000000);
    }
}
