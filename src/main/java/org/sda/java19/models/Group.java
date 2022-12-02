package org.sda.java19.models;

import lombok.Data;
import lombok.Getter;

import java.util.List;
@Data
@Getter
public class Group {
    private String name;
    private Trainer trainer;
    private List<Student> students;


    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
