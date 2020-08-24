package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {

    private  UUID id;
    private  String name;
    private String school;
    private double grade;

    public Person(@JsonProperty("id")  UUID id,@JsonProperty("name")  String name,@JsonProperty("school")  String school,@JsonProperty("grade")  double grade) {
        this.id = id;
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
