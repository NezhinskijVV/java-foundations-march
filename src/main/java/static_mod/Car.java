package static_mod;


public class Car {
    private String model;
    private static String color;

    public Car(String model) {
        this.model = model;
    }

    public static void setColor(String color) {
        Car.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "color='" + color + '\'' +
                '}';
    }
}