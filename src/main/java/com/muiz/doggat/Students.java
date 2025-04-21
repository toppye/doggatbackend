package com.muiz.doggat;

import jakarta.persistence.*;

@Entity
@Table(name = "Student_db")
public class Students {

    @Id
    @GeneratedValue
    private int id;
    @Column(
            name = "c_name",
            length = 20

    )
    private String firstname;

    private String lastname;

    @Column(
            unique = true
    )
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
