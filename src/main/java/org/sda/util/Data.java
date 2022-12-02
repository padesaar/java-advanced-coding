package org.sda.util;

import org.sda.java19.models.Group;
import org.sda.java19.models.Student;
import org.sda.java19.models.Trainer;

import java.time.LocalDate;
import java.util.List;

public class Data {


    public static List<Student> getStudents() {

        Student student1 = new Student();
        student1.setFirstName("Elmar");
        student1.setLastName("Konn");
        student1.setDateOfBirth(LocalDate.of(2000, 12, 23));
        student1.setHasPreviousJavaKnowledge(true);

        Student student2 = new Student();
        student2.setFirstName("Vello");
        student2.setLastName("Jänes");
        student2.setDateOfBirth(LocalDate.of(2003, 11, 9));
        student2.setHasPreviousJavaKnowledge(true);

        Student student3 = new Student();
        student3.setFirstName("Martin");
        student3.setLastName("Kass");
        student3.setDateOfBirth(LocalDate.of(2000, 4, 5));
        student3.setHasPreviousJavaKnowledge(false);

        Student student4 = new Student();
        student4.setFirstName("Peeter");
        student4.setLastName("Koer");
        student4.setDateOfBirth(LocalDate.of(1999, 8, 12));
        student4.setHasPreviousJavaKnowledge(true);

        Student student5 = new Student();
        student5.setFirstName("Ilmar");
        student5.setLastName("Tuvi");
        student5.setDateOfBirth(LocalDate.of(1998, 6, 13));
        student5.setHasPreviousJavaKnowledge(false);

        Student student6 = new Student();
        student6.setFirstName("Jimmy");
        student6.setLastName("Cooler");
        student6.setDateOfBirth(LocalDate.of(1997, 3, 14));
        student6.setHasPreviousJavaKnowledge(true);

        Student student7 = new Student();
        student7.setFirstName("Johan");
        student7.setLastName("Cold");
        student7.setDateOfBirth(LocalDate.of(2001, 12, 12));
        student7.setHasPreviousJavaKnowledge(false);

        Student student8 = new Student();
        student8.setFirstName("Maria");
        student8.setLastName("Smith");
        student8.setDateOfBirth(LocalDate.of(2000, 1, 15));
        student8.setHasPreviousJavaKnowledge(false);

        Student student9 = new Student();
        student9.setFirstName("Jill");
        student9.setLastName("Masters");
        student9.setDateOfBirth(LocalDate.of(1999, 9, 10));
        student9.setHasPreviousJavaKnowledge(true);

        Student student10 = new Student();
        student10.setFirstName("Stan");
        student10.setLastName("Lee");
        student10.setDateOfBirth(LocalDate.of(2002, 10, 28));
        student10.setHasPreviousJavaKnowledge(true);

        Student student11 = new Student();
        student11.setFirstName("Tarmo");
        student11.setLastName("Tamm");
        student11.setDateOfBirth(LocalDate.of(1999, 5, 12));
        student11.setHasPreviousJavaKnowledge(true);

        Student student12 = new Student();
        student12.setFirstName("Pille");
        student12.setLastName("Pärn");
        student12.setDateOfBirth(LocalDate.of(2001, 9, 18));
        student12.setHasPreviousJavaKnowledge(false);

        Student student13 = new Student();
        student13.setFirstName("Inga");
        student13.setLastName("Saare");
        student13.setDateOfBirth(LocalDate.of(2004, 8, 27));
        student13.setHasPreviousJavaKnowledge(true);

        Student student14 = new Student();
        student14.setFirstName("Viktor");
        student14.setLastName("Vikat");
        student14.setDateOfBirth(LocalDate.of(2001, 12, 15));
        student14.setHasPreviousJavaKnowledge(true);

        Student student15 = new Student();
        student15.setFirstName("Elmar");
        student15.setLastName("Sepp");
        student15.setDateOfBirth(LocalDate.of(2001, 1, 13));
        student15.setHasPreviousJavaKnowledge(false);

        return List.of(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14, student15 );
    }

    public static List<Trainer> getTrainer() {

        Trainer trainer1 = new Trainer();
        trainer1.setFirstName("Donald");
        trainer1.setLastName("Duck");
        trainer1.setDateOfBirth(LocalDate.of(2000, 10, 10));
        trainer1.setAuthorized(true);

        Trainer trainer2 = new Trainer();
        trainer2.setFirstName("Rowan");
        trainer2.setLastName("Domber");
        trainer2.setDateOfBirth(LocalDate.of(2001, 12, 11));
        trainer2.setAuthorized(true);

        Trainer trainer3 = new Trainer();
        trainer3.setFirstName("Rocher");
        trainer3.setLastName("Moore");
        trainer3.setDateOfBirth(LocalDate.of(1999, 9, 19));
        trainer3.setAuthorized(true);

        return List.of(trainer2, trainer1, trainer3);

    }

    public static List<Group> getGroup() {

        Group group1 = new Group();
        group1.setName("Javaremote19");
        group1.setTrainer(getTrainer().get(0));

        Group group2 = new Group();
        group2.setName("Javaremote20");
        group2.setTrainer(getTrainer().get(1));

        Group group3 = new Group();
        group3.setName("Javaremote21");
        group3.setTrainer(getTrainer().get(2));

        Group group4 = new Group();
        group4.setName("Javaremote22");
        group4.setTrainer(getTrainer().get(2));

        return List.of(group1, group2, group3, group4);
    }

}
