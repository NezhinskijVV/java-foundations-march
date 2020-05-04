package object;

import oop.Cat;
import oop.Lion;

public class ObjectMethodsRunner {

    public static void main(String[] args) {
//        Object obj1 = new Object();
//        Object obj2 = new Object();
//
//        System.out.println(obj1.hashCode());
//        System.out.println(obj2.hashCode());
//
//        System.out.println("obj1.equals(obj1) = " + obj1.equals(obj1));
//        System.out.println("obj1.equals(obj2) = " + obj1.equals(obj2));
//
//        System.out.println("obj1.toString() = " + obj1.toString());
//
//        System.out.println("obj1.getClass().getName() = " + obj1.getClass().getName());
//
//        Cat barsik = new Cat();
//        Cat cezar = new Cat();
//
//        System.out.println("barsik.equals(cezar) = " + barsik.equals(cezar));
//
        Telephone iphoneX = new Telephone("Iphone", 10);
        Telephone iphoneXI = new Telephone("Iphone", 11);
        Telephone samsungGalaxy3 = new Telephone("Samsung", 3);


        System.out.println(iphoneX.toString());
        System.out.println("samsungGalaxy3.toString() = " + samsungGalaxy3.toString());

//        Object o = new Telephone("Iphone", 4);
//        Telephone tel = (Telephone) o; //явное приведение типов
//        System.out.println(tel.getType());
//        Lion lion = (Lion) o; //ClassCastException


        System.out.println(iphoneX.equals(new Object()));

    }
}

//HW: 1. Явное и неявное приведение типов
//    2. Раннее и позднее связывание (прочесть)
//    3. Прочесть презентацию, Класс Object  + Эккель (статьи) Что делают методе
//    4. toString()  реализовать для всех классов по предыдущей домашней работе
//    5. hashCode equals определить для класса "Контакт"  из Волка с Уолл Стрит
