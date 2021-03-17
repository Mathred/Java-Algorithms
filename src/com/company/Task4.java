/*
Задание 4.1
На основе данных объектного списка из задания 3.4 реализуйте простой стек и его базовые методы.
Оцените время выполнения операций с помощью базового метода System.nanoTime().
Задание 4.2
На основе данных объектного списка из задания 3.4 реализуйте простую очередь и его базовые методы.
Реализуйте вспомогательные методы.
Оцените время выполнения операций с помощью базового метода System.nanoTime().
Задание 4.3
На основе данных объектного списка из задания 3.4 реализуйте простой дек и его базовые методы.
Оцените время выполнения операций с помощью базового метода System.nanoTime().
Задание 4.4
Реализуйте приоритетную очередь на основе ссылочных типов данных, например, integer.
Оцените время выполнения операций с помощью базового метода System.nanoTime().
Задание 4.5
На основе данных из задания 4.1 и 4.2, реализуйте стек и очередь на базе связанного списка.
Оцените время выполнения операций с помощью базового метода System.nanoTime().
 */

package com.company;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        TimeManager timeManager = new TimeManager();
        MyClass myClass = new MyClass();
        MyStack<Integer> myStack = new MyStack<>();

        String temp;
        int tempInt;

        LinkedList<String> calendarLinkedList = new LinkedList<>(Arrays.asList(myClass.getCalendar()));

