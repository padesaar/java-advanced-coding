package org.sda.java19;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;
}