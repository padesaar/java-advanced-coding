/**
 *
 * /**
 *  * SDA Scheduler
 *  *
 *  * Create a class hierarchy:
 *  * Person.java - firstname
 *  *             - lastname
 *  *             - dateOfBirth
 *  * Trainer.java (extends Person) - isAuthorized (boolean)
 *  * Student.java (extends Person) - hasPreviousJavaKnowledge (boolean)
 *  *
 *  *
 *  * Create a Group class which has
 *  *
 *  * name (Java19Remote, Java20Remote, etc)
 *  * one trainer
 *  * a list of students
 *  *
 *  * Manually initialize 15 students; 4 groups and 3 trainers;
 *  * Store all students in a list; all groups in a list; all trainers in a list;
 *  * Assign a trainer to each group
 *  * Assign 2-3 students to each group
 *  * Ensure the fact that a group will only have distinct students (How would you do that?)
 *  * Ensure the fact that a group will only have a maximum of 5 students; When you try to add a 6th one throw an MaximumNumberOfStudentsReached exception
 *  * Display all students in a group sorted alphabetically by lastName
 *  * Display the group with the maximum number of students
 *  * Display all students younger than 25, from all groups
 *  * Display all students grouped by trainer that teaches to them (eg. Trainer1 - stud1, stud3, stud4; Trainer2 - stud2, stud 10) - regardless of the group they're part of (If you were to store this information in a data structure what would you use?)
 *  * Display all students with previous java knowledge
 *  * Display the group with the highest number of students with no previous java knowledge
 *  * Remove all the students younger than 20 from all groups. Display the groups before and after removal
 */

package org.sda.java19;

import org.sda.java19.models.*;
import org.sda.util.Data;

import java.util.*;
import java.util.stream.Collectors;

import static org.sda.util.Data.getStudents;

public class Main {
    private static final int MAXIMUM_ALLOWED_STUDENTS = 5;
    public static void main(String[] args) throws MaximumNumberOfStudentsReachedException {

        List<Student> studentList = Data.getStudents();
        List<Trainer> trainerList = Data.getTrainer();
        List<Group> groupList = Data.getGroup();

       assignStudentsToGroup(groupList, studentList);
        assignTrainerToGroup(groupList, trainerList);

        //Display all students in a group sorted alphabetically by lastname
        for(Group group : groupList) {
            group.setStudents(group.getStudents().stream()
                    .sorted(Comparator.comparing(Person:: getLastName))
                            .collect(Collectors.toList()));
        }

        //Display the group with number of students
       groupList.stream()
               .sorted(Comparator.comparingInt(List::size)).reversed()

    }

    private static void assignStudentsToGroup(List<Group> groupList, List<Student> studentList) throws MaximumNumberOfStudentsReachedException{
        //assign 2-3 student to each group
        //Ensure the fact that a group will only have distinct students (How would you do that?) (not any duplicates)
        LinkedList<Student> studentLinkedList = new LinkedList<>(studentList); //arrayList to linkedLIst


        for(Group group: groupList) {
            List<Student> students = new ArrayList<>();
            for(int i = 0; i <= 4; i++) {
                if(students.size() >= MAXIMUM_ALLOWED_STUDENTS) {
                throw new MaximumNumberOfStudentsReachedException(group.getName());
            }
                Random random = new Random();
                int nextStudentIndex = random.nextInt(studentList.size()); //get the random index
                students.add(studentLinkedList.get(nextStudentIndex));
                studentLinkedList.remove(nextStudentIndex); //so that we don't have any duplicates
        }

        group.setStudents(students);
}
}
    private static void assignTrainerToGroup(List<Group> groupList, List<Trainer> trainerList){

        List<Trainer> trainers = new ArrayList<>();

        for(Group group: groupList) {

                Random random = new Random();
                int nextTrainerIndex = random.nextInt(trainerList.size()); //get the random index
                group.setTrainer(trainerList.get(nextTrainerIndex));
        }


        }
    }

