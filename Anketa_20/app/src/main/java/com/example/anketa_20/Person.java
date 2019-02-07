package com.example.anketa_20;

public class Person {
    String Lastname;
    String Firstname;
    String Fathername;

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getFathername() {
        return Fathername;
    }

    public void setFathername(String fathername) {
        Fathername = fathername;
    }

    public Person() {
        Lastname = "LastName";
        Firstname = "Firstname";
        Fathername = "Fathername";
    }

    public static Person Person = new Person();

}
