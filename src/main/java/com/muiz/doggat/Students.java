package com.muiz.doggat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {

    @Id
    private int id;

    private String firstname;

    private String lastname;

    private String email;

    private int age;

    public Students(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public Students() {

    }
}
