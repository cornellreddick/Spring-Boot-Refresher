package com.springboottrn.demo.model;

import java.util.UUID;

public class Student {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final String course;
    private final Integer age;

    public Student(UUID id,
                   String firstName,
                   String lastName,
                   String course,
                   Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCourse() {
        return course;
    }

    public Integer getAge() {
        return age;
    }


}
