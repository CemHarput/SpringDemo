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
        DB.add(new Person(id,"Cem","Bilkent",2.30));
        DB.add(new Person(id,"Ahmet","Metu",2.50));
        DB.add(new Person(id,"Batuhan","Bilkent",1.90));
        DB.add(new Person(id,"James Bond","Harvard",2.80));
        DB.add(new Person(id,"Tolga","Bilkent",3.00));
        DB.add(new Person(id,person.getName(),person.getSchool(),person.getGrade()));

        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public List<Person> filter(String name) {
        //should be  a parameter


       List<Person> filteredList = DB.stream().filter(p->p.getName().startsWith(name)).collect(Collectors.toList());


        return filteredList;
    }

    @Override
    public List<Person> filterBySchool(String School) {
        List<Person> filteredList = DB.stream().filter(p->p.getSchool().startsWith(School)).collect(Collectors.toList());

        return filteredList;
    }

    @Override
    public List<Person> filterByGrade(double grade) {
        List<Person> filteredList = DB.stream().filter(p->p.getGrade()>2.00).collect(Collectors.toList());

        return filteredList;
    }

    @Override
    public List<Person> updatePerson(Person person,String chance) {
        for (int i=0;i<DB.size();i++){
          if(DB.get(i).equals(person.getName())){
             //DB.set(i,chance);

          }

        }
    return DB;
    }


    @Override
    public void deletePerson(Person person) {
         //deleteNames
    }
}
