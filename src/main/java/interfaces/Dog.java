package interfaces;

public class Dog implements Walkable {

    @Override
    public void walk() {
        System.out.println("Я гуляю на 4х лапах");
    }
}