//        task41(timeManager, calendarLinkedList);
//        task42(timeManager, calendarLinkedList);
//        task43(timeManager, calendarLinkedList);
//        task44(timeManager);
//        task45myStack(timeManager, myStack);
//        task45myQueue(timeManager);

    }

    private static void task41(TimeManager timeManager, LinkedList<String> calendarLinkedList) {
        String temp;
        Stack<String> calendarStack = new Stack<>();
        timeManager.setStartTime();
        calendarStack.addAll(calendarLinkedList);
        timeManager.setEndTime();
        System.out.println("Добавление элементов из LindekList в Stack заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarStack);

        timeManager.setStartTime();
        temp = calendarStack.peek();
        timeManager.setEndTime();
        System.out.println(temp);
        System.out.println("Выполнение метода peek() заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        calendarStack.push("13th month");
        timeManager.setEndTime();
        System.out.println("Выполнение метода push() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarStack);

        timeManager.setStartTime();
        temp = calendarStack.pop();
        timeManager.setEndTime();
        System.out.println("Выполнение метода pop() заняло " + timeManager.getRunTime() + " нс");

        System.out.println(temp);
        System.out.println(calendarStack);
    }
    private static void task42(TimeManager timeManager, LinkedList<String> calendarLinkedList) {
        String temp;
        timeManager.setStartTime();
        Queue<String> calendarQueue = new LinkedList<>(calendarLinkedList);
        timeManager.setEndTime();
        System.out.println("Преобразование LinkedList в Linkedlist с интерфейсом Queue заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarQueue);

        timeManager.setStartTime();
        calendarQueue.add("1st month");
        timeManager.setEndTime();
        System.out.println("Выполнение метода add() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarQueue);

        timeManager.setStartTime();
        try {
            calendarQueue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Очеред пустая");
        }
        timeManager.setEndTime();
        System.out.println("Выполнение метода remove() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarQueue);

        timeManager.setStartTime();
        calendarQueue.poll();
        timeManager.setEndTime();
        System.out.println("Выполнение метода poll() заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        temp = calendarQueue.peek();
        timeManager.setEndTime();
        System.out.println("Выполнение метода peek() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(temp);
    }
    private static void task43(TimeManager timeManager, LinkedList<String> calendarLinkedList) {
        timeManager.setStartTime();
        Deque<String> calendarDeque = new LinkedList<>(calendarLinkedList);
        timeManager.setEndTime();
        System.out.println("Создание Deque из LinkedList заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarDeque);

        timeManager.setStartTime();
        calendarDeque.addFirst("1st month");
        timeManager.setEndTime();
        System.out.println("Выполнение метода addFisrst() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarDeque);

        timeManager.setStartTime();
        calendarDeque.addLast("13th month");
        timeManager.setEndTime();
        System.out.println("Выполнение метода addLast() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarDeque);

        timeManager.setStartTime();
        calendarDeque.removeFirst();
        timeManager.setEndTime();
        System.out.println("Выполнение метода removeFirst() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarDeque);

        timeManager.setStartTime();
        calendarDeque.removeLast();
        timeManager.setEndTime();
        System.out.println("Выполнение метода removeLast() заняло " + timeManager.getRunTime() + " нс");
        System.out.println(calendarDeque);

        while (!calendarDeque.isEmpty()) {
            calendarDeque.removeLast();
        }
        System.out.println(calendarDeque);
    }
    private static void task44(TimeManager timeManager) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        timeManager.setStartTime();
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(100);
        priorityQueue.add(-1);
        priorityQueue.add(1);
        timeManager.setEndTime();
        System.out.println("Добавление 5 новых элементов в приоритетную очередь заняло " + timeManager.getRunTime() + " нс");
        System.out.println(priorityQueue);


        while (!priorityQueue.isEmpty()) {
            timeManager.setStartTime();
            System.out.println(priorityQueue.poll());
            timeManager.setEndTime();
            System.out.println("Вывод последнего элемента (метод poll()) занял " + timeManager.getRunTime() + " нс");
        }
    }
    private static void task45myStack(TimeManager timeManager, MyStack<Integer> myStack) {
        timeManager.setStartTime();
        myStack.push(10);
        timeManager.setEndTime();
        System.out.println("Добавление первого элемента в MyStack заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myStack.push(5);
        timeManager.setEndTime();
        System.out.println("Добавление нового элемента в MyStack заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myStack.push(1);
        timeManager.setEndTime();
        System.out.println("Добавление нового элемента в MyStack заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myStack.push(20);
        timeManager.setEndTime();
        System.out.println("Добавление нового элемента в MyStack заняло " + timeManager.getRunTime() + " нс");
        myStack.print();

        timeManager.setStartTime();
        System.out.println(myStack.pop());
        timeManager.setEndTime();
        System.out.println("Выполнение метода pop() MyStack заняло " + timeManager.getRunTime() + " нс");
        myStack.print();

        timeManager.setStartTime();
        System.out.println(myStack.peek());
        timeManager.setEndTime();
        System.out.println("Выполнение метода peek() MyStack заняло " + timeManager.getRunTime() + " нс");
        myStack.print();
    }
    private static void task45myQueue(TimeManager timeManager) {
        int tempInt;
        MyQueue<Integer> myQueue = new MyQueue<>();

        timeManager.setStartTime();
        myQueue.insert(1);
        timeManager.setEndTime();
        System.out.println("Добавление первого элемента в MyQueue заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myQueue.insert(2);
        timeManager.setEndTime();
        System.out.println("Добавление нового элемента в MyQueue заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myQueue.insert(3);
        timeManager.setEndTime();
        System.out.println("Добавление нового элемента в MyQueue заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myQueue.insert(4);
        timeManager.setEndTime();
        System.out.println("Добавление нового элемента в MyQueue заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myQueue.print();
        timeManager.setEndTime();
        System.out.println("Вывод в консоль элементов MyQueue заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        myQueue.pop();
        timeManager.setEndTime();
        System.out.println("Выполнение метода pop() MyQueue заняло " + timeManager.getRunTime() + " нс");

        timeManager.setStartTime();
        tempInt = myQueue.peek();
        timeManager.setEndTime();
        System.out.println("Выполнение метода peek() MyQueue заняло " + timeManager.getRunTime() + " нс");
        System.out.println(tempInt);
    }

}
