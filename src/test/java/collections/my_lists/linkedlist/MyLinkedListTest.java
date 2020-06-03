package collections.my_lists.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс MyLinkedList имеет:")
public class MyLinkedListTest {
    private final MyLinkedList list = new MyLinkedList();

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

//    @Test
//    @DisplayName("корректный метод IndexOf для одного элемента")
//    public void shouldHaveCorrectIndexOf1(){
//        list.add("element1");
//        list.add("element2");
//        assertEquals(0, list.indexOf("element1"));
//    }
//
//    @Test
//    @DisplayName("корректный метод IndexOf для двух элементов")
//    public void shouldHaveCorrectIndexOf2(){
//        list.add("element1");
//        list.add("element2");
//        assertEquals(1, list.indexOf("element2"));
//    }


}

//HW:
// 1.  Написать тесты на ArrayList
//