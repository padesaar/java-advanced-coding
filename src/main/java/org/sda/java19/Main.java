package org.sda.java19;

/**
 * Exercise-1
 *
 * Create 3 classes: Person, Developer, JavaDeveloper.
 * a. Person is a parent class, Developer inherits from Person, JavaDeveloper inherits from
 * Developer
 * b. Create constructor for every class that will call constructor of the super class. Each
 * constructor should display an information, that it has been called.
 * c. Create an object of type JavaDeveloper. What information will be displayed and in
 * what order? // first person (mothers class fields), then developers class fields, then javadevelopers fields
 * d. Using an object of type JavaDeveloper call a method that is defined in Developer
 * class. What access modifier should it have? // Public or protected
 * e. *Overload method from the Person class in JavaDeveloper class to accept additional
 * parameters.
 */

public class Main {
    public static void main(String[] args) {

       // Create an object of type JavaDeveloper.
        // What information will be displayed and in what order?
        // first person (mothers class fields), then developers class fields, then javadevelopers fields
        JavaDeveloper jimmy = new JavaDeveloper("Jimmy", "Mcgill", 25, "jimmy@gmail.com", "+372453898503", "Tartu maantee 101", "4000", "Bolt");

        // Using an object of type JavaDeveloper call a method that is defined in Developer
        // class. What access modifier should it have? // Public

        System.out.println(jimmy.getAddress());

        // Overload method from the Person class in JavaDeveloper class to accept additional
        // parameters.
        System.out.println(jimmy.setFullName());

    }
}