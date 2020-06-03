package collections.my_lists.linkedlist;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        System.out.println("linkedList.size() = " + linkedList.size());
        linkedList.add("Vitaliy");
//        System.out.println(linkedList.toString());

        linkedList.add("Maxim");
        System.out.println(linkedList.toString());
        linkedList.add(null);
        linkedList.add("Anton");
        System.out.println(linkedList.toString());

//        linkedList.remove("Maxim");
//        System.out.println("After remove Maxim: " + linkedList.toString());
//        linkedList.remove("Leo");
//        System.out.println("After remove Leo: " + linkedList.toString());
        linkedList.remove("Vitaliy");
        System.out.println("After remove Vitaliy: " + linkedList.toString());
        linkedList.remove("Leo");
        System.out.println("After remove Leo: " + linkedList.toString());

        String s = null;

//        System.out.println(s.equals(""));

//        System.out.println("".equals(s));


    }
}
