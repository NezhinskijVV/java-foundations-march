package collections.my_lists.arraylist;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyArrayList имеет:")
public class MyArrayListTest {
    private final MyArrayList list = new MyArrayList();
    private final MyArrayList list2 = new MyArrayList();

    @Test
    @DisplayName("корректный метод add")
    public void shouldHaveCorrectMethodAdd() {
        String element = "element";
        list.add(element);
        assertEquals("element", String.valueOf(list.get(0)));
    }

    @Test
    @DisplayName("корректный метод size")
    public void shouldHaveCorrectSize() {
        list.add("element");
        assertEquals(1, list.size());
    }

    @Test
    @DisplayName("корректный метод IndexOf для одного элемента")
    public void shouldHaveCorrectIndexOf1(){
        list.add("element1");
        list.add("element2");
        assertEquals(0, list.indexOf("element1"));
    }

    @Test
    @DisplayName("корректный метод IndexOf для двух элементов")
    public void shouldHaveCorrectIndexOf2(){
        list.add("element1");
        list.add("element2");
        assertEquals(1, list.indexOf("element2"));
    }

    @Test
    @DisplayName("Корректный метод remove: ")
    public void shouldHaveCorrectMethodRemove(){
        list.add("a");
        list.add("b");
        list.add("c");
        list.remove(2);

        list2.add("a");
        list2.add("b");

        assertEquals(list2,list);
    }

}

//HW:
// 1.  Написать тесты на ArrayList
//