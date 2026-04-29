package com.lab3.collections_benchmark;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


/**
 * Класс для измерения времени выполнения операций над ArrayList и LinkedList.
 * Измеряются операции: add (в конец), insert (в случайную позицию),
 * get (по случайному индексу), remove (по случайному индексу).
 * 
 * @author Митюшин Максим
 */
public class CollectionsBenchmark {

	/** Количество повторений каждой операции */
	public static final int OPERATIONS_COUNT = 20000;
    private static final Random RANDOM = new Random();

    /**
     * Измеряет время добавления в конец ArrayList.
     * @return время в наносекундах
     */
    public static long measureAddArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    /**
     * Измеряет время вставки в случайную позицию в ArrayList.
     * Список изначально пуст, на каждом шаге размер увеличивается.
     * @return время в наносекундах
     */
    public static long measureInsertArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            int index = RANDOM.nextInt(list.size() + 1);
            list.add(index, i);
        }
        return System.nanoTime() - start;
    }
    
    /**
     * Измеряет время доступа к случайному элементу ArrayList.
     * Предварительно список заполняется OPERATIONS_COUNT элементами.
     * @return время в наносекундах
     */
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

    /**
     * Измеряет время удаления случайного элемента из ArrayList.
     * Предварительно список заполняется OPERATIONS_COUNT элементами.
     * @return время в наносекундах
     */
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
    
    /**
     * Измеряет время добавления в конец LinkedList.
     * @return время в наносекундах
     */
    public static long measureAddLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    /**
     * Измеряет время вставки в случайную позицию в LinkedList.
     * Список изначально пуст, размер растёт.
     * @return время в наносекундах
     */
    public static long measureInsertLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < OPERATIONS_COUNT; i++) {
            int index = RANDOM.nextInt(list.size() + 1);
            list.add(index, i);
        }
        return System.nanoTime() - start;
    }
    
    /**
     * Измеряет время доступа к случайному элементу LinkedList.
     * Предварительно список заполняется OPERATIONS_COUNT элементами.
     * @return время в наносекундах
     */
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

    /**
     * Измеряет время удаления случайного элемента из LinkedList.
     * Предварительно список заполняется OPERATIONS_COUNT элементами.
     * @return время в наносекундах
     */
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
