package collections.my_lists.arraylist;


import java.util.Arrays;

public class MyArrayList {
    private Object[] array;  //скрытый массив (внутри arrayList)
    private int size;    //размер ArrayList

    public static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    //  0    1   2    3     4    5  ...  9
    //  A     ... null
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean add(Object o) {
        if (size >= array.length) {
            Object[] resArray = new Object[3 * 2 * size + 1];
            System.arraycopy(array, 0, resArray, 0, size);
            array = resArray;
        }
        array[size++] = o;
        return true;
    }


    // A B C D E
    //удалить C
    // A B D E
    public boolean remove(Object o) {
        return false;
    }

    public void clear() {
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
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


    // A B C D E
    // 0  F
    // F A B C D E
    public void add(int index, Object element) {

    }


    public Object remove(int index) {
        return null;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    // A B C D E
    // 1 , 3

    // B C
    public MyArrayList subList(int fromIndex, int toIndex) {
        checkIndex(fromIndex);
        checkIndex(toIndex);
        MyArrayList arrayList = new MyArrayList();
        for (int i = fromIndex; i < toIndex; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }


    //    "MyArrayList{A B C D }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MyArrayList{");
        for (int i = 0; i < size; i++) {
            sb.append(array[i].toString()).append(' ');
        }
        sb.append('}');
        return sb.toString();
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyArrayList)) return false;

        MyArrayList arrayList = (MyArrayList) o;

        if (size != arrayList.size) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(array, arrayList.array);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(array);
        result = 31 * result + size;
        return result;
    }
}

//HW:
//1. реализовать все методы
//2. узнать что такое дженерики и рассказать в аудио сообщении
//3.* реализовать дженерики в своем списке