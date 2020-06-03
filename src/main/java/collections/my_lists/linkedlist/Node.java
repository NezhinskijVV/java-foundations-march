package collections.my_lists.linkedlist;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data //set + get == data
public class Node {
    private Object element;
    private Node next;
}