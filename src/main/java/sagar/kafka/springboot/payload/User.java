package sagar.kafka.springboot.payload;

import lombok.Data;
import lombok.ToString;

@Data
public class User {

    private int id;
    private String  firstName;
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
