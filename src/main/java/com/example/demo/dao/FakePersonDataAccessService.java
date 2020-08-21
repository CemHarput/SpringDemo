package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;


@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDAO{


    private static List<Person> DB  = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));

        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public List<Person> filter() {
        String temp = "Cem";


       List<Person> filteredList = DB.stream().filter(p->!p.getName().startsWith(temp)).collect(Collectors.toList());


        return filteredList;
    }


    @Override
    public void updatePerson(Person person) {

    }

    @Override
    public void deletePerson(Person person) {

    }
}
