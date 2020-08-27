package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;
@Data
@Entity
@Table(name="person")
public class Person {
    @Id
    @Column
    private  UUID id;

    @Column(nullable = false)
    private  String name;

    @Column(nullable = false)
    private String school;

    @Column(nullable = false)
    private double grade;



    public Person(@JsonProperty("id")  UUID id, @JsonProperty("name")  String name, @JsonProperty("school")  String school, @JsonProperty("grade")  double grade) {
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
