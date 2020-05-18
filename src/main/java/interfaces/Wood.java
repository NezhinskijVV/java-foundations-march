package interfaces;

public class Wood {
    public static void main(String[] args) {
        Tree christmasTree = new BirchTree();
        System.out.println(christmasTree.countLeaves());
        System.out.println(christmasTree.isSmellGood());

    }
}
