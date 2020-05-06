package final_mod;

public class MusicShop {

    public static void main(String[] args) {
        Headphones airpods = new Headphones(true, "Vitalik");
        Headphones philips = new Headphones(false, "Mark");

        System.out.println("Headphones.MINIMUM_VOLUME = " + Headphones.MINIMUM_VOLUME);
    }
}
