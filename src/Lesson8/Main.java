/*
Задание 8.1
Приведите пример использование хеш-таблиц.
Задание 8.2
Приведите примеры ключей и коллизий.
Задание 8.3
Приведите примеры популярных и эффективных хеш-функций.
Задание 8.4
На основе данных массива из задания 2.3 реализуйте хеш-таблицу с помощью открытой адресации, а конкретнее метода линейного пробирования
Задание 8.5
Перестройте программный код задания 8.4 из алгоритма линейного пробирования в алгоритм двойного хеширования.
Сравните отличительные черты двух алгоритмов.
 */

package Lesson8;

public class Main {

    public static void main(String[] args) {
/*
Задание 8.1

Хранение массивов данных, в которых хеш от ключа записи данных является ключевым полем хеш-таблицы
Передача и хранение "чувствительной" информации с использованием криптографических хеш-функций
Подтверждение транзакций в структуре данных блок-чейн

Задание 8.2
В качестве ключа могут выступать:
    одно из полей записи данных в хеш-таблицу (наименование, тип объекта)
    пароль для хеширования паролей
    связка логин-пароль для хеширования паролей
Коллизии могут появляться, когда математическая хеш-функция в результате обработки разных ключей выдает одинаковый
байт-код:
    если хеш-функция определяется, как остаток от деления ключа на 10, то ключи 5, 15, 25, 35 и т.д. выдают одинаковые
        байт-коды (5), что является коллизией

Задание 8.3
Хеш-функции, основанные на делении:
    остаток от деления ключа на предполагаемый размер хеш-таблицы (либо определенной доли хеш-таблицы - половина
        размера, треть размера и т.д.)
    полиномиальное разложение ключа (в качестве хеша выступают коэффициенты полинома)
Хеш-функции, основанные на суммировании (контрольные суммы)
Хеш-функции, основанные на возведении в степень
Криптографические функции:
    MD5, SHA-256, SHA-512
 */

        task84();
        task85();

    }

    private static void task85() {
        final int HASH_TABLE_SIZE = 20;
        MyArray myArray = new MyArray();
        int[] intArray = myArray.createIntArray(HASH_TABLE_SIZE/2,50);

        HashTable hashTable = new HashTable(HASH_TABLE_SIZE);

        for (int i : intArray) {
            hashTable.insertDoubleHash(new Item(i));
        }

        hashTable.display();

        System.out.println("------------");
        System.out.println(intArray[HASH_TABLE_SIZE/4]);
        System.out.println(hashTable.findDoubleHash(intArray[HASH_TABLE_SIZE/4]).getKey());

        System.out.println("------------");
        hashTable.popDoubleHash(intArray[HASH_TABLE_SIZE/4]);
        hashTable.display();
    }

    private static void task84() {
        final int HASH_TABLE_SIZE = 20;
        MyArray myArray = new MyArray();
        int[] intArray = myArray.createIntArray(HASH_TABLE_SIZE/2,50);

        HashTable hashTable = new HashTable(HASH_TABLE_SIZE);

        for (int i : intArray) {
            hashTable.insertLinearProbing(new Item(i));
        }

        hashTable.display();

        System.out.println("------------");
        System.out.println(intArray[HASH_TABLE_SIZE/4]);
        System.out.println(hashTable.findLinearProbing(intArray[HASH_TABLE_SIZE/4]).getKey());

        System.out.println("------------");
        hashTable.popLinearProbing(intArray[HASH_TABLE_SIZE/4]);
        hashTable.display();
    }
}
