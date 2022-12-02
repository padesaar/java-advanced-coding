package org.sda.java19.models;

public class MaximumNumberOfStudentsReachedException extends Exception{
    public MaximumNumberOfStudentsReachedException(String groupName){
        super(String.format("Group(name%s) has reached maximum number of students", groupName));
    }
}
