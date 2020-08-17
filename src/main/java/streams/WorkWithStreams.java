package streams;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class WorkWithStreams {

    public static void main(String[] args) {
//        Student harryPotter = new Student("Harry Potter", 2, Faculty.GRYFFINDOR);
//        Student jennyWeasley = new Student("Jenny Weasley", 1, Faculty.GRYFFINDOR);
//        Student drakoMalfoy = new Student("Drako Malfoy", 2, Faculty.SLYTHERIN);
//        Student cedricDigory = new Student("Cedric Diggory", 3, Faculty.HUFFLEPUFF);
//
////        List<Student> hogwartsStudents = OldApproach.generate(harryPotter, jennyWeasley, drakoMalfoy, cedricDigory);
//        List<Student> hogwartsStudents = NewApproach.generate(harryPotter, jennyWeasley, drakoMalfoy, cedricDigory);
//
//        System.out.println(OldApproach.getGryffindorStudents(hogwartsStudents));
//        System.out.println(NewApproach.getGryffindorStudents(hogwartsStudents));
//
//        System.out.println(NewApproach.getCoursesGryffindorsStudents(hogwartsStudents));


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> twoEvenSquares =
                numbers.stream()
                        .filter(n -> {
                            System.out.println("filtering " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("mapping " + n);
                            return n * n;
                        })
                        .limit(2)
                        .collect(toList());
    }

}
