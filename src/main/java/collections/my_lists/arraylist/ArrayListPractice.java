package collections.my_lists.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        System.out.println(myList.get(0));

        myList.add(0, 3);
        System.out.println("myList.get(0) = " + myList.get(0));

        myList.add(0, 7);
        myList.add(1, -1);

        //0  1 2 3
        //7 -1 2 1
        // Вывести все элементы списка
        System.out.print("MyList { ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("}");

        printList(myList);
        System.out.println("myList.contains(2) = " + myList.contains(2));

        //Проверка на существование элемента 2.
        //Вывести существует или нет.

        if (myList.contains(2)) {
            System.out.println("Элемент 2 существует");
        } else {
            System.out.println("Элемент 2 не сушествует");
        }


        myList.remove(0);
        printList(myList);
        myList.remove(Integer.valueOf(3));

        System.out.println("After remove element = 3");
        printList(myList);
        myList.add(1);
        myList.add(1);
        myList.add(1);

        System.out.println("After adding 3 elements of 1");
        printList(myList);

        System.out.println("myList.indexOf(1) = " + myList.indexOf(1));
        System.out.println("myList.lastIndexOf(1) = " + myList.lastIndexOf(1));

        System.out.println("After set: myList.set(1, 5)");
        myList.set(1, 5);
        printList(myList);

        //последний элемент списка заменяем на 10
        myList.set(myList.size() - 1, 10);
        printList(myList);

//        myList.clear();
        printList(myList);


        //0. Содание списков: (Используя конструктор)
        //а). Создать пустой список
        //б). Создать список размером 20

        List<String> hwList = new ArrayList<>();
        List<String> hwList2 = new ArrayList<>(20);

//        System.out.println("hwList2.get(19) = " + hwList2.get(19));

        for (int i = 0; i < 10; i++) {
            hwList.add(String.valueOf(i));
        }

        System.out.println("hwList");
        printList(hwList);

        //1. Получить элемент по индексу:
        //а). Получить первый элемент
        //б). Получить последний элемент

        System.out.println("Первый элемент " + hwList.get(0));
        System.out.println("Последний элемент " + hwList.get(hwList.size() - 1));
    }


    //HW:Списки:
    //
    //0. Содание списков: (Используя конструктор)
    //а). Создать пустой список
    //б). Создать список размером 20
    //
    //1. Получить элемент по индексу:
    //а). Получить первый элемент
    //б). Получить последний элемент
    //
    //2. Задачи на вставку элемента:
    //а) Добавить подряд 5 элементов.
    //б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
    //в) Записать в новый список все элементы предыдущего списка.
    //
    //3. Задачи на удаление элементов: (Используя методы)
    //а) Удалить элемент по значению
    //б) Удалить элемент по индексу
    //
    //4. Проверить наличие элемента
    //
    //5. Вывод списка:
    //а) Вывести список на экран в формате: List: {"First";"Second";"Third"}
    //
    //6. Отфильтровать список вернуть записи по некоторому условию:
    //а) Условие на индекс: Индекс делится на 3
    //б) Условие на значение: Вернуть количество элементов, которые равны "***"
    //
    //7. Пропустить несколько первых элементов
    //а) Пропустить первые 3 элемента в списке. (Остальные выводим на экран)
    //
    //6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
    //а) Пропустить первые 2 элемента, которые равные "****" (Вывести все кроме двух элементов)
    //
    //8. Вернуть первый подходящий элемент:
    //а) Возращаем Первый элемент длина которого делится на 3.
    //
    //9. Возвращаем все элементы удовлетворяющие условию:
    //а) Возвращаем все элементы длины которых делятся на 3
    //
    //10. Создать класс Person.
    //Вернуть всех военнообязанных мужчин (пол), которым меньше 27
    // и больше 18 и имя которых начинается на Н
    //
    //11. Найти средний возраст всех женщин.


    private static <T> void printList(List<T> myList) {
        for (T element : myList) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}