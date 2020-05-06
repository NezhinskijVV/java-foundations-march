package overload;


public class Pen {
    private String firm;
    private double size;

    //перегрузка конструкторов
    public Pen(){
    }

    public Pen(String firm){
        this.firm = firm;
    }

    //перегрузка методов
    public void print() {
        System.out.println("Pen");
    }

    public void print(String owner, double radius) {
        System.out.println("Pen" + owner + " " + radius);
    }

    public void printPen() {
        System.out.println("Pen");
    }

    public void print(double radius, String owner) {
        System.out.println("Pen " + radius + " " + owner);
    }
}