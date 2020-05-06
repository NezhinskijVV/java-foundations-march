package static_mod;


public class StaticRunner {

    public static void main(String[] args) {
        Car.setColor("red");
        Car ferrari = new Car("Ferrari");

        System.out.println(ferrari);

        Car.setColor("yellow");
        Car lamborgini = new Car("Lamborgini");

        System.out.println(lamborgini);

        System.out.println();
        System.out.println(ferrari);
    }
}