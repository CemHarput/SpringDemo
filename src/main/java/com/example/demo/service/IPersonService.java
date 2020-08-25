package com.example.demo.service;

import com.example.demo.model.Person;

import java.util.List;

public interface IPersonService {

    public int addPerson(Person person);



    public List<Person> getAllPeople();

    public List<Person> filter(String name);

    public List<Person> filterBySchool(String school) ;


    public Person filterByGrade(double grade) ;



}


