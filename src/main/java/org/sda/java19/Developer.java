package org.sda.java19;

public class Developer extends Person {

    private String email;
    private String phoneNumber;
    private String address;

    public Developer(String firstName, String lastName, int age, String email, String phoneNumber, String address) {
        super(firstName, lastName, age);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;


    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
