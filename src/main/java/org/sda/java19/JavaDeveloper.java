package org.sda.java19;

public class JavaDeveloper extends Developer {

    private String company;
    private String salary;

    public JavaDeveloper(String firstName, String lastName, int age, String email, String phoneNumber, String address, String company, String salary) {
        super(firstName, lastName, age, email, phoneNumber, address);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String setFullName () { //first we used get, but overload is more like setters method
        return this.getFirstName() + " " + this.getLastName();

        // public void setName (String firstName, String lastName) {
        // super.setName(firstname.concat(lastname));
    }

}
