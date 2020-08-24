package annotations.lecture;

import lombok.RequiredArgsConstructor;

@MyAnnotation(message = "Я Персона номер 1", flag = true)
@RequiredArgsConstructor
public class Person {
    private final String name;
    private int age;
    public boolean isGood = true;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isGood=" + isGood +
                '}';
    }
}