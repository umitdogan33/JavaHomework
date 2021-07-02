package Entities;

import java.time.format.DateTimeFormatter;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private int dateOfBird;
    private String nationalId;

    public Customer(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public int getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(int dateOfBird) {
        this.dateOfBird = dateOfBird;
    }
}
