package interfaces.cloneable;

public class AlcoholShop {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bottle saintSpringBottle = new Bottle(0.5, "plastic", "Saint Spring");
        Bottle shishkinWoodBottle = new Bottle(0.7, "plastic", "Shishkin Wood");

        Bottle saintSpringBottle2 = (Bottle) saintSpringBottle.clone();

        System.out.println(saintSpringBottle2.toString());

    }
}
