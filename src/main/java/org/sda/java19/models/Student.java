package org.sda.java19.models;

import lombok.Data;

/**
 * Student model extends from base class
 *
 */
@Data
public class Student extends Person {
    private boolean hasPreviousJavaKnowledge;

    public boolean isHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }
}
