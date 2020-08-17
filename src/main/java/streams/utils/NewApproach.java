package streams.utils;

import streams.model.Faculty;
import streams.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class NewApproach {
    public static List<Student> generate(Student harryPotter, Student jennyWeasley, Student drakoMalfoy, Student cedricDigory) {
        return List.of(harryPotter, jennyWeasley, drakoMalfoy, cedricDigory);
    }

    public static List<Student> getGryffindorStudents(List<Student> hogwartsStudents) {
        return hogwartsStudents.stream()
                .filter(student -> student.getFaculty() == Faculty.GRYFFINDOR)
                .collect(Collectors.toList());
    }

    public static List<Integer> getCoursesGryffindorsStudents(List<Student> hogwartsStudents) {
        return hogwartsStudents.stream()
                .filter(student -> student.getFaculty() == Faculty.GRYFFINDOR)
                .map(Student::getCourseNum)
                .limit(1)
                .collect(Collectors.toList());
    }


}