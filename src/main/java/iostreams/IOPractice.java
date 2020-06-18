package iostreams;

import interfaces.Man;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOPractice {
    public static void main(String[] args) {

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            String input = reader.readLine();
//            System.out.println("Input: " + input);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        //try with resources
//        try (BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in))) {
//
//            String input = reader.readLine();
//            System.out.println("Input: " + input);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //reader.close()


//        File file = new File("src/main/resources/file.txt");
//        try (PrintWriter printWriter = new PrintWriter(file)) {
//            printWriter.println("Privet, 1 string in file");
//            printWriter.println("Privet, 2 string in file");
//            printWriter.println("Privet, 3 string in file");

//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
////            System.out.println(fileReader.readLine());
//            while(fileReader.ready()){
//                System.out.println(fileReader.readLine());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Задача: Я ввожу с клавиатуры строки до тех пор, пока не ввел строку "Конец"
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String input;
//            while (!(input = reader.readLine()).equals("Конец")){
//                System.out.println(input);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        Man man = new Man("Vitya");
//
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//                new FileOutputStream("src/main/resources/man.out"))) {
//            objectOutputStream.writeObject(man);
//            objectOutputStream.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/man.out"))) {
            Man manFromFile = (Man) objectInputStream.readObject();
            System.out.println(manFromFile.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}