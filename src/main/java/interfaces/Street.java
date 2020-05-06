package interfaces;

public class Street {

    public static void main(String[] args) {
        Walkable dima = new Man();

        Walkable tuzik = new Dog();

//        dima.walk();
//        tuzik.walk();

        Walkable[] walkables = new Walkable[2];
        walkables[0] = dima;
        walkables[1] = tuzik;

        printWalkables(walkables);
    }

    public static void printWalkables(Walkable[] walkables) {
        for (Walkable walkable : walkables) {
            walkable.walk();
        }
    }
}

//HW: interface:
// Walkable (walk()),
// Swimable (метод void swim(), double maxSwimSpeed()),
// Runnable (метод void run(), int maxRunDistance()),
// Flyable (метод void fly(), String sing())
// Классы: Man (человек), Dog, Cat, Bird, Fish

// Класс Vodka
// 4 поля
// Перегрузить этот метод void drinkTooMuch()
// Перегрузить конструкторы

//Реализовать классы из презентации (в дз)


//ООП, раннюю поздняя связанность, интерфейсы, абстрактные классы, default interface
//одиночное насследование в Java
