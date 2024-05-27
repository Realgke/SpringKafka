package net.javaguides.springbootkafkatutorial.Payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class User {
    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
