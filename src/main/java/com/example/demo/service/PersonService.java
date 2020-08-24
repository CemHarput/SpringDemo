package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    public int addPerson(Person person){
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDAO.selectAllPeople();
    }

    public List<Person> filter(String name){
        return personDAO.filter(name);
    }

    public List<Person> filterBySchool(String school) {
        return personDAO.filterBySchool(school);
    }
    public List<Person> filterByGrade(double grade) {
        return personDAO.filterByGrade(grade);
    }

}
