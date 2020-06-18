package interfaces;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class Man implements Walkable, Serializable {
    private final String name;

    @Override
    public void walk() {
        System.out.println("Я гуляю на 2 ногах");
    }
}
