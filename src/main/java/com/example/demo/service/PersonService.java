package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService{

    private  PersonDAO personDAO;
    private PersonRepo personRepo;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDAO personDAO ,PersonRepo personRepo) {
        this.personDAO = personDAO;
        this.personRepo= personRepo;
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
    public Person filterByGrade(double grade) {

        return personRepo.findFirstByGrade(grade);
    }

}
