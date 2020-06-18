package exceptions;

import lombok.SneakyThrows;

public class ExceptionsPractice {


    public static void main(String[] args) {
//        throw new RuntimeException("Hola, RuntimeException!");

//        try {
//            throw new Exception("Hola, Exception!");
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        try {
//            exceptionMethod();
//        } catch (Exception e) {
//            System.out.println("catch " + e.getMessage());
//        }

//        exceptionMethodSneakyThrows();


//        try {
//            System.out.println("0");
////            exceptionMethod();
//            System.out.println("1");
////            throw new NullPointerException();
//        }
////        catch (FileNotFoundException e) {
////            e.printStackTrace();
////        } catch (IOException e) {
////            System.err.println("IO");
////            e.printStackTrace();
//         catch (Exception e) {
//            System.err.println("Exc");
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally");
//        }

        Child marusia = null;
        try {
            marusia = new Child("Maria", -10);

        } catch (MyException e) {
            e.printStackTrace();
//            throw new RuntimeException();
        }
        System.out.println(marusia);


    }

    public static void exceptionMethod() throws Exception {
        throw new Exception("Hola, Exception!");
    }


    @SneakyThrows
    public static void exceptionMethodSneakyThrows() {
        throw new Exception("Hola, Exception!");
    }
}