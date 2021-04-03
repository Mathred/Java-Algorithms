/*
Задание 2.1
На основе программного кода из домашнего задания №1 реализуйте массив на основе существующих примитивных или ссылочных типов данных.
Выполните обращение к массиву и базовые операции класса Arrays.
Оценить выполненные методы с помощью базового класса System.nanoTime().

Задание 2.2
На основе написанного кода в задании 2.1 реализуйте линейный и двоичный поиск.
Оценить алгоритмы линейного и двоичного поиска с помощью базового класса System.nanoTime(), при необходимости расширьте уже существующий массив данных.

Задание 2.3
Создайте массив размером 400 элементов.
Выполните сортировку с помощью метода sort().
Оцените сортировку с помощью базового класса System.nanoTime().

Задание 2.4
На основе существующего массива данных из задания 2.3 реализуйте алгоритм сортировки пузырьком.
Оцените сортировку с помощью базового класса System.nanoTime().
Сравните время выполнения алгоритмы сортировки методом sort() из задания 2.1 и сортировку пузырьком.

Задание 2.5
На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом выбора.
Оцените сортировку с помощью базового класса System.nanoTime().
Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3 и 2.4.

Задание 2.6
На основе массива данных из задания 2.3 реализуйте алгоритм сортировки методом вставки.
Оцените сортировку с помощью базового класса System.nanoTime().
Сравните с временем выполнения алгоритмов сортировки из прошлых заданий 2.3, 2.4 и 2.5.
 */

package Lesson2;

import Lesson1.MyClass;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        task21();
        task22();
        task23_24_25_26();

    }

    private static void task21() {
        long startTime = System.nanoTime();
        MyClass myClass = new MyClass();
        char[] abc = myClass.getAbc();
        System.out.println(Arrays.toString(abc)+"\nВывод массива abc занял "+(System.nanoTime()-startTime)+" нс");

        startTime = System.nanoTime();
        char[] firstHalfOfAlphabet = Arrays.copyOf(abc, abc.length/2);
        System.out.println("Создание (копирование) массива firstHalfOfAlphabet заняло "+(System.nanoTime()-startTime)+ " нс");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(firstHalfOfAlphabet)+"\nВывод массива firstHalfOfAlphabet занял "+(System.nanoTime()-startTime)+" нс");

        startTime = System.nanoTime();
        char[] secondHalfOfAlphabet = Arrays.copyOfRange(abc, abc.length/2, abc.length);
        System.out.println("Создание (копирование) массива secondHalfOfAlphabet заняло "+(System.nanoTime()-startTime)+ " нс");
        startTime = System.nanoTime();
        System.out.println(Arrays.toString(secondHalfOfAlphabet)+"\nВывод массива secondHalfOfAlphabet занял "+(System.nanoTime()-startTime)+" нс");
    }

    private static void task22() {
        final int ARRAY_LENGTH = 100;
        final int MAX_VALUE = 10;
        final int SEARCHED_VALUE = 10;
        long startTime;

        MyClass myClass = new MyClass();
        int[] intArray = myClass.setNewRandomIntArray(ARRAY_LENGTH,MAX_VALUE);
        System.out.println("Начальный массив:\n"+ Arrays.toString(intArray));

        startTime = System.nanoTime();
        try {
            System.out.println("Первое появление " + SEARCHED_VALUE + " в массиве intArray на позиции " + myClass.simpleSearch(intArray, SEARCHED_VALUE));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Простой поиск занял " + (System.nanoTime()-startTime) + " нс");

        startTime = System.nanoTime();
        Arrays.sort(intArray);
        System.out.println("Отсортированный массива:\n" + Arrays.toString(intArray));
        System.out.println("Сортировка массива заняла " + (System.nanoTime()-startTime) + " нс");

        startTime = System.nanoTime();
        System.out.println("Результат бинарного поиска: " + Arrays.binarySearch(intArray,SEARCHED_VALUE));
        System.out.println("Бинарный поиск в неотсортированном массиве занял " + (System.nanoTime()-startTime) + " нс");

    }

    private static void task23_24_25_26() {
        final int NUMBER_OF_ELEMENTS = 400;
        final int MAXIMUM_VALUE = 100;
        long startTime;

        MyArray myArray = new MyArray();
        int[] intArray = myArray.createIntArray(NUMBER_OF_ELEMENTS,MAXIMUM_VALUE);
        System.out.println("Исходный массив:\n" + Arrays.toString(intArray));
        int[] intArrayForQuickSorting = Arrays.copyOf(intArray,intArray.length);
        int[] intArrayForBubbleSorting = Arrays.copyOf(intArray,intArray.length);
        int[] intArrayForSelectionSorting = Arrays.copyOf(intArray,intArray.length);
        int[] intArrayForInsertionSorting = Arrays.copyOf(intArray,intArray.length);

        startTime = System.nanoTime();
        Arrays.sort(intArrayForQuickSorting);
        System.out.println("Сортировка методом sort() заняла " + (System.nanoTime()-startTime) + " нс");
//        System.out.println("Отсортированный массив (sort()):\n" + Arrays.toString(intArrayForQuickSorting));

        startTime = System.nanoTime();
        myArray.bubbleSort(intArrayForBubbleSorting);
        System.out.println("Сортировка пузырьком заняла " + (System.nanoTime()-startTime) + " нс");
//        System.out.println("Отсортированный массив (пузырек):\n" + Arrays.toString(intArrayForBubbleSorting));

        startTime = System.nanoTime();
        myArray.selectionSort(intArrayForSelectionSorting);
        System.out.println("Сортировка выбором заняла " + (System.nanoTime()-startTime) + " нс");
//        System.out.println("Отсортированный массив (выбор):\n" + Arrays.toString(intArrayForSelectionSorting));

        startTime = System.nanoTime();
        myArray.insertionSort(intArrayForInsertionSorting);
        System.out.println("Сортировка вставками заняла " + (System.nanoTime()-startTime) + " нс");
//        System.out.println("Отсортированный массив (вставка):\n" + Arrays.toString(intArrayForInsertionSorting));
    }
}
