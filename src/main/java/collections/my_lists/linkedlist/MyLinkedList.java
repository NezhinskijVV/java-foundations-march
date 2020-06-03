package collections.my_lists.linkedlist;

public class MyLinkedList {
    private Node startNode;
    private int size;

    public MyLinkedList(Object obj) {
        startNode = new Node(obj, null);
        size = 1;
    }

    public MyLinkedList() {
        size = 0;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return false;
    }


    // vitaliy - > max ->  vlad
    public boolean add(Object o) {
        if (startNode == null) {
            startNode = new Node(o, null);
        } else {
//1.            Node cur = startNode;
//            for (int i = 0; i < size - 1; i++) {
//                cur = cur.getNext();
//            }
//2.
//            Node cur;
//            for (cur = startNode; cur.getNext() != null; cur = cur.getNext()) {
//            }

//3.  Через цикл while

            Node cur = startNode;
            while (cur.getNext() != null) {
                cur = cur.getNext();
            }

            cur.setNext(new Node(o, null));
        }
        size++;
        return true;
    }

    public boolean remove(Object o) {   //удаление элемента по объекту
        if (size == 0 || o == null) {  // проверка на то имеет ли место быть удаление элемента
            return false;
        }

        if (o.equals(startNode.getElement())) { //проверка на совпадение с первым элементом
            if (startNode.getNext() != null) { // состоит ли список из 1 элемента?
                startNode = startNode.getNext(); //если более 1 элемента, то делаем стартовый node второй элемент списка
            } else {
                startNode = null; //иначе у нас список из одного элемента и мы этому элементу присваиваем null
            }
            size--;   //после удаления уменьшаем size на 1 и возвращаем true
            return true;
        }

        if (size > 1) {
            Node prevNode = startNode;       //храним ссылку на предыдущий и на текущий элементы
            Node curNode = startNode.getNext();
            for (int i = 0; i < size - 1; i++) {   //бежим по нашему списку
                if (o.equals(curNode.getElement())) {  //сравниваем текущее значение с o
                    prevNode.setNext(curNode.getNext());  //ссылку предыдущего элемента перенаправляем на следующий после текущего
                    curNode.setNext(null); //ссылку текущего делаем null
                    size--;   //после удаления уменьшаем size на 1 и возвращаем true
                    return true;
                }
                prevNode = curNode;         //передвигаем указатели предыдущего и последующего элементов
                curNode = curNode.getNext();
            }
        }
        return false;
    }

    public void clear() {
    }

    public Object get(int index) {
        Node curNode = startNode;
        for (int i = 0; i < index - 1; i++) {
            curNode = curNode.getNext();
        }

        return curNode.getElement();
    }

    private void checkIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.err.println("Введите корректный индекс от 0 до " + size);
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public MyLinkedList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyLinkedList{ ");
        if (startNode != null) {
            Node curNode = startNode;
            for (int i = 0; i < size; i++) {
                sb.append(curNode.getElement()).append(' ');
                curNode = curNode.getNext();
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public int indexOf(Object o) {
        return -1;
    }


}

//HW: 1. Реализовать все методы для LinkedList
//    2. Проверить что все тесты для LinkedList работают
//    3. Почитать что быстрее ArrayList или LinkedList
//    4.*  Больше тестов, добавить дженерики, сделать двунаправленный список