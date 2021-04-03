/*
Задание 1.1
Приведите пример алгоритмов и структур данных из жизни.
Задание 1.2
Приведите пример алгоритмов и структур данных в программировании.
Задание 1.3
Напишите программный код, в котором все данные хранятся только в переменных трех типов данных: Ссылочные, примитивные и своего класса содержащего: конструктор и метод отображения данных.
Выведите написанные данные.
Задание 1.4
Дополните предыдущий код сравнением ваших данных с другой переменной, данный код должен имитировать простейший поиск перебором.
Оцените время выполнения алгоритма с помощью базового метода System.nanoTime().
 */

package Lesson1;

public class Task1 {

    public static void main(String[] args) {



//        Задание 1.1. Приведите пример алгоритмов и структур данных из жизни:
//          1. Маршрут следования по карте
//          2. Инструкция по применению бытовой техники
//          3. Кухонный рецепт
//        Задание 1.2. Приведите пример алгоритмов и структур данных в программировании.
//          1. Алгоритмы сортировки массива
//          2. Поиск кратчайшего маршрута в графе
//          3. Задачи поиска элемента в массиве

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 2147483648L;
        float f = 1.0f;
        double d = 2.0;
        String string = "String";
        Integer integer = 10;

        System.out.printf("Примитивные типы данных:%nbyte:%d%nshort:%d%nint:%d%nlong:%d%nfloat:%5.2f%ndouble:%5.2f%nString:%s%nInteger:%d%n",b,s,i,l,f,d,string,integer);

        MyClass myClass = new MyClass(b,s,i,l,f,d,string,integer);

        myClass.printInfo();

        long startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(b)+"\nСравнение byte заняло "+(System.nanoTime()-startTime)+" нс");
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(s)+"\nСравнение short заняло "+(System.nanoTime()-startTime)+" нс");
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(i)+"\nСравнение int заняло "+(System.nanoTime()-startTime)+" нс");
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(l)+"\nСравнение long заняло "+(System.nanoTime()-startTime)+" нс");
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(f)+"\nСравнение float заняло "+(System.nanoTime()-startTime)+" нс");
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(d)+"\nСравнение double заняло "+(System.nanoTime()-startTime)+" нс");
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(string)+"\nСравнение String заняло "+(System.nanoTime()-startTime)+" нс");
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.compare(integer)+"\nСравнение Integer заняло "+(System.nanoTime()-startTime)+" нс");

        char ch = 'd';
        startTime = System.nanoTime();
        System.out.println("\n"+myClass.findCharNumberInAlphabet(ch)+"\nПоиск буквы " + ch +" занял "+(System.nanoTime()-startTime)+" нс");


    }
}
