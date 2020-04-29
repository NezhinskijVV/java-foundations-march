package oop;

public class Runner {

    public Runner(String s) {
    }

    public static void main(String[] args) {
//        Iron vitalikIron = new Iron("Blue");
//        System.out.println(vitalikIron.getColor());
//        vitalikIron.setColor("Red");
//        System.out.println(vitalikIron.getColor());

//        Iron bestIron = new Iron("Black");
        Appliance bestIron = new Iron("Black");
        bestIron.printLocation();
        bestIron.setInShop(false);
        bestIron.printLocation();

        // bestIron.getColor(); < - ошибка, bestIron ссылка типа Appliance

        Appliance bosh = new WashingMachine();
        bosh.printLocation();


        Cat simba = new Lion();


    }
}

//HW:
//1. Lion Cat Panther. Определить метод sayMeow() для Cat
// и переопределить его для Panther.
//2. Person Woman Man.
//Person поля: isMale , name, age. Метод printAge() 'напечатать возраст'.
//Woman Man. Поменять поле isMale в зависимости от класса.
//Для woman переопределить метод printAge() и напечатать 'всегда 18'.
//3. Создать массив типа Person, добавить туда всех Man и Woman
// и напечатать их возраст
//4. Иерархия Фигур
//Фигура, Треугольник, Прямоугольник, Квадрат
//определить методы вычисления площади и периметра в фигуре
// и реализовать для каждой фигуры свой метод
//5. Раннее и позднее связывание (прочесть)
//6. Определение абстракции, как принцип ООП (аудио)
//7. Принципы ООП (прочесть Эккеля плюс интернет)