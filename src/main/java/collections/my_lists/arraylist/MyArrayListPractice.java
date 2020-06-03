package collections.my_lists.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        MyArrayList myList = new MyArrayList();
        myList.add("A1");
        myList.add("A2");
        myList.add("A3");
        myList.add("A4");
        myList.add("A5");
        myList.add("A6");
        myList.add("A7");
        myList.add("A8");
        myList.add("A9");
        myList.add("A10");
        myList.add("A11");

        System.out.println(myList);
        System.out.println(myList.size());

        System.out.println(myList.get(10));
//        System.out.println(myList.get(11));
//        System.out.println(myList.get(-1));

//
//        List<String> list = new ArrayList<>();
//        list.add("A1");
//        list.add("A2");
//        list.add("A3");
//        list.add("A4");
//        list.add("A5");
//
//        System.out.println(list.subList(1, 3));

        System.out.println(myList.subList(1, 3));
        System.out.println('\ufeff');
    }
}
