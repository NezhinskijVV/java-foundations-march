package oop;

public class Runner {

    public Runner(String s) {
    }

    public static void main(String[] args) {
        Iron vitalikIron = new Iron("Blue");
        System.out.println(vitalikIron.getColor());
        vitalikIron.setColor("Red");
        System.out.println(vitalikIron.getColor());
    }
}
